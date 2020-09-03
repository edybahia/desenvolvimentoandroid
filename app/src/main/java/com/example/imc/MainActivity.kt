package com.example.imc

import android.icu.text.DecimalFormat
import android.icu.text.NumberFormat
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Executando o clique no botão Calcular
        btnCalcular.setOnClickListener {

           // Realizando o teste se o campo do editView está vazio

            if (edtAltura.text.toString().isEmpty()) {
                edtAltura.error = "Campo Obrigatório"
                edtAltura.requestFocus()
            } else if (edtPeso.text.toString().isEmpty()) {
                edtPeso.error = "Campo Obrigatório"
                edtPeso.requestFocus()
            } else

                // Caso o teste de campo dos Else for Falso executa os calculos

                {
                    val altura = edtAltura.text.toString().toFloat()
                    val peso = edtPeso.text.toString().toFloat()
                    //val df = DecimalFormat("#.00")

                    val resul = ((peso) / (altura * altura))


                    if ((resul >= 0) && (resul <=17))
                    {
                    makeText(applicationContext,"Você está muito Abaixo do Peso", Toast.LENGTH_LONG).show()
                    } else if ((resul >= 17) && (resul <=18.49))
                    {
                        makeText(applicationContext,"Você está Abaixo do Peso",Toast.LENGTH_LONG).show()
                    } else if ((resul >= 18.5) && (resul <=24.99))
                    {
                        makeText(applicationContext,"Você está com o Peso Normal",Toast.LENGTH_LONG).show()
                    } else if ((resul >= 25) && (resul <=29.99))
                    {
                        makeText(applicationContext,"Você está Acima do Peso",Toast.LENGTH_LONG).show()
                    } else if ((resul >= 30) && (resul <=34.99))
                    {
                        makeText(applicationContext,"Você está com Obesidade Nível I",Toast.LENGTH_LONG).show()
                    }
                    else if ((resul >= 35) && (resul <=39.99))
                    {
                        makeText(applicationContext,"Você está com Obesidade Nível II",Toast.LENGTH_LONG).show()
                    }
                    else {
                        makeText(applicationContext,"Você está com Obesidade Nível III",Toast.LENGTH_LONG).show()
                             }

                    val df = DecimalFormat ("#.00")
                    txtView.text = df.format(resul)

                }
        }

        btnLimpar.setOnClickListener {
            edtAltura.text.clear()
            edtPeso.text.clear()

        }
    }

}

