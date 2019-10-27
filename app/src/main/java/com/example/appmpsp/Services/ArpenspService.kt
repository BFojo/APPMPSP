package com.example.appmpsp.Services

import com.example.appmpsp.model.ArpenspResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ArpenspService {
    @GET("arpensp")
    fun getDataFromArpensp(@Query("token")query:String) : Call<List<ArpenspResult>>
}