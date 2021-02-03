package com.black_survivor.black_survivor_dictinary

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.black_survivor.black_survivor_dictinary.databinding.ActivityCharacterMiniBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Character_mini : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCharacterMiniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adview = findViewById<AdView>(R.id.adView6)
        MobileAds.initialize(this) {}
        val adRequest = AdRequest.Builder().build()
        adview.loadAd(adRequest)

        fun value(i:Int){
            var intent = Intent(this, video::class.java)

            if(i == 1) {
                when (binding.chWeaName1.text) {
                    "권총" -> intent.putExtra("권총", "권총")
                    "양손검" -> intent.putExtra("양손검", "양손검")
                    "글러브" -> intent.putExtra("글러브" , "글러브" )
                    "기타" -> intent.putExtra("기타", "기타")
                    "단검" -> intent.putExtra("단검", "단검")
                    "도끼" -> intent.putExtra("도끼", "도끼")
                    "돌격소총" -> intent.putExtra("돌격소총", "돌격소총")
                    "레이피어" -> intent.putExtra("레이피어", "레이피어")
                    "망치" -> intent.putExtra("망치", "망치")
                    "방망이" -> intent.putExtra("방망이", "방망이")
                    "석궁" -> intent.putExtra("석궁" , "석궁" )
                    "쌍검" -> intent.putExtra("쌍검", "쌍검")
                    "쌍절곤" -> intent.putExtra("쌍절곤", "쌍절곤")
                    "암기" -> intent.putExtra("암기", "암기")
                    "양손검" -> intent.putExtra("양손검", "양손검")
                    "저격총" -> intent.putExtra("저격총", "저격총")
                    "톤파" -> intent.putExtra("톤파", "톤파")
                    "투척" -> intent.putExtra("투척", "투척")
                    "활" -> intent.putExtra("활", "활")
                    "창" -> intent.putExtra("창", "창")
                }
                if(binding.chWeaName1.text != "없음" && binding.chWeaName1.text != null) {
                    startActivity(intent)
                }
            }
            if(i == 2){
                when (binding.chWeaName2.text) {
                    "권총" -> intent.putExtra("권총", "권총")
                    "양손검" -> intent.putExtra("양손검", "양손검")
                    "글러브" -> intent.putExtra("글러브" , "글러브" )
                    "기타" -> intent.putExtra("기타", "기타")
                    "단검" -> intent.putExtra("단검", "단검")
                    "도끼" -> intent.putExtra("도끼", "도끼")
                    "돌격소총" -> intent.putExtra("돌격소총", "돌격소총")
                    "레이피어" -> intent.putExtra("레이피어", "레이피어")
                    "망치" -> intent.putExtra("망치", "망치")
                    "방망이" -> intent.putExtra("방망이", "방망이")
                    "석궁" -> intent.putExtra("석궁" , "석궁" )
                    "쌍검" -> intent.putExtra("쌍검", "쌍검")
                    "쌍절곤" -> intent.putExtra("쌍절곤", "쌍절곤")
                    "암기" -> intent.putExtra("암기", "암기")
                    "양손검" -> intent.putExtra("양손검", "양손검")
                    "저격총" -> intent.putExtra("저격총", "저격총")
                    "톤파" -> intent.putExtra("톤파", "톤파")
                    "투척" -> intent.putExtra("투척", "투척")
                    "활" -> intent.putExtra("활", "활")
                    "창" -> intent.putExtra("창", "창")
                }
                if(binding.chWeaName2.text != "없음" && binding.chWeaName1.text != null) {
                    startActivity(intent)
                }
            }
            if(i == 3){
                when (binding.chWeaName3.text) {
                    "권총" -> intent.putExtra("권총", "권총")
                    "양손검" -> intent.putExtra("양손검", "양손검")
                    "글러브" -> intent.putExtra("글러브" , "글러브" )
                    "기타" -> intent.putExtra("기타", "기타")
                    "단검" -> intent.putExtra("단검", "단검")
                    "도끼" -> intent.putExtra("도끼", "도끼")
                    "돌격소총" -> intent.putExtra("돌격소총", "돌격소총")
                    "레이피어" -> intent.putExtra("레이피어", "레이피어")
                    "망치" -> intent.putExtra("망치", "망치")
                    "방망이" -> intent.putExtra("방망이", "방망이")
                    "석궁" -> intent.putExtra("석궁" , "석궁" )
                    "쌍검" -> intent.putExtra("쌍검", "쌍검")
                    "쌍절곤" -> intent.putExtra("쌍절곤", "쌍절곤")
                    "암기" -> intent.putExtra("암기", "암기")
                    "양손검" -> intent.putExtra("양손검", "양손검")
                    "저격총" -> intent.putExtra("저격총", "저격총")
                    "톤파" -> intent.putExtra("톤파", "톤파")
                    "투척" -> intent.putExtra("투척", "투척")
                    "활" -> intent.putExtra("활", "활")
                    "창" -> intent.putExtra("창", "창")
                }
                if(binding.chWeaName3.text != "없음" && binding.chWeaName1.text != null) {
                    startActivity(intent)
                }
            }
        }

        fun noimage(){
            if(binding.chWeaName2.text == "없음")
            {
                binding.Image2.visibility = View.GONE
            }
            if(binding.chWeaName3.text == "없음")
            {
                binding.Image3.visibility = View.GONE
            }
        }

        fun profilemovie(){
            var intent = Intent(this, profilemovie::class.java)
            when (binding.text.text)
            {
                "아야" -> intent.putExtra("아야", "아야")
                "피오라" -> intent.putExtra("피오라", "피오라")
                "현우" -> intent.putExtra("현우", "현우")
                "재키" -> intent.putExtra("재키", "재키")
                "하트" -> intent.putExtra("하트", "하트")
                "매그너스" -> intent.putExtra("매그너스", "매그너스")
                "나딘" -> intent.putExtra("나딘", "나딘")
                "자히르" -> intent.putExtra("자히르", "자히르")
            }
            if(binding.text.text == "아야" ||binding.text.text == "피오라" ||binding.text.text == "현우" ||binding.text.text == "재키" ||binding.text.text == "하트" ||
                binding.text.text == "매그너스" ||binding.text.text == "나딘" ||binding.text.text == "자히르") {
                startActivity(intent)
            }
            else{
                val dlg = AlertDialog.Builder(this)
                dlg.setMessage("해당 캐릭터는 영상이 존재하지 않습니다.")

                dlg.show()
            }
        }

        binding.movie.setOnClickListener(){
            profilemovie()
        }

        binding.recommend.setOnClickListener() {
            lateinit var a:String
            val intent = Intent(this, internet::class.java)
            when (binding.text.text) {
                    "아야" -> intent.putExtra("아야", "아야")
                    "피오라" -> intent.putExtra("피오라", "피오라")
                    "현우" -> intent.putExtra("현우", "현우")
                    "재키" -> intent.putExtra("재키", "재키")
                    "아드리아나" -> intent.putExtra("아드리아나", "아드리아나")
                    "하트" -> intent.putExtra("하트", "하트")
                    "매그너스" -> intent.putExtra("매그너스", "매그너스")
                    "나딘" -> intent.putExtra("나딘", "나딘")
                    "자히르" -> intent.putExtra("자히르", "자히르")
                    "키아라" -> intent.putExtra("키아라", "키아라")
                    "혜진" -> intent.putExtra("혜진", "혜진")
                    "아이솔" -> intent.putExtra("아이솔", "아이솔")
                    "리 다이린" -> intent.putExtra("리 다이린", "리 다이린")
                    "쇼이치" -> intent.putExtra("쇼이치", "쇼이치")
                    "실비아" -> intent.putExtra("실비아", "실비아")
                    "시셀라" -> intent.putExtra("시셀라", "시셀라")
                    "쇼우" -> intent.putExtra("쇼우", "쇼우")
                    "유키" -> intent.putExtra("유키", "유키")
            }
                if(binding.text.text == "엠마") {
                val dlg = AlertDialog.Builder(this)
                dlg.setMessage("해당 캐릭터는 공략 글이 부족합니다.")

                dlg.show()
            }
                else
                    startActivity(intent)
        }


        binding.skillInformation.setOnClickListener(){
            var intent = Intent(this, skill_information::class.java)
            when (binding.text.text)
            {
                "아야" -> intent.putExtra("아야", "아야")
                "피오라" -> intent.putExtra("피오라", "피오라")
                "현우" -> intent.putExtra("현우", "현우")
                "재키" -> intent.putExtra("재키", "재키")
                "아드리아나" -> intent.putExtra("아드리아나", "아드리아나")
                "하트" -> intent.putExtra("하트", "하트")
                "매그너스" -> intent.putExtra("매그너스", "매그너스")
                "나딘" -> intent.putExtra("나딘", "나딘")
                "자히르" -> intent.putExtra("자히르", "자히르")
                "키아라" -> intent.putExtra("키아라", "키아라")
                "혜진" -> intent.putExtra("혜진", "혜진")
                "아이솔" -> intent.putExtra("아이솔", "아이솔")
                "리 다이린" -> intent.putExtra("리 다이린", "리 다이린")
                "쇼이치" -> intent.putExtra("쇼이치", "쇼이치")
                "실비아" -> intent.putExtra("실비아", "실비아")
                "시셀라" -> intent.putExtra("시셀라", "시셀라")
                "쇼우" -> intent.putExtra("쇼우", "쇼우")
                "유키" -> intent.putExtra("유키", "유키")
                "엠마" -> intent.putExtra("엠마", "엠마")
            }
            startActivity(intent)
        }

        binding.profile.setOnClickListener(){
            var intent = Intent(this, profile::class.java)
            when (binding.text.text)
            {
                "아야" -> intent.putExtra("아야", "아야")
                "피오라" -> intent.putExtra("피오라", "피오라")
                "현우" -> intent.putExtra("현우", "현우")
                "재키" -> intent.putExtra("재키", "재키")
                "아드리아나" -> intent.putExtra("아드리아나", "아드리아나")
                "하트" -> intent.putExtra("하트", "하트")
                "매그너스" -> intent.putExtra("매그너스", "매그너스")
                "나딘" -> intent.putExtra("나딘", "나딘")
                "자히르" -> intent.putExtra("자히르", "자히르")
                "키아라" -> intent.putExtra("키아라", "키아라")
                "혜진" -> intent.putExtra("혜진", "혜진")
                "아이솔" -> intent.putExtra("아이솔", "아이솔")
                "리 다이린" -> intent.putExtra("리 다이린", "리 다이린")
                "쇼이치" -> intent.putExtra("쇼이치", "쇼이치")
                "실비아" -> intent.putExtra("실비아", "실비아")
                "시셀라" -> intent.putExtra("시셀라", "시셀라")
                "쇼우" -> intent.putExtra("쇼우", "쇼우")
                "유키" -> intent.putExtra("유키", "유키")
                "엠마" -> intent.putExtra("엠마", "엠마")
            }
            startActivity(intent)
        }

        if(intent.hasExtra("aya"))
        {
            binding.mini.setImageResource(R.drawable.mini_aya)
            binding.text.text = "아야"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
            binding.Image4.visibility = View.GONE

            binding.at2.text = "28"
            binding.at3.text = "77.4"
            binding.at4.text = "2.6"
            binding.hp2.text = "480"
            binding.hp3.text = "1677"
            binding.hp4.text = "63"
            binding.hpr2.text = "0.5"
            binding.hpr3.text = "1.26"
            binding.hpr4.text = "0.04"
            binding.st2.text = "440"
            binding.st3.text = "858"
            binding.st4.text = "22"
            binding.str2.text = "2.3"
            binding.str3.text = "3.63"
            binding.str4.text = "0.07"
            binding.def2.text = "18"
            binding.def3.text = "44.6"
            binding.def4.text = "1.4"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"


            binding.chWeapon1.setImageResource(R.drawable.sniper)
            binding.chWeapon2.setImageResource(R.drawable.revolber)
            binding.chWeapon3.setImageResource(R.drawable.overheat)
            binding.chWeaName1.setText("저격총")
            binding.chWeaName2.setText("권총")
            binding.chWeaName3.setText("돌격소총")

            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
            binding.recommend
            binding.skillInformation
            binding.profile
        }

        else if(intent.hasExtra("fiora"))
        {
            binding.mini.setImageResource(R.drawable.mini_fiora)
            binding.text.text = "피오라"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "37"
            binding.at3.text = "97.8"
            binding.at4.text = "3.2"
            binding.hp2.text = "550"
            binding.hp3.text = "2203"
            binding.hp4.text = "87"
            binding.hpr2.text = "0.8"
            binding.hpr3.text = "1.94"
            binding.hpr4.text = "0.06"
            binding.st2.text = "430"
            binding.st3.text = "677"
            binding.st4.text = "13"
            binding.str2.text = "2.2"
            binding.str3.text = "3.34"
            binding.str4.text = "0.06"
            binding.def2.text = "25"
            binding.def3.text = "66.8"
            binding.def4.text = "2.2"
            binding.ats2.text = "0.22"
            binding.ats3.text = "0.22"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.15"
            binding.sp3.text = "3.15"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.parry)
            binding.chWeapon2.setImageResource(R.drawable.quickcut)
            binding.chWeapon3.setImageResource(R.drawable.shadowstab)
            binding.chWeaName1.setText("양손검")
            binding.chWeaName2.setText("레이피어")
            binding.chWeaName3.setText("창")

            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie

        }
        else if(intent.hasExtra("jackie"))
        {
            binding.mini.setImageResource(R.drawable.mini_jackie)
            binding.text.text = "재키"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "37"
            binding.at3.text = "88.3"
            binding.at4.text = "2.7"
            binding.hp2.text = "560"
            binding.hp3.text = "2023"
            binding.hp4.text = "77"
            binding.hpr2.text = "0.5"
            binding.hpr3.text = "1.07"
            binding.hpr4.text = "0.03"
            binding.st2.text = "430"
            binding.st3.text = "715"
            binding.st4.text = "15"
            binding.str2.text = "2.1"
            binding.str3.text = "2.86"
            binding.str4.text = "0.04"
            binding.def2.text = "26"
            binding.def3.text = "67.8"
            binding.def4.text = "2.2"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.1"
            binding.sp3.text = "3.1"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.parry)
            binding.chWeapon2.setImageResource(R.drawable.berserk)
            binding.chWeapon3.setImageResource(R.drawable.cloakanddagger)
            binding.chWeapon4.setImageResource(R.drawable.dualswordrampage)

            binding.chWeapon4.visibility = View.VISIBLE
            binding.chWeaName4.visibility = View.VISIBLE
            binding.Image4.visibility = View.VISIBLE
            binding.chWeaName1.setText("양손검")
            binding.chWeaName2.setText("도끼")
            binding.chWeaName3.setText("단검")
            binding.chWeaName4.setText("쌍검")
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            binding.chWeapon4.setOnClickListener(){
                val intent = Intent(this, video::class.java)
                intent.putExtra("쌍검", "쌍검")
                startActivity(intent)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("hyonwoo"))
        {
            binding.mini.setImageResource(R.drawable.mini_hyunwoo)
            binding.text.text = "현우"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
            binding.Image4.visibility = View.GONE

            binding.at2.text = "40"
            binding.at3.text = "91.3"
            binding.at4.text = "2.7"
            binding.hp2.text = "500"
            binding.hp3.text = "2020"
            binding.hp4.text = "80"
            binding.hpr2.text = "0.8"
            binding.hpr3.text = "1.56"
            binding.hpr4.text = "0.04"
            binding.st2.text = "350"
            binding.st3.text = "654"
            binding.st4.text = "16"
            binding.str2.text = "1.8"
            binding.str3.text = "2.56"
            binding.str4.text = "0.04"
            binding.def2.text = "26"
            binding.def3.text = "67.8"
            binding.def4.text = "2.2"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.15"
            binding.sp3.text = "3.15"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.glove)
            binding.chWeapon2.setImageResource(R.drawable.tonpa)
            binding.chWeapon3
            binding.chWeaName1.setText("글러브")
            binding.chWeaName2.setText("톤파")
            binding.chWeaName3.setText("없음")
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("adriana"))
        {
            binding.mini.setImageResource(R.drawable.mini_adriana)
            binding.text.text = "아드리아나"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "31"
            binding.at3.text = "76.6"
            binding.at4.text = "2.4"
            binding.hp2.text = "530"
            binding.hp3.text = "1760"
            binding.hp4.text = "65"
            binding.hpr2.text = "0.5"
            binding.hpr3.text = "1.07"
            binding.hpr4.text = "0.03"
            binding.st2.text = "480"
            binding.st3.text = "651"
            binding.st4.text = "9"
            binding.str2.text = "1"
            binding.str3.text = "1.19"
            binding.str4.text = "0.01"
            binding.def2.text = "27"
            binding.def3.text = "59.3"
            binding.def4.text = "1.7"
            binding.ats2.text = "0.04"
            binding.ats3.text = "0.04"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.smokescreen)
            binding.chWeapon2
            binding.chWeapon3
            binding.chWeaName1.setText("투척")
            binding.chWeaName2.setText("없음")
            binding.chWeaName3.setText("없음")
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
            binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("chiara"))
        {
            binding.mini.setImageResource(R.drawable.mini_chiara)
            binding.text.text = "키아라"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "34"
            binding.at3.text = "72"
            binding.at4.text = "2"
            binding.hp2.text = "500"
            binding.hp3.text = "1640"
            binding.hp4.text = "60"
            binding.hpr2.text = "0.5"
            binding.hpr3.text = "0.88"
            binding.hpr4.text = "0.02"
            binding.st2.text = "410"
            binding.st3.text = "657"
            binding.st4.text = "13"
            binding.str2.text = "1.8"
            binding.str3.text = "2.37"
            binding.str4.text = "0.03"
            binding.def2.text = "24"
            binding.def3.text = "52.5"
            binding.def4.text = "1.5"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.15"
            binding.sp3.text = "3.15"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.quickcut)
            binding.chWeapon2
            binding.chWeapon3
            binding.chWeaName1.setText("레이피어")
            binding.chWeaName2
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("hart"))
        {
            binding.mini.setImageResource(R.drawable.mini_hart)
            binding.text.text = "하트"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "22"
            binding.at3.text = "79"
            binding.at4.text = "3"
            binding.hp2.text = "500"
            binding.hp3.text = "1906"
            binding.hp4.text = "74"
            binding.hpr2.text = "0.8"
            binding.hpr3.text = "2.43"
            binding.hpr4.text = "0.07"
            binding.st2.text = "420"
            binding.st3.text = "724"
            binding.st4.text = "16"
            binding.str2.text = "1.7"
            binding.str3.text = "2.46"
            binding.str4.text = "0.04"
            binding.def2.text = "20"
            binding.def3.text = "56.1"
            binding.def4.text = "1.9"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.05"
            binding.sp3.text = "3.05"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.guitar)
            binding.chWeapon2
            binding.chWeapon3
            binding.chWeaName1.setText("기타")
            binding.chWeaName2
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("hyejin"))
        {
            binding.mini.setImageResource(R.drawable.mini_hyejin)
            binding.text.text = "혜진"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "29"
            binding.at3.text = "76.5"
            binding.at4.text = "2.5"
            binding.hp2.text = "500"
            binding.hp3.text = "1716"
            binding.hp4.text = "64"
            binding.hpr2.text = "0.6"
            binding.hpr3.text = "1.17"
            binding.hpr4.text = "0.03"
            binding.st2.text = "400"
            binding.st3.text = "894"
            binding.st4.text = "26"
            binding.str2.text = "2"
            binding.str3.text = "3.52"
            binding.str4.text = "0.08"
            binding.def2.text = "22"
            binding.def3.text = "54.3"
            binding.def4.text = "1.7"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.ninja)
            binding.chWeapon2.setImageResource(R.drawable.bow)
            binding.chWeapon3
            binding.chWeaName1.setText("암기")
            binding.chWeaName2.setText("활")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("isol"))
        {
            binding.mini.setImageResource(R.drawable.mini_isol)
            binding.text.text = "아이솔"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "32"
            binding.at3.text = "81.4"
            binding.at4.text = "2.6"
            binding.hp2.text = "500"
            binding.hp3.text = "1640"
            binding.hp4.text = "60"
            binding.hpr2.text = "0.5"
            binding.hpr3.text = "1.07"
            binding.hpr4.text = "0.03"
            binding.st2.text = "400"
            binding.st3.text = "799"
            binding.st4.text = "21"
            binding.str2.text = "1.8"
            binding.str3.text = "2.37"
            binding.str4.text = "0.03"
            binding.def2.text = "23"
            binding.def3.text = "53.4"
            binding.def4.text = "1.6"
            binding.ats2.text = "0.14"
            binding.ats3.text = "0.14"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.05"
            binding.sp3.text = "3.05"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.revolber)
            binding.chWeapon2.setImageResource(R.drawable.overheat)
            binding.chWeapon3
            binding.chWeaName1.setText("권총")
            binding.chWeaName2.setText("돌격소총")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("li_dailin"))
        {
            binding.mini.setImageResource(R.drawable.mini_li_dailin)
            binding.text.text = "리 다이린"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "33"
            binding.at3.text = "69.1"
            binding.at4.text = "1.9"
            binding.hp2.text = "550"
            binding.hp3.text = "2241"
            binding.hp4.text = "89"
            binding.hpr2.text = "1.1"
            binding.hpr3.text = "2.43"
            binding.hpr4.text = "0.07"
            binding.st2.text = "420"
            binding.st3.text = "724"
            binding.st4.text = "16"
            binding.str2.text = "0.2"
            binding.str3.text = "0.39"
            binding.str4.text = "0.01"
            binding.def2.text = "20"
            binding.def3.text = "67.5"
            binding.def4.text = "2.5"
            binding.ats2.text = "0.07"
            binding.ats3.text = "0.07"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.1"
            binding.sp3.text = "3.1"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.glove)
            binding.chWeapon2.setImageResource(R.drawable.china_weapon)
            binding.chWeapon3
            binding.chWeaName1.setText("글러브")
            binding.chWeaName2.setText("쌍절곤")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("magnus"))
        {
            binding.mini.setImageResource(R.drawable.mini_magnus)
            binding.text.text = "매그너스"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "32"
            binding.at3.text = "68.1"
            binding.at4.text = "1.9"
            binding.hp2.text = "600"
            binding.hp3.text = "2329"
            binding.hp4.text = "91"
            binding.hpr2.text = "1"
            binding.hpr3.text = "1.95"
            binding.hpr4.text = "0.05"
            binding.st2.text = "410"
            binding.st3.text = "676"
            binding.st4.text = "14"
            binding.str2.text = "1.9"
            binding.str3.text = "3.04"
            binding.str4.text = "0.06"
            binding.def2.text = "25"
            binding.def3.text = "53.5"
            binding.def4.text = "1.5"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.2"
            binding.sp3.text = "3.2"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.hammer)
            binding.chWeapon2.setImageResource(R.drawable.swing)
            binding.chWeapon3
            binding.chWeaName1.setText("망치")
            binding.chWeaName2.setText("방망이")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("nadine"))
        {
            binding.mini.setImageResource(R.drawable.mini_nadine)
            binding.text.text = "나딘"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "32"
            binding.at3.text = "73.8"
            binding.at4.text = "2.2"
            binding.hp2.text = "520"
            binding.hp3.text = "1660"
            binding.hp4.text = "60"
            binding.hpr2.text = "0.4"
            binding.hpr3.text = "0.97"
            binding.hpr4.text = "0.3"
            binding.st2.text = "350"
            binding.st3.text = "597"
            binding.st4.text = "13"
            binding.str2.text = "1.9"
            binding.str3.text = "2.85"
            binding.str4.text = "0.05"
            binding.def2.text = "21"
            binding.def3.text = "49.5"
            binding.def4.text = "1.5"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.bow)
            binding.chWeapon2.setImageResource(R.drawable.crossbow)
            binding.chWeapon3
            binding.chWeaName1.setText("활")
            binding.chWeaName2.setText("석궁")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("shoichi"))
        {
            binding.mini.setImageResource(R.drawable.mini_shoichi)
            binding.text.text = "쇼이치"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "30"
            binding.at3.text = "85.1"
            binding.at4.text = "2.9"
            binding.hp2.text = "550"
            binding.hp3.text = "2032"
            binding.hp4.text = "78"
            binding.hpr2.text = "0.8"
            binding.hpr3.text = "1.56"
            binding.hpr4.text = "0.04"
            binding.st2.text = "370"
            binding.st3.text = "617"
            binding.st4.text = "13"
            binding.str2.text = "1.6"
            binding.str3.text = "2.36"
            binding.str4.text = "0.04"
            binding.def2.text = "27"
            binding.def3.text = "68.8"
            binding.def4.text = "2.2"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.1"
            binding.sp3.text = "3.1"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.cloakanddagger)
            binding.chWeapon2
            binding.chWeapon3
            binding.chWeaName1.setText("단검")
            binding.chWeaName2
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("silvia"))
        {
            binding.mini.setImageResource(R.drawable.mini_silvia)
            binding.text.text = "실비아"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "28"
            binding.at3.text = "66"
            binding.at4.text = "2"
            binding.hp2.text = "500"
            binding.hp3.text = "1697"
            binding.hp4.text = "63"
            binding.hpr2.text = "0.4"
            binding.hpr3.text = "0.97"
            binding.hpr4.text = "0.03"
            binding.st2.text = "440"
            binding.st3.text = "858"
            binding.st4.text = "22"
            binding.str2.text = "2.1"
            binding.str3.text = "3.24"
            binding.str4.text = "0.06"
            binding.def2.text = "20"
            binding.def3.text = "46.6"
            binding.def4.text = "1.4"
            binding.ats2.text = "0.02"
            binding.ats3.text = "0.02"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "?"
            binding.vi3.text = "?"
            binding.vi4.text = "?"

            binding.chWeapon1.setImageResource(R.drawable.revolber)
            binding.chWeapon2
            binding.chWeapon3
            binding.chWeaName1.setText("권총")
            binding.chWeaName2
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("sissela"))
        {
            binding.mini.setImageResource(R.drawable.mini_sissela)
            binding.text.text = "시셀라"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "23"
            binding.at3.text = "69.6"
            binding.at4.text = "2.4"
            binding.hp2.text = "480"
            binding.hp3.text = "1620"
            binding.hp4.text = "60"
            binding.hpr2.text = "0.4"
            binding.hpr3.text = "0.78"
            binding.hpr4.text = "0.02"
            binding.st2.text = "400"
            binding.st3.text = "704"
            binding.st4.text = "16"
            binding.str2.text = "1.1"
            binding.str3.text = "1.48"
            binding.str4.text = "0.02"
            binding.def2.text = "19"
            binding.def3.text = "51.3"
            binding.def4.text = "1.7"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.ninja)
            binding.chWeapon2.setImageResource(R.drawable.smokescreen)
            binding.chWeapon3
            binding.chWeaName1.setText("암기")
            binding.chWeaName2.setText("투척")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("xiukai"))
        {
            binding.mini.setImageResource(R.drawable.mini_xiukai)
            binding.text.text = "쇼우"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "40"
            binding.at3.text = "74.2"
            binding.at4.text = "1.8"
            binding.hp2.text = "530"
            binding.hp3.text = "2050"
            binding.hp4.text = "80"
            binding.hpr2.text = "1"
            binding.hpr3.text = "2.14"
            binding.hpr4.text = "0.06"
            binding.st2.text = "420"
            binding.st3.text = "686"
            binding.st4.text = "14"
            binding.str2.text = "0.3"
            binding.str3.text = "0.49"
            binding.str4.text = "0.01"
            binding.def2.text = "34"
            binding.def3.text = "66.3"
            binding.def4.text = "1.7"
            binding.ats2.text = "0.12"
            binding.ats3.text = "0.12"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.1"
            binding.sp3.text = "3.1"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.shadowstab)
            binding.chWeapon2.setImageResource(R.drawable.cloakanddagger)
            binding.chWeapon3
            binding.chWeaName1.setText("창")
            binding.chWeaName2.setText("단검")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("yuki"))
        {
            binding.mini.setImageResource(R.drawable.mini_yuki)
            binding.text.text = "유키"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "32"
            binding.at3.text = "73.8"
            binding.at4.text = "2.2"
            binding.hp2.text = "550"
            binding.hp3.text = "2089"
            binding.hp4.text = "81"
            binding.hpr2.text = "0.7"
            binding.hpr3.text = "1.65"
            binding.hpr4.text = "0.05"
            binding.st2.text = "410"
            binding.st3.text = "490"
            binding.st4.text = "20"
            binding.str2.text = "2.2"
            binding.str3.text = "3.34"
            binding.str4.text = "0.06"
            binding.def2.text = "26"
            binding.def3.text = "64"
            binding.def4.text = "2"
            binding.ats2.text = "0.06"
            binding.ats3.text = "0.06"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3.1"
            binding.sp3.text = "3.1"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.parry)
            binding.chWeapon2.setImageResource(R.drawable.dualswordrampage)
            binding.chWeapon3
            binding.chWeaName1.setText("양손검")
            binding.chWeaName2.setText("쌍검")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("zahir"))
        {
            binding.mini.setImageResource(R.drawable.mini_zahir)
            binding.text.text = "자히르"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
binding.Image4.visibility = View.GONE

            binding.at2.text = "25"
            binding.at3.text = "78.2"
            binding.at4.text = "2.8"
            binding.hp2.text = "520"
            binding.hp3.text = "1736"
            binding.hp4.text = "64"
            binding.hpr2.text = "0.6"
            binding.hpr3.text = "1.17"
            binding.hpr4.text = "0.03"
            binding.st2.text = "400"
            binding.st3.text = "894"
            binding.st4.text = "26"
            binding.str2.text = "2.4"
            binding.str3.text = "4.3"
            binding.str4.text = "0.1"
            binding.def2.text = "20"
            binding.def3.text = "54.2"
            binding.def4.text = "1.8"
            binding.ats2.text = "0.11"
            binding.ats3.text = "0.11"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.smokescreen)
            binding.chWeapon2.setImageResource(R.drawable.ninja)
            binding.chWeapon3
            binding.chWeaName1.setText("투척")
            binding.chWeaName2.setText("암기")
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
        else if(intent.hasExtra("emma"))
        {
            binding.mini.setImageResource(R.drawable.emma_mini)
            binding.text.text = "엠마"
            binding.mini.setBackgroundResource(R.drawable.image_color)
            binding.chWeapon4.visibility = View.GONE
            binding.chWeaName4.visibility = View.GONE
            binding.Image4.visibility = View.GONE

            binding.at2.text = "40"
            binding.at3.text = "87.5"
            binding.at4.text = "2.5"
            binding.hp2.text = "550"
            binding.hp3.text = "1690"
            binding.hp4.text = "60"
            binding.hpr2.text = "0.4"
            binding.hpr3.text = "0.78"
            binding.hpr4.text = "0.02"
            binding.st2.text = "430"
            binding.st3.text = "772"
            binding.st4.text = "18"
            binding.str2.text = "1.1"
            binding.str3.text = "1.48"
            binding.str4.text = "0.02"
            binding.def2.text = "28"
            binding.def3.text = "58.4"
            binding.def4.text = "1.6"
            binding.ats2.text = "0.1"
            binding.ats3.text = "0.1"
            binding.ats4.text = "-"
            binding.cri2.text = "0%"
            binding.cri3.text = "0%"
            binding.cri4.text = "-"
            binding.sp2.text = "3"
            binding.sp3.text = "3"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

            binding.chWeapon1.setImageResource(R.drawable.ninja)
            binding.chWeapon2
            binding.chWeapon3
            binding.chWeaName1.setText("암기")
            binding.chWeaName2
            binding.chWeaName3
            binding.chWeapon1.setOnClickListener(){
                value(1)
            }
            binding.chWeapon2.setOnClickListener(){
                value(2)
            }
            binding.chWeapon3.setOnClickListener(){
                value(3)
            }
            noimage()
            binding.recommend
            binding.skillInformation
            binding.profile
            binding.movie
        }
    }
}