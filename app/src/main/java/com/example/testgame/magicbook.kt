package com.example.testgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class magicbook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magicbook)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val Intent = Intent(this, sword::class.java)
            startActivity(Intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val Intent = Intent(this, goldenkey::class.java)
            startActivity(Intent)
        }
    }
}