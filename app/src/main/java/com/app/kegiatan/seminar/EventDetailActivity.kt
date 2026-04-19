package com.app.kegiatan.seminar

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.kegiatan.seminar.R
import com.app.kegiatan.seminar.data.EventRepository
import android.widget.ImageView

class EventDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        val id = intent.getIntExtra("event_id", -1)
        val event = EventRepository.getEventById(id)

        val nama = findViewById<TextView>(R.id.namaEvent)
        val deskripsi = findViewById<TextView>(R.id.deskripsi)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val img = findViewById<ImageView>(R.id.imgEvent)
        val btnKembali = findViewById<Button>(R.id.btnKembali)

        event?.let {
            nama.text = it.namaEvent
            deskripsi.text = it.deskripsi
            img.setImageResource(it.imageResId) // 🔥 INI YANG PENTING
        }

        btnDaftar.setOnClickListener {
            Toast.makeText(this, "Berhasil daftar event!", Toast.LENGTH_SHORT).show()
        }

        btnKembali.setOnClickListener {
            finish()
        }
    }
}