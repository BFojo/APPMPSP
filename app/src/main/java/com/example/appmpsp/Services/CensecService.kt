package com.example.appmpsp.Services

import com.example.appmpsp.model.CensecResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CensecService {
    @GET("censec")
    fun getDataFromCensec(@Query("token")query:String) : Call<List<CensecResult>>
}