package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*

class babies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_babies)
        var sexo = (findViewById<EditText>(R.id.etsexo))
        var peso = (findViewById<EditText>(R.id.etpeso1))
        var est = (findViewById<EditText>(R.id.etest1))
        var calcular = (findViewById<Button>(R.id.btn_cal1))
        var back = (findViewById<Button>(R.id.btn_back))
        var imc = (findViewById<TextView>(R.id.tv_imc1))
        var indice: Double? = null
        var estatura: Double? = null
        calcular.setOnClickListener {
            if (sexo.text.isEmpty()) {
                sexo.error = "Favor de llenar el campo vacío"
            } else {
                if (sexo.text.toString() == "niña" && sexo.text.toString() == "niño") {
                    sexo.error = "Escriba la inicial con mayúscula para validar el campo"
                } else {
                    if (sexo.text.toString() != "Niña" && sexo.text.toString() != "Niño") {
                        sexo.error = "Favor de sólo ingresar 'Niña' o 'Niño' con la inicial en mayúsulas y letra por letra para validar el campo"
                    } else {
                        if (peso.text.isEmpty()) {
                            peso.error = "Favor de ingresar al peso"
                        } else{
                                if (peso.text.toString() < "2.3" && peso.text.toString() > "12.3"){
                                    peso.error = "Favor de ingresar un valor real"
                                }else{
                                    if (est.text.isEmpty()){
                                        est.error = "Favor de ingresar la estatura"
                                    }else{
                                        if (est.text.toString() < 0.47.toDouble().toString() ||  est.text.toString() > 0.76.toDouble().toString()){
                                            est.error = "Favor de ingresar un valor real"
                                        }else{
                                            estatura = est.text.toString().toDouble() * est.text.toString().toDouble()
                                            indice = peso.text.toString().toDouble() / estatura.toString().toDouble()
                                            if (sexo.text.toString() == "Niña") {
                                                if (indice.toString().toDouble() <= 9.3 || indice.toString()
                                                        .toDouble() <= 15.7
                                                ) {
                                                    imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                        val bajo = Intent(this, bajo_babies::class.java)
                                                        startActivity(bajo)
                                                    }, 2000)

                                                } else {
                                                    if (indice.toString().toDouble() >= 15.7 && indice.toString()
                                                            .toDouble() <= 20.4
                                                    ) {
                                                        imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val normal = Intent(this, normal_babies::class.java)
                                                            startActivity(normal)
                                                        }, 2000)
                                                    } else {
                                                        if (indice.toString().toDouble() >= 20.4 && indice.toString()
                                                                .toDouble() <= 25.8
                                                        ) {
                                                            imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                            Handler(Looper.getMainLooper()).postDelayed({
                                                                val sobrepeso = Intent(this, sobrepeso_babies::class.java)
                                                                startActivity(sobrepeso)
                                                            }, 2000)

                                                        } else {
                                                            if (indice.toString().toDouble() >= 25.8 || indice.toString()
                                                                    .toDouble() >= 27.7
                                                            ) {
                                                                imc.text =
                                                                    ("El Índice de Masa Corporal es de " + indice.toString())
                                                                Handler(Looper.getMainLooper()).postDelayed({
                                                                    val obesidad = Intent(this, obesidad_babies::class.java)
                                                                    startActivity(obesidad)
                                                                }, 2000)
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (sexo.text.toString() == "Niño") {
                                                    if (indice.toString().toDouble() <= 9.5 || indice.toString()
                                                            .toDouble() <= 15.9
                                                    ) {
                                                        imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val bajo = Intent(this, bajo_babies::class.java)
                                                            startActivity(bajo)
                                                        }, 2000)

                                                    } else {
                                                        if (indice.toString().toDouble() >= 15.9 && indice.toString()
                                                                .toDouble() <= 21.7
                                                        ) {
                                                            imc.text = ("El Índice de Masa Corporal es de " + indice.toString())
                                                            Handler(Looper.getMainLooper()).postDelayed({
                                                                val normal = Intent(this, normal_babies::class.java)
                                                                startActivity(normal)
                                                            }, 2000)

                                                        } else {
                                                            if (indice.toString().toDouble() >= 21.7 && indice.toString()
                                                                    .toDouble() <= 26.3
                                                            ) {
                                                                imc.text =
                                                                    ("El Índice de Masa Corporal es de " + indice.toString())
                                                                Handler(Looper.getMainLooper()).postDelayed({
                                                                    val sobrepeso = Intent(this, sobrepeso_babies::class.java)
                                                                    startActivity(sobrepeso)
                                                                }, 2000)
                                                            } else {
                                                                if (indice.toString().toDouble() >= 26.3 || indice.toString()
                                                                        .toDouble() >= 28.0
                                                                ) {
                                                                    imc.text =
                                                                        ("El Índice de Masa Corporal es de " + indice.toString())
                                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                                        val obesidad = Intent(this, obesidad_babies::class.java)
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

            }
        back.setOnClickListener {
                val act6 = Intent(this, referencias::class.java)
                startActivity(act6)

        }

    }
}