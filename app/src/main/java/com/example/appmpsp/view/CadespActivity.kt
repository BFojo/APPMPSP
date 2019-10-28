package com.example.appmpsp.view

import com.example.appmpsp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.Services.CadespService
import com.example.appmpsp.adapter.CadespAdapter
import com.example.appmpsp.model.CadespResult
import com.example.appmpsp.presenter.CadespPresenter
import kotlinx.android.synthetic.main.cadesp_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CadespActivity : AppCompatActivity(), CadespView {

    val cadespAdapter = CadespAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.43.51:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(CadespService::class.java)

        CadespPresenter(this, service)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadesp_recycler)
        cadesp_recycler.layoutManager = LinearLayoutManager(this)
        cadesp_recycler.adapter = cadespAdapter

        presenter.showCadesp()
    }


    override fun showCadesp(cadesp: List<CadespResult>) {
        cadespAdapter.updateItems(cadesp)
    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
        cadesp_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBar.visibility = View.INVISIBLE
        cadesp_recycler.visibility = View.VISIBLE
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
