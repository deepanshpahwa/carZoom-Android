package com.example.carzoom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

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

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickListener{

    private static final String TAG = "class::MainActivity";
    RecyclerView carRecyclerView;
    Context context;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getBaseContext();

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .build());

        carRecyclerView = findViewById(R.id.recycler_view_activity_main);
        carRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        View progressBar = findViewById(R.id.progress_bar_activity_main);

        ResultsViewModel viewModel = new ViewModelProvider(this).get(ResultsViewModel.class);
        Observable<List<RelevantListingInfo>> resultsObservable = viewModel.makeFutureQuery(compositeDisposable);
        if (resultsObservable!=null) {
            resultsObservable
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<RelevantListingInfo>>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            Log.d(TAG, "onSubscribe: called.");
                            compositeDisposable.add(d);
                        }

                        @Override
                        public void onNext(List<RelevantListingInfo> relevantListingInfos) {
                            Log.d(TAG, "onNext: called");
                            carRecyclerView.setVisibility(View.VISIBLE);
                            progressBar.setVisibility(View.GONE);
//                        addDataToDatabase(relevantListingInfos);
                            displayData(relevantListingInfos);
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e(TAG, e.getMessage());
                        }

                        @Override
                        public void onComplete() {
                            Log.d(TAG, "onComplete: called.");
                        }
                    });
        }
    }

    private void displayData(List<RelevantListingInfo> posts ) {
        RecyclerViewAdapter adapter;
        adapter = new RecyclerViewAdapter(getBaseContext(), posts);
        adapter.setClickListener(this);
        carRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, String carId) {
        Intent myIntent = new Intent(this, DetailActivity.class);
        myIntent.putExtra("carId", carId);
        this.startActivity(myIntent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        compositeDisposable.clear();
    }
}