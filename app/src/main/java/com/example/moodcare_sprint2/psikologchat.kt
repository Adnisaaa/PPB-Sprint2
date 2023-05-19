package com.example.moodcare_sprint2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class psikologchat : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psikolog_chat)

        val nextchatbtn: Button = findViewById(R.id.nextchatButton)

        nextchatbtn.setOnClickListener {
            val intent = Intent(this, fiturchat::class.java)
            startActivity(intent)
        }
    }
}