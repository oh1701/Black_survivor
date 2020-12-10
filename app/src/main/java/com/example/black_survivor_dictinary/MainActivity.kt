package com.example.black_survivor_dictinary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.black_survivor_dictinary.databinding.ActivityCharacterBinding
import com.example.black_survivor_dictinary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Character.setOnClickListener{
                val intent = Intent(this, Character::class.java)
                startActivity(intent)
        }
    }
}