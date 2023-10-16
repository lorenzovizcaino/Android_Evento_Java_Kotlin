package com.example.android_evento_java_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button = this.findViewById(R.id.btn_to_metodo_xml)
        val intent = Intent(this,Ej01MetodoXMLActivity::class.java)
        b1.setOnClickListener {v -> startActivity(intent)}


    }
}