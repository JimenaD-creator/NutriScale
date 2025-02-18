package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*

class teenagers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teenagers)
        var sexo = (findViewById<EditText>(R.id.etsexo4))
        var peso = (findViewById<EditText>(R.id.etpeso3))
        var est = (findViewById<EditText>(R.id.etest3))
        var calcular = (findViewById<Button>(R.id.btn_calcular3))
        var back = (findViewById<Button>(R.id.btn_back4))
        var imc = (findViewById<TextView>(R.id.tv_imc3))
        var indice: Double? = null
        var estatura: Double? = null
        calcular.setOnClickListener {
            if (sexo.text.isEmpty()) {
                sexo.error = "Favor de llenar el campo vacío"
            } else {
                if (sexo.text.toString() == "mujer" && sexo.text.toString() == "hombre") {
                    sexo.error = "Escriba la inicial con mayúscula para validar el campo"

                } else {
                    if (sexo.text.toString() != "Mujer" && sexo.text.toString() != "Hombre") {
                        sexo.error =
                        "Favor de sólo ingresar 'Hombre' o 'Mujer' con la inicial en mayúscula y letra por letra para validar el campo"
                    } else {
                        if (peso.text.isEmpty()) {
                            peso.error = "Favor de ingresar el peso"
                        } else {
                            if (peso.text.toString() < 29.8.toDouble().toString() || peso.text.toString() > 79.toDouble().toString()) {
                                peso.error = "Favor de ingresar un valor real"
                            }else{
                                if (est.text.isEmpty()){
                                    est.error = "Favor de ingresar la estatura"
                                }else{
                                    if (est.text.toString() < 1.29.toDouble().toString() || est.text.toString() > 1.95.toDouble().toString()){
                                        est.error = "Favor de ingresar un valor real"
                                    }else{
                                        estatura =
                                            est.text.toString().toDouble()  * est.text.toString().toDouble()
                                        indice =
                                            peso.text.toString().toDouble() / estatura.toString().toDouble()
                                        if (sexo.text.toString() == "Mujer") {
                                            if (indice.toString().toDouble() <= 13.5 || indice.toString()
                                                    .toDouble() <= 16.5
                                            ) {
                                                imc.text =
                                                    ("El Índice de Masa Corporal es de " + indice.toString())
                                                Handler(Looper.getMainLooper()).postDelayed({
                                                    val bajo = Intent(this, bajo_teenagers::class.java)
                                                    startActivity(bajo)
                                                }, 2000)
                                            } else {
                                                if (indice.toString()
                                                        .toDouble() >= 16.5 && indice.toString()
                                                        .toDouble() <= 21.4
                                                ) {
                                                    imc.text =
                                                        ("El Índice de Masa Corporal es de " + indice.toString())
                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                        val normal =
                                                            Intent(this, normal_teenagers::class.java)
                                                        startActivity(normal)
                                                    }, 2000)
                                                } else {
                                                    if (indice.toString()
                                                            .toDouble() >= 21.4 && indice.toString()
                                                            .toDouble() <= 25.0
                                                    ) {
                                                        imc.text =
                                                            ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val sobrepeso = Intent(
                                                                this,
                                                                sobrepeso_teenagers::class.java
                                                            )
                                                            startActivity(sobrepeso)
                                                        }, 2000)

                                                    } else {
                                                        if (indice.toString()
                                                                .toDouble() >= 25.0 || indice.toString()
                                                                .toDouble() >= 29.7
                                                        ) {
                                                            imc.text =
                                                                ("El Índice de Masa Corporal es de " + indice.toString())
                                                            Handler(Looper.getMainLooper()).postDelayed({
                                                                val obesidad = Intent(
                                                                    this,
                                                                    obesidad_teenagers::class.java
                                                                )
                                                                startActivity(obesidad)
                                                            }, 2000)
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (sexo.text.toString() == "Hombre") {
                                                if (indice.toString()
                                                        .toDouble() <= 13.7 || indice.toString()
                                                        .toDouble() <= 17.6
                                                ) {
                                                    imc.text =
                                                        ("El Índice de Masa Corporal es de " + indice.toString())
                                                    Handler(Looper.getMainLooper()).postDelayed({
                                                        val bajo = Intent(this, bajo_teenagers::class.java)
                                                        startActivity(bajo)
                                                    }, 2000)

                                                } else {
                                                    if (indice.toString()
                                                            .toDouble() >= 17.6 && indice.toString()
                                                            .toDouble() <= 22.2
                                                    ) {
                                                        imc.text =
                                                            ("El Índice de Masa Corporal es de " + indice.toString())
                                                        Handler(Looper.getMainLooper()).postDelayed({
                                                            val normal =
                                                                Intent(this, normal_teenagers::class.java)
                                                            startActivity(normal)
                                                        }, 2000)

                                                    } else {
                                                        if (indice.toString()
                                                                .toDouble() >= 22.2 && indice.toString()
                                                                .toDouble() <= 25.4
                                                        ) {
                                                            imc.text =
                                                                ("El Índice de Masa Corporal es de " + indice.toString())
                                                            Handler(Looper.getMainLooper()).postDelayed({
                                                                val sobrepeso =
                                                                    Intent(
                                                                        this,
                                                                        sobrepeso_teenagers::class.java
                                                                    )
                                                                startActivity(sobrepeso)
                                                            }, 2000)
                                                        } else {
                                                            if (indice.toString()
                                                                    .toDouble() >= 25.4 || indice.toString()
                                                                    .toDouble() >= 29.7
                                                            ) {
                                                                imc.text =
                                                                    ("El Índice de Masa Corporal es de " + indice.toString())
                                                                Handler(Looper.getMainLooper()).postDelayed(
                                                                    {
                                                                        val obesidad =
                                                                            Intent(
                                                                                this,
                                                                                obesidad_teenagers::class.java
                                                                            )
                                                                        startActivity(obesidad)
                                                                    },
                                                                    2000
                                                                )
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