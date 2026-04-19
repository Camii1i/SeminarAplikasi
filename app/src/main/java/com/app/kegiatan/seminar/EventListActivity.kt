package com.app.kegiatan.seminar

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.app.kegiatan.seminar.R
import com.app.kegiatan.seminar.adapter.EventAdapter
import com.app.kegiatan.seminar.data.EventRepository
import android.widget.ImageView

class EventListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list) // layout list kamu

        val listView = findViewById<ListView>(R.id.listView)

        val events = EventRepository.getEvents()
        val adapter = EventAdapter(this, events)
        listView.adapter = adapter
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, EventDetailActivity::class.java)
            intent.putExtra("event_id", events[position].id)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}