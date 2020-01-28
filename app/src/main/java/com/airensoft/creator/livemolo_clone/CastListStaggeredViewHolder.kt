package com.airensoft.creator.livemolo_clone


import android.util.Log
import android.view.View
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.airensoft.creator.livemolo_clone.model.CastModel

import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.recyclerview_row.view.*
import java.util.*

class CastListStaggeredViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(castModel: CastModel) {
        itemView.castername.text = castModel.castername
        itemView.title.text = castModel.title
        itemView.viewer.text = castModel.viewer.toString() + "명"
        Glide.with(itemView.context).load(castModel.imageUrl).into(itemView.castImg)


    }


}