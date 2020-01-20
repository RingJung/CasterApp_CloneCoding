package com.airensoft.creator.livemolo_clone


import android.view.View

import androidx.recyclerview.widget.RecyclerView
import com.airensoft.creator.livemolo_clone.model.CastModel

import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.recyclerview_row.view.*
import java.util.*

class CastListStaggeredViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val mRandom = Random()
    fun bindView(castModel: CastModel) {
        itemView.castername.text = castModel.castername
        itemView.title.text = castModel.title
        itemView.viewer.text = castModel.viewer.toString() + "명"
        //itemView.castImg.layoutParams.height = getRandomIntInRange(250, 150)
        Glide.with(itemView.context).load(castModel.imageUrl).into(itemView.castImg)
    }

    private fun getRandomIntInRange(max: Int, min: Int): Int {
        return mRandom.nextInt(max - min + min) + min
    }
}