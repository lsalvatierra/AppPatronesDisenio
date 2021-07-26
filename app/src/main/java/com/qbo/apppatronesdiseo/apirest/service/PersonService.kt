package com.qbo.apppatronesdiseo.apirest.service

import com.qbo.apppatronesdiseo.apirest.response.PersonResult
import com.qbo.apppatronesdiseo.apirest.response.Result
import retrofit2.Call
import retrofit2.http.GET

interface PersonService {

    @GET("character")
    fun personList() : Call<PersonResult>
}