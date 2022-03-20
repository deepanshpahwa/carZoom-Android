package com.example.carzoom.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.example.carzoom.RealmObjects.RelevantListingInfo;
import com.example.carzoom.Respository.Repository;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;

public class ResultsViewModel extends AndroidViewModel {
    private Repository repository;

    public ResultsViewModel(Application application) {
        super(application);
        repository = Repository.getInstance();
    }

    public Observable<List<RelevantListingInfo>> makeFutureQuery(CompositeDisposable disposable){
        return repository.makeCarQuery(this.getApplication(), disposable );
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
