package com.example.firstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.graphics.Color

class Palindromes : AppCompatActivity() {
    val PALINDROME = "The input is a palindrome :D"
    val NOT_PALINDROME = "The input is not a palindrome :("

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindromes)

        var inputText = findViewById<EditText>(R.id.palindromeInput)
        val checkButton = findViewById<Button>(R.id.checkPalindromeButton)
        var resultView = findViewById<TextView>(R.id.palindromeResult)

        checkButton.setOnClickListener{
            var input = inputText.text.toString()
            if(input != "") {
                verifyInput(input,resultView)
            }
        }

    }

    fun verifyInput(input: String, view: TextView){
        if(isPalindrome(input)){
            view.text = PALINDROME
            view.setTextColor(getResources().getColor(R.color.red_200))
        } else {
            view.text = NOT_PALINDROME
            view.setTextColor(getResources().getColor(R.color.design_default_color_error))
        }
    }

    fun isPalindrome(text: String): Boolean {
        var text = text.toLowerCase().replace("\\s".toRegex(), "")
        var reversedText = text.toLowerCase().reversed()
        return text == reversedText
    }
}