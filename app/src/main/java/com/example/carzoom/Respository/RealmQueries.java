package com.example.carzoom.Respository;

import android.util.Log;

import com.example.carzoom.RealmObjects.RelevantListingInfo;

import java.util.List;

import io.reactivex.Observable;
import io.realm.Realm;

public class RealmQueries {


    private static final String TAG = "RealmQueries";

    protected static void addDataToDatabase(List<RelevantListingInfo> listings) {
//TODO async??
        Log.d(TAG, "addDataToDatabase:::: adding data to database");
        Realm realm = Realm.getDefaultInstance() ;
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
//                realm.deleteAll();
//                for(RelevantListingInfo info: listings) {
                realm.copyToRealm(listings);
//                }
            }
        });
        realm.close();
    }

    protected static Observable<List<RelevantListingInfo>> getFromLocalStorage(Realm realm) {
        Log.d(TAG, "getFromLocalStorage: fetching from local db");
        return Observable.just(
                realm.copyFromRealm(realm.where(RelevantListingInfo.class).findAllAsync())).publish().autoConnect();
    }

}
