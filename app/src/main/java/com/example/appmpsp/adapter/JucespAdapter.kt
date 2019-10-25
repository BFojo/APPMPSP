package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.JucespResult

class JucespAdapter : RecyclerView.Adapter<JucespAdapter.ViewHolder>()  {

    private var items = listOf<JucespResult>()

    fun updateItems(newItems: List<JucespResult>){
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.jucesp_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nireMatriz.text = items[position].nireMatriz
        holder.tipoEmpresa.text = items[position].tipoEmpresa
        holder.dataConstituicao.text = items[position].dataConstituicao
        holder.inicioAtividade.text = items[position].inicioAtividade
        holder.cnpjJ.text = items[position].cnpjJ
        holder.inscricaoEstadual.text = items[position].inscricaoEstadual
        holder.objeto.text = items[position].objeto
        holder.logradouro.text = items[position].logradouro
        holder.numero.text = items[position].numero
        holder.bairro.text = items[position].bairro
        holder.complemento.text = items[position].complemento
        holder.municipio.text = items[position].municipio
        holder.cep.text = items[position].cep
        holder.uf.text = items[position].uf
        holder.capital.text = items[position].capital
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nireMatriz = itemView.findViewById<TextView>(R.id.nireMatrizMItem)
        val tipoEmpresa = itemView.findViewById<TextView>(R.id.tipoEmpresaItem)
        val dataConstituicao = itemView.findViewById<TextView>(R.id.dataConstituicaoItem)
        val inicioAtividade = itemView.findViewById<TextView>(R.id.inicioAtividadeItem)
        val cnpjJ = itemView.findViewById<TextView>(R.id.cnpjItemJ)
        val inscricaoEstadual = itemView.findViewById<TextView>(R.id.inscricaoEstadualItem)
        val objeto = itemView.findViewById<TextView>(R.id.objetoItem)
        val logradouro = itemView.findViewById<TextView>(R.id.logradouroItem)
        val numero = itemView.findViewById<TextView>(R.id.numeroItem)
        val bairro = itemView.findViewById<TextView>(R.id.bairroItem)
        val complemento = itemView.findViewById<TextView>(R.id.complementoItem)
        val municipio = itemView.findViewById<TextView>(R.id.municipioItem)
        val cep = itemView.findViewById<TextView>(R.id.cepItem)
        val uf = itemView.findViewById<TextView>(R.id.ufItem)
        val capital = itemView.findViewById<TextView>(R.id.capitalItem)
    }

}