package com.example.app_lcool_ou_gasolina

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputAlcool: TextInputLayout
    private lateinit var editAlcool: TextInputEditText

    private lateinit var textInputGasolina: TextInputLayout
    private lateinit var editGasolina: TextInputEditText

    private lateinit var botton: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        inicializarComponentesInterface()

            botton.setOnClickListener{

            calcularMelhorPreco()
            }
        }
    private fun inicializarComponentesInterface() {

        textInputAlcool = findViewById(R.id.text_Input_alcool)
        editAlcool = findViewById(R.id.edit_alcool)

        textInputGasolina = findViewById(R.id.text_Input_gasolina)
        editGasolina = findViewById(R.id.edit_gasolina)

        botton = findViewById(R.id.button)
        textResultado = findViewById(R.id.text_resultado)
    }
    private fun calcularMelhorPreco(){
        val precoAlcool = editAlcool.text.toString()
        val precoGasolina = editGasolina.text.toString()

        val resultadovalidacao = validarcampus(precoAlcool, precoGasolina)
        if (resultadovalidacao){

            val pAlcool = precoAlcool.toDouble()
            val pGasolina = precoGasolina.toDouble()

            val resultado = pAlcool/pGasolina

            if(resultado >= 0.7){
                textResultado.text = "Melhor Utilizar Gasolina"
            } else{
                textResultado.text = "Melhor Utilizar Alcool"
            }

        }
    }

    private fun validarcampus(pAlcool: String, pGasolina: String): Boolean {

        textInputAlcool.error = null
        textInputGasolina.error = null

        if(pAlcool.isEmpty()){
            textInputAlcool.error = "digite o preco do alcool"
            return false

        }else if(pGasolina.isEmpty()){
            textInputGasolina.error = "digite o preco da gasolina"
            return false
        }

        return true

    }
}








