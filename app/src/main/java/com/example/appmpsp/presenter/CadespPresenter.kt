package com.example.appmpsp.presenter

import com.example.appmpsp.Services.CadespService
import com.example.appmpsp.model.CadespResult
import com.example.appmpsp.view.CadespView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CadespPresenter(
    private val view: CadespView,
    private val service: CadespService
) {

    fun showCadesp() {
        view.showLoading()
        val call = service.getDataFromCadesp()
        //val callback = endpoint.getPosts()

        call.enqueue(object : Callback<List<CadespResult>> {
            override fun onFailure(call: Call<List<CadespResult>>, t: Throwable) {
                view.hideLoading()
                view.showError(t)

            }

            override fun onResponse(
                call: Call<List<CadespResult>>,
                response: Response<List<CadespResult>>
            ) {
                response.body()?.let {
                    view.hideLoading()
                    view.showCadesp(it)
                }
            }
        })
    }
}