package com.example.appmpsp.Services

import com.example.appmpsp.model.InfocrimResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface InfocrimService {
    @GET("infocrim")
    fun getDataFromInfocrim(@Query("token")query:String) : Call<List<InfocrimResult>>
}