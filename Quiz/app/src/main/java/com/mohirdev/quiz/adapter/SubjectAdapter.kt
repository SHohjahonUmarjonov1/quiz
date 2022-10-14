package com.mohirdev.quiz.adapter

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.databinding.SubjectItemsBinding
import com.mohirdev.quiz.model.SubjectsModel

class SubjectAdapter(var subjects:List<SubjectsModel>, val callback:(subject: SubjectsModel)->Unit):RecyclerView.Adapter<SubjectAdapter.ItemHolder>() {
    inner class ItemHolder(private val binding: SubjectItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(subject: SubjectsModel, position: Int) {
            binding.name.text="${position+1}. ${subject.name}"
            binding.subjectBtn.setOnClickListener {
                callback(subject)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(SubjectItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(subjects[position],position)
    }

    override fun getItemCount(): Int {
        return subjects.size
    }
}