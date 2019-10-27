package com.example.appmpsp.view

import com.example.appmpsp.model.SielResult

interface SielView {
    fun showLoading()

    fun hideLoading()

    fun showSiel(siel: List<SielResult>)


    fun showError(error: Throwable)
}