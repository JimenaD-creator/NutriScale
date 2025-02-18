package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class referencias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_referencias)
        var bebes = (findViewById<Button>(R.id.btn1))
        var pequeños = (findViewById<Button>(R.id.btn2))
        var niños = (findViewById<Button>(R.id.btn3))
        var adolescentes = (findViewById<Button>(R.id.btn4))
        var adultos = (findViewById<Button>(R.id.btn5))

        bebes.setOnClickListener {
           val activity4 = Intent (this, babies::class.java)
            startActivity(activity4)
        }
        pequeños.setOnClickListener {
            val activity5 = Intent (this, children::class.java)
            startActivity(activity5)
        }
        niños.setOnClickListener {
            val activity6 = Intent (this, kids::class.java)
            startActivity(activity6)
        }
        adolescentes.setOnClickListener {
            val activity7 = Intent (this, teenagers::class.java)
            startActivity(activity7)
        }
        adultos.setOnClickListener {
            val activity4 = Intent (this, adults::class.java)
            startActivity(activity4)
        }

    }
}