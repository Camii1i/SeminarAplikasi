package com.app.kegiatan.seminar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.app.kegiatan.seminar.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnLihat)

        val btnExit = findViewById<Button>(R.id.btnExit)


        btn.setOnClickListener {
            startActivity(Intent(this, EventListActivity::class.java))
        }

        btnExit.setOnClickListener {
            finishAffinity() // 🔥 keluar dari semua activity
        }
    }
}