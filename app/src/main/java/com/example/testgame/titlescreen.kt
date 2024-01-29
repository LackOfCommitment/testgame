package com.example.testgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class titlescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_titlescreen)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val Intent = Intent(this,goldenkey::class.java)
            startActivity(Intent)
        }
//        }
    }
}
