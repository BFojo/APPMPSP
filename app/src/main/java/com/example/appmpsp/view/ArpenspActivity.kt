package com.example.appmpsp.view

import com.example.appmpsp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.Services.ArpenspService
import com.example.appmpsp.adapter.ArpenspAdapter
import com.example.appmpsp.model.ArpenspResult
import com.example.appmpsp.presenter.ArpenspPresenter
import kotlinx.android.synthetic.main.arpensp_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ArpenspActivity : AppCompatActivity(), ArpenspView  {

    val arpenspAdapter = ArpenspAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.16:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(ArpenspService::class.java)

        ArpenspPresenter(this, service)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.arpensp_recycler)
        arpensp_recycler.layoutManager = LinearLayoutManager(this)
        arpensp_recycler.adapter = arpenspAdapter

        presenter.showArpensp()
    }


    override fun showArpensp(arpensp: List<ArpenspResult>) {
        arpenspAdapter.updateItems(arpensp)
    }

    override fun showLoading() {
        progressBarArpensp.visibility = View.VISIBLE
        arpensp_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBarArpensp.visibility = View.INVISIBLE
        arpensp_recycler.visibility = View.VISIBLE
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
