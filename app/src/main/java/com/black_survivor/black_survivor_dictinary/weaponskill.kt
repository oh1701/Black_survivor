package com.black_survivor.black_survivor_dictinary

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.black_survivor.black_survivor_dictinary.databinding.ActivityWeaponskillBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds


class weaponskill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityWeaponskillBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this){}
        var adview11 = findViewById<AdView>(R.id.adView11)
        adview11.loadAd(AdRequest.Builder().build())

        binding.weapon1.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("단검", "단검")
            startActivity(intent)
        }
        binding.weapon2.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("도끼", "도끼")
            startActivity(intent)
        }
        binding.weapon3.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("양손검", "양손검")
            startActivity(intent)
        }
        binding.weapon4.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("쌍검", "쌍검")
            startActivity(intent)
        }
        binding.weapon5.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("돌격소총", "돌격소총")
            startActivity(intent)
        }
        binding.weapon6.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("권총", "권총")
            startActivity(intent)
        }
        binding.weapon7.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("저격총", "저격총")
            startActivity(intent)
        }
        binding.weapon8.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("글러브", "글러브")
            startActivity(intent)
        }
        binding.weapon9.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("톤파", "톤파")
            startActivity(intent)
        }
        binding.weapon10.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("망치", "망치")
            startActivity(intent)
        }
        binding.weapon11.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("방망이", "방망이")
            startActivity(intent)
        }
        binding.weapon12.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("레이피어", "레이피어")
            startActivity(intent)
        }
        binding.weapon13.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("창", "창")
            startActivity(intent)
        }
        binding.weapon14.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("석궁", "석궁")
            startActivity(intent)
        }
        binding.weapon15.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("활", "활")
            startActivity(intent)
        }
        binding.weapon16.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("투척", "투척")
            startActivity(intent)
        }
        binding.weapon17.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("암기", "암기")
            startActivity(intent)
        }
        binding.weapon18.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("기타", "기타")
            startActivity(intent)
        }
        binding.weapon19.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("쌍절곤", "쌍절곤")
            startActivity(intent)
        }
        binding.weapon20.setOnClickListener {
            var intent = Intent(this, video::class.java)
            intent.putExtra("채찍", "채찍")
            startActivity(intent)
        }
    }
}