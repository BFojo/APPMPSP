package com.example.appmpsp.Services

import com.example.appmpsp.model.CadespResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CadespService{

    @GET("cadesp")
    fun getDataFromCadesp(@Query("token")query:String) : Call<List<CadespResult>>
}