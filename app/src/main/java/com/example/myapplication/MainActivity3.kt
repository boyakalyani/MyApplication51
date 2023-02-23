package com.example.myapplication

import android.content.Intent
import android.graphics.Color.rgb
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity3 : AppCompatActivity() {
    lateinit var kalyanilastbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Log.w("!","on create")

        kalyanilastbutton = findViewById(R.id.btn3)
        kalyanilastbutton.setOnClickListener() {
            var jaji = Intent(applicationContext, MainActivity4::class.java)
            startActivity(jaji)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.w("b","on start")
    }

    override fun onResume() {
        super.onResume()
        Log.w("c","on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("d","on pause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("e","on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("f","on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("g","on destroy")
    }
}
