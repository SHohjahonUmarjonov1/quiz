package com.mohirdev.quiz.model

data class ListPlanModel(
    val name:String,
    val image: Int?,
    val list: List<PlanModel>
)