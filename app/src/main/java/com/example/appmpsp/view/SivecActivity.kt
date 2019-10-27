package com.example.appmpsp.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.R
import com.example.appmpsp.Services.SivecService
import com.example.appmpsp.adapter.SivecAdapter
import com.example.appmpsp.model.SivecResult
import com.example.appmpsp.presenter.SivecPresenter
import kotlinx.android.synthetic.main.sivec_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SivecActivity : AppCompatActivity(), SivecView {

    val sivecAdapter = SivecAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.16:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(SivecService::class.java)

        SivecPresenter(this, service)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sivec_recycler)
        sivec_recycler.layoutManager = LinearLayoutManager(this)
        sivec_recycler.adapter = sivecAdapter

        presenter.showSivec()
    }


    override fun showSivec(sivec: List<SivecResult>) {
        sivecAdapter.updateItems(sivec)
    }

    override fun showLoading() {
        progressBarSivec.visibility = View.VISIBLE
        sivec_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBarSivec.visibility = View.INVISIBLE
        sivec_recycler.visibility = View.VISIBLE
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