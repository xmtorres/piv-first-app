package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FahrenheitCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farenheit_calculator)

        var temperatureInput = findViewById<EditText>(R.id.temperatureInput)
        val toFahrenheitButton = findViewById<Button>(R.id.convertButton)
        var resultView = findViewById<TextView>(R.id.resultView)


        toFahrenheitButton.setOnClickListener{
            var input = temperatureInput.text.toString()
            if(input != ""){
                handleClick(input, resultView)
            }
        }
    }

    fun handleClick(input: String, view: TextView){
        var parsedTemperature = toFahrenheit(input.toDouble())
        view.text =  "%.1f Fº".format(parsedTemperature)
    }

    fun toFahrenheit(temperature: Double) : Double{
        // FORMULA: (10°C × 9/5) + 32 = 50°F
        var factor = 1.8
        val k = 32
        return (temperature * (factor)) + k
    }
}