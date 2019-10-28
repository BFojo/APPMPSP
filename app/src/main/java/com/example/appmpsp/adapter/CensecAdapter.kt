package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.CensecResult
import com.example.appmpsp.model.SociosResult


class CensecAdapter() : RecyclerView.Adapter<CensecAdapter.ViewHolder>() {

    private var items = listOf<CensecResult>()

    fun updateItems(newItems: List<CensecResult>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.censec_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nomeCen.text = items[position].socios[0].nomeCen
        holder.cpfCnpj.text = items[position].socios[0].cpfCnpj
        holder.qualidade.text = items[position].socios[0].qualidade
        holder.codigo.text = items[position].codigo
        holder.mes.text = items[position].mes
        holder.ano.text = items[position].ano
        holder.livro.text = items[position].livro
        holder.complemento.text = items[position].complemento
        holder.folha.text = items[position].folha
        holder.ufCartorio.text = items[position].ufCartorio
        holder.municipioCartorio.text = items[position].municipioCartorio

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeCen = itemView.findViewById<TextView>(R.id.nomeCenItem)
        val cpfCnpj = itemView.findViewById<TextView>(R.id.cpfCnpjItem)
        val qualidade = itemView.findViewById<TextView>(R.id.qualidadeItem)
        val codigo = itemView.findViewById<TextView>(R.id.codigoItem)
        val mes = itemView.findViewById<TextView>(R.id.mesItem)
        val ano = itemView.findViewById<TextView>(R.id.anoItem)
        val livro = itemView.findViewById<TextView>(R.id.livroItem)
        val complemento = itemView.findViewById<TextView>(R.id.complementoItem)
        val folha = itemView.findViewById<TextView>(R.id.folhaItem)
        val ufCartorio = itemView.findViewById<TextView>(R.id.ufCartorioItem)
        val municipioCartorio = itemView.findViewById<TextView>(R.id.municipioCartorioItem)

    }
}