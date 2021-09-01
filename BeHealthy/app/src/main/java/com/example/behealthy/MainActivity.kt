package com.example.behealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.behealthy.databinding.ActivityMainBinding
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // main theme ( splash screen)
        Thread.sleep(2000)
        setTheme(R.style.Theme_BeHealthy)

        binding.userCalculateButton.setOnClickListener {calculateImc()}


    }

    private fun calculateImc(){

        //  weight receive the value of weight text input
        val weight= binding.userWeightText.text.toString().toDouble()
        Log.d("bmi", "nao é possivel ${weight}")

        // height receive the value of height text input
        val height = binding.userHeightText.text.toString().toDouble() /100
        Log.d("bmi", "nao é possivel ${height}")

        // Calculate the Bmi
        val bmi = BigDecimal(weight / (height * height)).setScale(2, RoundingMode.HALF_EVEN).toDouble()
        Log.d("bmi", "nao é possivel ${bmi}")

        // card info text = the bmi classification
        binding.cardInfoText.text = bmiClassification(bmi)

    }


    private fun bmiClassification(result: Double): String {

        val text: String

        // text result
        val underWheight = "Seu Bmi é ${result}.\n você está abaixo do peso ideal."
        val normal = "Seu Bmi é ${result}.\n você está no peso ideal."
        val average = "Seu Bmi é ${result}.\n você está com sobre peso."
        val obesity = "Seu Bmi é ${result}.\n Você está com peso muito acima do ideal."
        val morbidObesity = "Seu Bmi é ${result}.\n Você com Obesidade morbida, procure já um médico."

        // bmi classification
        text = if(result in 18.5..25.0){
            normal
        }else if (result in 25.0..30.0){
            average
        }else if (result in 30.0..40.0){
            obesity
        }else if(result in 40.0..100.0){
            morbidObesity
        }else{
            underWheight
        }

        return text
    }

}