package com.example.appmpsp.Services

import com.example.appmpsp.model.JucespResult
import retrofit2.Call
import retrofit2.http.GET

interface JucespService {
    @GET("jucesp")
    fun getDataFromJucesp() : Call<List<JucespResult>>
}