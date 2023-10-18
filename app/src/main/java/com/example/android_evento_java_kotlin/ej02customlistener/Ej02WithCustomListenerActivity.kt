package com.example.android_evento_java_kotlin.ej02customlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.android_evento_java_kotlin.R

class Ej02WithCustomListenerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_reutilizado)

        val b:Button=findViewById(R.id.button)
        val tv:TextView=findViewById(R.id.textView)

        b.setOnClickListener(CustomOnClickListener(tv))
    }
}