package com.delaroystudios.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.profile_item.view.*

class ProfileAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    var items: List<ProfileItems> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.profile_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is ItemViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(itemList: List<ProfileItems>){
        items = itemList
    }

    inner class ItemViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        fun bind(category: ProfileItems){

            itemView.ivGridImage.setImageResource(category.image)
        }

    }

}