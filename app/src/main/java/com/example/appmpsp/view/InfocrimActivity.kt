package com.example.appmpsp.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.R
import com.example.appmpsp.Services.InfocrimService
import com.example.appmpsp.adapter.InfocrimAdapter
import com.example.appmpsp.model.InfocrimResult
import com.example.appmpsp.presenter.InfocrimPresenter
import kotlinx.android.synthetic.main.infocrim_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class InfocrimActivity : AppCompatActivity(), InfocrimView {

    val infocrimAdapter = InfocrimAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.16:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(InfocrimService::class.java)

        InfocrimPresenter(this, service)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infocrim_recycler)
        infocrim_recycler.layoutManager = LinearLayoutManager(this)
        infocrim_recycler.adapter = infocrimAdapter

        presenter.showInfocrim()
    }


    override fun showInfocrim(infocrim: List<InfocrimResult>) {
        infocrimAdapter.updateItems(infocrim)
    }

    override fun showLoading() {
        progressBarI.visibility = View.VISIBLE
        infocrim_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBarI.visibility = View.INVISIBLE
        infocrim_recycler.visibility = View.VISIBLE
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