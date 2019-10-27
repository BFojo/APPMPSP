package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class InfocrimResult (
    @SerializedName("natureza")
    val natureza: String,
    @SerializedName("local")
    val local: String,
    @SerializedName("complemento")
    val complemento: String,
    @SerializedName("tipoLocal")
    val tipoLocal: String,
    @SerializedName("circunscricao")
    val circunscricao: String,
    @SerializedName("dataOcorrencia")
    val dataOcorrencia: String,
    @SerializedName("dataComunicao")
    val dataComunicao: String,
    @SerializedName("elaborado")
    val elaborado: String

)