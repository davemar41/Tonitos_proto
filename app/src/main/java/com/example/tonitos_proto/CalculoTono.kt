package com.example.tonitos_proto

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tonitos_proto.databinding.ActivityCalculoTonoBinding

class CalculoTono : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = ActivityCalculoTonoBinding.inflate(layoutInflater)

        setContentView(bind.root)
        var numeroacordes: Int = 0
        var acorde: String = ""
        var contador: Int = 0
        bind.botonOk.isEnabled=false
        var misacordes = arrayListOf<String>()
        var mimotor = Motor(misacordes)/*hemos generado una instancia de la clase motor que es
        donde están los datos*/



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

        //botones operacionales
        bind.botonre.setOnClickListener {
            bind.visor.setText("re")
        }
        bind.botonmi.setOnClickListener {
            bind.visor.setText("mi")

        }
        bind.botonfa.setOnClickListener {
            bind.visor.setText("fa")

        }
        bind.botonsol.setOnClickListener {
            bind.visor.setText("sol")

        }
        bind.botondo.setOnClickListener {
            bind.visor.setText("do")

        }
        bind.botonla.setOnClickListener {
            bind.visor.setText("la")

        }
        bind.botonsi.setOnClickListener {
            bind.visor.setText("si")

        }
        bind.botonbemol.setOnClickListener {
            bind.visor.append("b")

        }
        bind.sostenido.setOnClickListener {
            bind.visor.append("#")

        }

        bind.botonmayor.setOnClickListener {
            bind.visor.append(" mayor")
        }
        bind.botonmenor.setOnClickListener {
            bind.visor.append(" menor")
        }
        bind.botonquinta.setOnClickListener {
            bind.visor.append("5")
        }
        bind.botonseptima.setOnClickListener {
            bind.visor.append("7")
        }

        //botones funcionales
        bind.botonintroducir.setOnClickListener {

            bind.botonOk.isEnabled=true
            numeroacordes=bind.editnumeroacordes.text.toString().toInt()
            Toast.makeText(this,"inserte acorde",Toast.LENGTH_SHORT).show()

        }
        bind.botonOk.setOnClickListener {
            //el boton ok controlará el contador
            numeroacordes=bind.editnumeroacordes.text.toString().toInt()

            acorde = bind.visor.text.toString()
            //si metemos un acorde vacio se nos quejará
            if(acorde==""){
                builder.setTitle("Atención Músicos")
                builder.setMessage("ha introducido un acorde vacio")
                builder.show()

            }else{
                contador++
                numeroacordes--
                bind.editnumeroacordes.setText(numeroacordes.toString())

                misacordes.add(acorde)
                bind.visor.setText("")
                if(numeroacordes==0){
                    Toast.makeText(this, "ha finalizado",Toast.LENGTH_LONG).show()
                    bind.botonOk.isEnabled=false
                    bind.editnumeroacordes.setText("")
                    Log.d("TAG","LOS VALORES SON: $misacordes")

                }else{
                    Toast.makeText(this,"introduzca otro acorde",Toast.LENGTH_SHORT).show()
                    bind.editnumeroacordes.setText(numeroacordes.toString())

                }
            }
            bind.botonCalcular.setOnClickListener {
                mimotor.Calculando(misacordes)
                //aqui hemos usado la instancia motor
                //dependiendo de lo que nos devuelva el metodo lanzara uno u otro Alert Dialog
                Log.d("TAG","LOS VALORES SON: $misacordes")
                when{
                    mimotor.Calculando(misacordes)==1 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidado)
                        builder.setView(R.layout.doyla)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }

                        builder.show()
                    }

                    mimotor.Calculando(misacordes)==2 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidasol)
                        builder.setView(R.layout.solymi)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==3 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidare)
                        builder.setView(R.layout.reysi)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==4 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidala)
                        builder.setView(R.layout.layfasos)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==5 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidami)
                        builder.setView(R.layout.miydosos)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==6 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidasi)
                        builder.setView(R.layout.siysol)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==7 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidafa)
                        builder.setView(R.layout.fayre)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()
                    }
                    mimotor.Calculando(misacordes)==8 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidasib)
                        builder.setView(R.layout.sibysol)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==9 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidamib)
                        builder.setView(R.layout.mibydo)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==10 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage(R.string.tonalidalab)
                        builder.setView(R.layout.labyfa)
                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }
                    mimotor.Calculando(misacordes)==0 ->{
                        val builder= androidx.appcompat.app.AlertDialog.Builder(this)
                        builder.setTitle("Atención Músicos")
                        builder.setMessage("no se encuentra tonalidad, revise los acordes, y recuerde que el sitema solo soporta hasta acordes septimas")

                        builder.setPositiveButton("ok"){
                                dialog,wich -> Toast.makeText(applicationContext,"ok", Toast.LENGTH_LONG).show()
                        }
                        builder.show()

                    }



                }
                contador = 0
                misacordes.clear()


            }





        }
        bind.botonborrar.setOnClickListener {
            bind.visor.setText("")
            bind.editnumeroacordes.setText("")
            contador=0
            misacordes.clear()
            bind.botonOk.isEnabled=false
        }





    }

}