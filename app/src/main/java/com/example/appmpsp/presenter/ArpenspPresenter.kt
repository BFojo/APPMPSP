package com.example.appmpsp.presenter

import com.example.appmpsp.Services.ArpenspService
import com.example.appmpsp.model.ArpenspResult
import com.example.appmpsp.view.ArpenspView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArpenspPresenter (
    private val view: ArpenspView,
    private val service: ArpenspService
    ) {

        fun showArpensp() {
            view.showLoading()
            val call = service.getDataFromArpensp("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZGE3YTQyZmEzZTU3MzI0OGRlYWQ0NTgiLCJpYXQiOjE1NzE5NjIxMDB9.-h9S6uW_Hz5VrnXUjiuwb5DEtxz1_fY-uBfM1wK3kjE")
            //val callback = endpoint.getPosts()

            call.enqueue(object : Callback<List<ArpenspResult>> {
                override fun onFailure(call: Call<List<ArpenspResult>>, t: Throwable) {
                    view.hideLoading()
                    view.showError(t)

                }

                override fun onResponse(
                    call: Call<List<ArpenspResult>>,
                    response: Response<List<ArpenspResult>>
                ) {
                    response.body()?.let {
                        view.hideLoading()
                        view.showArpensp(it)
                    }
                }
            })
        }
}