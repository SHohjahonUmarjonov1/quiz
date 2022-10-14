package com.mohirdev.quiz.model

data class QuizModel(
    val title:String,
    val image:Int?,
    val answerA:String,
    val answerB:String,
    val answerC:String,
    val answerD:String,
    val answer: String
)
