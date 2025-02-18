package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*

class children : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_children)
        var sexo = (findViewById<EditText>(R.id.etsexo2))
        var peso = (findViewById<EditText>(R.id.etpeso))
        var est = (findViewById<EditText>(R.id.etest))
        var imc = (findViewById<TextView>(R.id.tv_imc))
        var calcular = (findViewById<Button>(R.id.btn_calcular))
        var back = (findViewById<Button>(R.id.btn_back2))
        var indice: Double? = null
        var estaura: Double? = null
        calcular.setOnClickListener {
            if(sexo.text.isEmpty()){
                sexo.error = "Favor de llenar el campo vacío"
            }else {
                if (sexo.text.toString() != "Niña" && sexo.text.toString() != "Niño") {
                    sexo.error = "Favor de sólo ingresar 'Niña' o 'Niño' con la inicial en mayúsulas y letra por letra para validar el campo"
                } else {
                    if (peso.text.isEmpty()) {
                        peso.error = "Favor de ingresar el peso"
                    } else {
                        if (peso.text.toString() < "7.1" && peso.text.toString() > "23.5") {
                            peso.error = "Favor de ingresar un valor real"

                        } else{
                            if (est.text.isEmpty()){
                                est.error = "Favor de ingresar la estatura"
                            }else{
                                if (est.text.toString() < 0.69.toDouble().toString() || est.text.toString() > 1.067.toDouble().toString()){
                                    est.error = "Favor de ingresar un valor real"
                                }else{
                                    estaura = est.text.toString().toDouble() * est.text.toString().toDouble()
                                    indice = peso.text.toString().toDouble() / estaura.toString().toDouble()
                                    if (sexo.text.toString() == "Niña") {
                                        if (indice.toString().toDouble() <= 14.4 || indice.toString()
                                                .toDouble() <= 15.4
                                        ) {
                                            imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                            Handler(Looper.getMainLooper()).postDelayed({
                                                val bajo = Intent(this, bajo_children::class.java)
                                                startActivity(bajo)
                                            }, 2000)
                                        } else {
                                            if (indice.toString().toDouble() >= 15.4 && indice.toString()
                                                    .toDouble() <= 16.2
                                            ) {
                                                imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    val normal = Intent(this, normal_children::class.java)
                                                    startActivity(normal)
                                                }, 2000)
                                            } else {
                                                if (indice.toString().toDouble() >= 16.2 && indice.toString()
                                                        .toDouble() <= 19.9
                                                ) {
                                                    imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                        val sobrepeso = Intent(this, sobrepeso_children::class.java)
                                                        startActivity(sobrepeso)
                                                    }, 2000)

                                                } else {
                                                    if (indice.toString().toDouble() >= 19.9 || indice.toString()
                                                            .toDouble() >= 22.6
                                                    ) {
                                                        imc.text =
                                                            ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val obesidad = Intent(this, obesidad_children::class.java)
                                                            startActivity(obesidad)
                                                        }, 2000)
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (sexo.text.toString() == "Niño") {
                                            if (indice.toString().toDouble() <= 14.7 || indice.toString()
                                                    .toDouble() <= 15.7
                                            ) {
                                                imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    val bajo = Intent(this, bajo_children::class.java)
                                                    startActivity(bajo)
                                                }, 2000)

                                            } else {
                                                if (indice.toString().toDouble() >= 15.7 && indice.toString()
                                                        .toDouble() <= 16.5
                                                ) {
                                                    imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                        val normal = Intent(this, normal_children::class.java)
                                                        startActivity(normal)
                                                    }, 2000)

                                                } else {
                                                    if (indice.toString().toDouble() >= 16.5 && indice.toString()
                                                            .toDouble() <= 20.2
                                                    ) {
                                                        imc.text =
                                                            ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val sobrepeso = Intent(this, sobrepeso_children::class.java)
                                                            startActivity(sobrepeso)
                                                        }, 2000)
                                                    } else {
                                                        if (indice.toString().toDouble() >= 20.2 || indice.toString()
                                                                .toDouble() >= 22.9
                                                        ) {
                                                            imc.text =
                                                                ("El Índice de Masa Corporal es de " + indice.toString())
                                                            Handler(Looper.getMainLooper()).postDelayed({
                                                                val obesidad = Intent(this, obesidad_children::class.java)
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
                }
            }

            }
        back.setOnClickListener {
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)

        }
    }
}