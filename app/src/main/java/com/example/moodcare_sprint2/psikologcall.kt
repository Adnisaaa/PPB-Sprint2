package com.example.moodcare_sprint2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class psikologcall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psikolog_call)

        val nextbtn: Button = findViewById(R.id.nextButton)

        nextbtn.setOnClickListener {
            val intent = Intent(this, fiturcall::class.java)
            startActivity(intent)
        }
    }
}