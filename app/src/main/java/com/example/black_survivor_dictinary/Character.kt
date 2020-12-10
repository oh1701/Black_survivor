package com.example.black_survivor_dictinary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.black_survivor_dictinary.databinding.ActivityCharacterBinding

class Character : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aya.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("aya", "aya")
            startActivity(intent)
        }
        binding.fiora.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("fiora", "fiora")
            startActivity(intent)
        }
        binding.jackie.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("jackie", "jackie")
            startActivity(intent)
        }
        binding.hyonwoo.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("hyonwoo", "hyonwoo")
            startActivity(intent)
        }
        binding.adriana.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("adriana", "adriana")
            startActivity(intent)
        }
        binding.chiara.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("chiara", "chiara")
            startActivity(intent)
        }
        binding.hart.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("hart", "hart")
            startActivity(intent)
        }
        binding.hyejin.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("hyejin", "hyejin")
            startActivity(intent)
        }
        binding.isol.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("isol", "isol")
            startActivity(intent)
        }
        binding.liDailin.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("li_dailin", "li_dailin")
            startActivity(intent)
        }
        binding.magnus.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("magnus", "magnus")
            startActivity(intent)
        }
        binding.nadine.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("nadine", "nadine")
            startActivity(intent)
        }
        binding.shoichi.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("shoichi", "shoichi")
            startActivity(intent)
        }
        binding.silvia.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("silvia", "silvia")
            startActivity(intent)
        }
        binding.sissela.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("sissela", "sissela")
            startActivity(intent)
        }
        binding.xiukai.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("xiukai", "xiukai")
            startActivity(intent)
        }
        binding.yuki.setOnClickListener {
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("yuki", "yuki")
            startActivity(intent)
        }
        binding.zahir.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("zahir", "zahir")
            startActivity(intent)
        }
    }
}