package com.mohirdev.quiz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.quiz.R
import com.example.quiz.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.animationView.postOnAnimationDelayed({
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmentContainer, HomeFragment())
            }
        }, 3000)
    }

    companion object {

        @JvmStatic
        fun newInstance() = SplashFragment()
    }
}