package com.example.moodcare_sprint2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class fiturvideocall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitur_video_call)

        val endvideocall: ImageView = findViewById(R.id.endcallvideoIcon)

        endvideocall.setOnClickListener {
            val intent = Intent(this, metopem::class.java)
            startActivity(intent)
        }
    }
}