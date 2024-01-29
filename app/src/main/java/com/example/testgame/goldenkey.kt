package com.example.testgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class goldenkey : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goldenkey)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val Intent = Intent(this,magicbook::class.java)
            startActivity(Intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val Intent = Intent(this, nothingtodo::class.java)
            startActivity(Intent)

        }


    }
}