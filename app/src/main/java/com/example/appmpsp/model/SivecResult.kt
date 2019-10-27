package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName

class SivecResult(
    @SerializedName("nome")
    val nomeSiv: String,
    @SerializedName("sexo")
    val sexo: String,
    @SerializedName("dataNasc")
    val dataNascSiv: String,
    @SerializedName("rg")
    val rgSiv: String,
    @SerializedName("nControleVec")
    val nControleVec: String,
    @SerializedName("tipoRg")
    val tipoRg: String,
    @SerializedName("dataEmissaoRg")
    val dataEmissaoRg: String,
    @SerializedName("alcunha")
    val alcunha: String,
    @SerializedName("estadoCivil")
    val estadoCivil: String,
    @SerializedName("naturalidade")
    val naturalidadeSiv: String,
    @SerializedName("postoIdentificacao")
    val postoIdentificacao: String,
    @SerializedName("grauINstrucao")
    val grauINstrucao: String,
    @SerializedName("formulaFundamental")
    val formulaFundamental: String,
    @SerializedName("nomePai")
    val nomePaiSiv: String,
    @SerializedName("corOlhos")
    val corOlhos: String,
    @SerializedName("nomeMae")
    val nomeMaeSiv: String,
    @SerializedName("cabelo")
    val cabelo: String,
    @SerializedName("corPele")
    val corPele: String,
    @SerializedName("profissao")
    val profissao: String,
    @SerializedName("residencial")
    val residencial: String,
    @SerializedName("trabalho")
    val trabalho: String,
    @SerializedName("outrosNome")
    val outrosNome: String,
    @SerializedName("outrosRg")
    val outrosRg: String,
    @SerializedName("outrosDataNasc")
    val outrosDataNasc: String,
    @SerializedName("outrosNaturalidade")
    val outrosNaturalidade: String,
    @SerializedName("outrosNomePai")
    val outrosNomePai: String,
    @SerializedName("outrosNomeMae")
    val outrosNomeMae: String
)

