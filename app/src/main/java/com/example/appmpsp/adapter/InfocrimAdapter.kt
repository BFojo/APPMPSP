package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.InfocrimResult

class InfocrimAdapter : RecyclerView.Adapter<InfocrimAdapter.ViewHolder>()  {

    private var items = listOf<InfocrimResult>()

    fun updateItems(newItems: List<InfocrimResult>){
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.infocrim_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.natureza.text = items[position].natureza
        holder.local.text = items[position].local
        holder.complemento.text = items[position].complemento
        holder.tipoLocal.text = items[position].tipoLocal
        holder.circunscricao.text = items[position].circunscricao
        holder.dataOcorrencia.text = items[position].dataOcorrencia
        holder.dataComunicao.text = items[position].dataComunicao
        holder.elaborado.text = items[position].elaborado

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val natureza = itemView.findViewById<TextView>(R.id.naturezaItem)
        val local = itemView.findViewById<TextView>(R.id.localItem)
        val complemento = itemView.findViewById<TextView>(R.id.complementoItem)
        val tipoLocal = itemView.findViewById<TextView>(R.id.tipoLocalItem)
        val circunscricao = itemView.findViewById<TextView>(R.id.circunscricaoItem)
        val dataOcorrencia = itemView.findViewById<TextView>(R.id.dataOcorrenciaItem)
        val dataComunicao = itemView.findViewById<TextView>(R.id.dataComunicaoItem)
        val elaborado = itemView.findViewById<TextView>(R.id.elaboradoItem)

    }
}