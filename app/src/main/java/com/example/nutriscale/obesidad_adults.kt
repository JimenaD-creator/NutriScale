package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class obesidad_adults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obesidad_adults)
        var back = findViewById<ImageButton>(R.id.ib_regresar13)
        var dieta = (findViewById<Button>(R.id.b12))
        var ejercicios = (findViewById<Button>(R.id.btn_e9))
        dieta.setOnClickListener{
            // Mandamos llamar el activity 2
            val act6 = Intent(this, dieta_obesidad_adults::class.java)
            startActivity(act6)
        }
        ejercicios.setOnClickListener {
            val act7 = Intent(this, ejercicios_adults_obesidad::class.java)
            startActivity(act7)

        }
        back.setOnClickListener{
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)
        }
    }
}