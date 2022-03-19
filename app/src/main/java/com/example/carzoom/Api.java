package com.example.carzoom;


import com.example.carzoom.pojos.Results;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {

    @GET("assignment.json")
    Observable<Results> getCars();
}