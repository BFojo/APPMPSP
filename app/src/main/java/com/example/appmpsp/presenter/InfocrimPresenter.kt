package com.example.appmpsp.presenter

import com.example.appmpsp.Services.InfocrimService
import com.example.appmpsp.model.InfocrimResult
import com.example.appmpsp.view.InfocrimView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InfocrimPresenter (
    private val view: InfocrimView,
    private val service: InfocrimService
) {

    fun showInfocrim() {
        view.showLoading()
        val call = service.getDataFromInfocrim("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZGE3YTQyZmEzZTU3MzI0OGRlYWQ0NTgiLCJpYXQiOjE1NzE5NjIxMDB9.-h9S6uW_Hz5VrnXUjiuwb5DEtxz1_fY-uBfM1wK3kjE")
        //val callback = endpoint.getPosts()

        call.enqueue(object : Callback<List<InfocrimResult>> {
            override fun onFailure(call: Call<List<InfocrimResult>>, t: Throwable) {
                view.hideLoading()
                view.showError(t)

            }

            override fun onResponse(
                call: Call<List<InfocrimResult>>,
                response: Response<List<InfocrimResult>>
            ) {
                response.body()?.let {
                    view.hideLoading()
                    view.showInfocrim(it)
                }
            }
        })
    }
}