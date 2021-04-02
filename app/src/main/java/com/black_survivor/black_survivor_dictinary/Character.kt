package com.black_survivor.black_survivor_dictinary

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.black_survivor.black_survivor_dictinary.databinding.ActivityCharacterBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds


class Character : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this){}
        binding.adview1.loadAd(AdRequest.Builder().build())

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
        binding.emma.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("emma", "emma")
            startActivity(intent)
        }
        binding.lenox.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("lenox", "lenox")
            startActivity(intent)
        }
        binding.rozzi.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("rozzi", "rozzi")
            startActivity(intent)
        }
        binding.luke.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("luke", "luke")
            startActivity(intent)
        }
        binding.cathy.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("cathy", "cathy")
            startActivity(intent)
        }
        binding.adela.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("adela", "adela")
            startActivity(intent)
        }
        binding.bernice.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("bernice", "bernice")
            startActivity(intent)
        }
        binding.bernice.setOnClickListener{
            val intent = Intent(this, Character_mini::class.java)
            intent.putExtra("barbara", "barbara")
            startActivity(intent)
        }
    }
}