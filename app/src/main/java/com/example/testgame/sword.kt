package com.example.testgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sword)

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val Intent = Intent(this, titlescreen::class.java)
            startActivity(Intent)
        }
    }
    }
