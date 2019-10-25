package com.example.appmpsp.Services

import com.example.appmpsp.model.CadespResult
import retrofit2.Call
import retrofit2.http.GET

interface CadespService{

    @GET("cadesp")
    fun getDataFromCadesp() : Call<List<CadespResult>>
}