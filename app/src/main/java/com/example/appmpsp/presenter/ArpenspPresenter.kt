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
            val call = service.getDataFromArpensp()
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