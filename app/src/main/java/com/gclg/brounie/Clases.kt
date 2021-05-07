package com.gclg.brounie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clases.*

class Clases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clases)
        val img = intent.getIntExtra("EjerciciosAdapter.IMAGEN",0)
        val ejecicio = intent.getStringExtra("EjerciciosAdapter.EJERCICIO", )
        val autor = intent.getStringExtra("EjerciciosAdapter.AUTOR")
        val categoria = intent.getStringExtra("EjerciciosAdapter.CATEGORIA")

        ejercicio_nombre_clases.text = ejecicio
        autor_nombre_clases.text = autor
        categoria_ejercicio_clases.text = categoria
        imageView_clases.setImageResource(img)
    }
}