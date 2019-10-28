package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class SociosResult (
    @SerializedName("nome")
    val nomeCen: String,
    @SerializedName("cpfCnpj")
    val cpfCnpj: String,
    @SerializedName("qualidade")
    val qualidade: String
)