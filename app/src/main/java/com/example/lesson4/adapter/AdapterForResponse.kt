package com.example.lesson4.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.R
import com.example.lesson4.databinding.ItemHistoryBinding

class AdapterForResponse: RecyclerView.Adapter<AdapterForResponse.ThirdeHolder>() {

    private val historyList = arrayListOf<String>()

    class ThirdeHolder(item: View): RecyclerView.ViewHolder(item) {
        private val binding = ItemHistoryBinding.bind(item)

        fun bind(historyList: String) = with(binding){
            recyclerText.text = historyList
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdeHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_history,parent,false)
        return ThirdeHolder(view)
    }

    override fun onBindViewHolder(holder: ThirdeHolder, position: Int) {
        holder.bind(historyList[position])
    }

    override fun getItemCount()= historyList.size

    @SuppressLint("NotifyDataSetChanged")
    fun add(historyList: String){
        this.historyList.add(historyList)
        notifyDataSetChanged()
    }
}