package com.example.appmpsp.view

import com.example.appmpsp.model.DetranResult

interface DetranView {
    fun showLoading()

    fun hideLoading()

    fun showDetran(detran: List<DetranResult>)


    fun showError(error : Throwable)
}