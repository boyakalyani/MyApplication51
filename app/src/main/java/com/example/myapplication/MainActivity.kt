package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.w("a","on create")
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn1)
        btn.setOnClickListener (){
//                intent = Intent(applicationContext, MainActivity2::class.java)
//                startActivity(intent)
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
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
