package com.example.android_evento_java_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Ej06ListenerIsActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_reutilizado)
        tv= findViewById(R.id.textView)
        val b: Button = findViewById(R.id.button)
        b.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        tv.setText("Hi Teis6")
    }
}