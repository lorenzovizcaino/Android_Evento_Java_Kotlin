package com.example.android_evento_java_kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ej01MetodoXMLActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej01_metodo_xmlactivity)
    }

    fun miMetodoOnClick(view:View){
        val tv: TextView = findViewById(R.id.textView)
        tv.setText("Hi Teis")
    }


}