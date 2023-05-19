package com.example.moodcare_sprint2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class fiturcall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitur_call)

        val endcall: ImageView = findViewById(R.id.endcallIcon)

        endcall.setOnClickListener {
            val intent = Intent(this, metopem::class.java)
            startActivity(intent)
        }
    }
}