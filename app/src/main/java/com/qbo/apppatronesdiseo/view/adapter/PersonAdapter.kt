package com.qbo.apppatronesdiseo.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.qbo.apppatronesdiseo.apirest.response.Result
import com.qbo.apppatronesdiseo.databinding.PersonItemBinding


class PersonAdapter(private val listPersonaje: List<Result>)
    : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    inner class ViewHolder (val binding: PersonItemBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonAdapter.ViewHolder {
        val binding = PersonItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonAdapter.ViewHolder, position: Int) {
        with(holder){
            with(listPersonaje[position]){
                binding.tvnombre.text = name
                binding.tvgenero.text = gender
            }
        }
    }

    override fun getItemCount() = listPersonaje.size
}