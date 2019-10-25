package com.example.appmpsp.view

import com.example.appmpsp.model.CadespResult

interface CadespView {
    fun showLoading()

    fun hideLoading()

    fun showCadesp(cadesp : List<CadespResult>)


    fun showError(error : Throwable)
}
