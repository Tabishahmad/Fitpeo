package com.example.fitpeo.presentation.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.fitpeo.common.loadImageWithPicasso
import com.example.fitpeo.databinding.ImageRowBinding
import com.example.fitpeo.domain.model.Album

class ImageListAdapter : RecyclerView.Adapter<ImageListAdapter.ImageHolder>() {

    private var layoutInflater: LayoutInflater? = null
    var imageClickListener: ItemClickListener? = null
    var items: List<Album> = emptyList()

    class ImageHolder(val b: ImageRowBinding) : RecyclerView.ViewHolder(b.root) {
       fun setImage(thumbnailURL:String?) {
            b.iv.loadImageWithPicasso(b.iv.context, thumbnailURL)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val b = ImageRowBinding.inflate(layoutInflater!!, parent, false)
        return ImageHolder(b)
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        val book = items.get(position)
        holder.setImage(book.thumbnailUrl)
        holder.b.card.setOnClickListener {
            imageClickListener?.onItemClick(it, book, position)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    fun setClickListener(listener: ItemClickListener) {
        this.imageClickListener = listener
    }

    fun interface ItemClickListener {
        fun onItemClick(view: View, any: Any, index: Int)
    }
    fun updateList(newList: List<Album>) {
        val diffCallback = RecycleViewDiffUtil(items, newList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        items = newList
        diffResult.dispatchUpdatesTo(this)
    }
}