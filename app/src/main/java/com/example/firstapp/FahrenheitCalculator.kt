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

        val toFahrenheitButton = findViewById<Button>(R.id.convertButton)
        var temperatureInput = findViewById<EditText>(R.id.temperatureInput)
        var resultView = findViewById<TextView>(R.id.resultView)

        toFahrenheitButton.setOnClickListener{
            handleClick(temperatureInput.text.toString(), resultView)
        }
    }

    fun handleClick(input: String, view: TextView){
        var parsedTemperature = toFahrenheit(input.toDouble())
        view.text =  "%.2f Fº".format(parsedTemperature)
    }

    fun toFahrenheit(temperature: Double) : Double{
        // FORMULA: (10°C × 9/5) + 32 = 50°F
        var factor = 1.8
        val k = 32
        return (temperature * (factor)) + k
    }
}