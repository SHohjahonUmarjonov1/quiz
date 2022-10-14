package com.mohirdev.quiz.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.databinding.CourseItemsBinding
import com.mohirdev.quiz.model.ListPlanModel
import com.mohirdev.quiz.plans.android

class CoursesAdapter(var items: List<ListPlanModel>,val onClick:(course:ListPlanModel)->Unit):RecyclerView.Adapter<CoursesAdapter.ItemHolder>() {
    inner class ItemHolder(private val binding: CourseItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:ListPlanModel,position: Int){
            binding.courseName.text=item.name
            item.image?.let { binding.courseIcon1.setImageResource(it) }
            item.image?.let { binding.courseIcon2.setImageResource(it) }
            binding.courseName.setOnClickListener {
                onClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(CourseItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(items[position],position)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}