package com.example.appmpsp.Services

import com.example.appmpsp.model.ArpenspResult
import retrofit2.Call
import retrofit2.http.GET

interface ArpenspService {
    @GET("arpensp")
    fun getDataFromArpensp() : Call<List<ArpenspResult>>
}