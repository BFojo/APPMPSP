package com.example.appmpsp.Services

import com.example.appmpsp.model.SielResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SielService {
    @GET("siel")
    fun getDataFromSiel(@Query("token")query:String) : Call<List<SielResult>>
}