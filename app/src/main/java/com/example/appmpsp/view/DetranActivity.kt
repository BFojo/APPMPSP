package com.example.appmpsp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmpsp.R
import com.example.appmpsp.Services.CadespService
import com.example.appmpsp.Services.DetranService
import com.example.appmpsp.adapter.CadespAdapter
import com.example.appmpsp.adapter.DetranAdapter
import com.example.appmpsp.model.CadespResult
import com.example.appmpsp.model.DetranResult
import com.example.appmpsp.presenter.CadespPresenter
import com.example.appmpsp.presenter.DetranPresenter
import kotlinx.android.synthetic.main.cadesp_recycler.*
import kotlinx.android.synthetic.main.detran_recycler.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DetranActivity : AppCompatActivity() , DetranView {


    val detranAdapter = DetranAdapter()

    val presenter by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.16:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(DetranService::class.java)

        DetranPresenter(this, service)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detran_recycler)
        detran_recycler.layoutManager = LinearLayoutManager(this)
        detran_recycler.adapter = detranAdapter

        presenter.showDetran()
    }

    override fun showDetran(detran: List<DetranResult>) {
        detranAdapter.updateItems(detran)
    }

    override fun showLoading() {
        progressBarDetran.visibility = View.VISIBLE
        detran_recycler.visibility = View.INVISIBLE
    }

    override fun hideLoading() {
        progressBarDetran.visibility = View.INVISIBLE
        detran_recycler.visibility = View.VISIBLE
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
