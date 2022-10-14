package com.mohirdev.quiz.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.quiz.R
import com.example.quiz.databinding.FragmentHomeBinding
import com.google.gson.Gson
import com.mohirdev.quiz.adapter.SubjectAdapter
import com.mohirdev.quiz.model.SubjectsModel
import com.mohirdev.quiz.tests.tests

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            val subjects = tests()
            binding.recycler.adapter = SubjectAdapter(subjects, ::toQuiz)
    }

    private fun toQuiz(subject: SubjectsModel) {
        val bundle = bundleOf("subject" to Gson().toJson(subject))
        requireActivity().supportFragmentManager.commit {
            replace(R.id.fragmentContainer, GoFragment::class.java,bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}