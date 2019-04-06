package com.example.laboratorio3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import models.Place
import models.Places

/**
 * Laboratorio 3
 * @author Juan Fernando De Leon Quezada
 */
class MainActivity : AppCompatActivity() {

    private var isNameShown: Boolean = false
    private lateinit var editTxt: EditText
    private lateinit var nameTxtView: TextView
    private lateinit var userInput: TextView
    private lateinit var nameButton: Button
    private lateinit var antiguaButton: Button
    private lateinit var tikalButton: Button
    private lateinit var atitlanButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Array with places info
        val places = Places()

        //Set name button
        nameButton = findViewById(R.id.setName)
        //
        nameButton.setOnClickListener {

            if (!isNameShown){

                nameTxtView = findViewById(R.id.nameTxtView)
                editTxt = findViewById(R.id.editText)
                userInput = findViewById(R.id.userInput)

                val input: String = editTxt.text.toString()
                userInput.text = input

                nameTxtView.visibility = View.GONE
                editTxt.visibility = View.GONE

                isNameShown = true

            } else {

                nameTxtView.visibility = View.VISIBLE
                editTxt.visibility = View.VISIBLE
                userInput.visibility = View.GONE

                isNameShown = false

            }

            //Antigua Button
            antiguaButton = findViewById(R.id.antiguaButton)

            antiguaButton.setOnClickListener {

                val intent = Intent(this, Activity2::class.java).putExtra("place", places.places[0])
                startActivity(intent)

            }

        }

    }
}
