package com.airensoft.creator.livemolo_clone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.airensoft.creator.livemolo_clone.CastListStaggeredViewHolder
import com.airensoft.creator.livemolo_clone.CastModel
import com.airensoft.creator.livemolo_clone.R


class CastListStaggeredAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listOfMovies = listOf<CastModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CastListStaggeredViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.recyclerview_row, parent, false)
        )
    }

    override fun getItemCount(): Int = listOfMovies.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val movieViewHolder = viewHolder as CastListStaggeredViewHolder
        movieViewHolder.bindView(listOfMovies[position])
    }

    fun setMovieList(listOfCasts: List<CastModel>) {
        this.listOfMovies = listOfCasts
        notifyDataSetChanged()
    }
}