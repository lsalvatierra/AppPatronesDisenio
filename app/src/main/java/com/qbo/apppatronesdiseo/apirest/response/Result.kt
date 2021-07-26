package com.qbo.apppatronesdiseo.apirest.response

data class Result(
    val gender: String,
    val id: Int,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
    val type: String
)