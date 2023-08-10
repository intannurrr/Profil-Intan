package com.example.profilintan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {
    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    var list = ArrayList<SekolahData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager(this)

        list.add(SekolahData("SDN Tugu 1","Pangkalan Tugu Kec Sayung Kab Demak"))
        list.add(SekolahData("SMP Miftahul Ulum Boarding School","Jogoloyo Wonosalam Demak"))
        list.add(SekolahData("SMKN 1 Sayung","Jl.Raya Semarang-Demak KM 14 Onggorawe"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}