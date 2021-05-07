package com.gclg.brounie.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gclg.brounie.Clases
import com.gclg.brounie.R
import com.gclg.brounie.models.Ejercicios
import kotlinx.android.synthetic.main.custom_card.view.*

class EjerciciosAdapter(val ejercicios_list: ArrayList<Ejercicios>): RecyclerView.Adapter<EjerciciosAdapter.EjerciciosHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EjerciciosHolder {
        val layoutInflater = LayoutInflater.from(parent.context )
        return EjerciciosHolder(layoutInflater.inflate(R.layout.custom_card, parent, false))
    }

    override fun onBindViewHolder(holder: EjerciciosHolder, position: Int) {
        holder.render(ejercicios_list[position])
    }

    override fun getItemCount(): Int {
        return ejercicios_list.size
    }


    inner class EjerciciosHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(ejercicio:Ejercicios){
            view.imageView.setImageResource(ejercicio.imagen)
            view.ejercicio_nombre.text = ejercicio.ejercicio
            view.autor_nombre.text = ejercicio.autor
            view.categoria_ejercicio.text = ejercicio.categoria

            view.setOnClickListener(View.OnClickListener {
                val intent = Intent(view.context,Clases::class.java)
                intent.putExtra("EjerciciosAdapter.IMAGEN",ejercicio.imagen)
                intent.putExtra("EjerciciosAdapter.EJERCICIO",ejercicio.ejercicio)
                intent.putExtra("EjerciciosAdapter.AUTOR",ejercicio.autor)
                intent.putExtra("EjerciciosAdapter.CATEGORIA",ejercicio.categoria)
                view.context.startActivity(intent)
            })
        }


    }
}