package com.example.behealthy

import android.content.Intent
import android.content.Intent.EXTRA_TEXT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import com.example.behealthy.databinding.ActivityMainBinding
import com.example.behealthy.databinding.ActivityResultBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var bindingResult:ActivityResultBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.userCalculateButton.setOnClickListener {calculateImc()}


    }


    fun calculateImc(){

        // receber o valor de Peso
        val peso = binding.userHeightText.toString()
        val pesoD = peso.toDouble()


        // receber o valor de Altura
        val altura = binding.userHeightText.toString()
        val alturaD = altura.toDouble()


        // imc recebe os valores dos inputs faz o calculo
        val imc = pesoD / (alturaD * alturaD)
        val result = imc.toString()

        val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE,result)
        }
        startActivity(intent)


    }


}