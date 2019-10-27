package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.SivecResult

class SivecAdapter : RecyclerView.Adapter<SivecAdapter.ViewHolder>()  {
    private var items = listOf<SivecResult>()

    fun updateItems(newItems: List<SivecResult>){
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.sivec_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nomeSiv.text = items[position].nomeSiv
        holder.sexo.text = items[position].sexo
        holder.dataNascSiv.text = items[position].dataNascSiv
        holder.rgSiv.text = items[position].rgSiv
        holder.nControleVec.text = items[position].nControleVec
        holder.tipoRg.text = items[position].tipoRg
        holder.dataEmissaoRg.text = items[position].dataEmissaoRg
        holder.alcunha.text = items[position].alcunha
        holder.estadoCivil.text = items[position].estadoCivil
        holder.naturalidadeSiv.text = items[position].naturalidadeSiv
        holder.postoIdentificacao.text = items[position].postoIdentificacao
        holder.grauINstrucao.text = items[position].grauINstrucao
        holder.formulaFundamental.text = items[position].formulaFundamental
        holder.nomePaiSiv.text = items[position].nomePaiSiv
        holder.corOlhos.text = items[position].corOlhos
        holder.nomeMaeSiv.text = items[position].nomeMaeSiv
        holder.cabelo.text = items[position].cabelo
        holder.corPele.text = items[position].corPele
        holder.profissao.text = items[position].profissao
        holder.residencial.text = items[position].residencial
        holder.trabalho.text = items[position].trabalho
        holder.outrosNome.text = items[position].outrosNome
        holder.outrosRg.text = items[position].outrosRg
        holder.outrosDataNasc.text = items[position].outrosDataNasc
        holder.outrosNaturalidade.text = items[position].outrosNaturalidade
        holder.outrosNomePai.text = items[position].outrosNomePai
        holder.outrosNomeMae.text = items[position].outrosNomeMae

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeSiv = itemView.findViewById<TextView>(R.id.nomeSiItem)
        val sexo = itemView.findViewById<TextView>(R.id.sexoItem)
        val dataNascSiv = itemView.findViewById<TextView>(R.id.dataNascSivItem)
        val rgSiv = itemView.findViewById<TextView>(R.id.rgSiItem)
        val nControleVec = itemView.findViewById<TextView>(R.id.nControleVecItem)
        val tipoRg = itemView.findViewById<TextView>(R.id.tipoRgItem    )
        val dataEmissaoRg = itemView.findViewById<TextView>(R.id.dataEmissaoRgItem)
        val alcunha = itemView.findViewById<TextView>(R.id.alcunhaItem)
        val estadoCivil = itemView.findViewById<TextView>(R.id.estadoCivilItem)
        val naturalidadeSiv = itemView.findViewById<TextView>(R.id.naturalidadeSivItem)
        val postoIdentificacao = itemView.findViewById<TextView>(R.id.postoIdentificacaoItem)
        val grauINstrucao = itemView.findViewById<TextView>(R.id.grauINstrucaoItem)
        val formulaFundamental = itemView.findViewById<TextView>(R.id.formulaFundamentalItem)
        val nomePaiSiv = itemView.findViewById<TextView>(R.id.nomePaiSivItem)
        val corOlhos = itemView.findViewById<TextView>(R.id.corOlhosItem)
        val nomeMaeSiv = itemView.findViewById<TextView>(R.id.nomeMaeSivItem)
        val cabelo = itemView.findViewById<TextView>(R.id.cabeloItem)
        val corPele = itemView.findViewById<TextView>(R.id.corPeleItem)
        val profissao = itemView.findViewById<TextView>(R.id.profissaoItem)
        val residencial = itemView.findViewById<TextView>(R.id.residencialItem)
        val trabalho = itemView.findViewById<TextView>(R.id.trabalhoItem)
        val outrosNome = itemView.findViewById<TextView>(R.id.outrosNomeItem)
        val outrosRg = itemView.findViewById<TextView>(R.id.outrosRgItem)
        val outrosDataNasc = itemView.findViewById<TextView>(R.id.outrosDataNascItem)
        val outrosNaturalidade = itemView.findViewById<TextView>(R.id.outrosNaturalidadeItem)
        val outrosNomePai = itemView.findViewById<TextView>(R.id.outrosNomePaiItem)
        val outrosNomeMae = itemView.findViewById<TextView>(R.id.outrosNomeMaeItem)

    }
}