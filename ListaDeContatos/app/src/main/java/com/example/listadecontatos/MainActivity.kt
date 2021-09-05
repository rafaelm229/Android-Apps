package com.example.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // Recycler View
    private val rvlist: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    // Instance Adapter
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        update()

    }

    private fun bindView(){
        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager(this)

    }

    private fun update(){
        adapter.updateList(
            arrayListOf(
                Contact(
                    "Rafael Moura",
                    "(15)99601-5005",
                    "img.jpg"
                )
            )
        )
    }

}