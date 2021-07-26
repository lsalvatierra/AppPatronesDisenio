package com.qbo.apppatronesdiseo.apirest

import com.qbo.apppatronesdiseo.apirest.service.PersonService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    //es un singleton, solo lo instanciará una vez y lo reutilizará para la próxima llamada
    private fun builderRetrofit() = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // Por definición lazy es una función que durante la primera invocación
    // ejecuta el lambda que se le haya pasado y en posteriores invocaciones
    // retornará el valor computado inicialmente.
    // Entonces retrofitService solo se inicializará la primera vez que
    // llame y luego reutilizará ese mismo valor
    val retrofitService: PersonService by lazy {
        builderRetrofit().create(PersonService::class.java)
    }
}