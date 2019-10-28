package com.example.appmpsp.presenter

import com.example.appmpsp.Services.CensecService
import com.example.appmpsp.model.CensecResult
import com.example.appmpsp.view.CensecView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CensecPresenter (
    private val view: CensecView,
    private val service: CensecService
) {

    fun showCensec() {
        view.showLoading()
        val call = service.getDataFromCensec("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZGE3YTQyZmEzZTU3MzI0OGRlYWQ0NTgiLCJpYXQiOjE1NzE5NjIxMDB9.-h9S6uW_Hz5VrnXUjiuwb5DEtxz1_fY-uBfM1wK3kjE")
        //val callback = endpoint.getPosts()

        call.enqueue(object : Callback<List<CensecResult>> {
            override fun onFailure(call: Call<List<CensecResult>>, t: Throwable) {
                view.hideLoading()
                view.showError(t)

            }

            override fun onResponse(
                call: Call<List<CensecResult>>,
                response: Response<List<CensecResult>>
            ) {
                response.body()?.let {
                    view.hideLoading()
                    view.showCensec(it)
                }
            }
        })
    }
}