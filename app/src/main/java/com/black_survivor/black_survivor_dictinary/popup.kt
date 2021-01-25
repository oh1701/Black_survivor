package com.example.black_survivor_dictinary

import android.app.Application
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.black_survivor_dictinary.databinding.ActivityPopupBinding

open class Mypopup : Application() {
    private companion object {
        lateinit var instance: Mypopup
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

    }
}

class popup : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPopupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ddd:Int = 0
        binding.imup1
        binding.imup2
        binding.imup3
        binding.imup4
        binding.imup5
        binding.imdown1
        binding.imdown2
        binding.imdown3
        binding.imdown4
        binding.imdown5

        var skssks: ImageView = findViewById(R.id.imup_1)
        var b: ImageView = findViewById(R.id.imup_2)
        var c: ImageView = findViewById(R.id.imup_3)
        var d: ImageView = findViewById(R.id.imup_4)
        var e: ImageView = findViewById(R.id.imup_5)

        binding.imupText1
        binding.imupText2
        binding.imupText3
        binding.imupText4
        binding.imupText5

        binding.imdownText1
        binding.imdownText2
        binding.imdownText3
        binding.imdownText4
        binding.imdownText5





    }
}

