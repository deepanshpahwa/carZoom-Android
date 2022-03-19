package com.example.carzoom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carzoom.Adapter.RecyclerViewAdapter;
import com.example.carzoom.RealmObjects.RelevantListingInfo;
import com.example.carzoom.ViewModel.ResultsViewModel;
import com.facebook.stetho.Stetho;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.realm.Realm;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickListener{

    private static final String TAG = "class::MainActivity";
    RecyclerView superListView;
    Context context;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ImageView imageView;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realm = Realm.getDefaultInstance();
        context = getBaseContext();

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
//                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                        .build());

        superListView = findViewById(R.id.simpleRecyclerView);
        superListView.setLayoutManager(new LinearLayoutManager(context));

        ResultsViewModel viewModel = new ViewModelProvider(this).get(ResultsViewModel.class);
        Observable<List<RelevantListingInfo>> resultsObservable = viewModel.makeFutureQuery();
        if (resultsObservable != null) {
            resultsObservable
                    .subscribeOn(Schedulers.io())
//                    .map(extractRelevantInfo)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<RelevantListingInfo>>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            Log.d(TAG, "onSubscribe: called.");
//                            d.//TODO
                            compositeDisposable.add(d);
                        }

                        @Override
                        public void onNext(List<RelevantListingInfo> relevantListingInfos) {
                            Log.d(TAG, "onNext: got the response from server!");
                            Log.d(TAG, "onNext: " + relevantListingInfos.get(0));
//                        addDataToDatabase(relevantListingInfos);
                            displayData(relevantListingInfos);
                            //TODO hide loading screen

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.d("TAG", "onError:::::: " + "showing old data");
                        }

                        @Override
                        public void onComplete() {
                            Log.d(TAG, "onComplete: called.");
                        }
                    });

        }
        else{
            Log.d(TAG, "onCreate:::: Resulsts are null");
            //TODO Toast
        }
    }

    private void displayData(List<RelevantListingInfo> posts ) {

        if (posts==null) {
            posts = realm.where(RelevantListingInfo.class).sort("position").findAll();
        }
        RecyclerViewAdapter adapter;
        adapter = new RecyclerViewAdapter(getBaseContext(), posts);
        adapter.setClickListener(this);
        superListView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, String carId) {
        Intent myIntent = new Intent(this, DetailActivity.class);
        myIntent.putExtra("carId", carId); //Optional parameters
        this.startActivity(myIntent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        compositeDisposable.clear();
    }
}