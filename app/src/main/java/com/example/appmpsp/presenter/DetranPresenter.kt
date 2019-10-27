package com.example.appmpsp.presenter

import com.example.appmpsp.Services.DetranService
import com.example.appmpsp.model.DetranResult
import com.example.appmpsp.view.DetranView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetranPresenter (
    private val view: DetranView,
    private val service: DetranService
    ) {

        fun showDetran() {
            view.showLoading()
        val call = service.getDataFromDetran("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZGE3YTQyZmEzZTU3MzI0OGRlYWQ0NTgiLCJpYXQiOjE1NzE5NjIxMDB9.-h9S6uW_Hz5VrnXUjiuwb5DEtxz1_fY-uBfM1wK3kjE")
            //val callback = endpoint.getPosts()

            call.enqueue(object : Callback<List<DetranResult>> {
                override fun onFailure(call: Call<List<DetranResult>>, t: Throwable) {
                    view.hideLoading()
                    view.showError(t)

                }

                override fun onResponse(
                    call: Call<List<DetranResult>>,
                    response: Response<List<DetranResult>>
                ) {
                    response.body()?.let {
                        view.hideLoading()
                        view.showDetran(it)
                    }
                }
            })
        }
    }