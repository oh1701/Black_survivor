package com.example.black_survivor_dictinary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.black_survivor_dictinary.databinding.ActivityCharacterMiniBinding

class Character_mini : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCharacterMiniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("aya"))
        {
            binding.mini.setImageResource(R.drawable.mini_aya)
            binding.text.text = "아야"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

            binding.skillInformation
            binding.movie
            binding.stats
            binding.root

            binding.textWeapon
            binding.chWeapon1.resources
            binding.chWeapon2
            binding.chWeapon3
        }

        else if(intent.hasExtra("fiora"))
        {
            binding.mini.setImageResource(R.drawable.mini_fiora)
            binding.text.text = "피오라"
            binding.mini.setBackgroundResource(R.drawable.image_color)

            binding.at2.text = "37"
            binding.at3.text = "84.5"
            binding.at4.text = "2.5"
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

        }
        else if(intent.hasExtra("jackie"))
        {
            binding.mini.setImageResource(R.drawable.mini_jackie)
            binding.text.text = "재키"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("hyonwoo"))
        {
            binding.mini.setImageResource(R.drawable.mini_hyunwoo)
            binding.text.text = "현우"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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
        }
        else if(intent.hasExtra("adriana"))
        {
            binding.mini.setImageResource(R.drawable.mini_adriana)
            binding.text.text = "아드리아나"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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
        }
        else if(intent.hasExtra("chiara"))
        {
            binding.mini.setImageResource(R.drawable.mini_chiara)
            binding.text.text = "키아라"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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
            binding.sp2.text = "3.2"
            binding.sp3.text = "3.2"
            binding.sp4.text = "-"
            binding.vi2.text = "8"
            binding.vi3.text = "8"
            binding.vi4.text = "-"

        }
        else if(intent.hasExtra("hart"))
        {
            binding.mini.setImageResource(R.drawable.mini_hart)
            binding.text.text = "하트"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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


        }
        else if(intent.hasExtra("hyejin"))
        {
            binding.mini.setImageResource(R.drawable.mini_hyejin)
            binding.text.text = "혜진"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("isol"))
        {
            binding.mini.setImageResource(R.drawable.mini_isol)
            binding.text.text = "아이솔"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("li_dailin"))
        {
            binding.mini.setImageResource(R.drawable.mini_li_dailin)
            binding.text.text = "리 다일린"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("magnus"))
        {
            binding.mini.setImageResource(R.drawable.mini_magnus)
            binding.text.text = "매그너스"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("nadine"))
        {
            binding.mini.setImageResource(R.drawable.mini_nadine)
            binding.text.text = "나딘"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("shoichi"))
        {
            binding.mini.setImageResource(R.drawable.mini_shoichi)
            binding.text.text = "쇼이치"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("silvia"))
        {
            binding.mini.setImageResource(R.drawable.mini_silvia)
            binding.text.text = "실비아"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("sissela"))
        {
            binding.mini.setImageResource(R.drawable.mini_sissela)
            binding.text.text = "시셀라"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("xiukai"))
        {
            binding.mini.setImageResource(R.drawable.mini_xiukai)
            binding.text.text = "쇼우"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("yuki"))
        {
            binding.mini.setImageResource(R.drawable.mini_yuki)
            binding.text.text = "유키"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
        else if(intent.hasExtra("zahir"))
        {
            binding.mini.setImageResource(R.drawable.mini_zahir)
            binding.text.text = "자히르"
            binding.mini.setBackgroundResource(R.drawable.image_color)

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

        }
    }
}