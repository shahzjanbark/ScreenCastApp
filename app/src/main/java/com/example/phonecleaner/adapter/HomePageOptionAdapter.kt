package com.example.phonecleaner.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.phonecleaner.data.HomeOptions
import com.example.phonecleaner.databinding.HomeItemRecyclerviewBinding

class HomePageOptionAdapter(val context : Context, val list : List<HomeOptions>) :
    RecyclerView.Adapter<HomePageOptionAdapter.MyViewHolder>() {



    class MyViewHolder(itemView: HomeItemRecyclerviewBinding) : ViewHolder(itemView.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = HomeItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }


    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder){
            with(list[position]){
                Log.e("Title", "title: ${this.title}")
                Log.e("Title", "description: ${this.description}")
            }
        }

    }


}