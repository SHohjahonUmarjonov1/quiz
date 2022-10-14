package com.mohirdev.quiz.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.R
import com.mohirdev.quiz.adapter.ErrorAdapter
import com.mohirdev.quiz.adapter.SubjectAdapter
import com.example.quiz.databinding.FragmentErrorBinding
import com.mohirdev.quiz.model.QuizModel
import com.mohirdev.quiz.model.SubjectsModel
import com.mohirdev.quiz.storage.Preferences
import com.mohirdev.quiz.tests.tests
import com.google.gson.Gson


class ErrorFragment : Fragment() {
    private var _binding: FragmentErrorBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentErrorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val storage = Preferences(requireContext())
        val errorsIndex = storage.getIndex()
        val json = arguments?.getString("subject")
        val errorList = mutableListOf<QuizModel>()
        val subject = Gson().fromJson(json, SubjectsModel::class.java)
        for (i in errorsIndex) {
            errorList.add(subject.quiz[i])
        }
        binding.errorRecycler.adapter = ErrorAdapter(errorList)
        binding.errorRecycler.layoutManager = LinearLayoutManager(requireContext())
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = ErrorFragment()
    }
}