package com.example.recyclerviewlistkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlistkotlin.databinding.FruitsLayoutBinding

class MyAdapter(val List: ArrayList<String>)  :RecyclerView.Adapter<MyAdapter.FruitsHolder>(){

    inner class FruitsHolder(val binding: FruitsLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding2 = FruitsLayoutBinding.inflate(inflater,parent,false)
        return FruitsHolder(binding2)
    }

    override fun onBindViewHolder(holder: FruitsHolder, position: Int) {
        val data = List[position]
        holder.binding.tvShowFruitsName.text = data//data set

    }

    override fun getItemCount(): Int {
        return List.size//size of list
    }
}