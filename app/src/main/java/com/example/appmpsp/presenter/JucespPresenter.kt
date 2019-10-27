package com.example.appmpsp.presenter

import com.example.appmpsp.Services.JucespService
import com.example.appmpsp.model.JucespResult
import com.example.appmpsp.view.JucespView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class JucespPresenter (
    private val view: JucespView,
    private val service: JucespService
) {

    fun showJucesp() {
        view.showLoading()
        val call = service.getDataFromJucesp("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZGE3YTQyZmEzZTU3MzI0OGRlYWQ0NTgiLCJpYXQiOjE1NzE5NjIxMDB9.-h9S6uW_Hz5VrnXUjiuwb5DEtxz1_fY-uBfM1wK3kjE")
        //val callback = endpoint.getPosts()

        call.enqueue(object : Callback<List<JucespResult>> {
            override fun onFailure(call: Call<List<JucespResult>>, t: Throwable) {
                view.hideLoading()
                view.showError(t)

            }

            override fun onResponse(
                call: Call<List<JucespResult>>,
                response: Response<List<JucespResult>>
            ) {
                response.body()?.let {
                    view.hideLoading()
                    view.showJucesp(it)
                }
            }
        })
    }
}