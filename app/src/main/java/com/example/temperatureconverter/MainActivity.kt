package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  btnconvert: Button = findViewById(R.id.btn)
        val etcelsius: EditText = findViewById(R.id.editTextNumber)
        val etfahrenheit: TextView = findViewById(R.id.tverror)
        val btnrefresh: Button = findViewById(R.id.btn1)

        btnconvert.setOnClickListener{
            val celsius=etcelsius.text.toString().toInt()

            val  FAH=celsius*9/5+32

            etfahrenheit.text=FAH.toString()
        }

        //refresh button
        btnrefresh.setOnClickListener {
            etcelsius.setText("")
        }
    }
}