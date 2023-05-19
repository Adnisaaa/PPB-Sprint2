package com.example.moodcare_sprint2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val callButton: Button = findViewById(R.id.callbtn)
        val VideoCallButton: Button = findViewById(R.id.vcbtn)
        val ChatButton: Button = findViewById(R.id.chatbtn)
        val TitikTemuButton: Button = findViewById(R.id.tiktembtn)
        val RekamMedisButton: ImageButton = findViewById(R.id.rekambtn)
        val pfButton: ImageButton = findViewById(R.id.profilebtn)

        pfButton.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }
        RekamMedisButton.setOnClickListener {
            val intent = Intent(this, RekamPsikolog::class.java)
            startActivity(intent)
        }
        callButton.setOnClickListener {
            val intent = Intent(this, psikologcall::class.java)
            startActivity(intent)
        }
        VideoCallButton.setOnClickListener {
            val intent = Intent(this, psikologvideocall::class.java)
            startActivity(intent)
        }
        ChatButton.setOnClickListener {
            val intent = Intent(this, psikologchat::class.java)
            startActivity(intent)
        }
        TitikTemuButton.setOnClickListener {
            val intent = Intent(this, fiturtiktem::class.java)
            startActivity(intent)
        }
    }
}