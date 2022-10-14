package com.mohirdev.quiz.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.R
import com.example.quiz.databinding.ErrorItemsBinding
import com.example.quiz.databinding.FragmentErrorBinding
import com.example.quiz.databinding.FragmentQuizBinding
import com.example.quiz.databinding.SubjectItemsBinding
import com.mohirdev.quiz.model.QuizModel
import com.mohirdev.quiz.model.SubjectsModel

class ErrorAdapter(var errors: List<QuizModel>) :
    RecyclerView.Adapter<ErrorAdapter.ItemHolder>() {
    inner class ItemHolder(private val binding: ErrorItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("ResourceAsColor")
        fun bind(subject: QuizModel, position: Int) {
            binding.quizTitle.text = subject.title
            binding.btnA.text = subject.answerA
            binding.btnB.text = subject.answerB
            binding.btnC.text = subject.answerC
            binding.btnD.text = subject.answerD
            if (subject.answer == "A") {
                binding.btnA.setIconResource(R.drawable.ic_check)
            } else {
                binding.btnA.setIconResource(R.drawable.ic_error)
            }
            if (subject.answer == "B") {
                binding.btnB.setIconResource(R.drawable.ic_check)
            } else {
                binding.btnB.setIconResource(R.drawable.ic_error)
            }
            if (subject.answer == "C") {
                binding.btnC.setIconResource(R.drawable.ic_check)
            } else {
                binding.btnC.setIconResource(R.drawable.ic_error)
            }
            if (subject.answer == "D") {
                binding.btnD.setIconResource(R.drawable.ic_check)
            } else {
                binding.btnD.setIconResource(R.drawable.ic_error)
            }
            if (subject.image == null) {
                binding.quizImage.isVisible = false
            } else {
                binding.quizImage.setImageResource(subject.image)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            ErrorItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(errors[position], position)
    }

    override fun getItemCount(): Int {
        return errors.size
    }
}