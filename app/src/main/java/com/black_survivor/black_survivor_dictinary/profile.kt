package com.black_survivor.black_survivor_dictinary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.black_survivor.black_survivor_dictinary.databinding.ActivityProfileBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this){}
        var adview8 = findViewById<AdView>(R.id.adview8)
        adview8.loadAd(AdRequest.Builder().build())

        fun text(a:String, b:String, c:String, d:String, e:String, f:String, g:String, h:String, i:String){
            binding.charText.text = a
            binding.text1.text = b
            binding.text2.text = c
            binding.text3.text = d
            binding.text4.text = e
            binding.text5.text = f
            binding.text6.text = g
            binding.text7.text = h
            binding.text8.text = i
        }
        if(intent.hasExtra("아야")){
            binding.name.text = "아야"
            binding.image.setImageResource(R.drawable.aya)
            text("\"나쁜 사람이요? 어디 있나요!\"", "스즈키 아야(鈴木アヤ)", "권총, 돌격소총, 저격총"
                    ,"26세", "일본", "경찰", "161cm/56kg", "여성","훈련 3장 클리어 시 지급")
        }
        if(intent.hasExtra("피오라")){
            binding.name.text = "피오라"
            binding.image.setImageResource(R.drawable.fiora)
            text("\"내 적은 어디에 있지?\"","피오라 펠르랭(Fiora Pellerin)","레이피어, 양손검, 창","24세","이탈리아","펜싱선수","158cm / 48kg","여성","8020 A코인 / 1075NP")
        }
        if(intent.hasExtra("재키")){
            binding.name.text = "재키"
            binding.image.setImageResource(R.drawable.jackie)
            text("\"숨바꼭질 시작이구나?\"","재키 퀄트(Jackie Quilt)","단검, 양손검, 도끼, 쌍검",
                    "22세","영국","연쇄 살인범","167cm / 62kg","여성","훈련 1장 클리어 보상")

        }
        if(intent.hasExtra("현우")){
            binding.name.text = "현우"
            binding.image.setImageResource(R.drawable.hyonwoo)
            text("\"이럴 때 쓰라고 있는 게 주먹이지\"","장현우(Jang Hyunwoo)","글러브, 톤파","17세","대한민국","학생","174cm / 73kg","남성","8020 A코인 / 1075NP")

        }
        if(intent.hasExtra("아드리아나")){
            binding.name.text = "아드리아나"
            binding.image.setImageResource(R.drawable.adriana)
            text("\"릴리... 날 부른거니?\"","아드리아나 리베라","투척","22세","멕시코","방화광","169cm / 60kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("키아라")){
            binding.name.text = "키아라"
            binding.image.setImageResource(R.drawable.chiara)
            text("\"난 더 이상 구원받지 못할 거야...\"","키아라(Chiara)","레이피어","21세","프랑스",
                    "견습 수녀","167cm / 48kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("하트")){
            binding.name.text = "하트"
            binding.image.setImageResource(R.drawable.hart_model)
            text("\"Love&Peace! 헤헤...\"","하트 플로이드(Hart Floyd)","기타","23세",
                    "미국","뮤지션","175cm / 63kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("혜진")){
            binding.name.text = "혜진"
            binding.image.setImageResource(R.drawable.hyejin)
            text("\"운명이라면 따르겠습니다.\"","이혜진(Lee Hyejin)","암기, 활","18세","대한민국",
                    "무당","163cm / 46kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("아이솔")){
            binding.name.text = "아이솔"
            binding.image.setImageResource(R.drawable.isol_model)
            text("\"작전 준비 완료.\"","아이솔 (Isol)","권총, 돌격소총","16세","브라질",
                    "게릴라 소년병","167cm / 62kg","남성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("리 다이린")){
            binding.name.text = "리 다이린"
            binding.image.setImageResource(R.drawable.li_dailin_model)
            text("\"하아...꼭 내가 해야 돼?\"","리 다이린(利黛琳)","글러브, 쌍절곤","26세",
                    "홍콩","백수","165cm / 57kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("매그너스")){
            binding.name.text = "매그너스"
            binding.image.setImageResource(R.drawable.magnus_model)
            text("\"이 몸의 질주를 막을 수 있는 놈이 있을 것 같나?\"","매그너스 스콧(Magnus Scott)","방망이, 망치",
                    "34세","미국","갱 리더","186cm / 97kg","남성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("나딘")){
            binding.name.text = "나딘"
            binding.image.setImageResource(R.drawable.nadine_model)
            text("\"그래, 사냥을 시작하지.\"","나딘 찬드라위나타","활, 석궁","21세","인도네시아",
                    "사냥꾼","178cm / 66kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("쇼이치")){
            binding.name.text = "쇼이치"
            binding.image.setImageResource(R.drawable.shoichi)
            text("\"잘 부탁드립니다. 평범한 회사원입니다.\"","아즈마 쇼이치(東彰一)","단검","33세",
                    "일본","증권사 직원, 암살자","179cm / 71kg","남성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("실비아")){
            binding.name.text = "실비아"
            binding.image.setImageResource(R.drawable.silvia)
            text("\"달릴 시간이구나? 그렇지?\"","실비아 피케","권총","21세","아르헨티나",
                    "모터사이클 레이서","166cm / 58kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("시셀라")){
            binding.name.text = "시셀라"
            binding.image.setImageResource(R.drawable.sissela)
            text("\"도망칠 수... 없는 거 겠죠?\"","시셀라 카일(Sissela Kyle)","암기, 투척","16세","스웨덴",
                    "불치병 환자","153cm / 37kg","여성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("쇼우")){
            binding.name.text = "쇼우"
            binding.image.setImageResource(R.drawable.xiukai)
            text("\"좋아, 단숨에 요리해보자고!\"","주오 쇼우카이(左修凱)","창","34세",
                    "중국","요리사","187cm / 152kg","남성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("유키")){
            binding.name.text = "유키"
            binding.image.setImageResource(R.drawable.yuki)
            text("\"이번엔 제 차례로군요\"","사토 유키(佐藤雪)","양손검, 쌍검","18세","일본","고등학생(검도부장)",
                    "171cm / 65kg","남성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("자히르")){
            binding.name.text = "자히르"
            binding.image.setImageResource(R.drawable.zahir_model)
            text("\"신이 주신 시련이라면, 기꺼이 감당할 것이오.\"","자히르 싱(Zahir singh)","투척, 암기","18세",
                    "인도","교인","175cm / 74kg","남성","8020 A코인 / 1075 NP")

        }
        if(intent.hasExtra("엠마")){
            binding.name.text = "엠마"
            binding.image.setImageResource(R.drawable.emma)
            text("\"마술사 등장! 새 무대를 준비해볼까?\"","엠마 하디","암기","21세","미국","마술사",
                    "164cm / 56kg","여성","8020 A코인 / 1075 NP")
        }
        if(intent.hasExtra("레녹스")){
            binding.name.text = "레녹스"
            binding.image.setImageResource(R.drawable.c_lenox)
            text("\"자, 오늘은 어떤 고기가 날 기다릴까?\"", "레녹스", "채찍"
                    ,"26세", "오스트리아", "낚시꾼", "170cm/58kg", "여성","8020 A코인 / 1075 NP")
        }
        if(intent.hasExtra("로지")){
            binding.name.text = "로지"
            binding.image.setImageResource(R.drawable.c_rozzi)
            text("\"은밀하고, 깔끔하게\"", "로지", "권총"
                    ,"20세", "브라질", "용병", "165cm/50kg", "여성","8020 A코인 / 1075 NP")
        }
        if(intent.hasExtra("루크")){
            binding.name.text = "루크"
            binding.image.setImageResource(R.drawable.luke)
            text("\"쓱싹쓱싹, 청소 대행업체 더블 엘(LL)입니다~\"", "루크", "방망이",
                    "27세", "폴란드", "청소부", "177cm/75kg", "남성","8020 A코인 / 1075 NP")
        }
        if(intent.hasExtra("캐시")){
            binding.name.text = "캐시"
            binding.image.setImageResource(R.drawable.cathy)
            text("\"피와 사체를 보는 건 익숙합니다.\"", "캐시 허긴스", "단검",
                    "32세", "캐나다", "의사", "?cm/?kg", "여성","8020 A코인 / 1075 NP")
        }
        if(intent.hasExtra("아델라")){
            binding.name.text = "아델라"
            binding.image.setImageResource(R.drawable.adela)
            text("\"왜 그렇게 애를 써? 어차피 내가 이길텐데.\"", "아델라 그로", "레이피어",
                    "25세", "--", "체스 챔피언", "?cm/?kg", "여성","8020 A코인 / 1075 NP")
        }

        if(intent.hasExtra("버니스")) {
            binding.name.text = "버니스"
            binding.image.setImageResource(R.drawable.bernice)
            text("\"인간을 쏘지 않아. 짐승을 사냥할 뿐이다\"", "버니스 볼튼", "저격총",
                    "42세", "--", "사냥꾼", "?cm/?kg", "남성", "8020 A코인 / 1075 NP")
        }
        if(intent.hasExtra("바바라")){
            binding.name.text = "바바라"
            binding.image.setImageResource(R.drawable.barbara)
            text("\"너희가 이게 얼마나 대단한 발명인지 알 리가 없지\"", "바바라 엘란바인", "방망이",
                    "36세", "--", "발명가", "?cm/?kg", "여성","8020 A코인 / 1075 NP")
        }
        /*
        if(intent.hasExtra("")){
            binding.name.text = ""
            binding.image.setImageResource(R.drawable.)
            text("\"\"", "", "",
                    "", "", "", "", "","8020 A코인 / 1075 NP")
        }
        */
    }
}
