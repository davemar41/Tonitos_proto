package com.example.tonitos_proto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tonitos_proto.databinding.ActivityCalculadorBinding

class Calculador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityCalculadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.volver.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

       /* val acordes= listOf(Datos.Domayor("do mayor", "do mayor7", "do5", "re menor", "re menor7", "re5", "mi menor", "mi menor7", "mi5","mi mayor","mi7",
            "fa mayor", "fa mayor7", "fa5", "sol mayor", "sol7", "sol5", "la menor", "la menor7", "la5", "si menor", "si menor7b5","si5"),
            Datos.Domayor("sol mayor", "sol mayor7", "sol5", "la menor", "la menor7", "la5", "si menor", "si menor7", "si5","si mayor","si7",
                "do mayor", "do mayor7", "do5", "re mayor", "re7", "re5", "mi menor", "mi menor7", "mi5", "fa# menor", "fa# menor7b5","fa#5"),
            Datos.remayor("re mayor", "re mayor7", "re5", "mi menor", "mi menor7", "mi5", "fa# menor", "fa# menor7", "fa#5","fa# mayor","fa#7",
            "sol mayor", "sol mayor7", "sol5", "la mayor", "la7", "la5", "si menor", "si menor7", "si5", "do# menor", "do# menor7b5","do#5"),
            Datos.lamayor("la mayor", "la mayor7", "la5", "si menor", "si menor7", "si5", "do# menor", "do# menor7", "do#5","do# mayor","do#7",
                "re mayor", "re mayor7", "re5", "mi mayor", "mi7", "mi5", "fa# menor", "fa# menor7", "fa#5", "sol# menor", "sol# menor7b5", "sol# menor7b5"),
            Datos.mimayor("mi mayor", "mi mayor7", "mi5", "fa# menor", "fa# menor7", "fa#5", "sol# menor", "sol# menor7", "sol#5","sol# mayor","sol#7",
                "la mayor", "la mayor7", "la5", "si mayor", "si7", "si5", "do# menor", "do# menor7", "do#5", "re# menor", "re# menor7b5","re#5"),
            Datos.simayor("si mayor", "si mayor7", "si5", "do# menor", "do# menor7", "do#5", "re# menor", "re# menor7", "re#5","re# mayor","re#7",
                "mi mayor", "mi mayor7", "mi5", "fa# mayor", "fa#7", "fa#5", "sol# menor", "sol# menor7", "sol#5", "la# menor", "la# menor7b5","la#5"),
            Datos.famayor("fa mayor", "fa mayor7", "fa5", "sol menor", "sol menor7", "sol5", "la menor", "la menor7", "la5","la mayor", "la7",
                "sib mayor", "sib mayor7", "sib5","la# mayor", "la# mayor7", "la#5", "do mayor", "do7", "do5", "re menor", "re menor7", "re5"),Datos.sibmayor("sib mayor", "sib mayor7", "sib5","la# mayor", "la# mayor7", "la#5","do menor", "do menor7", "do5", "re menor", "re menor7", "re5","re mayor", "re7",
                "mib mayor", "mib mayor7", "mib5","re# mayor","re# mayor7","re#5", "fa mayor", "fa7", "fa5"),Datos.mibmayor("mib mayor", "mib mayor7", "mib5","re# mayor","re# mayor7","re#5", "fa menor", "fa menor7", "fa5", "sol menor", "sol menor7", "sol5","sol mayor7", "sol7",
                "lab mayor", "lab mayor7", "lab5","sol# mayor","sol# mayor7" ,"sib mayor", "sib7", "sib5","la# mayor"),Datos.labmayor("lab mayor", "lab mayor7", "lab5","sol# mayor","sol# mayor7","sol#5", "sib menor", "sib menor7", "sib5","la# mayor", "la# mayor7", "la#5", "do menor", "do menor7", "do5","do mayor","do7",
                "reb mayor", "reb mayor7", "reb5","do# mayor", "do# mayor7", "do#5","sol menor", "sol menor7b5","sol5"))*/

        binding.nueva.setOnClickListener {
            val intent= Intent(this,CalculoTono::class.java)
            startActivity(intent)
        }

    }


}