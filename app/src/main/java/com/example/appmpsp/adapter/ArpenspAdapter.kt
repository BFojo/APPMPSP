package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.ArpenspResult


class ArpenspAdapter: RecyclerView.Adapter<ArpenspAdapter.ViewHolder>() {

    private var items = listOf<ArpenspResult>()

    fun updateItems(newItems: List<ArpenspResult>){
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArpenspAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.arpensp_item, parent, false)
        return ArpenspAdapter.ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ArpenspAdapter.ViewHolder, position: Int) {
        holder.cartorio.text = items[position].cartorio
        holder.cns.text = items[position].cns
        holder.uf.text = items[position].uf
        holder.nomeConjuge1.text = items[position].nomeConjuge1
        holder.nomeConjuge2.text = items[position].nomeConjuge2
        holder.novoNomeConjuge1.text = items[position].novoNomeConjuge1
        holder.novoNomeConjuge2.text = items[position].novoNomeConjuge2
        holder.dataCasamento.text = items[position].dataCasamento
        holder.matricula.text = items[position].matricula
        holder.dataEntrada.text = items[position].dataEntrada
        holder.dataRegistro.text = items[position].dataRegistro
        holder.acervo.text = items[position].acervo
        holder.numeroLivro.text = items[position].numeroLivro
        holder.numeroFolha.text = items[position].numeroFolha
        holder.numeroRegistro.text = items[position].numeroRegistro
        holder.tipoLivro.text = items[position].tipoLivro
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cartorio= itemView.findViewById<TextView>(R.id.cartorioItem)
        val cns = itemView.findViewById<TextView>(R.id.cnsItem)
        val uf = itemView.findViewById<TextView>(R.id.ufItem)
        val nomeConjuge1 = itemView.findViewById<TextView>(R.id.nomeConjugeItem1)
        val nomeConjuge2 = itemView.findViewById<TextView>(R.id.nomeConjugeItem2)
        val novoNomeConjuge1 = itemView.findViewById<TextView>(R.id.novoNomeConjugeItem1)
        val novoNomeConjuge2 = itemView.findViewById<TextView>(R.id.novoNomeConjugeItem2)
        val dataCasamento = itemView.findViewById<TextView>(R.id.dtCasamentoItem)
        val matricula = itemView.findViewById<TextView>(R.id.matriculaItem)
        val dataEntrada = itemView.findViewById<TextView>(R.id.dataEntradaItem)
        val dataRegistro = itemView.findViewById<TextView>(R.id.dataRegistroItem)
        val acervo = itemView.findViewById<TextView>(R.id.acervoItem)
        val numeroLivro = itemView.findViewById<TextView>(R.id.numeroLivroItem)
        val numeroFolha = itemView.findViewById<TextView>(R.id.numeroFolhaItem)
        val numeroRegistro = itemView.findViewById<TextView>(R.id.numeroRegistroItem)
        val tipoLivro = itemView.findViewById<TextView>(R.id.tipoLivroItem)
    }
}