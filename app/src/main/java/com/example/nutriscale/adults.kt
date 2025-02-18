package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*

class adults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adults)
        var peso = (findViewById<EditText>(R.id.etp))
        var est = (findViewById<EditText>(R.id.etestatura1))
        var calcular = (findViewById<Button>(R.id.btn_cal))
        var back = (findViewById<Button>(R.id.btn_back5))
        var imc = (findViewById<TextView>(R.id.tv_result))
        var indice: Double? = null
        var estatura: Double? = null
        calcular.setOnClickListener {
            if(peso.text.isEmpty()){
                peso.error = "Favor de ingresar el peso"
            }else {
                if (peso.text.toString() < "37" && peso.text.toString() > "200") {
                    peso.error = "Sólo se permiten valores reales"
                }else{
                    if (peso.text.toString() < "15" && peso.text.toString() > "370"){

                        peso.error = "Favor de ingresar un valor real"
                    } else {
                        if (est.text.isEmpty()){
                            est.error = "Favor de ingresar la estatura"
                        }else{
                            if (est.text.toString() < 1.44.toDouble().toString() || est.text.toString() > 2.toDouble().toString()){
                                est.error = "Favor de ingresar un valor real"
                            }else{
                                estatura = est.text.toString().toDouble() * est.text.toString().toDouble()
                                indice = peso.text.toString().toDouble() / estatura.toString().toDouble()
                                if (indice.toString().toDouble() < 18.5) {
                                    imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                    Handler(Looper.getMainLooper()).postDelayed({
                                        val bajo = Intent(this, bajo_adults::class.java)
                                        startActivity(bajo)
                                    }, 2000)
                                } else {
                                    if (indice.toString().toDouble() > 18.5 && indice.toString()
                                            .toDouble() < 24.9
                                    ) {
                                        imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                        Handler(Looper.getMainLooper()).postDelayed({
                                            val normal = Intent(this, normal_teenagers::class.java)
                                            startActivity(normal)
                                        }, 2000)
                                    } else {
                                        if (indice.toString().toDouble() > 25 && indice.toString()
                                                .toDouble() < 29.9
                                        ) {
                                            imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                            Handler(Looper.getMainLooper()).postDelayed({
                                                val sobrepeso = Intent(this, sobrepeso_adults::class.java)
                                                startActivity(sobrepeso)
                                            }, 2000)
                                        } else {
                                            if (indice.toString().toDouble() > 30) {
                                                imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    val obesidad = Intent(this, obesidad_adults::class.java)
                                                    startActivity(obesidad)
                                                }, 2000)
                                            }
                                        }
                                    }

                                }

                            }
                        }


                    }
                }


            }

            }
        back.setOnClickListener {
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)

        }

    }
}