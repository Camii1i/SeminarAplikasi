package com.app.kegiatan.seminar.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.app.kegiatan.seminar.R
import com.app.kegiatan.seminar.model.Event

class EventAdapter(
    private val activity: Activity,
    private val listEvent: List<Event>
) : BaseAdapter() {

    override fun getCount(): Int = listEvent.size

    override fun getItem(position: Int): Any = listEvent[position]

    override fun getItemId(position: Int): Long = listEvent[position].id.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = convertView ?: LayoutInflater.from(activity)
            .inflate(R.layout.item_event, parent, false)

        val img = view.findViewById<ImageView>(R.id.imgEvent)
        val nama = view.findViewById<TextView>(R.id.txtNama)
        val tanggal = view.findViewById<TextView>(R.id.txtTanggal)
        val lokasi = view.findViewById<TextView>(R.id.txtLokasi)

        val event = listEvent[position]

        img.setImageResource(event.imageResId)
        nama.text = event.namaEvent
        tanggal.text = event.tanggal
        lokasi.text = event.lokasi

        return view
    }
}