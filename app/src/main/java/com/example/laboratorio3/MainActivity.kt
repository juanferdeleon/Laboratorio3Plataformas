package com.example.laboratorio3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set name button
        nameButton = findViewById(R.id.setName)

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

                isNameShown = false

            }

        }

    }
}
