package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class CensecResult (
    @SerializedName("socios")
    val socios: List<SociosResult>,
    @SerializedName("codigo")
    val codigo: String,
    @SerializedName("mes")
    val mes: String,
    @SerializedName("ano")
    val ano: String,
    @SerializedName("livro")
    val livro: String,
    @SerializedName("complemento")
    val complemento: String,
    @SerializedName("folha")
    val folha: String,
    @SerializedName("ufCartorio")
    val ufCartorio: String,
    @SerializedName("municipioCartorio")
    val municipioCartorio: String
)