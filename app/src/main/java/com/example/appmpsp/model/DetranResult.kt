package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class DetranResult (
    @SerializedName("nome")
    val nome:String,

    @SerializedName("nomepai")
    val nomepai:String,

    @SerializedName("nomemae")
    val nomemae:String,

    @SerializedName("renach")
    val renach:String,

    @SerializedName("cpf")
    val cpf:String,

    @SerializedName("rg")
    val rg:String

)

