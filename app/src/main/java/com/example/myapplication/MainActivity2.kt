package com.example.myapplication

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.content.ContextCompat
import java.net.URL

class MainActivity2 : AppCompatActivity() {
    lateinit var bn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.w("1","on create")

        bn = findViewById(R.id.btn2)
        bn.setOnClickListener(){
            bn.text="hi kalyani"
            bn.setBackgroundColor(resources.getColor(R.color.purple_700))//not working
            bn.backgroundTintList= ContextCompat.getColorStateList(this@MainActivity2,R.color.black)//working
            var inten=Intent(this,MainActivity3::class.java)
            startActivity(inten)
        }
    }override fun onStart() {
        super.onStart()
        Log.w("2","on start")
    }

    override fun onResume() {
        super.onResume()
        Log.w("3","on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("4","on pause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("5","on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("6","on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("7","on destroy")
    }
}

