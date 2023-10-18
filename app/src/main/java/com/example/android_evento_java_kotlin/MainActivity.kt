package com.example.android_evento_java_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android_evento_java_kotlin.ej02customlistener.Ej02WithCustomListenerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button = this.findViewById(R.id.btn_to_metodo_xml)
        val intent = Intent(this,Ej01MetodoXMLActivity::class.java)
        b1.setOnClickListener {v -> startActivity(intent)}

        val b2: Button = this.findViewById(R.id.btn_to_listener_personalizado)
        b2.setOnClickListener { v-> startActivity(Intent(this, Ej02WithCustomListenerActivity::class.java)) }

        val b3: Button = this.findViewById(R.id.btn_to_listener_personalizado_inner)
        b3.setOnClickListener { v-> startActivity(Intent(this, Ej03WithInnerCustomListenerActivity::class.java)) }

        val b4: Button = this.findViewById(R.id.btn_to_clase_anonima)
        b4.setOnClickListener { v-> startActivity(Intent(this, Ej04ClaseAnonimaActivity::class.java)) }

        val b5: Button = this.findViewById(R.id.btn_to_lambda)
        b5.setOnClickListener { v-> startActivity(Intent(this, Ej05LambdaActivity::class.java)) }

        val b6: Button = this.findViewById(R.id.btn_to_activity_listener)
        b6.setOnClickListener { v-> startActivity(Intent(this, Ej06ListenerIsActivity::class.java)) }


    }
}