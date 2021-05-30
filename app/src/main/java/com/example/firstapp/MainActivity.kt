package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun toPalindromesActivity(){
            val intent = Intent(this, Palindromes::class.java)
            startActivity(intent)
        }

        fun toFarenheitCalculatorActivity(){
            val intent = Intent(this, FahrenheitCalculator::class.java)
            startActivity(intent)
        }

        var palindromeButton = findViewById<Button>(R.id.palindromeButton)

        palindromeButton.setOnClickListener {
            toPalindromesActivity()
        }

        var farenheitButton = findViewById<Button>(R.id.farenheitCalculatorButton)

        farenheitButton.setOnClickListener{
            toFarenheitCalculatorActivity()
        }
    }
}