package com.app.kegiatan.seminar.data

import com.app.kegiatan.seminar.R
import com.app.kegiatan.seminar.model.Event

object EventRepository {

    fun getEvents(): List<Event> {
        return listOf(
            Event(1, "Seminar AI", "BEM", "20 Mei 2026", "Aula Kampus",
                "Seminar tentang AI", R.drawable.seminar1, "Seminar"),

            Event(2, "Workshop UI/UX", "HIMTI", "22 Mei 2026", "Lab Komputer",
                "Belajar UI/UX", R.drawable.seminar2, "Workshop"),

            Event(3, "Lomba Coding", "UKM IT", "25 Mei 2026", "Online",
                "Kompetisi coding", R.drawable.seminar3, "Lomba"),

            Event(4, "Seminar Karir", "CDC", "28 Mei 2026", "Aula Utama",
                "Tips karir", R.drawable.seminar4, "Seminar")
        )
    }

    fun getEventById(id: Int): Event? {
        return getEvents().find { it.id == id }
    }
}