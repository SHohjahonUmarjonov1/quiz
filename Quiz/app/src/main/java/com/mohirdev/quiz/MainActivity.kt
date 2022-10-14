package com.mohirdev.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.navigation.NavController
import androidx.navigation.NavHost
import com.example.quiz.R
import com.example.quiz.databinding.ActivityMainBinding
import com.mohirdev.quiz.fragment.HomeFragment
import com.mohirdev.quiz.fragment.ResultFragment
import com.mohirdev.quiz.fragment.SplashFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val navController:NavController
    get() = (supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHost).navController
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         Thread{
             binding=ActivityMainBinding.inflate(layoutInflater)
             setContentView(binding.root)
             supportFragmentManager.commit {
                 add(R.id.fragmentContainer, SplashFragment())
             }
         }.start()
    }
}