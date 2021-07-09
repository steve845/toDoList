package com.example.asg3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //list/arrays
      val weekdays= listOf<String>()
        var register= arrayListOf("joan","shane","shem","ham")
        val shem: String= register.removeAt(2)
        register[0] ="david"
        register.size



    }
}