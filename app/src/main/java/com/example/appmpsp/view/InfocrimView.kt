package com.example.appmpsp.view

import com.example.appmpsp.model.InfocrimResult

interface InfocrimView {
    fun showLoading()

    fun hideLoading()

    fun showInfocrim(infocrim: List<InfocrimResult>)


    fun showError(error : Throwable)
}