package com.example.laboratorio3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import models.Place

class Activity2 : AppCompatActivity() {

    private lateinit var title: TextView
    private lateinit var  phrase: TextView
    private lateinit var description: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        title = findViewById(R.id.title)
        phrase = findViewById(R.id.phrase)
        description = findViewById(R.id.description)

        val place = intent.getSerializableExtra("place") as Place

        title.text = place.title
        phrase.text = place.phrase
        description.text = place.description

    }
}
