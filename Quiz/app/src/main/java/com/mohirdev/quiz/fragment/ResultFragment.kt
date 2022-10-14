package com.mohirdev.quiz.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.quiz.R
import com.example.quiz.databinding.FragmentResultBinding
import com.mohirdev.quiz.model.SubjectsModel
import com.mohirdev.quiz.storage.Preferences
import com.google.gson.Gson

class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            val json = arguments?.getString("answer") ?: return
            val subject = Gson().fromJson(json, SubjectsModel::class.java)
            val storage = Preferences(requireContext())
            var errorList = storage.getIndex()
            if (errorList.isEmpty()) {
                binding.text.isVisible = true
                binding.errorList.isVisible = false
                binding.text.text = "Tabriklaymiz!! Siz barcha savollarga to'g'ri javob berdingiz"
            }
            binding.resultText.text =
                "${(subject.quiz.size - errorList.size)}/${(subject.quiz.size)} \n Sizning foiz ko'rsatkichingiz ${Math.round((subject.quiz.size - errorList.size) / subject.quiz.size.toFloat() * 100*100).toFloat()/100}%"
            binding.rating.rating =
                (5 * ((subject.quiz.size - errorList.size) / subject.quiz.size.toFloat()))
            binding.rating.isEnabled = false

            binding.errorList.setOnClickListener {
                val bundle = bundleOf("subject" to Gson().toJson(subject))
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fragmentContainer, ErrorFragment::class.java, bundle)
                    addToBackStack(null)
                }
            }
            binding.info.setOnClickListener {
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fragmentContainer, InfoFragment())
                    addToBackStack(null)
                }
            }
            binding.back.setOnClickListener {
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fragmentContainer, HomeFragment())
                    disallowAddToBackStack()
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = ResultFragment()
    }
}