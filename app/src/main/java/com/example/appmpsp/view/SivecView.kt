package com.example.appmpsp.view

import com.example.appmpsp.model.SivecResult

interface SivecView {
    fun showLoading()

    fun hideLoading()

    fun showSivec(sivec: List<SivecResult>)

    fun showError(error: Throwable)
}