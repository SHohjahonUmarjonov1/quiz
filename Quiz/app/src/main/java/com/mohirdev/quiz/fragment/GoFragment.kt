package com.mohirdev.quiz.fragment

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import com.example.quiz.R
import com.example.quiz.databinding.FragmentGoBinding
import com.google.gson.Gson

class GoFragment : Fragment() {
    private var _binding: FragmentGoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val json = arguments?.getString("subject", null) ?: return
        val bundle = bundleOf("subject" to json)
        binding.animationView.postDelayed({
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmentContainer, QuizFragment::class.java, bundle)
            }
        }, 4000)
    }


    companion object {
        @JvmStatic
        fun newInstance() = GoFragment()
    }
}