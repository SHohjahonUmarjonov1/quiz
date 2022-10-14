package com.mohirdev.quiz.storage

import android.content.Context
import com.google.gson.Gson

class Preferences(context: Context) {
    private var preferences=context.getSharedPreferences("preferences",Context.MODE_PRIVATE)
    fun setIndex(list: List<Int>) {
        preferences.edit().putString("error",Gson().toJson(list)).apply()
    }
    fun getIndex() : List<Int>{
        val json=preferences.getString("error",null)
        return Gson().fromJson<List<Int>>(json,List::class.java)
    }
}