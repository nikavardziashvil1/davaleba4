package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity() {
    private lateinit var editLastName: EditText
    private lateinit var nextButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        editLastName = findViewById(R.id.editTextTextPersonName2)
        nextButton = findViewById(R.id.button5)
        val name = intent.extras?.getString("NAME")

        nextButton.setOnClickListener() {

            val lastName = editLastName.text.toString()

            if (lastName.isEmpty()) {
                return@setOnClickListener
            }

            val i = Intent(this, SecondActivity::class.java)

            i.putExtra("NAME" , name)
            i.putExtra("LASTNAME", lastName)

            startActivity(i)
        }

    }
}