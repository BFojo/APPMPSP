package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.CadespResult

class CadespAdapter : RecyclerView.Adapter<CadespAdapter.ViewHolder>() {

    private var items = listOf<CadespResult>()

    fun updateItems(newItems: List<CadespResult>){
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cadesp_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cnpj.text = items[position].cnpj
        holder.dataCadastro.text = items[position].dataCadastro
        holder.drt.text = items[position].drt
        holder.formasAtuacao.text = items[position].formasAtuacao
        holder.ie.text = items[position].ie
        holder.nire.text = items[position].nire
        holder.nomeEmpresarial.text = items[position].nomeEmpresarial
        holder.ocorrenciaFiscal.text = items[position].ocorrencia
        holder.postoFiscalI.text = items[position].postoFiscal
        holder.regimeEstadual.text = items[position].regimeEstadual
        holder.tipoUnidade.text = items[position].tipoUnidade
        holder.situacao.text = items[position].situcao
        holder.situacaoCadastral.text = items[position].situacaoCadastral
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ie = itemView.findViewById<TextView>(R.id.ieItem)
        val situacao = itemView.findViewById<TextView>(R.id.situacaoItem)
        val cnpj = itemView.findViewById<TextView>(R.id.cnpjItem)
        val dataCadastro = itemView.findViewById<TextView>(R.id.dataCadastroItem1)
        val nomeEmpresarial = itemView.findViewById<TextView>(R.id.nomeEmpresarialItem2)
        val regimeEstadual = itemView.findViewById<TextView>(R.id.regimeEstadualItem1)
        val drt = itemView.findViewById<TextView>(R.id.drtItem2)
        val postoFiscalI = itemView.findViewById<TextView>(R.id.postoFiscalItem)
        val nire = itemView.findViewById<TextView>(R.id.nireItem)
        val situacaoCadastral = itemView.findViewById<TextView>(R.id.situacaoCadastralItem)
        val ocorrenciaFiscal = itemView.findViewById<TextView>(R.id.ocorrenciaFiscalItem)
        val tipoUnidade = itemView.findViewById<TextView>(R.id.tipoUnidadeItem)
        val formasAtuacao = itemView.findViewById<TextView>(R.id.formasAtuacaoItem)
    }
}