package com.example.tonitos_proto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tonitos_proto.databinding.ActivityCalculadorBinding
import com.example.tonitos_proto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.entrar.setOnClickListener {
            val intent= Intent(this,Calculador::class.java)
            startActivity(intent)
        }


    }
}