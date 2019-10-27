package com.example.appmpsp.Services

import com.example.appmpsp.model.SivecResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SivecService {

    @GET("sivec")
    fun getDataFromSivec(@Query("token")query:String) : Call<List<SivecResult>>
}