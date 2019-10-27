package com.example.appmpsp.presenter

import com.example.appmpsp.Services.SielService
import com.example.appmpsp.model.SielResult
import com.example.appmpsp.view.SielView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SielPresenter(
    private val view: SielView,
    private val service: SielService
) {

    fun showSiel() {
        view.showLoading()
        val call = service.getDataFromSiel("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZGE3YTQyZmEzZTU3MzI0OGRlYWQ0NTgiLCJpYXQiOjE1NzE5NjIxMDB9.-h9S6uW_Hz5VrnXUjiuwb5DEtxz1_fY-uBfM1wK3kjE")
        //val callback = endpoint.getPosts()

        call.enqueue(object : Callback<List<SielResult>> {
            override fun onFailure(call: Call<List<SielResult>>, t: Throwable) {
                view.hideLoading()
                view.showError(t)

            }

            override fun onResponse(
                call: Call<List<SielResult>>,
                response: Response<List<SielResult>>
            ) {
                response.body()?.let {
                    view.hideLoading()
                    view.showSiel(it)
                }
            }
        })
    }
}