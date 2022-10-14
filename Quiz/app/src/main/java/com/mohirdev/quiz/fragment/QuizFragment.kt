package com.mohirdev.quiz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.commit
import com.mohirdev.quiz.MainActivity
import com.example.quiz.R
import com.example.quiz.databinding.FragmentQuizBinding
import com.mohirdev.quiz.model.SubjectsModel
import com.mohirdev.quiz.storage.Preferences
import com.google.gson.Gson


class QuizFragment : Fragment() {
    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!
    private var index = 0
    private var answerCount = 0.0
    private var errorAnswer= mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val json = arguments?.getString("subject", null) ?: return
        var subject = Gson().fromJson(json, SubjectsModel::class.java)
        if (subject.quiz.size>10){
            subject.quiz=subject.quiz.shuffled().subList(0,10)
        }else{
            subject.quiz=subject.quiz.shuffled()
        }

        fun nextQuiz() {
            if (index < subject.quiz.size) {
                binding.quizTitle.text = subject.quiz[index].title
                if (subject.quiz[index].image == null) {
                    binding.quizImage.isVisible = false
                } else {
                    binding.quizImage.isVisible=true
                    binding.quizImage.setImageResource(subject.quiz[index].image!!)
                }
                binding.btnA.text = subject.quiz[index].answerA
                binding.btnB.text = subject.quiz[index].answerB
                binding.btnC.text = subject.quiz[index].answerC
                binding.btnD.text = subject.quiz[index].answerD
            } else {
                Toast.makeText(
                    requireContext(),
                    "Siz ${answerCount.toInt()} ta savolga to'g'ri javob berdingiz ! ",
                    Toast.LENGTH_SHORT
                ).show()
                requireActivity().supportFragmentManager.commit {
                    val bundle= bundleOf("answer" to Gson().toJson(subject))
                    replace(R.id.fragmentContainer, ResultFragment::class.java,bundle)
                }
                val storage= Preferences(requireContext())
                storage.setIndex(errorAnswer)
            }
        }
        nextQuiz()
        binding.btnA.setOnClickListener {
            if (index>=subject.quiz.size){
                return@setOnClickListener
            }
            if (subject.quiz[index].answer == "A") {
                answerCount++
            }else{
                errorAnswer.add(index)
            }
            index++
            nextQuiz()
        }
        binding.btnB.setOnClickListener {
            if (index>=subject.quiz.size){
                return@setOnClickListener
            }
            if (subject.quiz[index].answer == "B") {
                answerCount++
            }else{
                errorAnswer.add(index)
            }
            index++
            nextQuiz()
        }
        binding.btnC.setOnClickListener {
            if (index>=subject.quiz.size){
                return@setOnClickListener
            }
            if (subject.quiz[index].answer == "C") {
                answerCount++
            }else{
                errorAnswer.add(index)
            }
            index++
            nextQuiz()
        }
        binding.btnD.setOnClickListener {
            if (index>=subject.quiz.size){
                return@setOnClickListener
            }
            if (subject.quiz[index].answer == "D") {
                answerCount++
            }else{
                errorAnswer.add(index)
            }
            index++
            nextQuiz()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

    companion object {
        @JvmStatic
        fun newInstance() = QuizFragment()
    }
}