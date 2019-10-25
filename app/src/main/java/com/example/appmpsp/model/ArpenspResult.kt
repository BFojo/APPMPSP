package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class ArpenspResult (

    @SerializedName("cartorio")
    val cartorio: String,
    @SerializedName("cns")
    val cns: String,
    @SerializedName("uf")
    val uf: String,
    @SerializedName("nomeConjuge1")
    val nomeConjuge1: String,
    @SerializedName("nomeConjuge2")
    val nomeConjuge2: String,
    @SerializedName("novoNomeConjuge1")
    val novoNomeConjuge1: String,
    @SerializedName("novoNomeConjuge2")
    val novoNomeConjuge2: String,
    @SerializedName("dataCasamento")
    val dataCasamento: String,
    @SerializedName("matricula")
    val matricula: String,
    @SerializedName("dataEntrada")
    val dataEntrada: String,
    @SerializedName("dataRegistro")
    val dataRegistro: String,
    @SerializedName("acervo")
    val acervo: String,
    @SerializedName("numeroLivro")
    val numeroLivro: String,
    @SerializedName("numeroFolha")
    val numeroFolha: String,
    @SerializedName("numeroRegistro")
    val numeroRegistro: String,
    @SerializedName("tipoLivro")
    val tipoLivro: String
)