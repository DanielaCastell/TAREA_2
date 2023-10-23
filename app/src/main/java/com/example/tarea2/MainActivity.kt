package com.example.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNombre: EditText= findViewById(R.id.editTextNombre)
        val botonEnviar:Button= findViewById(R.id.botonEnviar)
        val MiPrimerApp:TextView= findViewById(R.id.MiprimerApp)

        botonEnviar.setOnClickListener {
            val nombre = editTextNombre.text.toString()
            val mensaje = "Bienvenido $nombre, Programador de Apps"
            MiPrimerApp.text = mensaje
        }
    }
}