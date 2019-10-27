package com.example.appmpsp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmpsp.R
import com.example.appmpsp.model.DetranResult

class DetranAdapter:  RecyclerView.Adapter<DetranAdapter.ViewHolder>() {

    private var items = listOf<DetranResult>()

    fun updateItems(newItems: List<DetranResult>){
        items = newItems
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetranAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.detran_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size


    override fun onBindViewHolder(holder: DetranAdapter.ViewHolder, position: Int) {
        holder.nome.text = items[position].nome
        holder.nomepai.text = items[position].nomepai
        holder.nomemae.text = items[position].nomemae
        holder.renach.text = items[position].renach
        holder.cpf.text = items[position].cpf
        holder.rg.text = items[position].rg
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome = itemView.findViewById<TextView>(R.id.nomeItem)
        val nomepai = itemView.findViewById<TextView>(R.id.nomePaiItem)
        val nomemae = itemView.findViewById<TextView>(R.id.nomeMaeItem)
        val renach = itemView.findViewById<TextView>(R.id.renachItem)
        val cpf = itemView.findViewById<TextView>(R.id.cpfItem)
        val rg = itemView.findViewById<TextView>(R.id.rgItem)
    }
}