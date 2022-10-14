package com.mohirdev.quiz.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quiz.R
import com.example.quiz.databinding.FragmentCoursesBinding
import com.google.gson.Gson
import com.mohirdev.quiz.adapter.CoursesAdapter
import com.mohirdev.quiz.model.ListPlanModel
import com.mohirdev.quiz.plans.android
import com.mohirdev.quiz.plans.english

class CoursesFragment : Fragment() {

    private var _binding:FragmentCoursesBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding=FragmentCoursesBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items = listOf(
            ListPlanModel("Matematika", R.drawable.math5, emptyList()),
            ListPlanModel("Ingliz tili", R.drawable.uk, english()),
            ListPlanModel("Arab tili",R.drawable.arabic, emptyList()),
            ListPlanModel("Rus tili", R.drawable.russia, emptyList()),
            ListPlanModel("Mental Arifmetika", R.drawable.math3, emptyList()),
            ListPlanModel("Pochemuchka", R.drawable.russia2, emptyList()),
            ListPlanModel("Robototexnika", R.drawable.robot, emptyList()),
            ListPlanModel("Android",R.drawable.android, android()),
            ListPlanModel("Kompyuter ilmlari", R.drawable.it2, emptyList()),
        )
            binding.courseRecycler.layoutManager = LinearLayoutManager(requireContext())
            binding.courseRecycler.adapter = CoursesAdapter(items,::sendPlan)
    }
    private fun sendPlan(coursePlan:ListPlanModel) {
        val bundle = bundleOf("plan" to Gson().toJson(coursePlan))
        requireActivity().supportFragmentManager.commit {
            replace(R.id.fragmentContainer,PlanFragment::class.java,bundle)
            addToBackStack(null)
        }
    }


    companion object {

        @JvmStatic
        fun newInstance() = CoursesFragment()
    }
}