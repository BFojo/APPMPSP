package com.example.appmpsp.view

import com.example.appmpsp.model.ArpenspResult

interface ArpenspView {
    fun showLoading()

    fun hideLoading()

    fun showArpensp(arpensp : List<ArpenspResult>)

    fun showError(error : Throwable)
}