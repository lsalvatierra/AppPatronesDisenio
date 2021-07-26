package com.qbo.apppatronesdiseo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qbo.apppatronesdiseo.apirest.response.Result
import com.qbo.apppatronesdiseo.repository.PersonRepository
import okhttp3.Response
import retrofit2.Call
import retrofit2.Callback

class PersonViewModel : ViewModel() {

    private var repository = PersonRepository()

    fun personList(): LiveData<List<Result>> {
        return repository.personList()
    }

}