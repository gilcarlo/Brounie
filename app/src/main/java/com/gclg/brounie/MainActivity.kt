package com.gclg.brounie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.gclg.brounie.adapters.EjerciciosAdapter
import com.gclg.brounie.models.Ejercicios
import kotlinx.android.synthetic.main.activity_como_te_cuidas2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arrayEjercicios = arrayListOf<Ejercicios>()
    var arrayEjerciciosAux = arrayListOf<Ejercicios>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tarjeta1 = Ejercicios(R.drawable.jonathan_borba_lrqptqs7nqq_unsplash,"Movilidad Torácica","Mariale Montas","YOGA: PRINCIPIANTE")
        var tarjeta2 = Ejercicios(R.drawable.carl_barcelo_nquhqkuvj3c_unsplash,"Yoga para principiantes","Sofia Garza","YOGA: PRINCIPIANTE")
        var tarjeta3 = Ejercicios(R.drawable.big_dodzy__asitof_fai_unsplash,"Movilidad Torácica","Mariale Montas","YOGA: PRINCIPIANTE")

        arrayEjercicios.add(tarjeta1)
        arrayEjercicios.add(tarjeta2)
        arrayEjercicios.add(tarjeta3)

        inflarRecycler(arrayEjercicios)

        search_view.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                search_view.clearFocus()
                for (elemento in arrayEjercicios){
                    if (elemento.autor.equals(query)){
                        Log.e("ESTO SALEN EN EL IF","SI LO ENCONTRO1")
                    }
                    if (elemento.categoria.equals(query)){
                        Log.e("ESTO SALEN EN EL IF","SI LO ENCONTRO1")
                    }
                    if (elemento.ejercicio.equals(query)){
                        Log.e("ESTO SALEN EN EL IF","SI LO ENCONTRO1")
                    }else{
                        Log.e("ESTO SALEN EN EL else","no LO ENCONTRO1")
                    }
                }

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                arrayEjerciciosAux.clear()
                for (elemento in arrayEjercicios){
                    if (newText.toString().toUpperCase() in elemento.autor.toUpperCase() || newText.toString().toUpperCase() in elemento.categoria.toUpperCase() || newText.toString().toUpperCase() in elemento.ejercicio.toUpperCase()){
                        arrayEjerciciosAux.add(elemento)
                        var filteredAdapter = EjerciciosAdapter(arrayEjerciciosAux)
                        lista_recycler_vertical.adapter = filteredAdapter
                    }else{
                        Log.e("ESTO SALEN EN EL else","no LO ENCONTRO2")
                    }
                }
                return false
            }

        })
    }

    fun inflarRecycler(array: ArrayList<Ejercicios>){
        lista_recycler_vertical.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val adapter = EjerciciosAdapter(array)
        lista_recycler_vertical.adapter = adapter
    }
}