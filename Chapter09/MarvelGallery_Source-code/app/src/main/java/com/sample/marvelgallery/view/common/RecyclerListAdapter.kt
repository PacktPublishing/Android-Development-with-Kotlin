package com.sample.marvelgallery.view.common

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

open class RecyclerListAdapter( // 1
        var items: List<AnyItemAdapter> = listOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override final fun getItemCount() = items.size // 4

    override final fun getItemViewType(position: Int) = items[position].layoutId // 3, 4

    override final fun onCreateViewHolder(parent: ViewGroup, layoutId: Int): RecyclerView.ViewHolder { // 4
        val itemView = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return items.first { it.layoutId == layoutId }.onCreateViewHolder(itemView) // 3
    }

    override final fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) { // 4
        items[position].bindViewHolder(holder)
    }
}

typealias AnyItemAdapter = ItemAdapter<out RecyclerView.ViewHolder> // 5
