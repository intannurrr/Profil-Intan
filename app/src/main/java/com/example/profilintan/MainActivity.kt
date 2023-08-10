package com.example.profilintan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfil: CardView = findViewById(R.id.profile)
        val btnAducation: CardView = findViewById(R.id.aducation)
        val btnSkill: CardView = findViewById(R.id.skill)
        val btnPortofolio: CardView = findViewById(R.id.portofolio)
        val btnHobby: CardView = findViewById(R.id.hobby)

        btnProfil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        btnAducation.setOnClickListener {
            val intent = Intent(this, SekolahActivity::class.java)
            startActivity(intent)
        }
        btnSkill.setOnClickListener {
            val intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)

        }
        btnPortofolio.setOnClickListener {
            val intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }
        btnHobby.setOnClickListener {
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
        }
    }
}