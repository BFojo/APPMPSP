package com.example.appmpsp.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.R
import com.example.appmpsp.Services.SielService
import com.example.appmpsp.adapter.SielAdapter
import com.example.appmpsp.model.SielResult
import com.example.appmpsp.presenter.SielPresenter
import kotlinx.android.synthetic.main.siel_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SielActivity: AppCompatActivity() , SielView {

    val sielAdapter = SielAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.43.51:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(SielService::class.java)

        SielPresenter(this, service)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.siel_recycler)
        siel_recycler.layoutManager = LinearLayoutManager(this)
        siel_recycler.adapter = sielAdapter

        presenter.showSiel()
    }

    override fun showSiel(siel: List<SielResult>) {
        sielAdapter.updateItems(siel)
    }

    override fun showLoading() {
        progressBarSiel.visibility = View.VISIBLE
        siel_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBarSiel.visibility = View.INVISIBLE
        siel_recycler.visibility = View.VISIBLE
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