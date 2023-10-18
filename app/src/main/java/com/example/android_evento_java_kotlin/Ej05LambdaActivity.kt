package com.example.android_evento_java_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Ej05LambdaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_reutilizado)

        val tv: TextView = findViewById(R.id.textView)
        val b: Button = findViewById(R.id.button)
        b.setOnClickListener { tv.setText("Hi Teis5") }
    }
}