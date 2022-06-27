package com.jantonioc.layoutstylethemes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvCources:TextView
    lateinit var tvExams:TextView
    lateinit var tvFreeLance:TextView
    lateinit var tvInfo:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCources = findViewById(R.id.tvcources)
        tvExams = findViewById(R.id.tvexams)
        tvFreeLance = findViewById(R.id.tvfreelance)
        tvInfo = findViewById(R.id.info)


    }

    fun display(view: View)
    {
        tvInfo.text = "Android Application Development, Android Security Essentials and Monetize Android Applications"
    }
}