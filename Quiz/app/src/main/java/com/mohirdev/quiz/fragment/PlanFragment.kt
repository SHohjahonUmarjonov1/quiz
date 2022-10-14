package com.mohirdev.quiz.fragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quiz.databinding.FragmentPlanBinding
import com.google.gson.Gson
import com.mohirdev.quiz.adapter.PlanAdapter
import com.mohirdev.quiz.model.ListPlanModel

class PlanFragment : Fragment() {
    private var _binding:FragmentPlanBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding=FragmentPlanBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val json= arguments?.getString("plan") ?:return
        val coursePlan=Gson().fromJson(json, ListPlanModel::class.java)
        binding.courseName.text=coursePlan.name
        coursePlan.image?.let { binding.courseIcon.setImageResource(it) }?: kotlin.run { binding.courseIcon.isVisible=false }
        if (coursePlan.list.isEmpty()) {
            binding.planRecycler.isVisible=false
            val textView=TextView(requireContext())
            textView.layoutParams= ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            )
            textView.gravity=Gravity.CENTER
            textView.textSize= 32F
            textView.text="Hozircha ma'lumotlar mavjud emas"
            binding.linearPlan.addView(textView)
            return
        }
        binding.planRecycler.layoutManager=LinearLayoutManager(requireContext())
        binding.planRecycler.adapter=PlanAdapter(coursePlan)
    }

    companion object {
        @JvmStatic
        fun newInstance() = PlanFragment()
    }
}