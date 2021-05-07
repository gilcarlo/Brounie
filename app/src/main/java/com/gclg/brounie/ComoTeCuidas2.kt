package com.gclg.brounie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gclg.brounie.adapters.EjerciciosAdapter
import com.gclg.brounie.models.Ejercicios
import kotlinx.android.synthetic.main.activity_como_te_cuidas2.*
import kotlinx.android.synthetic.main.activity_main.*

class ComoTeCuidas2 : AppCompatActivity() {
    var arrayEjercicios = arrayListOf<Ejercicios>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_te_cuidas2)

        card_inicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        card_consejos.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn_circular1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn_circular2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn_circular3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}