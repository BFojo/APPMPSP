package com.example.appmpsp.view

import com.example.appmpsp.model.CensecResult

interface CensecView {
    fun showLoading()

    fun hideLoading()

    fun showCensec(censec : List<CensecResult>)


    fun showError(error : Throwable)
}