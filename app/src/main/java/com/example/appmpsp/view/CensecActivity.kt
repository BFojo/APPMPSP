package com.example.appmpsp.view

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.R
import com.example.appmpsp.Services.CensecService
import com.example.appmpsp.adapter.CensecAdapter
import com.example.appmpsp.model.CensecResult
import com.example.appmpsp.presenter.CensecPresenter
import kotlinx.android.synthetic.main.censec_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CensecActivity(): AppCompatActivity(), CensecView {

    val censecAdapter = CensecAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.43.51:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(CensecService::class.java)

        CensecPresenter(this, service)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.censec_recycler)
        censec_recycler.layoutManager = LinearLayoutManager(this)
        censec_recycler.adapter = censecAdapter

        presenter.showCensec()
    }


    override fun showCensec(censec: List<CensecResult>) {
        censecAdapter.updateItems(censec)
    }

    override fun showLoading() {
        progressBarCensec.visibility = View.VISIBLE
        censec_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBarCensec.visibility = View.INVISIBLE
        censec_recycler.visibility = View.VISIBLE
    }

    override fun showError(error: Throwable) {
        AlertDialog.Builder(this)
            .setMessage(error.message)
            .setTitle("Erro")
            .setPositiveButton("Ok", null)
            .create()
            .show()
    }
}
