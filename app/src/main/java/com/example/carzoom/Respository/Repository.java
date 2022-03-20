package com.example.carzoom.Respository;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.carzoom.R;
import com.example.carzoom.RealmObjects.RelevantListingInfo;
import com.example.carzoom.Retrofit.RetrofitClient;
import com.example.carzoom.Utils;
import com.example.carzoom.pojos.Listing;
import com.example.carzoom.pojos.Results;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.realm.Realm;

public class Repository{
    private static Repository instance;
    private String TAG = "class::Repository";

    public static Repository getInstance(){

        if(instance == null){
            instance = new Repository();
        }
        return instance;
    }

    public Observable<List<RelevantListingInfo>> makeCarQuery(Application application, CompositeDisposable disposable) {

        Realm realm = Realm.getDefaultInstance() ;
        Observable<List<RelevantListingInfo>> ret = null;
        SharedPreferences sharedPref = application.getSharedPreferences(application.getString(R.string.preference_key), Context.MODE_PRIVATE);
        String rawTimestamp = Utils.readFromSharedPref(application, sharedPref);

        boolean isStale = false;
        boolean isFirstPull = false;
        if(rawTimestamp== null || rawTimestamp.equals("")){
            isFirstPull = true;
            Log.d(TAG, "makeCarQuery: will be pulling for the first time");
        }
        if(!isFirstPull) {
            DateTime yesterday = DateTime.now().minusDays(1);
            isStale = DateTime.parse(rawTimestamp).isBefore(yesterday);
            if (isStale)Log.d(TAG, "makeCarQuery: is not first pull, data is stale");
            else Log.d(TAG, "makeCarQuery: is not first pull, data is NOT stale");
        }

//TOdo
        if (isStale || isFirstPull){
            Log.d(TAG, "makeCarQuery: data is  stale or  is first pull");
//            if (isFirstPull){
            if (!Utils.isNetworkConnected(application)){
                //Toast no data no network
                Log.d(TAG, "makeCarQuery: no network TOAST");
                return ret;//check for errors
            }

            ret = makeNetworkCall();
            ret.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())

                    .subscribe(new Observer<List<RelevantListingInfo>>() {
                @Override
                public void onSubscribe(Disposable d) {
                    Log.d("TAG", "onSubscribe: in Repo");
                    disposable.add(d);
                }

                @Override
                public void onNext(List<RelevantListingInfo> relevantListingInfos) {
                    Utils.writeToSharedPref(application, sharedPref);
                    RealmQueries.addDataToDatabase(relevantListingInfos);
                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onComplete() {

                }
            });

        }else{
            ret = RealmQueries.getFromLocalStorage(realm);
        }
        realm.close();
        return ret;
    }

    private Observable<List<RelevantListingInfo>> makeNetworkCall() {
        Log.d(TAG, "makeNetworkCall: making network call");
        Observable<List<RelevantListingInfo>> networkObservable = RetrofitClient.getInstance().getMyApi().getCars().map(extractRelevantInfo).replay().autoConnect();
        return networkObservable;
    }
    //TODO make call to makeFutureQuery, on complete save data to realm db asynchronously and return the value fetched from api

    Function<Results, List<RelevantListingInfo>> extractRelevantInfo = new Function<Results, List<RelevantListingInfo>> () {
        @Override
        public List<RelevantListingInfo> apply(Results results) throws Exception {
            List<RelevantListingInfo> relevantListingInfoList = new ArrayList<>();
//                    int position = 0;
            for (Listing listing : results.getListings()) {
                RelevantListingInfo relevantListingInfo = new RelevantListingInfo();
                relevantListingInfo.setId(listing.getId());
                relevantListingInfo.setYear(listing.getYear());
                relevantListingInfo.setMake(listing.getMake());
                relevantListingInfo.setModel(listing.getModel());
                relevantListingInfo.setLastPrice(listing.getListPrice());
                relevantListingInfo.setMileage(listing.getMileage());
                relevantListingInfo.setCity(listing.getDealer().getCity());
                relevantListingInfo.setState(listing.getDealer().getState());
                relevantListingInfo.setPhone(listing.getDealer().getPhone());
                relevantListingInfo.setExteriorColor(listing.getExteriorColor());
                relevantListingInfo.setInteriorColor(listing.getInteriorColor());
                relevantListingInfo.setDriveType(listing.getDrivetype());
                relevantListingInfo.setTransmission(listing.getTransmission());
                relevantListingInfo.setBodyType(listing.getBodytype());
                relevantListingInfo.setEngine(listing.getEngine());
                relevantListingInfo.setFuel(listing.getFuel());
                relevantListingInfo.setImageUrl(listing.getImages().getFirstPhoto().getMedium());

                relevantListingInfoList.add(relevantListingInfo);
//                        position++;
            }
            return relevantListingInfoList;
        }
    };
}
