package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class JucespResult (
    @SerializedName("nireMatriz")
    val nireMatriz: String,
    @SerializedName("tipoEmpresa")
    val tipoEmpresa: String,
    @SerializedName("dataConstituicao")
    val dataConstituicao: String,
    @SerializedName("inicioAtividade")
    val inicioAtividade: String,
    @SerializedName("cnpj")
    val cnpjJ: String,
    @SerializedName("inscricaoEstadual")
    val inscricaoEstadual: String,
    @SerializedName("objeto")
    val objeto: String,
    @SerializedName("logradouro")
    val logradouro: String,
    @SerializedName("numero")
    val numero: String,
    @SerializedName("bairro")
    val bairro: String,
    @SerializedName("complemento")
    val complemento: String,
    @SerializedName("municipio")
    val municipio: String,
    @SerializedName("cep")
    val cep: String,
    @SerializedName("uf")
    val uf: String,
    @SerializedName("capital")
    val capital: String
)

