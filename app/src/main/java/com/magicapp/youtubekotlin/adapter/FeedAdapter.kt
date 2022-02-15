package com.magicapp.youtubekotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.magicapp.youtubekotlin.R
import com.magicapp.youtubekotlin.model.Feed

class FeedAdapter(var context: Context, var items: ArrayList<Feed>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_vedios, parent, false)
        return FeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val video = items[position]

        if (holder is FeedViewHolder){
            var iv_profile = holder.iv_profile
            var iv_vedio = holder.iv_vedio

            iv_profile.setImageResource(video.profile)
            iv_vedio.setImageResource(video.photo)
         }
    }
    class FeedViewHolder(view: View): RecyclerView.ViewHolder(view){
        var iv_profile: ShapeableImageView
        var iv_vedio: ImageView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            iv_vedio = view.findViewById(R.id.iv_video)
        }
    }


}