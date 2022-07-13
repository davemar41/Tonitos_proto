package com.example.tonitos_proto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.tonitos_proto.databinding.ActivityCalculoTonoBinding

class CalculoTono : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = ActivityCalculoTonoBinding.inflate(layoutInflater)

        setContentView(bind.root)
        var numeroacordes: Int = 0
        var acorde: String = ""
        var contador: Int = 0
        var misacordes = arrayListOf<String>()
        var mimotor = Motor(misacordes)


        //alert dialog
        val builder = AlertDialog.Builder(this);
        bind.botonOk.isEnabled = false
        //inicialmente tendremos un alert dialog para darnos instrucciones
        builder.setTitle("Atención Músicos")
        builder.setMessage(R.string.ayuda)
        builder.setPositiveButton("ok") { dialog, wich ->
            Toast.makeText(applicationContext, "ok", Toast.LENGTH_LONG).show()
        }
        builder.show()

        bind.botonvolver.setOnClickListener {
            val intent= Intent(this,Calculador::class.java)
        }
        bind.botonintroducir.setOnClickListener {
            bind.botonOk.isEnabled = true
            numeroacordes=bind.editnumeroacordes.text.toString().toInt()
            Toast.makeText(this,"inserte acorde",Toast.LENGTH_SHORT).show()
        }
        //este boton contralara el contador
        bind.botonOk.setOnClickListener {
            acorde = bind.visor.text.toString()
        }


    }
}