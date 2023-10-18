package com.example.android_evento_java_kotlin.ej02customlistener

import android.view.View
import android.widget.TextView

class CustomOnClickListener (tv:TextView):View.OnClickListener{

    var tv:TextView=tv

//    constructor(tv:TextView){
//        this.tv=tv
//
//    }
    override fun onClick(v: View) {
        tv.setText("Hi Teis2")
    }
}