package com.example.appmpsp.presenter

import com.example.appmpsp.Services.SivecService
import com.example.appmpsp.model.SivecResult
import com.example.appmpsp.view.SivecView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SivecPresenter(
    private val view: SivecView,
    private val service: SivecService
) {

    fun showSivec() {
        view.showLoading()
        val call = service.getDataFromSivec("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZGE3YTQyZmEzZTU3MzI0OGRlYWQ0NTgiLCJpYXQiOjE1NzE5NjIxMDB9.-h9S6uW_Hz5VrnXUjiuwb5DEtxz1_fY-uBfM1wK3kjE")
        //val callback = endpoint.getPosts()

        call.enqueue(object : Callback<List<SivecResult>> {
            override fun onFailure(call: Call<List<SivecResult>>, t: Throwable) {
                view.hideLoading()
                view.showError(t)

            }

            override fun onResponse(
                call: Call<List<SivecResult>>,
                response: Response<List<SivecResult>>
            ) {
                response.body()?.let {
                    view.hideLoading()
                    view.showSivec(it)
                }
            }
        })
    }
}