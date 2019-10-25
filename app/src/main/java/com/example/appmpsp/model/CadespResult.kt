package com.example.appmpsp.model

import com.google.gson.annotations.SerializedName


class CadespResult(

    @SerializedName("ie")
    val ie: String,
    @SerializedName("situacao")
    val situcao: String,
    @SerializedName("cnpj")
    val cnpj: String,
    @SerializedName("dataCadastro")
    val dataCadastro: String,
    @SerializedName("nomeEmpresarial")
    val nomeEmpresarial: String,
    @SerializedName("regimeEstadual")
    val regimeEstadual: String,
    @SerializedName("drt")
    val drt: String,
    @SerializedName("postoFiscal")
    val postoFiscal: String,
    @SerializedName("nire")
    val nire: String,
    @SerializedName("situacaoCadastral")
    val situacaoCadastral: String,
    @SerializedName("ocorrenciaFiscal")
    val ocorrencia: String,
    @SerializedName("tipoUnidade")
    val tipoUnidade: String,
    @SerializedName("formasAtuacao")
    val formasAtuacao: String
)
