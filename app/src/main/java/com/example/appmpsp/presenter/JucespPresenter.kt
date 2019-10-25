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
        val call = service.getDataFromJucesp()
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