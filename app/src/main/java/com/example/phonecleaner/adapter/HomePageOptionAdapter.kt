package com.example.phonecleaner.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.phonecleaner.data.HomeOptions
import com.example.phonecleaner.databinding.HomeItemRecyclerviewBinding

class HomePageOptionAdapter(val context : Context, val list : List<HomeOptions>) :
    RecyclerView.Adapter<HomePageOptionAdapter.MyViewHolder>() {



    class MyViewHolder(itemView: HomeItemRecyclerviewBinding) : ViewHolder(itemView.root) {
        val catTitleTv = itemView.catTitleTv
        val catIV = itemView.catIV
        val catDescTv = itemView.catDescTv
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
               holder.catTitleTv.text = this.title
               holder.catIV.setImageDrawable(ResourcesCompat.getDrawable(context.resources, this.icon, null))
               holder.catDescTv.text = this.description
            }
        }

    }


}