package com.josty.genshin.characters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.josty.genshin.databinding.ItemCharactersBinding

class CharactersAdapter(private var list: List<CharactersListItem>) :
    RecyclerView.Adapter<CharactersAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(list[position])
    override fun getItemCount(): Int = if (list.isNotEmpty()) list.size else 0


    inner class ViewHolder(private val binding: ItemCharactersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: CharactersListItem) {
            binding.title.text = item.title
            binding.star.text = item.star
//            binding.icon
//            TODO fill ImageView
        }
    }
}