package com.example.jogoadivinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var numeroF = Random(Int.MAX_VALUE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAdivinha = findViewById<Button>(R.id.buttonAdivinha)
        buttonAdivinha.setOnClickListener{  enviaDados()  }
    }

    fun enviaDados(){
        val editTextNumber = findViewById<TextView>(R.id.editTextNumber)
        val numeroAdivinhado = editTextNumber.text.toString().toInt()

        if(numeroAdivinhado > 10){
            editTextNumber.error = getString(R.string.numero_maior_que_10)
            editTextNumber.requestFocus()
            return
        }

    }
}