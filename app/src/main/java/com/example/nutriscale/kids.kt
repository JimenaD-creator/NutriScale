package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*

class kids : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kids)
        var sexo = (findViewById<EditText>(R.id.etsexo3))
        var peso = (findViewById<EditText>(R.id.etpeso2))
        var est = (findViewById<EditText>(R.id.etest2))
        var calcular = (findViewById<Button>(R.id.btn_calcular2))
        var back = (findViewById<Button>(R.id.btn_back3))
        var imc = (findViewById<TextView>(R.id.tv_imc2))
        var indice: Double? = null
        var estatura: Double? = null
        calcular.setOnClickListener {
            if(sexo.text.isEmpty()){
                sexo.error = "Favor de llenar el campo vacío"
            }else {
                if (sexo.text.toString() != "Niña" && sexo.text.toString() != "Niño") {
                    sexo.error = "Favor de sólo ingresar 'Niño' o 'Niña' con la inicial en mayúscula y letra por letra para validar el campo"
                } else {
                    if (peso.text.isEmpty()) {
                        peso.error = "Favor de ingresar el peso"
                    } else {
                        if (peso.text.toString() < 16.5.toDouble().toString() || peso.text.toString() > 35.toDouble().toString()) {
                            peso.error = "Favor de ingresar un valor real"

                        } else{
                            if (est.text.isEmpty()){
                                est.error = "Favor de ingresar la estatura"
                            }else{
                                if (est.text.toString() < 1.08.toDouble().toString() || est.text.toString() > 1.35.toDouble().toString()){
                                    est.error = "Favor de ingresar un valor real"
                                }else{
                                    estatura = est.text.toString().toDouble() * est.text.toString().toDouble()
                                    indice = peso.text.toString().toDouble() / estatura.toString().toDouble()
                                    if (sexo.text.toString() == "Niña") {
                                        if (indice.toString().toDouble() <= 12.7 || indice.toString()
                                                .toDouble() <= 13.3
                                        ) {
                                            imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                            Handler(Looper.getMainLooper()).postDelayed({
                                                val bajo = Intent(this, bajo_kids::class.java)
                                                startActivity(bajo)
                                            }, 2000)
                                        } else {
                                            if (indice.toString().toDouble() >= 13.3 && indice.toString()
                                                    .toDouble() <= 16.3
                                            ) {
                                                imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    val normal = Intent(this, normal_kids::class.java)
                                                    startActivity(normal)
                                                }, 2000)
                                            } else {
                                                if (indice.toString().toDouble() >= 16.3 && indice.toString()
                                                        .toDouble() <= 18.7
                                                ) {
                                                    imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                        val sobre = Intent(this, sobrepeso_kids::class.java)
                                                        startActivity(sobre)
                                                    }, 2000)

                                                } else {
                                                    if (indice.toString().toDouble() >= 18.7 || indice.toString()
                                                            .toDouble() >= 22.0
                                                    ) {
                                                        imc.text =
                                                            ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val obeso = Intent(this, obesidad_kids::class.java)
                                                            startActivity(obeso)
                                                        }, 2000)
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (sexo.text.toString() == "Niño") {
                                            if (indice.toString().toDouble() <= 13.0 || indice.toString()
                                                    .toDouble() <= 13.6
                                            ) {
                                                imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    val bajo = Intent(this, bajo_kids::class.java)
                                                    startActivity(bajo)
                                                }, 2000)

                                            } else {
                                                if (indice.toString().toDouble() >= 13.6 && indice.toString()
                                                        .toDouble() <= 16.2
                                                ) {
                                                    imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                        val normal = Intent(this, normal_kids::class.java)
                                                        startActivity(normal)
                                                    }, 2000)

                                                } else {
                                                    if (indice.toString().toDouble() >= 16.2 && indice.toString()
                                                            .toDouble() <= 18.2
                                                    ) {
                                                        imc.text =
                                                            ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val sobre = Intent(this, sobrepeso_kids::class.java)
                                                            startActivity(sobre)
                                                        }, 2000)
                                                    } else {
                                                        if (indice.toString().toDouble() >= 18.2 || indice.toString()
                                                                .toDouble() >= 20.9
                                                        ) {
                                                            imc.text =
                                                                ("El Índice de Masa Corporal es de " + indice.toString())
                                                            Handler(Looper.getMainLooper()).postDelayed({
                                                                val obeso = Intent(this, obesidad_kids::class.java)
                                                                startActivity(obeso)
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