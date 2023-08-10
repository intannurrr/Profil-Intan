package com.example.profilintan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectActivity : AppCompatActivity() {
    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<ProjectData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProject)
        projectView.layoutManager = LinearLayoutManager(this)

        list.add(ProjectData("UPB_XIPPLG2_3008","Aplikasi Android","https://github.com/intannurrr/UPB_XIPPLG2_3008")
        )
        list.add(ProjectData("Profil Guru","Aplikasi Android","https://github.com/intannurrr/projek-profil-guru"))

        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter
    }
}