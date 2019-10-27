package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.SielResult

class SielAdapter : RecyclerView.Adapter<SielAdapter.ViewHolder>()  {
    private var items = listOf<SielResult>()

    fun updateItems(newItems: List<SielResult>){
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.siel_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.numeroProcesso.text = items[position].numeroProcesso
        holder.nomeS.text = items[position].nomeS
        holder.titulo.text = items[position].titulo
        holder.dataNasc.text = items[position].dataNasc
        holder.zona.text = items[position].zona
        holder.municipioS.text = items[position].municipioS
        holder.ufS.text = items[position].ufS
        holder.dataDomicilio.text = items[position].dataDomicilio
        holder.nomePaiS.text = items[position].nomePaiS
        holder.nomeMaes.text = items[position].nomeMaeS
        holder.naturalidade.text = items[position].naturalidade
        holder.codValidacao.text = items[position].codValidacao
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numeroProcesso = itemView.findViewById<TextView>(R.id.numeroProcessoItem)
        val nomeS = itemView.findViewById<TextView>(R.id.nomeSItem)
        val titulo = itemView.findViewById<TextView>(R.id.tituloItem)
        val dataNasc = itemView.findViewById<TextView>(R.id.dataNascItem)
        val zona = itemView.findViewById<TextView>(R.id.zonaItem)
        val municipioS = itemView.findViewById<TextView>(R.id.municipioSItem)
        val ufS = itemView.findViewById<TextView>(R.id.ufSItem)
        val dataDomicilio = itemView.findViewById<TextView>(R.id.dataDomicilioItem)
        val nomePaiS = itemView.findViewById<TextView>(R.id.nomePaiSItem)
        val nomeMaes = itemView.findViewById<TextView>(R.id.nomeMaeSItem)
        val naturalidade = itemView.findViewById<TextView>(R.id.naturalidadeItem)
        val codValidacao = itemView.findViewById<TextView>(R.id.codValidacaoItem)
    }
}