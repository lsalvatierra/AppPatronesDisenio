package com.qbo.apppatronesdiseo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.qbo.apppatronesdiseo.R
import com.qbo.apppatronesdiseo.databinding.ActivityMainBinding

import com.qbo.apppatronesdiseo.view.adapter.PersonAdapter
import com.qbo.apppatronesdiseo.viewmodel.PersonViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var personViewModel: PersonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        personViewModel = ViewModelProvider(this)
            .get(PersonViewModel::class.java)
        binding.rvpersonajes.layoutManager =
            GridLayoutManager(applicationContext, 2)
        personViewModel.personList().observe(this,
            Observer {
                binding.rvpersonajes.adapter = PersonAdapter(it)
            })
    }

}