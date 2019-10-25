package com.example.appmpsp.view

import com.example.appmpsp.model.JucespResult

interface JucespView {
    fun showLoading()

    fun hideLoading()

    fun showJucesp(jucesp : List<JucespResult>)


    fun showError(error : Throwable)
}