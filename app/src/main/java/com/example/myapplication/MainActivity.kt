package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate")

        editText = findViewById(R.id.editTextTextPersonName)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            val text = editText.text.toString()

            if (text.isEmpty()) {
                return@setOnClickListener
            }

            val i = Intent(this, ThirdActivity::class.java)
            i.putExtra("NAME", text)

            finish()

            startActivity(i)

        }

    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart")

    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy")
    }

}