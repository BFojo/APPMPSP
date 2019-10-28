package com.example.appmpsp.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.R
import com.example.appmpsp.Services.JucespService
import com.example.appmpsp.adapter.JucespAdapter
import com.example.appmpsp.model.JucespResult
import com.example.appmpsp.presenter.JucespPresenter
import kotlinx.android.synthetic.main.jucesp_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JucespActivity : AppCompatActivity(), JucespView {

    val jucespAdapter = JucespAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.43.51:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(JucespService::class.java)

        JucespPresenter(this, service)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jucesp_recycler)
        jucesp_recycler.layoutManager = LinearLayoutManager(this)
        jucesp_recycler.adapter = jucespAdapter

        presenter.showJucesp()
    }


    override fun showJucesp(jucesp: List<JucespResult>) {
        jucespAdapter.updateItems(jucesp)
    }

    override fun showLoading() {
        progressBarJucesp.visibility = View.VISIBLE
        jucesp_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBarJucesp.visibility = View.INVISIBLE
        jucesp_recycler.visibility = View.VISIBLE
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