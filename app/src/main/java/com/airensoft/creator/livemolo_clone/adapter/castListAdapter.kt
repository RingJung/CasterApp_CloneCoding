package com.airensoft.creator.livemolo_clone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.airensoft.creator.livemolo_clone.CastListStaggeredViewHolder
import com.airensoft.creator.livemolo_clone.model.CastModel
import com.airensoft.creator.livemolo_clone.R


class CastListStaggeredAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listOfCast = listOf<CastModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CastListStaggeredViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.recyclerview_row, parent, false)
        )
    }

    override fun getItemCount(): Int = listOfCast.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val movieViewHolder = viewHolder as CastListStaggeredViewHolder
        movieViewHolder.bindView(listOfCast[position])
   }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    fun setCastList(listOfCasts: List<CastModel>) {
        this.listOfCast = listOfCasts
        notifyDataSetChanged()              //list  갱신
    }
}