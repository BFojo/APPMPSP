package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class SielResult (
    @SerializedName("numeroProcesso")
    val numeroProcesso: String,
    @SerializedName("nome")
    val nomeS: String,
    @SerializedName("titulo")
    val titulo: String,
    @SerializedName("dataNasc")
    val dataNasc: String,
    @SerializedName("zona")
    val zona: String,
    @SerializedName("municipio")
    val municipioS: String,
    @SerializedName("uf")
    val ufS: String,
    @SerializedName("dataDomicilio")
    val dataDomicilio: String,
    @SerializedName("nomePai")
    val nomePaiS: String,
    @SerializedName("nomeMae")
    val nomeMaeS: String,
    @SerializedName("naturalidade")
    val naturalidade: String,
    @SerializedName("codValidacao")
    val codValidacao: String

)