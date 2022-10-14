package com.mohirdev.quiz.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.databinding.PlanItemsBinding
import com.mohirdev.quiz.model.ListPlanModel
import com.mohirdev.quiz.model.PlanModel

class PlanAdapter(private val items:ListPlanModel):RecyclerView.Adapter<PlanAdapter.ItemHolder>() {
    inner class ItemHolder(private val binding: PlanItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:ListPlanModel, position: Int) {
            binding.title.text=item.list[position].title
            binding.body.text=item.list[position].body
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(PlanItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(items,position)
    }

    override fun getItemCount(): Int {
        return items.list.size
    }
}