package com.example.laboratorio3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import models.Place

/**
 * Activity 2
 * @author Juan Fernando De Leon Quezada
 */
class Activity2 : AppCompatActivity() {

    private lateinit var title: TextView
    private lateinit var phrase: TextView
    private lateinit var description: TextView
    private lateinit var commentEditText: EditText
    private lateinit var comment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        title = findViewById(R.id.title)
        phrase = findViewById(R.id.phraseTextView)
        description = findViewById(R.id.description)

        val place = intent.getSerializableExtra("place") as Place

        title.text = place.title
        phrase.text = place.phrase
        description.text = place.description

        commentEditText = findViewById(R.id.commentEditText)
        comment = findViewById(R.id.commentButton)

        comment.setOnClickListener {

            val commentText: String = commentEditText.text.toString()

            Toast.makeText(this, commentText, Toast.LENGTH_SHORT).show()

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}
