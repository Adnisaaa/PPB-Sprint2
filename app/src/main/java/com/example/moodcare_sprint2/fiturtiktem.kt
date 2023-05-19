package com.example.moodcare_sprint2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class fiturtiktem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitur_tiktem)

        val titiktemu: Button = findViewById(R.id.temuiButton)

        titiktemu.setOnClickListener {
            val intent = Intent(this, metopem::class.java)
            startActivity(intent)
        }
    }
}