package com.black_survivor.black_survivor_dictinary

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class item_in(context: Context) {

    var rnqns: Int = 0
    var qkRnrl: Int = -1
    var qkRnrl2: Int = -1

    val aview: View = LayoutInflater.from(context).inflate(R.layout.activity_popup, null)
    val bview: View = LayoutInflater.from(context).inflate(R.layout.activity_imsi, null)

    val ImageView1: ImageView = aview.findViewById(R.id.im1)


    val name: TextView = aview.findViewById(R.id.te1)

    val uptext1: TextView = aview.findViewById(R.id.imup_text1)
    val uptext2: TextView = aview.findViewById(R.id.imup_text2)
    val uptext3: TextView = aview.findViewById(R.id.imup_text3)
    val uptext4: TextView = aview.findViewById(R.id.imup_text4)
    val uptext5: TextView = aview.findViewById(R.id.imup_text5)
    val im: TextView = aview.findViewById(R.id.te4)

    val downtext1: TextView = aview.findViewById(R.id.imdown_text1)
    val downtext2: TextView = aview.findViewById(R.id.imdown_text2)
    val downtext3: TextView = aview.findViewById(R.id.imdown_text3)
    val downtext4: TextView = aview.findViewById(R.id.imdown_text4)
    val downtext5: TextView = aview.findViewById(R.id.imdown_text5)

    val imaup1: ImageView = aview.findViewById(R.id.imup_1)
    val imaup2: ImageView = aview.findViewById(R.id.imup_2)
    val imaup3: ImageView = aview.findViewById(R.id.imup_3)
    val imaup4: ImageView = aview.findViewById(R.id.imup_4)
    val imaup5: ImageView = aview.findViewById(R.id.imup_5)

    val imadown1: ImageView = aview.findViewById(R.id.imdown_1)
    val imadown2: ImageView = aview.findViewById(R.id.imdown_2)
    val imadown3: ImageView = aview.findViewById(R.id.imdown_3)
    val imadown4: ImageView = aview.findViewById(R.id.imdown_4)
    val imadown5: ImageView = aview.findViewById(R.id.imdown_5)

    val grade: TextView = aview.findViewById(R.id.te2_1)
    val abil: TextView = aview.findViewById(R.id.te22_1)
    val exeplan: TextView = aview.findViewById(R.id.te3_1)

    val imsi: ImageView = bview.findViewById(R.id.imaging)

    fun grade() {
        when (grade.text) {
            "일반" -> grade.setTextColor(Color.WHITE)
            "고급" -> grade.setTextColor(Color.GREEN)
            "희귀" -> grade.setTextColor(Color.parseColor("#11ABE8"))
            "영웅" -> grade.setTextColor(Color.parseColor("#FFBB86FC"))
            "전설" -> grade.setTextColor(Color.YELLOW)
        }
    }

    fun ima_tex_clear() {
        imaup1.setImageResource(0)
        imaup2.setImageResource(0)
        imaup3.setImageResource(0)
        imaup4.setImageResource(0)
        imaup5.setImageResource(0)
        uptext1.text = ""
        uptext2.text = ""
        uptext3.text = ""
        uptext4.text = ""
        uptext5.text = ""

        imadown1.setImageResource(0)
        imadown2.setImageResource(0)
        imadown3.setImageResource(0)
        imadown4.setImageResource(0)
        imadown5.setImageResource(0)
        downtext1.text = ""
        downtext2.text = ""
        downtext3.text = ""
        downtext4.text = ""
        downtext5.text = ""
    }

    fun reset() {
        imaup1.setImageResource(0)
        uptext1.text = ""
        imaup2.setImageResource(0)
        uptext2.text = ""
        imaup3.setImageResource(0)
        uptext3.text = ""
        imaup4.setImageResource(0)
        uptext4.text = ""
        imaup5.setImageResource(0)
        uptext5.text = ""

        imadown1.setImageResource(0)
        downtext1.text = ""
        imadown2.setImageResource(0)
        downtext2.text = ""
        imadown3.setImageResource(0)
        downtext3.text = ""
        imadown4.setImageResource(0)
        downtext4.text = ""
        imadown5.setImageResource(0)
        downtext5.text = ""

        im.text = "상위 아이템"
        im.isClickable = false
    }

    fun te(a: String, b: String, c: String, d: String) {
        name.text = a
        abil.text = b
        exeplan.text = c
        grade.text = d
    }

    fun up(a: String, b: String, c: String, d: String, e: String) {
        for (j in falselist.indices) {
            if (falselist[j].name1 == a) {
                imaup1.setImageResource(falselist[j].Image1)
                uptext1.text = falselist[j].name1
            }
            if (falselist[j].name1 == b) {
                imaup2.setImageResource(falselist[j].Image1)
                uptext2.text = falselist[j].name1
            }
            if (falselist[j].name1 == c) {
                imaup3.setImageResource(falselist[j].Image1)
                uptext3.text = falselist[j].name1
            }
            if (falselist[j].name1 == d) {
                imaup4.setImageResource(falselist[j].Image1)
                uptext4.text = falselist[j].name1
            }

            if (falselist[j].name1 == e) {
                imaup5.setImageResource(falselist[j].Image1)
                uptext5.text = falselist[j].name1
            }
        }
    }

    fun down(a: String, b: String, c: String, d: String, e: String) {
        for (j in falselist.indices) {
            if (falselist[j].name1 == a) {
                imadown1.setImageResource(falselist[j].Image1)
                downtext1.text = falselist[j].name1
            }
            if (falselist[j].name1 == b) {
                imadown2.setImageResource(falselist[j].Image1)
                downtext2.text = falselist[j].name1
            }
            if (falselist[j].name1 == c) {
                imadown3.setImageResource(falselist[j].Image1)
                downtext3.text = falselist[j].name1
            }
            if (falselist[j].name1 == d) {
                imadown4.setImageResource(falselist[j].Image1)
                downtext4.text = falselist[j].name1
            }

            if (falselist[j].name1 == e) {
                imadown5.setImageResource(falselist[j].Image1)
                downtext5.text = falselist[j].name1
            }
        }
    }

    fun falsearray(i: Int) {
        if (falselist[i].name1 == "채찍") {
            te("채찍", "공격력 +12", "성당(3개), 학교(4개)의 상자", "일반")
            up("오랏줄", "철편", "", "", "")
        }
        if (falselist[i].name1 == "오랏줄") {
            te("오랏줄", "공격력 +24, 스킬 증폭 +6", "[제작] 채찍 + 마패", "고급")
            up("바람 채찍", "", "", "", "")
            down("채찍", "마패", "", "", "")
        }
        if (falselist[i].name1 == "철편") {
            te("철편", "공격력 +30", "[제작] 채찍 + 면도칼", "고급")
            up("뇌룡편", "박력편", "", "", "")
            down("채찍", "면도칼", "", "", "")
        }
        if (falselist[i].name1 == "바람 채찍") {
            te("바람 채찍", "공격력 +24, 스킬 증폭 +20", "[제작] 오랏줄 + 부채", "희귀")
            up("글레이프니르", "열화구절편", "", "", "")
            down("오랏줄", "부채", "", "", "")
        }
        if (falselist[i].name1 == "뇌룡편") {
            te("뇌룡편", "공격력 +30\n" +
                    "스킬 증폭 +20%", "[제작] 철편 + 황금", "희귀")
            up("", "", "", "", "")
            down("철편", "황금", "", "", "")
        }
        if (falselist[i].name1 == "박력편") {
            te("박력편", "공격력 +42\n" +
                    "공격 속도 +20%", "[제작] 철편 + 방전 전지", "희귀")
            up("플라즈마 윕", "", "", "", "")
            down("철편", "방전 전지", "", "", "")
        }
        if (falselist[i].name1 == "글레이프니르") {
            te("글레이프니르", "공격력 +58\n" +
                    "스킬 증폭 +35", "[제작] 바람 채찍 + 가시 발판", "영웅")
            up("", "", "", "", "")
            down("바람 채찍", "가시 발판", "", "", "")
        }
        if (falselist[i].name1 == "플라즈마 윕") {
            te("플라즈마 윕", "공격력 +60, 공격 속도 +30%\n" +
                    "시야 +2.3", "[제작] 박력편 + 레이저 포인터", "영웅")
            up("", "", "", "", "")
            down("박력편", "레이저 포인터", "", "", "")
        }
        if (falselist[i].name1 == "열화구절편") {
            te("열화구절편", "공격력 +65, 생명력 흡수 +20%\n" +
                    "스킬 증폭 +40", "[제작] VF 혈액 샘플 + 바람 채찍", "전설")
            up("", "", "", "", "")
            down("VF 혈액 샘플", "바람 채찍", "", "", "")
        }
        if (falselist[i].name1 == "가위") {
            te("가위", "공격력 +5", "골목길(7개), 병원(6개), 학교(6개)의 상자\n, 박쥐(사냥)", "일반")
            up("King-V", "", "", "", "")
        }

        if (falselist[i].name1 == "만년필") {
            te("만년필", "공격력 +5", "일반", "고급 주택가(6개), 번화가(8개), 학교(7개)의 상자\n" + ", 멧돼지(사냥)")
            up("정교한 도면", "싸인볼", "빈티지 카드", "", "")
        }

        if (falselist[i].name1 == "식칼") {
            te("식칼", "공격력 +4" + "이동속도 +0.05", "단검 사용 시 기본 지급, 골목길(5개), 호텔(4개), 절(3개)의 상자\n, 멧돼지(사냥)", "일반")
            up("군용 나이프", "쌍칼", "정글 기요틴", "바이던트", "")
        }

        if (falselist[i].name1 == "군용 나이프") {
            te("군용 나이프", "공격력 +14, 이동속도 +0.08", "[제작] \n 식칼 + 나뭇가지", "고급")
            up("장미칼", "초진동나이프", "프라가라흐", "식칼", "나뭇가지")
        }
        if (falselist[i].name1 == "장미칼") {
            te("장미칼", "공격력 +20, 이동속도 +0.1, 쿨다운 감소 +10%", "[제작] \n 군용 나이프 + 꽃", "고급")
            up("카른웬난", "파산검", "군용 나이프", "꽃", "")
        }
        if (falselist[i].name1 == "카른웬난") {
            te("카른웬난", "공격력 +44, 이동속도 +0.1, 체력 재생 +1.2\n 쿨다운 감소 +12%, 기본 공격 추가 피해 +29", "[제작] \n 장미칼 + 성자의 유산", "영웅")
            up("장미칼", "성자의 유산", "", "", "")
        }
        if (falselist[i].name1 == "파산검") {
            te("파산검", "공격력 +38, 이동속도 +0.1 \n쿨다운 감소 +10%, 스킬 증폭 +30", "[제작] \n 장미칼 + 재", "영웅")
            up("장미칼", "재", "", "", "")
        }
        if (falselist[i].name1 == "초진동나이프") {
            te("초진동나이프", "공격력 +57, 공격속도 +40%, 이동속도 +0.1", "[제작] \n 군용 나이프 + 모터", "영웅")
            up("군용 나이프", "모터", "", "", "")
        }
        if (falselist[i].name1 == "프라가라흐") {
            te("프라가라흐", "공격력 +90, 이동속도 +0.2", "[제작] \n 군용 나이프 + 포스 코어", "전설")
            up("군용 나이프", "포스 코어", "", "", "")
        }
        if (falselist[i].name1 == "녹슨 검") {
            te("녹슨 검", "공격력 + 11", "양손검 사용 시 기본 지급\n" + "항구(4개), 절(4개), 성당(4개)의 상자", "일반")
            up("샴쉬르", "일본도", "바스타드 소드", "쌍칼", "비파단도")
        }
        if (falselist[i].name1 == "샴쉬르") {
            te("샴쉬르", "공격력 +27", "[제작]\n 녹슨 검 + 라이터", "고급")
            up("보검", "레바테인", "", "", "")
            down("녹슨 검", "라이터", "", "", "")
        }
        if (falselist[i].name1 == "일본도") {
            te("일본도", "공격력 +35", "[제작]\n 녹슨 검 + 철판", "희귀")
            up("마사무네", "무라마사", "다인슬라이프", "", "")
            down("녹슨 검", "철판", "", "", "")
        }
        if (falselist[i].name1 == "마사무네") {
            te("마사무네", "공격력 +40, 공격 속도 + 15!%", "[제작]\n일본도 + 오일", "희귀")
            up("아론다이트", "", "", "", "")
            down("일본도", "오일", "", "", "")
        }
        if (falselist[i].name1 == "무라마사") {
            te("무라마사", "공격력 +50", "[제작]\n일본도 + 원석", "희귀")
            up("모노호시자오", "", "", "", "")
            down("일본도", "원석", "", "", "")
        }
        if (falselist[i].name1 == "바스타드 소드") {
            te("바스타드 소드", "공격력 +45, 이동속도-0.05", "[제작]\n 녹슨 검 + 강철", "희귀")
            up("뚜언 띠엔", "플라즈마 소드", "", "", "")
            down("녹슨 검", "강철", "", "", "")
        }
        if (falselist[i].name1 == "보검") {
            te("보검", "공격력 +35, 최대 체력 +200", "[제작] 샴쉬르 + 루비", "희귀")
            up("엑스칼리버", "호푸어드", "", "", "")
            down("샴쉬르", "루비", "", "", "")
        }
        if (falselist[i].name1 == "뚜언 띠엔") {
            te("뚜언 띠엔", "공격력 +77, 방어력 +25", "[제작] 바스타드 소드 + 거북이 등딱지", "희귀")
            down("바스타드 소드", "거북이 등딱지", "", "", "")
        }
        if (falselist[i].name1 == "플라즈마 소드") {
            te("플라즈마 소드", "공격력 +75, 시야 +3", "[제작] 바스타드 소드 + 레이저 포인터", "희귀")
            down("바스타드 소드", "레이저 포인터", "", "", "")
        }
        if (falselist[i].name1 == "아론다이트") {
            te("아론 다이트", "공격력 +50, 공격속도 +25%\n 기본공격 추가피해 +25", "[제작] 마사무네 + 십자가", "영웅")
            down("마사무네", "십자가", "", "", "")
        }
        if (falselist[i].name1 == "엑스칼리버") {
            te("엑스칼리버", "공격력 +60, 최대체력 +360, 공격 속도 +10% 체력재생 +200%", "[제작] 보검 + 성배", "영웅")
            down("보검", "성배", "", "", "")
        }
        if (falselist[i].name1 == "모노호시자오") {
            te("모노호시자오", "공격력 +74, 생명력 흡수 +21%", "[제작] 무라마사 + 정교한 도면", "영웅")
            down("무라마사", "정교한 도면", "", "", "")
        }
        if (falselist[i].name1 == "호푸어드") {
            te("호푸어드", "공격력 +50, 최대체력 +300, 치명타 확률 +25%", "[제작] 보검 + 유리 조각", "영웅")
            down("보검", "유리 조각", "", "", "")
        }
        if (falselist[i].name1 == "레바테인") {
            te("레바테인", "공격력 +75, 체력 재생 +1.5, 스태미너 재생 +1.5, 기본공격 추가 피해 +20", "[제작] 삼매진화 + 샴쉬르", "전설")
            down("삼매진화", "샴쉬르", "", "", "")
        }
        if (falselist[i].name1 == "다인슬라이프") {
            te("다인슬라이프", "공격력 +80\n" + "생명력 흡수 +25%", "[제작] VF 혈액 샘플 + 일본도", "전설")
            down("VF 혈액 샘플", "일본도", "", "", "")
        }
        if (falselist[i].name1 == "곡괭이") {
            te("곡괭이", "공격력 +15", "연못(7개), 묘지(7개), 숲(8개), 모래사장(7)의 상자\n" + "박쥐(사냥)", "일반")
            up("사슬 낫", "황금", "", "", "")
        }
        if (falselist[i].name1 == "손도끼") {
            te("손도끼", "공격력 +25", "연못(4개), 모래사장(5), 공장(4)의 상자, 들개(사냥)", "일반")
            up("전투 도끼", "펜듈럼 도끼", "도끼창", "", "")
        }
        if (falselist[i].name1 == "사슬 낫") {
            te("사슬 낫", "공격력 +50, 기본 공격 사거리 +0.2", "[제작] 곡괭이 + 쇠사슬", "고급")
            up("사신의 낫", "곡괭이", "쇠사슬", "", "")
        }
        if (falselist[i].name1 == "전투 도끼") {
            te("전투 도끼", "공격력 +47", "[제작] \n 손도끼 + 대나무", "고급")
            up("경량화 도끼", "대부", "", "", "")
            down("손도끼", "대나무", "", "", "")
        }
        if (falselist[i].name1 == "경량화 도끼") {
            te("경량화 도끼", "공격력 +61, 이동속도 +0.15", "[제작] \n 전투 도끼 + 깃털", "희귀")
            up("파라슈", "", "", "", "")
            down("전투 도끼", "깃털", "", "", "")
        }
        if (falselist[i].name1 == "사신의 낫") {
            te("사신의 낫", "공격력 +80 \n 기본 공격 사거리 +0.5", "[제작] \n 사슬 낫 + 단봉", "희귀")
            up("산타 무에르테", "스퀴테", "하르페", "", "")
            down("사슬 낫", "단봉", "", "", "")
        }
        if (falselist[i].name1 == "대부") {
            te("대부", "공격력 +110, 이동속도 -0.1", "[제작] \n 전투 도끼 + 강철", "희귀")
            up("빔 엑스", "", "", "", "")
            down("전투 도끼", "강철", "", "", "")
        }
        if (falselist[i].name1 == "빔 엑스") {
            te("빔 엑스", "공격력 +137, 시야 +4", "[제작] \n대부 + 레이저 포인터", "영웅")
            down("대부", "레이저 포인터", "", "", "")
        }
        if (falselist[i].name1 == "산타 무에르테") {
            te("산타 무에르테", "공격력 +100, 최대 체력 +450 ,생명력 흡수 +15%\n기본 공격 사거리 +0.5", "[제작] \n사신의 낫 + 루비", "영웅")
            down("사신의 낫", "루비", "", "", "")
        }
        if (falselist[i].name1 == "스퀴테") {
            te("스퀴테", "공격력 +130, 기본 공격 사거리 +1 \n 스킬 증폭 +18%", "[제작] \n사신의 낫 + 황금", "영웅")
            down("사신의 낫", "황금", "", "", "")
        }
        if (falselist[i].name1 == "파라슈") {
            te("파라슈", "공격력 +115, 이동속도 +0.1, 쿨다운 감소 +10%", "[제작] 경량화 도끼 + 진신사리", "영웅")
            down("경량화 도끼", "진신사리", "", "", "")
        }
        if (falselist[i].name1 == "하르페") {
            te("하르페", "공격력 +105, 이동속도 +0.1, 스킬 증폭 +33, 스킬 공격 사거리+0.5, 스킬 적중 시 치유 감소 -40%", "[제작] 사신의 낫 + 백우선", "영웅")
            down("사신의 낫", "백우선", "", "", "")
        }
        if (falselist[i].name1 == "쌍칼") {
            te("쌍칼", "공격력 +18, 공격속도 +10%", "[제작] \n식칼 + 녹슨 검", "고급")
            up("피렌체식 쌍검", "자웅일대검", "디오스쿠로이", "로이거차르", "")
            down("식칼", "녹슨 검", "", "", "")
        }
        if (falselist[i].name1 == "피렌체식 쌍검") {
            te("피렌체식 쌍검", "공격력 +28, 공격속도 +10%\n생명력 흡수 +10%", "[제작] \n쌍칼 + 정교한 도면", "희귀")
            up("이천일류", "", "", "", "")
            down("쌍칼", "정교한 도면", "", "", "")
        }
        if (falselist[i].name1 == "이천일류") {
            te("이천일류", "공격력 +46, 공격속도 +10%, 생명력 흡수 +18%, 스킬 적중 시 치유 감소 -40%", "[제작] \n피렌체식 쌍검 + 못", "영웅")
            down("피렌체식 쌍검", "못", "", "", "")
        }
        if (falselist[i].name1 == "자웅일대검") {
            te("자웅일대검", "공격력 +60, 공격속도 +50%", "[제작] \n쌍칼 + 문스톤", "영웅")
            down("쌍칼", "문스톤", "", "", "")
        }
        if (falselist[i].name1 == "디오스쿠로이") {
            te("디오스쿠로이", "공격력 +46, 공격속도 +50%", "[제작] \n쌍칼 + 이온 전지", "영웅")
            down("쌍칼", "이온 전지", "", "", "")
        }
        if (falselist[i].name1 == "로이거 차르") {
            te("로이거 차르", "공격력 +38, 공격속도 +15%, 스킬 증폭 +36", "[제작] \n쌍칼 + 독약", "영웅")
            down("쌍칼", "독약", "", "", "")
        }
        if (falselist[i].name1 == "발터 PPK\u002dMagnum") {
            te("발터 PPK", "장탄 수: 6발, 공격력 +14", "사용 시 기본 지급\n" + "모래사장(4개), 호텔(5개), 공장(4개)의 상자", "일반")
            up("매그넘-파이썬", "베레타 M92F", "", "", "")
        }
        if (falselist[i].name1 == "매그넘\u002d파이썬") {
            te("매그넘\u002d파이썬", "장탄 수: 6발, 공격력 +15, 공격속도 +10%\n, 이동속도 +0.1", "[제작]\n 발터 PPK Magnum + 오일", "고급")
            up("매그넘-아나콘다", "더블 리볼버 SP", "", "", "")
            down("발터 PPK-Magnum", "오일", "", "", "")
        }
        if (falselist[i].name1 == "베레타 M92F") {
            te("베레타 M92F", "장탄 수: 6발, 공격력 +23, 이동속도 +0.1", "[제작]\n 발터 PPK Magnum + 가죽", "고급")
            up("FN57", "더블 리볼버 SP", "일렉트론 블라스터", "악켈테", "")
            down("발터 PPK-Magnum", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "FN57") {
            te("FN57", "장탄 수: 6발, 공격력 +29, 이동속도 +0.1. 시야 +2.5", "[제작]\n 베레타 M92F + 레이저 포인터", "희귀")
            up("엘레강스", "", "", "", "")
            down("베레타 M92F", "레이조 포인터", "", "", "")
        }
        if (falselist[i].name1 == "더블 리볼버 SP") {
            te("더블 리볼버 SP", "장탄 수: 6발, 공격력 +49, 이동속도 +0.1. 공격 속도 +10%", "[제작]\n 베레타 M92F + 매그넘\u002d파이썬", "희귀")
            up("마탄의 사수", "", "", "", "")
            down("베레타 M92F", "매그넘-파이썬", "", "", "")
        }
        if (falselist[i].name1 == "매그넘\u002d아나콘다") {
            te("매그넘\u002d아나콘다", "장탄 수: 6발, 공격력 +43, 이동속도 +0.1. \n공격 속도 +10%, 생명력 흡수 +10%", "[제작]\n 매그넘\u002d파이썬 + 정교한 도면", "희귀")
            up("매그넘-보아", "", "", "", "")
            down("매그넘-파이썬", "정교한 도면", "", "", "")
        }
        if (falselist[i].name1 == "마탄의 사수") {
            te("마탄의 사수", "장탄 수: 7발, 공격력 +35, 이동속도 +0.1\n스킬 증폭 +42, 공격 속도 +10%", "[제작]\n 더블 리볼버 SP + 재", "영웅")
            down("더블 리볼버 SP", "재", "", "", "")
        }
        if (falselist[i].name1 == "엘레강스") {
            te("엘레강스", "장탄 수: 6발, 공격력 +90, 이동속도 +0.2, 시야 +5", "[제작]\n FN57 + 먼지털이개", "영웅")
            down("FN57", "먼지털이개", "", "", "")
        }
        if (falselist[i].name1 == "일렉트론 블라스터") {
            te("일렉트론 블라스터", "장탄 수: 10발, 공격력 +65, 이동속도 +0.1\n기본 공격 추가 피해 +28", "[제작]\n 베레타 M92F + 이온 전지", "영웅")
            down("베레타 M92F", "이온 전지", "", "", "")
        }
        if (falselist[i].name1 == "매그넘\u002d보아") {
            te("매그넘\u002d보아", "장탄 수: 6발, 공격력 +90, 이동속도 +0.1\n시야 +3.5, 생명력 흡수 +20%", "[제작]\n 매그넘\u002d아나콘다 + 강철", "영웅")
            down("매그넘-아나콘다", "강철", "", "", "")
        }
        if (falselist[i].name1 == "악켈테") {
            te("악켈테", "장탄 수: 10발, 공격력 +120, 이동속도 +0.2", "[제작]\n 포스 코어 + 베레타 M92F", "전설")
            down("포스 코어", "베레타 M92F", "", "", "")
        }
        if (falselist[i].name1 == "페도로프 자동소총") {
            te("페도로프 자동소총", "장탄 수: 30발, 공격력 +11, 이동속도", "사용 시 기본 지급, 호텔(4개), 공장(4개)의 상자", "일반")
            up("STG-44", "", "", "", "")
        }
        if (falselist[i].name1 == "STG\u002d44") {
            te("STG\u002d44", "장탄 수: 30발, 공격력 +18, 시야 +1.5, 기본 공격 추가 피해 +2", "[제작]\n페도로프 자동소총 + 화약", "고급")
            up("AK-47", "M16A1", "기관총", "", "")
            down("페도로프 자동소총", "화약", "", "", "")
        }
        if (falselist[i].name1 == "AK\u002d47") {
            te("AK\u002d47", "장탄 수: 30발, 공격력 +29, 시야 +1.5, 기본 공격 추가 피해 +2", "[제작]\nSTG\u002d44 + 피아노선", "희귀")
            up("AK-12", "", "", "", "")
            down("STG-44", "피아노선", "", "", "")
        }
        if (falselist[i].name1 == "M16A1") {
            te("M16A1", "장탄 수: 30발, 공격력 +25, 시야 +1.5, 기본 공격 추가 피해 +4", "[제작]\nSTG\u002d44 + 가죽", "희귀")
            up("XCR", "", "", "", "")
            down("STG-44", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "기관총") {
            te("기관총", "장탄 수: 30발, 공격력 +20, 시야 +1.5\n 기본 공격 추가 피해 +11, 공격 속도 +10%", "[제작]\nSTG\u002d44 + 모터", "영웅")
            down("STG-44", "모터", "", "", "")
        }
        if (falselist[i].name1 == "개틀링건") {
            te("개틀링건", "장탄 수: 30발, 공격력 +50, 시야 +1.5\n 기본 공격 추가 피해 +12, 공격 속도 +15%", "[제작]기관총 + 오일", "영웅")
            down("기관총", "오일", "", "", "")
        }
        if (falselist[i].name1 == "AK\u002d12") {
            te("AK\u002d12", "장탄 수: 30발, 공격력 +50, 시야 +1.5\n 기본 공격 추가 피해 +12", "[제작]\nAK-47 + 유리판", "영웅")
            down("AK-47", "유리판", "", "", "")
        }
        if (falselist[i].name1 == "XCR") {
            te("XCR", "장탄 수: 30발, 공격력 +60, 시야 +1.5\n 기본 공격 추가 피해 +10", "[제작]\nM16A1 + 탄창", "영웅")
            down("M16A1", "탄창", "", "", "")
        }
        if (falselist[i].name1 == "화승총") {
            te("화승총", "장탄 수 : 1발, 공격력 +34", "사용 시 기본 지급, 항구(3개), 숲(2개)의 상자", "일반")
            up("스프링필드", "", "", "", "")
        }
        if (falselist[i].name1 == "스프링필드") {
            te("스프링필드", "장탄 수 : 1발, 공격력 +50, 이동속도 -0.07, 시야 +1.5", "[제작] 화승총 + 레이저 포인터\n초록색 항공 보급", "고급")
            up("하푼건", "금교전", "레일건", "", "")
            down("화승총", "레이저 포인터", "", "", "")
        }
        if (falselist[i].name1 == "하푼건") {
            te("하푼건", "장탄 수 : 2발, 공격력 +64, 이동속도 -0.07, 시야 +2", "[제작]\n 스프링필드 + 단창", "희귀")
            up("Tac-50", "인터벤션", "", "", "")
            down("스프링필드", "단창", "", "", "")
        }
        if (falselist[i].name1 == "금교전") {
            te("금교전", "장탄 수 : 1발, 공격력 +56, 이동속도 -0.07, 시야 +2.5, 스킬증폭 +18%", "[제작]\n 스프링필드 + 황금", "희귀")
            up("NTW-20", "사사성광", "", "", "")
            down("스프링필드", "황금", "", "", "")
        }
        if (falselist[i].name1 == "레일건") {
            te("레일건", "장탄 수 : 3발, 공격력 +78, 이동속도 -0.03, 시야 +2, 공격속도 +20%", "[제작]\n 스프링필드 + 전자 부품", "희귀")
            up("폴라리스", "", "", "", "")
            down("스프링필드", "전자 부품", "", "", "")
        }
        if (falselist[i].name1 == "Tac\u002d50") {
            te("Tac\u002d50", "장탄 수 : 2발, 공격력 +140, 시야 +2.5, 생명력 흡수 +20%", "[제작]\n 하푼건 + 정교한 도면", "영웅")
            down("하푼건", "정교한 도면", "", "", "")
        }
        if (falselist[i].name1 == "인터벤션") {
            te("인터벤션", "장탄 수 : 2발, 공격력 +120, 시야 +4.5, 기본 공격 사거리 +1", "[제작]\n 하푼건 + 망원 카메라", "영웅")
            down("하푼건", "망원 카메라", "", "", "")
        }
        if (falselist[i].name1 == "NTW\u002d20") {
            te("NTW\u002d20", "장탄 수 : 1발, 공격력 +100, 시야 +2.5, 이동속도 -0.07, 스킬증폭 +24%", "[제작]\n 금교전 + 철판", "영웅")
            down("금교전", "철판", "", "", "")
        }
        if (falselist[i].name1 == "폴라리스") {
            te("폴라리스", "장탄 수 : 3발, 공격력 +130, 시야 +2, 공격속도 +40%, 이동속도 -0.03%", "[제작]\n 레일건 + 백색 가루", "영웅")
            down("레일건", "백색 가루", "", "", "")
        }

        if (falselist[i].name1 == "사사성광") {
            te("사사성광", "장탄 수 : 1발, 공격력 +100, 시야 +2.5, 이동속도 -0.07, 스킬증폭 +33%", "[제작]\n 문스톤 + 금교전", "전설")
            down("문스톤", "금교전", "", "", "")
        }
        if (falselist[i].name1 == "바늘") {
            te("바늘", "공격력 +3, 치명타 피해량 +25%", "사용 시 기본 지급\n" +
                    "골목길(6개), 호텔(6개), 병원(6개)의 상자", "일반")
            up("레이피어", "분대장 완장", "한방침", "다트", "독침")
        }
        if (falselist[i].name1 == "레이피어") {
            te("레이피어", "공격력 +16, 치명타 피해량 +25%", "[제작] \n바늘 + 철광성", "고급")
            up("매화검", "활빈검", "주와이외즈", "", "")
            down("바늘", "철광석", "", "", "")
        }
        if (falselist[i].name1 == "매화검") {
            te("매화검", "공격력 +121, 치명타 확률 +10%, 치명타 피해량 +25%, 쿨다운 감소 +10%", "[제작] \n레이피어 + 운명의 꽃", "희귀")
            up("듀랜달 Mk2", "볼틱레토", "유성검", "", "")
            down("레이피어", "운명의 꽃", "", "", "")
        }
        if (falselist[i].name1 == "활빈검") {
            te("활빈검", "공격력 +30, 체력 재생+1.5, 스태미너 재생 +200%, 쿨다운 감소 +12% 치명타 피해량 +25%", "[제작] \n레이피어 + 어사의", "영웅")
            up("미스틸테인", "", "", "", "")
            down("레이피어", "어사의", "", "", "")
        }
        if (falselist[i].name1 == "듀랜달 Mk2") {
            te("듀랜달 Mk2", "공격력 +55, 시야 +3, 치명타 확률 +10%, 치명타 피해량 +30%, 쿨다운 감소 +10%", "[제작]\n 매화검 + 레이저 포인터", "영웅")
            down("매화검", "레이저 포인터", "", "", "")
        }
        if (falselist[i].name1 == "볼틱레토") {
            te("볼틱레토", "공격력 +47, 공격속도 +35%, 치명타 확률 +10%, 치명타 피해량 +25%, 쿨다운 감소 +10%", "[제작]\n 매화검 + 전자 부품", "영웅")
            down("매화검", "전자 부품", "", "", "")
        }
        if (falselist[i].name1 == "유성검") {
            te("유성검", "공격력 +75, 치명타 피해량 +30%, 쿨다운 감소 +10%", "[제작]\n 매화검 + 운석", "영웅")
            down("매화검", "운석", "", "", "")
        }
        if (falselist[i].name1 == "주와이외즈") {
            te("주와이외즈", "공격력 +75, 치명타 피해량 +30%, 이동속도 +0.2", "[제작]\n 레이피어 + 미스릴", "영웅")
            down("레이피어", "미스릴", "", "", "")
        }
        if (falselist[i].name1 == "미스틸테인") {
            te("미스틸테인", "공격력 +30, 치명타 피해량 +25%, 쿨다운 감소 +12%, 스태미너 재생 +200%, 체력 재생 +1.5, 스킬 증폭 +17%", "[제작]\n 활빈검 + 나뭇가지", "전설")
            down("활빈검", "나뭇가지", "", "", "")
        }
        if (falselist[i].name1 == "볼틱레토") {
            te("볼틱레토", "공격력 +47, 공격속도 +35%, 치명타 확률 +10%, 치명타 피해량 +25%, 쿨다운 감소 +10%", "[제작]\n 매화검 + 전자 부품", "영웅")
            down("매화검", "전자 부품", "", "", "")
        }
        if (falselist[i].name1 == "단창") {
            te("단창", "공격력 +15", "사용 시 기본 지급\n" + "연못(5개), 절(4개), 숲(4개)의 상자", "일반")
            up("죽창", "파이크", "발리스타", "하푼건", "")
        }
        if (falselist[i].name1 == "죽창") {
            te("죽창", "공격력 +37", "[제작]\n 단창 + 대나무", "고급")
            up("바이던트", "강창", "회첨창", "", "")
            down("단창", "대나무", "", "", "")
        }
        if (falselist[i].name1 == "바이던트") {
            te("바이던트", "공격력 +52", "[제작]\n 죽창 + 식칼", "희귀")
            up("코스믹 바이던트", "트리아이나", "", "", "")
            down("죽창", "식칼", "", "", "")
        }
        if (falselist[i].name1 == "파이크") {
            te("파이크", "공격력 +64, 이동속도 -0.1", "[제작]\n 단창 + 강철", "희귀")
            up("도끼창", "트리아이나", "롱기누스의 창", "", "")
            down("단창", "강철", "", "", "")
        }
        if (falselist[i].name1 == "도끼창") {
            te("도끼창", "공격력 +85, 이동속도 -0.1", "[제작]\n 손도끼 + 파이크", "희귀")
            up("방천화극", "청룡언월도", "", "", "")
            down("손도끼", "파이크", "", "", "")
        }
        if (falselist[i].name1 == "강창") {
            te("강창", "공격력 +40, 이동속도 +0.1", "[제작]\n 죽창 + 깃털", "희귀")
            up("방천화극", "장팔사모", "", "", "")
            down("죽창", "깃털", "", "", "")
        }
        if (falselist[i].name1 == "애각창") {
            te("애각창", "공격력 +105, 이동속도 +0.2", "[제작]\n 강창 + 백색 가루", "영웅")
            down("강창", "백색 가루", "", "", "")
        }
        if (falselist[i].name1 == "장팔사모") {
            te("장팔마소", "공격력 +100, 공격속도 +40%", "[제작]\n 강창 + 이온 전지", "영웅")
            down("강창", "이온 전지", "", "", "")
        }
        if (falselist[i].name1 == "코스믹 바이던트") {
            te("코스믹 바이던트", "공격력 +150", "[제작]\n 강창 + 문스톤", "영웅")
            down("강창", "문스톤", "", "", "")
        }
        if (falselist[i].name1 == "트리아이나") {
            te("트리아이나", "공격력 +90, 스킬 증폭 +17%", "[제작]\n 바이던트 + 파이크", "영웅")
            down("바이던트", "파이크", "", "", "")
        }
        if (falselist[i].name1 == "방천화극") {
            te("방천화극", "공격력 +88, 이동속도 -0.1, 스킬 적중 시 치유 감소 -40%, 스킬 증폭 +31%", "[제작]\n 도끼창 + 군선", "영웅")
            down("도끼창", "군선", "", "", "")
        }
        if (falselist[i].name1 == "청룡언월도") {
            te("청룡언월도", "공격력 +115, 체력 +300, 이동속도 -0.05", "[제작]\n 도끼창 + 철판", "영웅")
            down("도끼창", "철판", "", "", "")
        }
        if (falselist[i].name1 == "화첨창") {
            te("화첨창", "공격력 +110, 체력 재생 +1.5, 스태미너 재생 +1.5, 기본 공격 추가 피해 +30", "[제작]\n 삼매진화 + 죽창", "전설")
            down("삼매진화", "죽창", "", "", "")
        }

        if (falselist[i].name1 == "롱기누스의 창") {
            te("롱기누스의 창", "공격력 +140, 생명력 흡수 +20%", "[제작]\n VF 혈액 샘플 + 파이크", "전설")
            down("VF 혈액 샘플", "파이크", "", "", "")
        }
        if (falselist[i].name1 == "망치") {
            te("망치", "공격력 +16", "사용 시 기본 지급, 연못(7개), 모래사장(6개), 골목길(10개)의 상자, 맷돼지(사냥)", "일반")
            up("워해머", "루비", "철판", "", "")
        }
        if (falselist[i].name1 == "워해머") {
            te("워해머", "공격력 +40", "[제작]\n망치 + 단봉", "고급")
            up("모닝 스타", "사슴 망치", "마법봉", "", "")
            down("망치", "단봉", "", "", "")
        }
        if (falselist[i].name1 == "모닝 스타") {
            te("모닝 스타", "공격력 +55", "[제작]\n워해머 + 쇠구슬", "희귀")
            up("낭아봉", "개밥바라기", "", "", "")
            down("워해머", "쇠구슬", "", "", "")
        }
        if (falselist[i].name1 == "사슴 망치") {
            te("사슴 망치", "공격력 +56", "[제작]\n워해머 + 가죽", "희귀")
            up("다그다의 망치", "토르의 망치", "", "", "")
            down("워해머", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "낭아봉") {
            te("낭아봉", "공격력 +55, 스킬 증폭 +31", "[제작]\n모닝 스타 + 달궈진 돌멩이", "영웅")
            down("모닝 스타", "달궈진 돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "다그다의 망치") {
            te("다그다의 망치", "공격력 +95, 체력 재생 +150%, 기본공격 추가 피해 +20", "[제작]\n사슴 망치 + 성자의 유산", "영웅")
            down("사슴 망치", "성자의 유산", "", "", "")
        }
        if (falselist[i].name1 == "토르의 망치") {
            te("토르의 망치", "공격력 +120, 공격속도 +40%", "[제작]\n사슴 망치 + 이온 전지", "영웅")
            down("사슴 망치", "이온 전지", "", "", "")
        }
        if (falselist[i].name1 == "개밥바라기") {
            te("개밥바라기", "공격력 +145", "[제작]\n 문스톤 + 모닝 스타", "영웅")
            down("문스톤", "모닝 스타", "", "", "")
        }
        if (falselist[i].name1 == "마법봉") {
            te("마법봉", "공격력 +60, 생명력 흡수 +30%, 스킬 증폭 +27%", "[제작]\n 워해머 + 달빛 펜던트", "영웅")
            down("워해머", "달빛 펜던트", "", "", "")
        }
        if (falselist[i].name1 == "쇠구슬") {
            te("쇠구슬", "장탄 수: 50, 공격력 +12", "양궁장(5개), 숲(7개), 공장(7개)의 상자\n" +
                    "맷돼지(사냥)", "일반")
            up("수류탄", "볼 라이트닝", "힐리스", "소란 발생기", "모닝 스타")
        }
        if (falselist[i].name1 == "야구공") {
            te("야구공", "장탄 수: 50, 공격력 +12", "사용 시 기본 지급", "일반")
            up("싸인볼", "", "", "", "")
        }
        if (falselist[i].name1 == "수류탄") {
            te("수류탄", "최대 충전 수 : 6발, 공격력 +25, 기본 공격 추가 피해 +20", "[제작]\n쇠구슬 + 화약", "고급")
            up("고폭 수류탄", "", "", "", "")
            down("쇠구슬", "화약", "", "", "")
        }
        if (falselist[i].name1 == "화염병") {
            te("화염병", "최대 충전 수 : 20발, 공격력 +22, 공격속도 +15%", "[제작]\n유리병 + 오일", "고급")
            up("밀가루 폭탄", "소이탄", "", "", "")
            down("유리병", "오일", "", "", "")
        }
        if (falselist[i].name1 == "싸인볼") {
            te("싸인볼", "최대 충전 수 : 50발, 공격력 +30", "[제작]\n야구공 + 만년필", "고급")
            up("슬링", "", "", "", "")
            down("야구공", "만년필", "", "", "")
        }
        if (falselist[i].name1 == "슬링") {
            te("슬링", "최대 충전 수 : 50발, 공격력 +42", "[제작]\n싸인볼 + 고무", "희귀")
            up("다비드슬링", "", "", "", "")
            down("싸인볼", "고무", "", "", "")
        }
        if (falselist[i].name1 == "밀가루 폭탄") {
            te("밀가루 폭탄", "최대 충전 수 : 20발, 공격력 +58, 공격속도 +15%", "[제작]\n백색 가루 + 화염병", "희귀")
            up("연막탄", "", "", "", "")
            down("백색 가루", "화염병", "", "", "")
        }
        if (falselist[i].name1 == "볼 라이트닝") {
            te("볼 라이트닝", "최대 충전 수 : 50발, 공격력 +24, 공격속도 20%", "[제작]\n쇠구슬 + 방전 전지", "희귀")
            up("소이탄", "", "", "", "")
            down("쇠구슬", "방전 전지", "", "", "")
        }
        if (falselist[i].name1 == "플러버") {
            te("플러버", "최대 충전 수 : 50발, 공격력 +42", "[제작]\n고무 + 뜨거운 물", "희귀")
            up("가시 탱탱볼", "", "", "", "")
            down("고무", "뜨거운 물", "", "", "")
        }
        if (falselist[i].name1 == "가시 탱탱볼") {
            te("가시 탱탱볼", "공격력 +42, 스킬 적중 시 치유 감소 -40%", "[제작]\n플러버 + 못", "희귀")
            up("루테늄 구슬", "", "", "", "")
            down("플러버", "못", "", "", "")
        }
        if (falselist[i].name1 == "소이탄") {
            te("소이탄", "최대 충전 수 : 50발, 공격력 +70, 쿨다운 감소 +8%, 공격속도 +50%", "[제작]\n화염병 + 볼 라이트닝", "영웅")
            down("화염병", "볼 라이트닝", "", "", "")
        }
        if (falselist[i].name1 == "안티오크의 수류탄") {
            te("안티오크의 수류탄", "최대 충전 수 : 8발, 공격력 +85, 기본 공격 추가 피해 +85", "[제작]\n고폭 수류탄 + 십자가", "영웅")
            down("고폭 수류탄", "십자가", "", "", "")
        }
        if (falselist[i].name1 == "다비드슬링") {
            te("다비드슬링", "최대 충전 수 : 50발, 공격력 +71, 체력재생 +150%, 기본 공격 추가 피해 +27", "[제작]\n슬링 + 성자의 유산", "영웅")
            down("슬링", "성자의 유산", "", "", "")
        }
        if (falselist[i].name1 == "연막탄") {
            te("연막탄", "최대 충전 수 : 20발, 공격력 +90, 공격속도 +40%", "[제작]\n밀가루 폭탄 + 콜라", "영웅")
            down("밀가루 폭탄", "콜라", "", "", "")
        }
        if (falselist[i].name1 == "고폭 수류탄") {
            te("고폭 수류탄", "최대 충전 수 : 8발, 공격력 +56, 기본 공격 추가 피해 +60", "[제작]\n수류탄 + RDX", "영웅")
            down("수류탄", "RDX", "", "", "")
        }
        if (falselist[i].name1 == "루테늄 구슬") {
            te("루테늄 구슬", "최대 충전 수 : 50발, 공격력 +80, 스킬 증폭 +26%, 스킬 적중 시 치유 감소 -40%", "[제작]\n가시 탱탱볼 + 황금", "영웅")
            down("가시 탱탱볼", "황금", "", "", "")
        }

        if (falselist[i].name1 == "너클") {
            te("너클", "공격력 +10", "묘지(5개), 숲(5개)의 상자", "일반")
            up("아이언 너클", "", "", "", "")
        }
        if (falselist[i].name1 == "목장갑") {
            te("목장갑", "공격력 +7", "호텔(4개), 병원(4개)의 상자", "일반")
            up("글러브", "건틀릿", "", "", "")
        }
        if (falselist[i].name1 == "글러브") {
            te("글러브", "공격력 +18", "[제작]\n목장갑 + 가죽", "고급")
            up("회단 장갑", "천잠장갑", "", "", "")
            down("목장갑", "가죽", "", "", "")
        }

        if (falselist[i].name1 == "아이언 너클") {
            te("아이언 너클", "공격력 +20", "[제작]\n 너클 + 철광석", "고급")
            up("윙 너클", "유리 너클", "", "", "")
            down("너클", "철광석", "", "", "")
        }

        if (falselist[i].name1 == "건틀릿") {
            te("건틀릿", "공격력 +32, 이동속도 -0.1", "[제작]\n목장갑 + 강철", "희귀")
            up("귀골 장갑", "벽력귀투", "", "", "")
            down("목장갑", "강철", "", "", "")
        }

        if (falselist[i].name1 == "윙 너클") {
            te("윙 너클", "공격력 +20, 이동속도 +0.1", "[제작]\n아이언 너클 + 깃털", "희귀")
            up("블러드윙 너클", "", "", "", "")
            down("아이언 너클", "깃털", "", "", "")
        }

        if (falselist[i].name1 == "귀골 장갑") {
            te("귀골 장갑", "공격력 +35, 방어력 +13, 이동속도 -0.05", "[제작]\n건틀릿 + 거북이 등딱지", "희귀")
            up("단영촌천투", "브레이질 건틀릿", "", "", "")
            down("건틀릿", "거북이 등딱지", "", "", "")
        }

        if (falselist[i].name1 == "벽력귀투") {
            te("벽력귀투", "공격력 +32, 이동속도 -0.1, 기본 공격 추가 피해 +15", "[제작]\n건틀릿 + 화약", "희귀")
            up("디바인 피스트", "", "", "", "")
            down("건틀릿", "화약", "", "", "")
        }

        if (falselist[i].name1 == "유리 너클") {
            te("유리 너클", "공격력 +28. 치명타 확률 +10%", "[제작]\n아이언 너클 + 유리 조각", "희귀")
            up("소수", "", "", "", "")
            down("아이언 너클", "유리 조각", "", "", "")
        }

        if (falselist[i].name1 == "회단 장갑") {
            te("회단 장갑", "공격력 +27, 스킬증폭 +30", "[제작]\n글러브 + 재", "희귀")
            up("빙화현옥수", "여래수투", "", "", "")
            down("글러브", "재", "", "", "")
        }

        if (falselist[i].name1 == "단영촌천투") {
            te("단영촌천투", "공격력 +50, 방어력 +25, 스태미너 재생 +50%, 생명력 흡수 +10%", "[제작]\n귀골 장갑 + 인형", "영웅")
            up("", "", "", "", "")
            down("귀골 장갑", "인형", "", "", "")
        }

        if (falselist[i].name1 == "디바인 피스트") {
            te("디바인 피스트", "공격력 +53, 이동속도 -0.05, 기본 공격 추가 피해 +33", "[제작]\n벽력귀투 + 십자가", "영웅")
            up("", "", "", "", "")
            down("벽력귀투", "십자가", "", "", "")
        }

        if (falselist[i].name1 == "블러드윙 너클") {
            te("블러드윙 너클", "공격력 +53, 최대 체력 +250, 이동속도 +0.1", "[제작]\n윙 너클 + 루비", "영웅")
            up("", "", "", "", "")
            down("윙 너클", "루비", "", "", "")
        }

        if (falselist[i].name1 == "빙화현옥수") {
            te("빙화현옥수", "공격력 +30, 쿨다운 감소 +15%, 스킬 증폭 +38", "[제작]\n회단 장갑 + 얼음", "영웅")
            up("", "", "", "", "")
            down("회단 장갑", "얼음", "", "", "")
        }
        if (falselist[i].name1 == "여래수투") {
            te("여래수투", "공격력 +37 쿨다운 감소 +10% 스킬 증폭 +18%", "[제작]\n회단 장갑 + 진신사리", "영웅")
            up("", "", "", "", "")
            down("회단 장갑", "진신사리", "", "", "")
        }

        if (falselist[i].name1 == "브레이질 건틀릿") {
            te("브레이질 건틀릿", "공격력 +53, 방어력 +13, 체력 재생 +1, 공격 속도 +30%, 이동속도 -.0.05", "[제작]\n귀골 장갑 + 기름먹인 천 ", "영웅")
            up("", "", "", "", "")
            down("귀골 장갑", "기름먹인 천", "", "", "")
        }

        if (falselist[i].name1 == "소수") {
            te("소수", "공격력 +55, 치명타 확률 +20%", "[제작]\n유리 너클 + 백색 가루", "영웅")
            up("", "", "", "", "")
            down("유리 너클", "백색 가루", "", "", "")
        }

        if (falselist[i].name1 == "천잠장갑") {
            te("천잠장갑", "공격력 +85, 이동속도 +0.2", "[제작]\n미스릴 실 + 글러브", "영웅")
            up("", "", "", "", "")
            down("미스릴 실", "글러브", "", "", "")
        }

        if (falselist[i].name1 == "대나무") {
            te("대나무", "공격력 +12", "사용 시 기본 지급\n" + "연못(7개), 절(7개), 양궁장(5개),묘지(7),숲(7)의 상자, 박쥐(사냥)", "일반")
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "톤파") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "화살통") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "대나무 트랩") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "전투 도끼") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "죽창") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "장봉") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "건곤권") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "편전") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "크로스보우") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "슈퍼스트랫") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "톤파") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "화살통") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "대나무 트랩") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "전투 도끼") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "죽창") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "톤파") {
            te("톤파", "공격력 +23, 방어력 +8", "[제작]\n대나무 + 나뭇가지", "고급")
            up("경찰봉", "류큐톤파", "", "", "")
            down("대나무", "나뭇가지", "", "", "")
        }

        if (falselist[i].name1 == "경찰봉") {
            te("경찰봉", "공격력 +35, 방어력 +8", "[제작]\n톤파 + 마패", "희귀")
            up("택티컬 톤파", "", "", "", "")
            down("톤파", "마패", "", "", "")
        }

        if (falselist[i].name1 == "류큐톤파") {
            te("류큐톤파", "공격력 +38, 방어력 +18", "[제작]\n톤파 + 백색 가루", "희귀")
            up("마이쏙", "플라즈마 톤파", "", "", "")
            down("톤파", "백색 가루", "", "", "")
        }
        if (falselist[i].name1 == "택티컬 톤파") {
            te("택티컬 톤파", "공격력 +74, 방어력 +10, 생명력 흡수 +25%", "[제작]\n 경찰봉 + 정교한 도면", "영웅")
            down("경찰봉 + 정교한 도면", "", "", "", "")
        }
        if (falselist[i].name1 == "마이쏙") {
            te("마이쏙", "공격력 +63, 방어력 +20, 체력 재생 +100%", "[제작]\n 류큐톤파 + 단봉", "영웅")
            down("류큐톤파", "단봉", "", "", "")
        }
        if (falselist[i].name1 == "플라즈마 톤파") {
            te("플라즈마 톤파", "공격력 +65, 방어력 +18, 시야 +2.5", "[제작]\n류큐톤파 + 레이저 포인터", "영웅")
            down("류큐톤파", "레이저 포인터", "", "", "")
        }
        if (falselist[i].name1 == "나뭇가지") {
            name.text = "나뭇가지"
            abil.text = "공격력 +5"
            exeplan.text = "나뭇더미에서 채집"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "머리테") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "군복") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "버터") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "군용 나이프") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "톤파") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "유엽비도") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "목궁") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "미스틸테인") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "머리테") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "군복") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "버터") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "군용 나이프") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "톤파") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "단봉") {
            te("단봉", "공격력 +15", "사용 시 기본 지급\n" +
                    "항구(5개), 연못(5), 절(3개)의 상자, 들개(사냥)", "일반")
            up("워해머", "장봉", "먼지털이개", "사신의 낫", "마이쏙")
            down("", "", "", "", "")
        }

        if (falselist[i].name1 == "장봉") {
            te("장봉", "공격력 +25", "[제작]\n단봉 + 대나무", "고급")
            up("도깨비 방망이", "우산", "여의봉", "", "")
            down("단봉", "대나무", "", "", "")
        }

        if (falselist[i].name1 == "도깨비 방망이") {
            te("도깨비 방망이", "공격력 +30, 기본 공격 시 치유 감소 -40%", "[제작]\n장봉 + 못", "희귀")
            up("타구봉", "", "", "", "")
            down("장봉", "못", "", "", "")
        }

        if (falselist[i].name1 == "우산") {
            te("우산", "공격력 +30, 스킬 증폭 +14", "[제작]\n장봉 + 부채", "희귀")
            up("스파이의 우산", "", "", "", "")
            down("장봉", "부채", "", "", "")
        }

        if (falselist[i].name1 == "횃불") {
            te("횃불", "공격력 +40, 체력 재생 +0.5, 공격 속도 +10%, 이동 속도 +0.1", "[제작]\n먼지털이개 + 기름먹인 천", "희귀")
            up("구원의 여신상", "", "", "", "")
            down("먼지털이개", "기름먹인 천", "", "", "")
        }

        if (falselist[i].name1 == "구원의 여신상") {
            te("구원의 여신상", "공격력 +90, 체력 재생 +0.6, 스태미너 재생 +60%, 공격 속도 +15%, 이동 속도 +0.1, 생명력 흡수 +10%", "[제작]\n횃불 + 인형", "영웅")
            up("", "", "", "", "")
            down("횃불", "인형", "", "", "")
        }
        if (falselist[i].name1 == "타구봉") {
            te("타구봉", "공격력 +85, 공격속도 +50%, 기본 공격 시 치유 감소 -40%", "[제작]\n도깨비 방망이 + 모터", "영웅")
            up("", "", "", "", "")
            down("도깨비 방망이", "모터", "", "", "")
        }
        if (falselist[i].name1 == "스파이의 우산") {
            te("스파이의 우산", "공격력 +65, 스킬 증폭 +28", "[제작]\n우산 + ", "영웅")
            up("", "", "", "", "")
            down("우산", "재", "", "", "")
        }
        if (falselist[i].name1 == "여의봉") {
            te("여의봉", "공격력 +150", "[제작]\n포스 코어 + 장봉", "전설")
            up("", "", "", "", "")
            down("포스 코어", "장봉", "", "", "")
        }
        if (falselist[i].name1 == "양궁") {
            te("양궁", "공격력 +11", "사용 시 기본 지급,양궁장(4개), 성당(4개)의 상자", "일반")
            up("장궁", "", "", "", "")
            down("", "", "", "", "")
        }

        if (falselist[i].name1 == "목궁") {
            te("목궁", "공격력 +26", "[제작]\n나뭇가지 + 피아노선", "고급")
            up("강궁", "탄궁", "", "", "")
            down("나뭇가지", "피아노선", "", "", "")
        }
        if (falselist[i].name1 == "장궁") {
            te("장궁", "공격력 +25", "[제작]\n양궁 + 고무", "고급")
            up("컴포지트 보우", "벽령궁", "화전", "", "")
            down("양궁", "고무", "", "", "")
        }

        if (falselist[i].name1 == "컴포지트 보우") {
            te("컴포지트 보우", "공격력 +25, 기본 공격 시 치유 감소 -40%", "[제작]\n장궁 + 못", "희귀")
            up("트윈보우", "", "", "", "")
            down("장궁", "못", "", "", "")
        }

        if (falselist[i].name1 == "강궁") {
            te("강궁", "공격력 +26\n" +
                    "공격 속도(%) +15%", "[제작]\n목궁 + 오일", "희귀")
            up("트윈보우", "페일노트", "", "", "")
            down("목궁", "오일", "", "", "")
        }

        if (falselist[i].name1 == "국궁") {
            te("국궁", "공격력 +20, 기본 공격 추가 피해 +25", "[제작]\n벽력궁 + 마패", "희귀")
            up("편전", "", "", "", "")
            down("벽력궁", "마패", "", "", "")
        }

        if (falselist[i].name1 == "벽력궁") {
            te("벽력궁", "공격력 +25, 기본 공격 추가 피해 +11", "[제작]\n장궁 + 화약", "희귀")
            up("국궁", "", "", "", "")
            down("장궁", "화약", "", "", "")
        }
        if (falselist[i].name1 == "탄궁") {
            te("탄궁", "공격력 +55", "[제작]\n목궁 + 달궈진 돌멩이", "희귀")
            up("골든래쇼 보우", "", "", "", "")
            down("목궁", "달궈진 돌멩이", "", "", "")
        }

        if (falselist[i].name1 == "화전") {
            te("화전", "공격력 +25, 스킬증폭 +18", "[제작]\n장궁 + 라이터", "희귀")
            up("엘리멘탈 보우", "", "", "", "")
            down("장궁", "라이터", "", "", "")
        }

        if (falselist[i].name1 == "편전") {
            te("편전", "공격력 +55, 기본 공격 추가 피해 +40", "[제작]\n국궁 + 대나무", "영웅")
            up("", "", "", "", "")
            down("국궁", "대나무", "", "", "")
        }

        if (falselist[i].name1 == "골든래쇼 보우") {
            te("골든래쇼 보우", "공격력 +68, 스킬 증폭 +20%, 쿨다운 감소 +10%", "[제작]\n탄궁 + 황금", "영웅")
            up("", "", "", "", "")
            down("탄궁", "황금", "", "", "")
        }

        if (falselist[i].name1 == "트윈보우") {
            te("트윈보우", "공격력 +70, 공격속도 +55%, 기본 공격 시 치유 감소 -40%", "[제작]\n강궁 + 컴포지트 보우", "영웅")
            up("", "", "", "", "")
            down("강궁", "컴포지트 보우", "", "", "")
        }
        if (falselist[i].name1 == "엘리멘탈 보우") {
            te("엘리멘탈 보우", "공격력 +60, 이동속도 +0.1, 스킬 증폭 +38, 스킬 적중 시 치유 감소 -40%", "[제작]\n화전 + 백우선", "영웅")
            up("", "", "", "", "")
            down("화전", "백우선", "", "", "")
        }

        if (falselist[i].name1 == "페일노트") {
            te("페일노트", "공격력 +100, 공격속도 +15%, 생명력 흡수 +15%", "[제작]\nVF 혈액 샘플 + 강궁", "전설")
            up("", "", "", "", "")
            down("VF 혈액 샘플", "강궁", "", "", "")
        }

        if (falselist[i].name1 == "석궁") {
            te("석궁", "공격력 +12", "사용 시 기본 지급\n" +
                    "숲(4개), 공장(4개)의 상자", "일반")
            up("쇠뇌", "크로스보우", "", "", "")
            down("", "", "", "", "")
        }

        if (falselist[i].name1 == "쇠뇌") {
            te("쇠뇌", "공격력 +30", "[제작]\n석궁 + 피아노선", "고급")
            up("노", "헤비 크로스보우", "", "", "")
            down("석궁", "피아노선", "", "", "")
        }
        if (falselist[i].name1 == "크로스보우") {
            te("크로스보우", "공격력 +30", "[제작]\n석궁 + 대나무", "고급")
            up("저격궁", "철궁", "샤릉가", "", "")
            down("석궁", "대나무", "", "", "")
        }

        if (falselist[i].name1 == "노") {
            te("노", "공격력 +42", "[제작]\n쇠뇌 + 고무", "희귀")
            up("영광금귀신기노", "", "", "", "")
            down("쇠뇌", "고무", "", "", "")
        }

        if (falselist[i].name1 == "저격궁") {
            te("저격궁", "공격력 +30, 시야 +2.5", "[제작]\n크로스보우 + 레이저 포인터", "희귀")
            up("저격 크로스보우", "", "", "", "")
            down("크로스보우", "레이저 포인터", "", "", "")
        }
        if (falselist[i].name1 == "헤비 크로스보우") {
            te("헤비 크로스보우", "공격력 +69, 이동 속도 -0.1", "[제작]\n쇠뇌 + 강철", "희귀")
            up("발리스타", "", "", "", "")
            down("쇠뇌", "강철", "", "", "")
        }
        if (falselist[i].name1 == "철궁") {
            te("철궁", "공격력 +60", "[제작]\n크로스보우 + 철판", "희귀")
            up("대황", "", "", "", "")
            down("크로스보우", "철판", "", "", "")
        }
        if (falselist[i].name1 == "대황") {
            te("대황", "공격력 +75, 체력 재생 +2, 공격 속도 +50%", "[제작]\n철궁 + 기름먹힌 천", "영웅")
            up("", "", "", "", "")
            down("철궁", "기름먹인 천", "", "", "")
        }
        if (falselist[i].name1 == "발리스타") {
            te("발리스타", "공격력 +115\n" +
                    "공격 속도(%) -5%", "[제작]\n헤비 크로스보우 + 단창", "영웅")
            up("", "", "", "", "")
            down("헤비 크로스보우", "단창", "", "", "")
        }
        if (falselist[i].name1 == "저격 크로스보우") {
            te("저격 크로스보우", "공격력 +85, 시야 +3.5\n" +
                    "기본 공격 사거리 +1", "[제작]\n저격궁 + 저격 스코프", "영웅")
            up("", "", "", "", "")
            down("저격궁", "저격 스코프", "", "", "")
        }
        if (falselist[i].name1 == "영광금귀신기노") {
            te("영광금귀신기노", "공격력 +70\n" +
                    "기본 공격 추가 피해 +37", "[제작]\n노 + RDX", "영웅")
            up("", "", "", "", "")
            down("노", "RDX", "", "", "")
        }
        if (falselist[i].name1 == "샤릉가") {
            te("샤릉가", "공격력 +140", "[제작]\n포스 코어 + 크로스보우", "전설")
            up("", "", "", "", "")
            down("포스 코어", "크로스보우", "", "", "")
        }
        if (falselist[i].name1 == "면도칼") {
            te("면도칼", "장탄 수: 50, 공격력 +11", "사용 시 기본 지급 , 병원(개), 성당(개), 학교(개)의 상자 ,박쥐(사냥)", "일반")
            up("표창", "흑건", "치파오", "블리더", "철편")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "분필") {
            te("분필", "장탄 수: 50, 공격력 +12", "공장(개), 성당(개), 학교(개)의 상자\n" +
                    "박쥐(사냥)", "일반")
            up("백색 가루", "", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "트럼프 카드") {
            te("트럼프 카드", "장탄 수: 51, 공격력 +4\n" +
                    "치명타 확률 +5%", "번화가(개), 호텔(개)의 상자\n" +
                    "멧돼지(사냥)", "일반")
            up("빈티지 카드", "운명의 꽃", "보헤미안", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "다트") {
            te("다트", "장탄 수: 20, 공격력 +16, 치명타 피해량 +20%, 이동 속도 +0.1%", "[제작]\n바늘 + 깃털", "고급")
            up("플럼바타", "", "", "", "")
            down("바늘", "깃털", "", "", "")
        }
        if (falselist[i].name1 == "빈티지 카드") {
            te("빈티지 카드", "장탄 수: 50, 공격력 +15, 치명타 확률 +10%", "[제작]\n트럼프 카드 + 만년필", "고급")
            up("부적", "미치광이왕의 카드", "", "", "")
            down("트럼프 카드", "만년필", "", "", "")
        }
        if (falselist[i].name1 == "표창") {
            te("표창", "장탄 수: 50, 공격력 +27", "[제작]\n면도칼 + 피아노선", "고급")
            up("챠크람", "수다르사나", "", "", "")
            down("면도칼", "피아노선", "", "", "")
        }
        if (falselist[i].name1 == "흑건") {
            te("흑건", "장탄 수 : 50, 공격력 +17, 기본 공격 추가 피해 +10", "[제작]\n면도칼 + 십자가", "고급")
            up("유엽비도", "푸른색 단도", "", "", "")
            down("면도칼", "십자가", "", "", "")
        }
        if (falselist[i].name1 == "수다르사나") {
            te("수다르사나", "공격력 +125", "[제작]\n포스 코어 + 표창", "전설")
            up("", "", "", "", "")
            down("포스 코어", "표창", "", "", "")
        }
        if (falselist[i].name1 == "만천화우") {
            te("만천화우", "장탄 수: 3, 공격력 +80, 치명타 피해량+50%, 스킬 증폭 +25, 기본 공격 추가 피해 +130", "[제작]\n빙백은침 + 폭뢰침", "전설")
            up("", "", "", "", "")
            down("빙백은침", "폭뢰침", "", "", "")
        }

        if (falselist[i].name1 == "부적") {
            te("부적", "장탄 수: 10, 공격력 +40, 스킬 증폭 +10%", "[제작]\n빈티지 카드 + 불경", "고급")
            up("옥전결", "생사부", "", "", "")
            down("빈티지 카드", "불경", "", "", "")
        }
        if (falselist[i].name1 == "유엽비도") {
            te("유엽비도", "장탄 수: 50, 공격력 +17, 기본 공격 추가 피해 +20", "[제작]\n흑건 + 나뭇가지", "고급")
            up("매화비표", "", "", "", "")
            down("흑건", "나뭇가지", "", "", "")
        }
        if (falselist[i].name1 == "챠크람") {
            te("챠크람", "장탄 수: 50, 공격력 +38", "[제작]\n표창 + 마패", "희귀")
            up("법륜", "", "", "", "")
            down("표창", "마패", "", "", "")
        }
        if (falselist[i].name1 == "매화비표") {
            te("매화비표", "장탄 수: 50, 공격력 +17, 쿨다운 감소 +10%, 기본 공격 추가 피해 +30", "[제작]\n유엽비도 + 꽃", "희귀")
            up("풍마수리검", "", "", "", "")
            down("유엽비도", "꽃", "", "", "")
        }
        if (falselist[i].name1 == "독침") {
            te("독침", "장탄 수: 3, 공격력 +55, 치명타 피해량 +20%, 스킬 증폭 +15", "[제작]\n바늘 + 독약", "희귀")
            up("빙백은침", "", "", "", "")
            down("바늘", "독약", "", "", "")
        }
        if (falselist[i].name1 == "법륜") {
            te("법륜", "장탄 수: 50, 공격력 +38, 스킬 증폭 +15%", "[제작]\n챠크람 + 불경", "희귀")
            up("건곤권", "", "", "", "")
            down("챠크람", "불경", "", "", "")
        }
        if (falselist[i].name1 == "플럼바타") {
            te("플럼바타", "장탄 수: 20, 공격력 +48, 이동속도 +0.1, 치명타 피해량 +25%", "[제작]\n다트 + 강철", "희귀")
            up("플레셋", "", "", "", "")
            down("다트", "강철", "", "", "")
        }
        if (falselist[i].name1 == "미치광이왕의 카드") {
            te("미치광이왕의 카드", "장탄 수: 52, 공격력 +49, 공격속도 +40%, 치명타 확률 +25%", "[제작]\n빈티지 카드 + 이온 전지", "영웅")
            up("", "", "", "", "")
            down("빈티지 카드", "이온 전지", "", "", "")
        }
        if (falselist[i].name1 == "옥전결") {
            te("옥전결", "장탄 수: 10, 공격력 +60, 스킬 증폭 +12%", "[제작]\n부적 + 재", "영웅")
            up("", "", "", "", "")
            down("부적", "재", "", "", "")
        }
        if (falselist[i].name1 == "풍마 수리검") {
            te("풍마 수리검", "장탄 수: 50, 공격력 +52, 쿨다운 감소 +15%, 기본 공격 추가 피해 +36", "[제작]\n매화비표 + 알코올", "영웅")
            up("", "", "", "", "")
            down("매화비표", "알코올", "", "", "")
        }
        if (falselist[i].name1 == "빙백은침") {
            te("빙백은침", "장탄 수: 3, 공격력 +80, 스킬 증폭 +20, 치명타 피해량 +50%", "[제작]\n독침 + 얼음", "영웅")
            up("만천화우", "", "", "", "")
            down("독침", "얼음", "", "", "")
        }
        if (falselist[i].name1 == "푸른색 단도") {
            te("푸른색 단도", "장탄 수: 50, 공격력 +20, 기본 공격 추가 피해 +29, 스킬 증폭 +24", "[제작]\n흑건 + 독약", "영웅")
            up("", "", "", "", "")
            down("흑건", "독약", "", "", "")
        }
        if (falselist[i].name1 == "플레셋") {
            te("플레셋", "장탄 수: 20, 공격력 +85, 이동속도 +0.25, 치명타 피해량 +40%", "[제작]\n플럼바타 + 백색 가루", "")
            up("", "", "", "", "")
            down("플럼바타", "백색 가루", "", "", "")
        }
        if (falselist[i].name1 == "건곤권") {
            te("건곤권", "장탄 수: 50, 공격력 +55, 스킬 증폭 +17%", "[제작]\n법륜 + 대나무", "영웅")
            up("", "", "", "", "")
            down("법륜", "대나무", "", "", "")
        }
        if (falselist[i].name1 == "생사부") {
            te("생사부", "장탄 수: 10, 공격력 +80, 스킬 증폭 +20%", "[제작]\n부적 + 생명의 나무", "영웅")
            up("", "", "", "", "")
            down("부적", "생명의 나무", "", "", "")
        }
        if (falselist[i].name1 == "보급형 기타") {
            te("보급형 기타", "공격력 +5", "기타 사용 시 기본 지급\n [제작] 대나무 + 피아노선", "일반")
            up("골든 브릿지", "싱글 픽업", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "골든 브릿지") {
            te("골든 브릿지", "공격력 +8, 스킬증폭 +14%", "[제작]\n보급형 기타 + 황금", "고급")
            up("험버커 픽업", "King-V", "", "", "")
            down("보급형 기타", "황금", "", "", "")
        }
        if (falselist[i].name1 == "싱글 픽업") {
            te("싱글 픽업", "공격력 +8, 공격속도 +15%, 기본 공격 추가 피해 +2", "[제작]\n보급형 기타 + 방전 전지", "고급")
            up("루비 스페셜", "노캐스터", "슈퍼스트랫", "야생마", "")
            down("보급형 기타", "방전 전지", "", "", "")
        }
        if (falselist[i].name1 == "루비 스페셜") {
            te("루비 스페셜", "공격력 +20, 최대 체력 +300, 공격속도 +20%, 기본 공격 추가 피해 +2", "[제작]\n싱글 픽업 + 루비", "희귀")
            up("보헤미안", "", "", "", "")
            down("싱글 픽업", "루비", "", "", "")
        }
        if (falselist[i].name1 == "험버커 픽업") {
            te("험버커 픽업", "공격력 +25, 시야 +3, 스킬 증폭 +15%", "[제작]\n골든 브릿지 + 저격 스코프", "희귀")
            up("천국의 계단", "", "", "", "")
            down("골든 브릿지", "저격 스코프", "", "", "")
        }
        if (falselist[i].name1 == "King-V") {
            te("King-V", "공격력 +13, 스킬증폭 +16%", "[제작]\n골든 브릿지 + 가위", "희귀")
            up("퍼플 헤이즈", "", "", "", "")
            down("골든 브릿지", "가위", "", "", "")
        }
        if (falselist[i].name1 == "노캐스터") {
            te("노캐스터", "공격력 +15, 공격속도 +20%, 생명력 흡수 +10%, 기본 공격 추가 피해 +10", "[제작]\n싱글 픽업 + 정교한 도면", "희귀")
            up("새티스팩션", "", "", "", "")
            down("싱글 픽업", "정교한 도면", "", "", "")
        }
        if (falselist[i].name1 == "슈퍼스트랫") {
            te("슈퍼스트랫", "공격력 +19, 공격 속도 +15%, 기본 공격 추가 피해 +2", "[제작]\n싱글 픽업 + 대나무", "희귀")
            up("원더풀 투나잇", "더 월", "", "", "")
            down("싱글 픽업", "대나무", "", "", "")
        }
        if (falselist[i].name1 == "야생마") {
            te("야생마", "공격력 +9, 공격속도 +25%, 기본 공격 추가 피해 +6", "[제작]\n싱글 픽업 + 오일", "희귀")
            up("틴 스피릿", "", "", "", "")
            down("싱글 픽업", "오일", "", "", "")
        }
        if (falselist[i].name1 == "비파단도") {
            te("비파단도", "공격력 +5, 스킬증폭 +8%", "[제작]\n녹슨 검 + 마패", "고급")
            up("월왕구천", "", "", "", "")
            down("녹슨 검", "마패", "", "", "")
        }
        if (falselist[i].name1 == "월왕구천") {
            te("월왕구천", "공격력 +13, 스킬증폭 20%", "[제작]\n비파단도 + 정교한 도면", "희귀")
            up("", "", "", "", "")
            down("비파단도", "정교한 도면", "", "", "")
        }
        if (falselist[i].name1 == "보헤미안") {
            te("보헤미안", "공격력 +50, 최대 체력 +380, 공격 속도 +20%\n치명타 확률 +20%, 기본 공격 추가 피해 +2", "[제작]\n루비 스페셜 + 트럼프 카드", "영웅")
            up("", "", "", "", "")
            down("루비 스페셜", "트럼프 카드", "", "", "")
        }
        if (falselist[i].name1 == "천국의 계단") {
            te("천국의 계단", "공격력 +61, 체력 재생 +200%, 시야 +4, 스킬 증폭 +20%", "[제작] 험버커 픽업 + 성배\n보라색 항공 보급 ", "영웅")
            up("", "", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "퍼플 헤이즈") {
            te("퍼플 헤이즈", "공격력 +85, 스킬 증폭 +21%", "[제작]\nKing-V + 재", "영웅")
            up("", "", "", "", "")
            down("King-V", "재", "", "", "")
        }
        if (falselist[i].name1 == "새티스팩션") {
            te("새티스팩션", "공격력 +30, 공격속도 +30%, 생명력 흡수 +10%, 기본 공격 추가 피해 +11", "[제작]\n노캐스터 + 돌멩이", "영웅")
            up("", "", "", "", "")
            down("노캐스터", "돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "원더풀 투나잇") {
            te("원더풀 투나잇", "공격력 +100, 공격속도 +25%, 기본 공격 추가 피해 +2", "[제작]\n슈퍼스트랫 + 운석", "영웅")
            up("", "", "", "", "")
            down("슈퍼스트랫", "운석", "", "", "")
        }
        if (falselist[i].name1 == "더 월") {
            te("더 월", "공격력 +75, 공격속도 +20%, 기본 공격 추가 피해 +2", "[제작]\n슈퍼스트랫 + 백색 가루", "영웅")
            up("", "", "", "", "")
            down("슈퍼스트랫", "백색 가루", "", "", "")
        }
        if (falselist[i].name1 == "틴 스피릿") {
            te("틴 스피릿", "공격력 +10, 공격속도 +30%, 기본 공격 추가 피해 +2-", "[제작]\n야생마 + 진신사리", "영웅")
            up("", "", "", "", "")
            down("야생마", "진신사리", "", "", "")
        }
        if (falselist[i].name1 == "쇠사슬") {
            name.text = "쇠사슬"
            abil.text = "공격력 +13"
            exeplan.text = "사용 시 기본 지급\n" +
                    "모래사장(6개), 골목길(6개), 묘지(7개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "눈차크") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "사슬 코이프") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "라이더 자켓") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "사슬 갑옷") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "체인 레깅스") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "사슬 낫") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "눈차크") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "사슬 코이프") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "라이더 자켓") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "사슬 갑옷") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "체인 레깅스") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "눈차크") {
            te("눈차크", "공격력 +29", "[제작]\n쇠사슬 + 고철", "고급")
            up("샤퍼", "블리더", "", "", "")
            down("쇠사슬", "고철", "", "", "")
        }
        if (falselist[i].name1 == "샤퍼") {
            te("샤퍼", "공격력 +29, 스킬 적중 시 치유 감소 -40%", "[제작]\n눈차크 + 못", "희귀")
            up("대소반룡곤", "", "", "", "")
            down("눈차크", "못", "", "", "")
        }
        if (falselist[i].name1 == "블리더") {
            te("블리더", "공격력 +38", "[제작]\n눈차크 + 면도칼", "희귀")
            up("초진동눈차크", "", "", "", "")
            down("눈차크", "면도칼", "", "", "")
        }
        if (falselist[i].name1 == "대소반룡곤") {
            te("대소반룡곤", "공격력 +50, 스킬증폭 +17, 스킬 적중 시 치유 감소 -40%", "[제작]\n샤퍼 + 재", "영웅")
            up("", "", "", "", "")
            down("샤퍼", "재", "", "", "")
        }
        if (falselist[i].name1 == "초진동눈차크") {
            te("초진동눈차크", "공격력 +65, 공격속도 +50%", "[제작]\n블리더 + 모터", "영웅")
            up("", "", "", "", "")
            down("블리더", "모터", "", "", "")
        }
        if (falselist[i].name1 == "머리띠") {
            te("머리띠", "방어력 +4, 최대 스태미너 +130", "번화가(8개), 절(7개), 묘지(7개)의 상자\n" +
                    "박쥐(사냥)", "일반")
            up("가면", "머리테", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "모자") {
            te("모자", "방어력 +4, 쿨다운 감소 +5%", "연못(7개), 양궁장(5개), 학교(6개)의 상자\n" +
                    "박쥐(가끔)를 처치", "일반")
            up("베레모", "사슬 코이프", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "자전거 헬멧") {
            te("자전거 헬멧", "최대 체력 +90", "모래사장(6개), 성당(6개), 학교(6개)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("안전모", "방탄모", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "가면") {
            te("가면", "방어력 +10, 최대 스태미너 +130, 이동속도 +0.08", "[제작] 머리띠 + 깃털\n 초록색 항공 보급", "고급")
            up("투구", "변검", "", "", "")
            down("머리띠", "깃털", "", "", "")
        }
        if (falselist[i].name1 == "머리테") {
            te("머리테", "방어력 +14, 최대 스태미너 +270", "[제작] 머리띠 + 나뭇가지\n초록색 항공 보급", "고급")
            up("티아라", "왕관", "월계관", "", "")
            down("머리띠", "나뭇가지", "", "", "")
        }
        if (falselist[i].name1 == "베레모") {
            te("베레모", "방어력 +10, 최대 체력 +60, 쿨다운 감소 +7%", "[제작] 모자 + 가위 \n 초록색 항공 보급", "고급")
            up("방탄모", "", "", "", "")
            down("모자", "가위", "", "", "")
        }
        if (falselist[i].name1 == "사슬 코이프") {
            te("사슬 코이프", "방어력 +14, 쿨다운 감소+10%", "[제작] 모자 + 쇠사슬\n초록색 항공 보급", "고급")
            up("투구", "미스릴 투구", "", "", "")
            down("모자", "쇠사슬", "", "", "")
        }
        if (falselist[i].name1 == "안전모") {
            te("안전모", "최대 체력 +210", "[제작] 자전거 헬멧 + 돌멩이\n초록색 항공 보급", "고급")
            up("소방 헬멧", "", "", "", "")
            down("돌멩이", "자전거 헬멧", "", "", "")
        }
        if (falselist[i].name1 == "방탄모") {
            te("방탄모", "방어력 +15, 최대 체력 +90, 쿨다운 감소 +8%", "[제작] 베레모 + 자전거 헬멧\n파란색 항공 보급", "희귀")
            up("전술-OPS 헬멧", "", "", "", "")
            down("베레모", "자전거 헬멧", "", "", "")
        }
        if (falselist[i].name1 == "소방 헬멧") {
            te("소방 헬멧", "최대 체력 +280", "[제작] 안전모 + 물\n파란색 항공 보급", "희귀")
            up("오토바이 헬멧", "", "", "", "")
            down("안전모", "물", "", "", "")
        }
        if (falselist[i].name1 == "티아라") {
            te("티아라", "방어력 +14, 최대 스태미너 +460", "[제작] 머리테 + 마패\n파란색 항공 보급", "희귀")
            up("수정 티아라", "", "", "", "")
            down("머리테", "마패", "", "", "")
        }
        if (falselist[i].name1 == "왕관") {
            te("왕관", "방어력 +16, 최대 스태미너 +360, 스킬 증폭 +11%", "[제작] 머리테 +황금\n파란색 항공 보급", "희귀")
            up("제국 왕관", "", "", "", "")
            down("머리테", "황금", "", "", "")
        }
        if (falselist[i].name1 == "투구") {
            te("투구", "방어력 +20, 최대 스태미너 +130, 이동속도 +0.1, 쿨다운 감소 +10%", "[제작]사슬 코이프 + 가면\n파란색 항공 보급", "희귀")
            up("기사단장의 투구", "황실 부르고넷", "", "", "")
            down("사슬 코이프", "가면", "", "", "")
        }
        if (falselist[i].name1 == "오토바이 헬멧") {
            te("오토바이 헬멧", "공격력 +10, 최대 체력 +300, 시야 +2.5", "[제작] 소방 헬멧 + 쌍안경\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("소방 헬멧", "쌍안경", "", "", "")
        }
        if (falselist[i].name1 == "미스릴 투구") {
            te("미스릴 투구", "방어력 +38, 공격속도 +12%, 이동속도 +0.2, 쿨다운 감소 +15%", "[제작] 미스릴 + 사슬 코이프\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("미스릴", "사슬 코이프", "", "", "")
        }
        if (falselist[i].name1 == "수정 티아라") {
            te("수정 티아라", "방어력 +14, 최대 스태미너 +700, 치명타 확률 +20%", "[제작]티아라 + 유리 조각\n", "영웅")
            up("", "", "", "", "")
            down("티아라", "유리 조각", "", "", "")
        }
        if (falselist[i].name1 == "전술-OPS 헬멧") {
            te("전술-OPS 헬멧", "방어력 +15, 최대 체력 +120, 공격속도 +23%, 쿨다운 감소 +15%", "[제작] 방탄모 + 전자 부품\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("방탄모", "전자 부품", "", "", "")
        }
        if (falselist[i].name1 == "기사단장의 투구") {
            te("기사단장의 투구", "방어력 +28, 최대 스태미너 +200, 이동속도 +0.1, 쿨다운 감소 +10%, 스킬 피해 감소 +11%", "[제작] 투구 + 고무\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("투구", "고무", "", "", "")
        }
        if (falselist[i].name1 == "제국 왕관") {
            te("제국 왕관", "방어력 +18, 최대 체력 +300, 최대 스태미너 +500, 스킬 증폭 +10%", "[제작] 왕관 + 루비\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("왕관", "루비", "", "", "")
        }
        if (falselist[i].name1 == "황실 부르고넷") {
            te("황실 부르고넷", "방어력 +10, 최대 스태미너 +200, 이동속도 +0.1, 쿨다운 감소 +10%, 스킬 증폭 +14%", "[제작] 투구 + 황금\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("투구", "황금", "", "", "")
        }
        if (falselist[i].name1 == "변검") {
            te("변검", "방어력 +16, 최대 스태미너 +300, 이동속도 +0.1, 생명력 흡수 +22%, 비전투중 이동속도 +0.4", "[제작] 가면 + VF 혈액 샘플\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("가면", "VF 혈액 샘플", "", "", "")
        }
        if (falselist[i].name1 == "월계관") {
            te("월계관", "방어력 +18, 최대 스태미너 +580, 체력 재생 +1.5, 스태미너 재생 +2, 기본 공격 추가 피해 +15", "[제작]삼매진화 + 머리테\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("삼매진화", "머리테", "", "", "")
        }
        if (falselist[i].name1 == "바람막이") {
            te("바람막이", "최대 체력 +50, 기본 공격 피해 감소 +3", "고급 주택가(6개), 호텔(7개), 학교(7개)의 상자", "일반")
            up("가죽 자켓", "군복", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "승복") {
            te("승복", "방어력 +5, 쿨다운 감소 +5%", "절(9개), 양궁장(5개)의 상자", "일반")
            up("거북 도복", "덧댄 로브", "진신 사리", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "전신 수영복") {
            te("전신 수영복", "방어력 +1, 스킬 피해 감소 +5%", "항구(7개), 모래사장(6개), 골목길(7개)의 상자", "일반")
            up("비키니", "잠수복", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "천 갑옷") {
            te("천 갑옷", "방어력 +11", "절(8개), 양궁장(6개), 묘지(7개)의 상자", "일반")
            up("가죽 갑옷", "판금 갑옷", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "가죽 갑옷") {
            te("가죽 갑옷", "방어력 +22", "[제작] 천 갑옷 + 가죽\n초록색 항공 보급", "고급")
            up("사슬 갑옷", "석양의 갑옷", "미스릴 갑옷", "", "")
            down("천 갑옷", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "가죽 자켓") {
            te("가죽 자켓", "방어력 +8, 최대 체력 +70, 기본 공격 피해 감소 +6", "[제작] 바람막이 + 가죽\n초록색 항공 보급", "고급")
            up("라이더 자켓", "", "", "", "")
            down("바람막이", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "거북 도복") {
            te("거북 도복", "방어력 +10, 쿨다운 감소 +10%", "[제작] 승복 + 거북이 등딱지\n초록색 항공 보급", "고급")
            up("용의 도복", "", "", "", "")
            down("승복", "거북이 등딱지", "", "", "")
        }
        if (falselist[i].name1 == "군복") {
            te("군복", "최대 체력 +50, 기본 공격 피해 감소 +10", "[제작] 바람막이 + 나뭇가지\n초록색 항공 보급", "고급")
            up("정장", "방탄조끼", "", "", "")
            down("바람막이", "나뭇가지", "", "", "")
        }
        if (falselist[i].name1 == "덧댄 로브") {
            te("덧댄 로브", "방어력 +5, 체력 재생 +1, 쿨다운 감소 +7%", "[제작] 승복 + 붕대\n초록색 항공 보급", "고급")
            up("한복", "EOD 슈트", "", "", "")
            down("승복", "붕대", "", "", "")
        }
        if (falselist[i].name1 == "드레스") {
            te("드레스", "공격력 +8, 방어력 +8, 스태미너 재생 +100%", "[제작] 옷감 + 가위\n초록색 항공 보급", "고급")
            up("치파오", "불꽃 드레스", "", "", "")
            down("옷감", "가위", "", "", "")
        }
        if (falselist[i].name1 == "비키니") {
            te("비키니", "방어력 +4, 스킬 피해 감소 +11%", "[제작]전신 수영복 + 가위\n초록색 항공 보급", "고급")
            up("아마조네스 아머", "", "", "", "")
            down("전신 수영복", "가위", "", "", "")
        }
        if (falselist[i].name1 == "잠수복") {
            te("잠수복", "방어력 +9, 스킬 피해 감소 +10%", "[제작] 전신 수영복 + 고무\n", "고급")
            up("광학미채 슈트", "배틀 슈트", "", "", "")
            down("전신 수영복", "고무", "", "", "")
        }
        if (falselist[i].name1 == "라이더 자켓") {
            te("라이더 자켓", "방어력 +11, 최대 체력 +70, 기본 공격 피해 감소 +9", "[제작]가죽 자켓 + 쇠사슬\n파란색 항공 보급", "희귀")
            up("락커의 자켓", "", "", "", "")
            down("가죽 자켓", "쇠사슬", "", "", "")
        }
        if (falselist[i].name1 == "사슬 갑옷") {
            te("사슬 갑옷", "방어력 +30", "[제작] 가죽 갑옷 + 쇠사슬\n파란색 항공 보급", "희귀")
            up("지휘관의 갑옷", "", "", "", "")
            down("가죽 갑옷", "쇠사슬", "", "", "")
        }
        if (falselist[i].name1 == "정장") {
            te("정장", "생명력 흡수 +5%, 기본 공격 피해 감소 +12", "[제작] 군복 + 리본\n파란색 항공 보급", "희귀")
            up("집사복", "", "", "", "")
            down("군복", "리본", "", "", "")
        }
        if (falselist[i].name1 == "치파오") {
            te("치파오", "공격력 +10, 방어력 +10, 스태미너 재생 +150%", "[제작] 드레스 + 면도칼\n파란색 항공 보급", "희귀")
            up("용의 도복", "", "", "", "")
            down("드레스", "면도칼", "", "", "")
        }
        if (falselist[i].name1 == "판금 갑옷") {
            te("판금 갑옷", "방어력 +38, 최대 체력 +100, 이동속도 -0.1", "[제작] 천 갑옷 + 강철\n파란색 항공 보급", "희귀")
            up("성기사의 갑옷", "아마조네스 갑옷", "", "", "")
            down("천 갑옷", "강철", "", "", "")
        }
        if (falselist[i].name1 == "한복") {
            te("한복", "방어력 +12, 체력 재생 +1, 쿨다운 감소 +8%", "[제작] 덧댄 로브 + 꽃\n", "희귀")
            up("어사의", "퀸 오브 하트", "", "", "")
            down("덧댄 로브", "꽃", "", "", "")
        }
        if (falselist[i].name1 == "방탄조끼") {
            te("방탄조끼", "방어력 +10, 최대 체력 +130, 기본 공격 피해 감소 +10", "[제작] 군복 + 철판\n파란색 항공 보급", "희귀")
            up("배틀 슈트", "EOD 슈트", "", "", "")
            down("군복", "철판", "", "", "")
        }
        if (falselist[i].name1 == "석양의 갑옷") {
            te("석양의 갑옷", "방어력 +28, 최대 체력 +360", "[제작] 가죽 갑옷 + 루비\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "어사의") {
            te("어사의", "방어력 +23, 최대 체력 +2.5, 쿨다운 감소 +15%", "[제작] 한복 + 마패\n", "희귀")
            up("활빈검", "", "", "", "")
            down("한복", "마패", "", "", "")
        }
        if (falselist[i].name1 == "광학미채 슈트") {
            te("광학미채 슈트", "공격력 +10, 방어력 +20, 치명타 확률 +22%, 스킬 피해 감소 +10%", "[제작] 잠수복 + 유리판\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("잠수복", "유리판", "", "", "")
        }
        if (falselist[i].name1 == "락커의 자켓") {
            te("락커의 자켓", "공격력 +30, 방어력 +11, 비전투중 이동속도 +0.1, 기본 공격 피해 감소 +15, 스킬 적중 시 치유 감소 -40%", "[제작] 라이더 자켓 + 소란 발생기\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("라이더 자켓", "소란 발생기", "", "", "")
        }
        if (falselist[i].name1 == "미스릴 갑옷") {
            te("미스릴 갑옷", "방어력 +65, 공격속도 +12%, 이동속도 +0.2", "[제작] 미스릴 + 가죽 갑옷\n보라색 항공 보급", "미스릴 갑옷")
            up("", "", "", "", "")
            down("미스릴", "가죽 갑옷", "", "", "")
        }
        if (falselist[i].name1 == "성기사의 갑옷") {
            te("성기사의 갑옷", "방어력 +38, 체력 재생 +150%, 이동속도 -0.02, 기본 공격 추가 피해 +15", "[제작] 판금 갑옷 + 성자의 유산\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("판금 갑옷", "성자의 유산", "", "", "")
        }
        if (falselist[i].name1 == "아마조네스 아머") {
            te("아마조네스 아머", "방어력 +28, 최대 체력 +120, 스킬 피해 감소 +20%", "[제작] 판금 갑옷 + 비키니\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("판금 갑옷", "비키니", "", "", "")
        }
        if (falselist[i].name1 == "용의 도복") {
            te("용의 도복", "공격력 +11, 방어력 +10, 스태미너 재생 +150%, 쿨다운 감소 +10%, 기본 공격 사거리 +1", "[제작] 치파오 + 거북 도복\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("치파오", "거북 도복", "", "", "")
        }
        if (falselist[i].name1 == "지휘관의 갑옷") {
            te("지휘관의 갑옷", "방어력 +20, 스킬 증폭 +18%", "[제작] 사슬 갑옷 + 황금\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("사슬 갑옷", "황금", "", "", "")
        }
        if (falselist[i].name1 == "집사복") {
            te("집사복", "공격력 +30, 이동속도 +0.1, 생명력 흡수 +20%, 기본 공격 피해 감소 +10", "[제작] 정장 + 먼지털이개\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("정장", "먼지털이개", "", "", "")
        }
        if (falselist[i].name1 == "배틀 슈트") {
            te("배틀 슈트", "방어력 +25, 최대 체력 +140, 기본 공격 피해 감소 +12, 스킬 피해 감소 +12%", "[제작] 방탄조끼 + 잠수복\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("방탄조끼", "잠수복", "", "", "")
        }
        if (falselist[i].name1 == "EOD 슈트") {
            te("EOD 슈트", "방어력 +20, 최대 체력 +300, 체력 재생 +1, 쿨다운 감소 +10%, 기본 공격 피해 감소 +10", "[제작] 방탄조끼 + 덧댄 로브\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("방탄조끼", "덧댄 로브", "", "", "")
        }
        if (falselist[i].name1 == "불꽃 드레스") {
            te("불꽃 드레스", "방어력 +30, 체력 재생 +2.5, 스태미너 재생 +3, 스태미너 재생 +75%, 기본 공격 추가 피해 +18", "[제작] 삼매진화 + 드레스\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "카바나") {
            te("카바나", "방어력 +38, 스킬 증폭 +22%", "[제작] 운석 + 지휘관의 갑옷\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("운석", "지휘관의 갑옷", "", "", "")
        }
        if (falselist[i].name1 == "퀸 오브 하트") {
            te("퀸 오브 하트", "방어력 +37, 체력 재생 +3, 쿨다운 감소 +25%", "[제작] VF 혈액 샘플 + 한복\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("VF 혈액 샘플", "한복", "", "", "")
        }
        if (falselist[i].name1 == "손목시계") {
            te("손목시계", "공격속도 +10%", "고급 주택가(6개), 호텔(6개), 번화가(8개)의 상자\n" +
                    "들개(가끔)를 처치", "일반")
            up("바이탈 센서", "큐브 워치", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "붕대") {
            te("붕대", "체력 재생 +0.8", "항구(7개), 병원(6개), 공장(6개), 학교(6)의 상자\n" +
                    "박쥐(가끔)를 처치", "일반")
            up("바이탈 센서", "분대장 완장", "브레이서", "구급상자", "기름먹인 천")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "팔찌") {
            te("팔찌", "최대 스태미너 +200", "연못(7개), 고급 주택가(6개), 골목길(6개)의 상자\n" +
                    "들개(가끔)를 처치", "일반")
            up("금팔찌", "진홍 팔찌", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "가죽 방패") {
            te("가죽 방패", "공격력 +10, 방어력 +10", "[제작] 거북이 등딱지 + 가죽\n초록색 항공 보급", "고급")
            up("강철 방패", "미스릴 방패", "아이기스", "", "")
            down("거북이 등딱지", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "분대장 완장") {
            te("분대장 완자", "체력 재생 +1.5, 치명타 피해량 +15%", "[제작] 붕대 + 바늘\n초록색 항공 보급", "고급")
            up("기사의 신조", "", "", "", "")
            down("붕대", "바늘", "", "", "")
        }
        if (falselist[i].name1 == "브레이서") {
            te("브레이서", "방어력 +13, 체력 재생 +1", "[제작] 붕대 + 가죽\n초록색 항공 보급", "고급")
            up("바주반드", "드라우프니르", "오토-암즈", "", "")
            down("붕대", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "검집") {
            te("검집", "공격력 +18, 기본 공격 피해 감소 +", "[제작] 가죽 + 철판\n파란색 항공 보급", "희귀")
            up("샤자한의 검집", "", "", "", "")
            down("가죽", "철판", "", "", "")
        }
        if (falselist[i].name1 == "금팔찌") {
            te("금팔찌", "최대 스태미너 +220, 스킬 증폭 +12%", "[제작] 팔찌 + 황금\n파란색 항공 보급", "희귀")
            up("드라우프니르", "", "", "", "")
            down("팔찌", "황금", "", "", "")
        }
        if (falselist[i].name1 == "바주반드") {
            te("바주반드", "방어력 +25, 기본 공격 피해 감소 +8", "[제작] 브레이서 + 철판\n파란색 항공 보급", "희귀")
            up("소드 스토퍼", "", "", "", "")
            down("브레이서", "철판", "", "", "")
        }
        if (falselist[i].name1 == "진홍 팔찌") {
            te("진홍 팔찌", "최대 체력 +200, 최대 스태미너 +250", "[제작] 팔찌 + 가시 발판\n파란색 항공 보급", "희귀")
            up("스카디의 팔찌", "아이기스", "", "", "")
            down("팔찌", "가시 발판", "", "", "")
        }
        if (falselist[i].name1 == "강철 방패") {
            te("강철 방패", "공격력 +23, 방어력 +20, 이동속도 -0.05", "[제작] 방패 + 강철\n파란색 항공 보급", "희귀")
            up("기사의 신조", "", "", "", "")
            down("가죽 방패", "강철", "", "", "")
        }
        if (falselist[i].name1 == "큐브 워치") {
            te("큐브 워치", "방어력 +27, 공격속도 +50%", "[제작] 손목시계 + 문스톤\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("손목시계", "문스톤", "", "", "")
        }
        if (falselist[i].name1 == "소드 스토퍼") {
            te("소드 스토퍼", "방어력 +36, 치명타 피해 감소 +10%, 기본 공격 시 치유 감소 -40%", "[제작] 바주반드 + 못\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("바주반드", "못", "", "", "")
        }
        if (falselist[i].name1 == "드라우프니르") {
            te("드라우프니르", "방어력 +10, 최대 스태미너 +240, 체력 재생 +1, 스킬 증폭 17%", "[제작] 금팔찌 + 브레이서\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("금팔찌", "브레이서", "", "", "")
        }
        if (falselist[i].name1 == "미스릴 방패") {
            te("미스릴 방패", "공격력 +30, 방어력 +30, 공격속도 +12%, 이동속도 +0.1", "[제작] 미스릴 + 가죽 방패\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("미스릴", "가죽 방패", "", "", "")
        }
        if (falselist[i].name1 == "바이탈 센서") {
            te("바이탈 센서", "방어력 +15, 공격속도 +30%", "[제작] 손목 시계 + 휴대폰\n보라색 항공 보급", "영웅")
            up("레이더", "", "", "", "")
            down("손목 시계", "휴대폰", "", "", "")
        }
        if (falselist[i].name1 == "기사의 신조") {
            te("기사의 신조", "공격력 +30, 방어력 +20, 체력 재생 +1.5, 이동속도 -0.05, 치명타 피해량 +25%", "[제작] 강철 방패 + 분대장 완장\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("강철 방패", "분대장 완장", "", "", "")
        }
        if (falselist[i].name1 == "샤자한의 검집") {
            te("샤자한의 검집", "공격력 +28, 최대 체력 +260, 기본 공격 피해 감소 +2", "[제작] 검집 + 루비\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("검집", "루비", "", "", "")
        }
        if (falselist[i].name1 == "아이기스") {
            te("아이기스", "체력 +350, 스태미너 +250, 공격력 +10, 방어력 +10", "[제작] 진홍 팔찌 + 가죽 방패\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("진홍 팔찌", "가죽 방패", "", "", "")
        }
        if (falselist[i].name1 == "스카디의 팔찌") {
            te("스카디의 팔찌", "최대 체력 +200, 최대 스태미너 +250, 체력 재생 +2, 스태미너 재생 +2, 스킬 증폭 +20", "[제작] 만년빙 + 진홍 팔찌\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("만년빙", "진홍 팔찌", "", "", "")
        }
        if (falselist[i].name1 == "레이더") {
            te("레이더", "방어력 +15, 공격속도 +40%, 치명타 확률 +24%", "[제작] 바이탈 센서 + 유리판\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("바이탈 센서", "유리판", "", "", "")
        }
        if (falselist[i].name1 == "오토-암즈") {
            te("오토-암즈", "공격력 +40, 방어력 +35, 체력 재생 +1", "[제작] 브레이서 + 포스 코어\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("브레이서", "포스 코어", "", "", "")
        }
        if (falselist[i].name1 == "슬리퍼") {
            te("슬리퍼", "스태미너 재생 +0.5, 이동속도 +0.04", "번화가(8개), 병원(6개), 학교(7개)의 상자\n" +
                    "박쥐(가끔)를 처치", "일반")
            up("하이힐", "덧댄 슬리퍼", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "운동화") {
            te("운동화", "이동속도 +0.08", "고급 주택가(6개), 골목길(7개), 양궁장(5개)의 상자\n" +
                    "들개(가끔)를 처치", "일반")
            up("힐리스", "부츠", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "타이즈") {
            te("타이즈", "방어력 +5, 이동속도 +0.04", "번화가(8개), 병원(6개), 숲(7개)의 상자\n" +
                    "맷돼지(가끔)를 처치\n", "일반")
            up("무릎 보호대", "체인 레깅스", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "무릎 보호대") {
            te("무릎 보호대", "방어력 +8, 이동속도 +0.16", "[제작] 타이즈 + 가죽\n초록색 항공 보급", "고급")
            up("강철 무릎 보호대", "", "", "", "")
            down("타이즈", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "체인 레깅스") {
            te("체인 레깅스", "방어력 +10, 이동속도 +0.14", "[제작]타이즈 + 쇠사슬\n초록색 항공 보급", "고급")
            up("미스릴 부츠", "부케팔로스", "", "", "")
            down("타이즈", "쇠사슬", "", "", "")
        }
        if (falselist[i].name1 == "하이힐") {
            te("하이힐", "스태미너 재생 +0.8, 이동속도 +0.17", "[제작] 슬리퍼 + 고철\n초록색 항공 보급", "고급")
            up("킬힐", "", "", "", "")
            down("슬리퍼", "고철", "", "", "")
        }
        if (falselist[i].name1 == "힐리스") {
            te("힐리스", "이동속도 +0.12, 비전투중 이동 속도 +0.2", "[제작] 운동화 + 쇠구슬\n초록색 항공 보급", "고급")
            up("매버릭 러너", "헤르메스의 부츠", "", "", "")
            down("운동화", "쇠구슬", "", "", "")
        }
        if (falselist[i].name1 == "덧댄 슬리퍼") {
            te("덧댄 슬리퍼", "스태미너 재생 +0.5, 스태미너 재생 +30%, 이동속도 +0.16", "[제작] 슬리퍼 + 옷감\n초록색 항공 보급", "고급")
            up("풍화륜", "글레이셜 슈즈", "", "", "")
            down("슬리퍼", "옷감", "", "", "")
        }
        if (falselist[i].name1 == "부츠") {
            te("부츠", "체력 재생 +0.6, 공격속도 +2%, 이동속도 +0.22", "[제작] 운동화 + 기름먹인 천\n파란색 항공 보급", "희귀")
            up("전투화", "EOD 부츠", "", "", "")
            down("운동화", "기름먹인 천", "", "", "")
        }
        if (falselist[i].name1 == "강철 무릎 보호대") {
            te("강철 무릎 보호대", "방어력 +20, 이동속도 +0.24", "[제작] 무릎 보호대 + 강철\n파란색 항공 보급", "희귀")
            up("EOD 부츠", "", "", "", "")
            down("강철", "무릎 보호대", "", "", "")
        }
        if (falselist[i].name1 == "매버릭 러너") {
            te("매버릭 러너", "공격속도 +15%, 이동속도 +0.2, 비전투중 이동속도 +0.55", "[제작] 힐리스 + 전자 부품\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("힐리스", "전자 부품", "", "", "")
        }
        if (falselist[i].name1 == "전투화") {
            te("전투화", "체력 재생 +0.6, 공격속도 +7%, 이동속도 +0.27", "[제작] 부츠 + 기즉\n파란색 항공 보급", "희귀")
            up("경량화 부츠", "클링온 부츠", "", "", "")
            down("부츠", "가죽", "", "", "")
        }
        if (falselist[i].name1 == "킬힐") {
            te("킬힐", "공격력 +5, 스태미너 재생 +0.8, 이동속도 +0.16, 치명타 확률 +10%", "[제작] 하이힐 + 유리 조각\n파란색 항공 보급", "희귀")
            up("분홍신", "부케팔로스", "", "", "")
            down("하이힐", "유리 조각", "", "", "")
        }
        if (falselist[i].name1 == "풍화륜") {
            te("풍화륜", "스태미너 재생 +1, 스태미너 재생 +50%, 이동속도 +0.35, 스킬증폭 +10", "[제작] 덧댄 슬리퍼 + 재\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("덧댄 슬리퍼", "재", "", "", "")
        }
        if (falselist[i].name1 == "경량화 부츠") {
            te("경량화 부츠", "체력 재생 +1, 공격속도 +35%, 이동속도 +0.4", "[제작] 전투화 + 깃털\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("전투화", "깃털", "", "", "")
        }
        if (falselist[i].name1 == "미스릴 부츠") {
            te("미스릴 부츠", "방어력 +22, 공격속도 +12%, 이동속도 +0.45", "[제작] 미스릴 + 체인 레깅스\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("미스릴", "체인 레깅스", "", "", "")
        }
        if (falselist[i].name1 == "부케팔로스") {
            te("부케 팔로스", "공격력 +5, 방어력 +5, 스태미너 재생 +1, 이동속도 +0.33, 치명타 확률 +15%", "[제작]킬힐 + 체인 레깅스\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("킬힐", "체인 레깅스", "", "", "")
        }
        if (falselist[i].name1 == "클링온 부츠") {
            te("클링온 부츠", "체력 재생 +0.7, 공격속도 +15, 이동속도 +0.35, 기본 공격 시 치유 감소 -40%", "[제작] 전투화 + 못\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("전투화", "못", "", "", "")
        }
        if (falselist[i].name1 == "EOD 부츠") {
            te("EOD 부츠", "방어력 +26, 체력 재생 +1, 이동속도 +0.33", "[제작] 부츠 + 강철 무릎 보호대\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("부츠", "강철 무릎 보호대", "", "", "")
        }
        if (falselist[i].name1 == "글레이셜 슈즈") {
            te("글레이셜 슈즈", "체력 재생 +2, 스태미너 재생 +2, 스태미너 재생 +60%, 이동속도 +0.25, 비전투중 이동속도 +0.4, 스킬증폭 +15", "[제작] 덧댄 슬리퍼 + 만년빙\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("만년빙", "덧댄 슬리퍼", "", "", "")
        }
        if (falselist[i].name1 == "헤르메스의 부츠") {
            te("헤르메스의 부츠", "방어력 +40, 이동속도 +0.4, 비전투중 이동 속도+0.2", "[제작] 포스 코어 + 힐리스\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("포스 코어", "힐리스", "", "", "")
        }
        if (falselist[i].name1 == "분홍신") {
            te("분홍신", "공격력 +5, 스태미너 재생 +1, 이동속도 +0.4, 치명타 확률 +10%, 생명력 흡수 +15%", "[제작] 킬힐 + VF 혈액 샘플\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("킬힐", "VF 혈액 샘플", "", "", "")
        }
        if (falselist[i].name1 == "깃털") {
            name.text = "깃털"
            abil.text = "이동속도 +0.06"
            exeplan.text = "병원(6개), 묘지(7개), 숲(7개)의 상자, 맷돼지(가끔)를 처치"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "경량화 도끼") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "가면") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "경량화 부츠") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "백우선") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "먼지털이개") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "강창") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "윙 너클") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "다트") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "경량화 도끼") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "가면") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "경량화 부츠") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "백우선") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "먼지털이개") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "꽃") {
            name.text = "꽃"
            abil.text = "쿨다운 감소 +7%"
            exeplan.text = "연못(7개),고급 주택가(7), 묘지(7개), 숲(7개)의 상자\n" +
                    "맷돼지(가끔)를 처치"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "장미칼") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "한복") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "운명의 꽃") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "백일취") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "난초") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "매화비표") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "장미칼") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "한복") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "운명의 꽃") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "백일취") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "난초") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "리본") {
            te("리본", "생명력 흡수 +5%", "연못(6개),고급 주택가(7), 학교(7개)의 상자\n" +
                    "들개(가끔)를 처치", "일반")
            up("정장", "인형", "달빛 펜던트", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "부채") {
            te("부채", "스킬증폭 +11", "번화가(8개), 숲(8개), 성당(6개)의 상자\n" +
                    "들개(가끔)를 처치", "일반")
            up("군선", "우치와", "우산", "바람 채찍", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "불경") {
            te("불경", "스킬 증폭 +7%", "절(8개)의 상자\n" +
                    "박쥐(가끔), 들개(가끔)를 처치", "일반")
            up("진신사리", "부적", "법륜", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "상자") {
            te("상자", "최대 체력 +90", "항구(7개), 연못(7), 성당(6)의 상자\n" +
                    "박쥐(가끔)를 처치", "일반")
            up("탄창", "슈뢰딩거의 상자", "초코파이 상자", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "성배") {
            te("성배", "체력 재생 +120%", "성당(9개)\n" +
                    "박쥐(가끔),맷돼지(가끔)를 처치", "일반")
            up("엑스칼리버", "성자의 유산", "천국의 계단", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "십자가") {
            te("십자가", "기본 공격 추가 피해 +7", "골목길(7개), 성당(9개)\n" +
                    "들개(가끔)를 처치", "일반")
            up("아론다이트", "성자의 유산", "디바인 피스트", "안티오크의 수류탄", "흑건")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "쌍안경") {
            te("쌍안경", "기본 공격 추가 피해 +7", "모래사장(6개), 골목길(6개), 호텔(6), 공장(7)\n" +
                    "박쥐(가끔), 들개(가끔)를 처치", "일반")
            up("오토바이 헬멧", "저격 스코프", "망원 카메라", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "성자의 유산") {
            te("성자의 유산", "체력 재생 +150%, 기본 공격 추가 피해 +8", "[제작] 십자가 + 성배\n초록색 항공 보급", "고급")
            up("카른웬난", "성기사의 갑옷", "진리는 나의 빛", "다그다의 망치", "다비드 슬링")
            down("십자가", "성배", "", "", "")
        }
        if (falselist[i].name1 == "운명의 꽃") {
            te("운명의 꽃", "치명타 확률 +15%, 쿨다운 감소 +10%", "[제작] 꽃 + 트럼프 카드\n초록색 항공 보급", "고급")
            up("에메랄드 타블렛", "매화검", "", "", "")
            down("꽃", "트럼프 카드", "", "", "")
        }
        if (falselist[i].name1 == "유리 조각") {
            te("유리 조각", "치명타 확률 +13%", "[제작] 유리병 + 돌멩이\n초록색 항공 보급", "고급")
            up("호푸어드", "수정 티아라", "킬힐", "유리판", "유리 너클")
            down("유리병", "돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "인형") {
            te("인형", "스태미너 재생(%) +100%\n" +
                    "생명력 흡수 +11%", "[제작] 리본 + 옷감\n초록색 항공 보급", "고급")
            up("우치와", "구원의 여신상", "단영촌천투", "", "")
            down("리본", "옷감", "", "", "")
        }
        if (falselist[i].name1 == "저격 스코프") {
            te("저격 스코프", "공격력 +10, 시야 +4.5m", "[제작] 레이저 포인터 + 쌍안경 \n초록색 항공 보급", "고급")
            up("저격 크로스보우", "험버커 픽업", "", "", "")
            down("레이저 포인터", "쌍안경", "", "", "")
        }
        if (falselist[i].name1 == "진신사리") {
            te("진신사리", "쿨다운 감소 +8%, 스킬 증폭 +8%", "[제작] 불경 + 승복\n초록색 항공 보급", "고급")
            up("파라슈", "진리는 나의 빛", "여래수투", "틴 스피릿", "")
            down("불경", "승복", "", "", "")
        }
        if (falselist[i].name1 == "화살통") {
            te("화살통", "공격속도 +22%", "[제작] 가죽 + 대나무\n초록색 항공 보급", "고급")
            up("궁기병의 화살통", "", "", "", "")
            down("가죽", "대나무", "", "", "")
        }
        if (falselist[i].name1 == "먼지털이개") {
            te("먼지털이개", "공격력 +9, 이동속도 +0.1", "[제작] 단봉 + 깃털, 늑대(사냥)\n초록색 항공 보급", "고급")
            up("집사복", "궁기병의 화살통", "횃불", "엘레강스", "")
            down("단봉", "깃털", "", "", "")
        }
        if (falselist[i].name1 == "군선") {
            te("군선", "스킬 증폭 +14, 스킬 적중시 치유 감소 -40%", "[제작] 부채 + 못\n초록색 항공 보급", "고급")
            up("백우선", "방천화극", "", "", "")
            down("부채", "못", "", "", "")
        }
        if (falselist[i].name1 == "백우선") {
            te("백우선", "이동속도 +0.1, 스킬증폭 +16, 스킬 적중 시 치유 감쇼 -40%", "[제작] 군선 + 깃털\n파란색 항공 보급", "희귀")
            up("하르페", "엘리멘탈 보우", "", "", "")
            down("군선", "깃털", "", "", "")
        }
        if (falselist[i].name1 == "생명의 가루") {
            te("생명의 가루", "체력 재생 +1.5, 스태미너 재생 +1.5", "[제작] 생명의 나무 + 돌멩이, 곰(사냥), 위클라인(사냥)\n파란색 항공 보급", "희귀")
            up("만년빙", "삼매진화", "포스 코어", "", "")
            down("생명의 나무", "돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "우치와") {
            te("우치와", "스태미너 재생 +100%, 생명력 흡수 +15%, 스킬 증폭 +21", "[제작] 인형 + 부채\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("인형", "부채", "", "", "")
        }
        if (falselist[i].name1 == "탄창") {
            te("탄창", "최대 체력 +350, 기본 공격 피해 감소 +6", "[제작] 상자 + 철판\n파란색 항공 보급", "희귀")
            up("XCR", "", "", "", "")
            down("상자", "철판", "", "", "")
        }
        if (falselist[i].name1 == "궁기병의 화살통") {
            te("궁기병의 화살통", "공격력 +13, 공격속도 +30%, 이동속도 +0.1", "[제작] 화살통 + 먼지털이개\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("화살통", "먼지털이개", "", "", "")
        }
        if (falselist[i].name1 == "달빛 펜던트") {
            te("달빛 펜던트", "공격력 +20, 생명력 흡수 +20%", "[제작] 리본 + 문스톤, 곰(사냥), 위클라인(사냥)\n파란색 항공 보급", "희귀")
            up("마법봉", "", "", "", "")
            down("리본", "문스톤", "", "", "")
        }
        if (falselist[i].name1 == "슈뢰딩거의 상자") {
            te("슈뢰딩거의 상자", "최대 체력 +380, 스킬 증폭 +7", "[제작] 상자 + 독약\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("상자", "독약", "", "", "")
        }
        if (falselist[i].name1 == "진리는 나의 빛") {
            te("진리는 나의 빛", "체력 재생 +150%, 쿨다운 감소 +10%, 기본 공격 추가 피해 +12, 스킬 증폭 +8%", "[제작] 진신사리 + 성자의 유산\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("진신사리", "성자의 유산", "", "", "")
        }
        if (falselist[i].name1 == "만년빙") {
            te("만년빙", "체력 재생 +1.5, 스태미너 재생 +1.5, 스킬 증폭 +18", "[제작] 생명의 가루 + 얼음\n보라색 항공 보급", "영웅")
            up("스카디의 팔찌", "글레이셜 슈즈", "", "", "")
            down("생명의 가루", "얼음", "", "", "")
        }
        if (falselist[i].name1 == "삼매진화") {
            te("삼매진화", "체력 재생 +1.5, 스태미너 재생 +1.5, 기본 공격 추가 피해 +13", "[제작] 생명의 가루 + 라이터\n보라색 항공 보급", "영웅")
            up("레바테인", "월계관", "불꽃 드레스", "화첨창", "")
            down("생명의 가루", "라이터", "", "", "")
        }
        if (falselist[i].name1 == "에메랄드 타블렛") {
            te("에메랄드 타블렛", "공격력 +10, 방어력 +10, 치명타 확률 +15%, 쿨다운 감소 +10%", "[제작] 포스 코어 + 운명의 꽃\n노라색 항공 보급", "전설")
            up("", "", "", "", "")
            down("포스 코어", "운명의 꽃", "", "", "")
        }
        if (falselist[i].name1 == "감자") {
            te("감자", "체력 재생 +130", "감자 덩굴에서 채집", "일반")
            up("감자빵", "감자스프", "감자튀김", "구운 감자", "버터 감자구이")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "대구") {
            te("대구", "체력 재생 +130", "바다 낚시(모래사장, 고급 주택가, 항구)에서 채집", "일반")
            up("꿀 바른 대구살", "대구 간 통조림", "달걀 생선 필레", "메로구이", "생선까스")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "레몬") {
            te("레몬", "체력 재생", "호텔(6개), 고급 주택가(5개), 병원(4개)의 상자", "일반")
            up("레몬에이드", "칵테일", "시트러스 케이크", "레몬 아이스크림", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "마늘") {
            te("마늘", "체력 재생 +200", "골목길(6개), 절(6개), 묘지(5개)의 상자", "일반")
            up("마늘빵", "마늘 베이컨 말이", "마늘 꿀절임", "마늘라면", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "반창고") {
            te("반창고", "체력 재생 +200", "병원(4개)의 상자", "일반")
            up("지혈제", "", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "붕어") {
            te("붕어", "체력 재생 +130", "민물 낚시에서 채집", "일반")
            up("붕어빵", "매운탕", "구운 붕어", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "빵") {
            name.text = "빵"
            abil.text = "체력 재생 +200"
            exeplan.text = "학교(6개), 성당(4개), 항구(4개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            qkRnrl2 = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "마늘빵") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "붕어빵") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "초코파이") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "번") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "햄버거") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1 && qkRnrl2 == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "감자빵") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "시트러스 케이크") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "계란빵") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "카레빵") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "모카빵") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템3으로 변경)")
                    qkRnrl *= -1
                } else if (qkRnrl == 1 && qkRnrl2 == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "파운드 케이크") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템3 (터치 시 상위 아이템1로 변경)")
                    qkRnrl2 *= -1
                } else if (qkRnrl == 1 && qkRnrl2 == 1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "마늘빵") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "붕어빵") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "초코파이") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "번") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "햄버거") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                    qkRnrl2 *= -1
                }
            }
        }

        if (falselist[i].name1 == "고기") {
            te("고기", "체력 재생 +200", "닭, 멧돼지, 늑대, 곰을 처치", "일반")
            up("탄두리", "마늘 베이컨 말이", "햄버거", "후라이드 치킨", "스테이크")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "달걀") {
            name.text = "달걀"
            abil.text = "체력 재생 +200"
            exeplan.text = "묘지(6개), 양궁장(5개), 숲(5개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "달걀 생선 필레") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "레몬 아이스크림") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "계란빵") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "이스터 에그") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "스크램블 에그") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "삶은 달걀") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "달걀 생선 필레") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "레몬 아이스크림") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "계란빵") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "이스터 에그") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "스크램블 에그") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "생라면") {
            te("생라면", "체력 재생 +200", "항구(6개), 골목길(6개), 양궁장(5개)의 상자", "일반")
            up("뜨거운 라면", "볶음라면", "냉면", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "약초") {
            te("약초", "체력 재생 +200", "연못(7개), 절(6개), 숲(6개)의 상자", "일반")
            up("약주", "보약", "난초", "탕약", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "초콜렛") {
            name.text = "초콜렛"
            abil.text = "체력 재생 +200"
            exeplan.text = "번화가(6개), 고급 주택가(5개), 양궁장(4개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            for (j in falselist.indices) {
                if (falselist[j].name1 == "초코 우유") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "핫초코") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "초코파이") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "이스터 에그") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "위스키 봉봉") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }

            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "초코 아이스크림") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "초코칩 쿠키") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "초코 우유") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "핫초코") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "초코파이") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "이스터 에그") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "위스키 봉봉") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "카레 가루") {
            te("카레 가루", "체력 재생 +200", "고급 주택가(5개), 공장(5개)의 상자", "일반")
            up("탄두리", "카레빵", "카레", "카레 고로케", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "꿀 바른 대구살") {
            te("꿀 바른 대구살", "체력 재생 +700", "[제작] 꿀 + 대구\n초록색 항공 보급", "고급")
            up("글레이프니르", "", "", "", "")
            down("꿀", "대구", "", "", "")
        }
        if (falselist[i].name1 == "대구 간 통조림") {
            te("대구 간 통조림", "체력 재생 +650", "[제작] 캔 + 대구\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("캔", "대구", "", "", "")
        }
        if (falselist[i].name1 == "마늘빵") {
            te("마늘빵", "체력 재생 +500", "[제작] 빵 + 마늘\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("빵", "마늘", "", "", "")
        }
        if (falselist[i].name1 == "버터") {
            te("버터", "체력 재생 +450", "[제작] 우유 + 나뭇가지\n초록색 항공 보급", "고급")
            up("초코칩 쿠키", "허니버터", "파운드 케이크", "버터 감자구이", "")
            down("우유", "나뭇가지", "", "", "")
        }
        if (falselist[i].name1 == "보약") {
            te("보약", "체력 재생 +650", "[제작] 거븍이 등딱지 + 약초\n초록색 항공 보급", "고급")
            up("대환단", "", "", "", "")
            down("약초", "거북이 등딱지", "", "", "")
        }
        if (falselist[i].name1 == "붕어빵") {
            te("붕어빵", "체력재생 +400", "[제작] 빵 + 붕어\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("빵", "붕어", "", "", "")
        }
        if (falselist[i].name1 == "성수") {
            te("성수", "체력 재생 +600", "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "지혈제") {
            te("지혈제", "체력 재생 +650", "[제작] 알코올 + 반창고\n초록색 항공 보급", "고급")
            up("구급상자", "", "", "", "")
            down("반창고", "알코올", "", "", "")
        }
        if (falselist[i].name1 == "초코파이") {
            te("초코파이", "체력 재생 +600", "[제작] 빵 + 초콜렛\n초록색 항공 보급", "고급")
            up("초코파이 상자", "", "", "", "")
            down("빵", "초콜렛", "", "", "")
        }
        if (falselist[i].name1 == "한방침") {
            te("한방침", "체력 재생 +800", "[제작] 알코올 + 바늘\n초록색 항공 보급", "고급")
            up("대환단", "", "", "", "")
            down("바늘", "알코올", "", "", "")
        }
        if (falselist[i].name1 == "난초") {
            te("난초", "체력 재생 +500", "[제작] 약초 + 꽃\n초록색 항공 보급", "고급")
            up("힐링포션", "", "", "", "")
            down("꽃", "약초", "", "", "")
        }
        if (falselist[i].name1 == "탄두리") {
            te("탄두리", "체력 재생 +600", "[제작] 카레 가루 + 고기\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("카레 가루", "고기", "", "", "")
        }
        if (falselist[i].name1 == "마늘 베이컨 말이") {
            te("마늘 베이컨 말이", "체력 재생 +650", "[제작] 마늘 + 고기\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("마늘", "고기", "", "", "")
        }
        if (falselist[i].name1 == "번") {
            te("번", "체력 재생 +600", "[제작] 빵 + 커피콩\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("빵", "커피콩", "", "", "")
        }
        if (falselist[i].name1 == "햄버거") {
            te("햄버거", "체력 재생 +600", "[제작] 고기 + 빵\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("고기", "빵", "", "", "")
        }
        if (falselist[i].name1 == "감자빵") {
            te("감자빵", "체력 재생 +360", "[제작] 감자 + 빵\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("감자", "빵", "", "", "")
        }
        if (falselist[i].name1 == "감자스프") {
            te("감자스프", "체력 재생 +600", "[제작] 감자 + 우유\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("감자", "우유", "", "", "")
        }
        if (falselist[i].name1 == "달걀 생선 필레") {
            te("달걀 생선 필레", "체력 재생 +700", "[제작] 대구 + 달걀\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("대구", "달걀", "", "", "")
        }
        if (falselist[i].name1 == "시트러스 케이크") {
            te("시트러스 케이크", "체력 재생 +360", "[제작] 레몬 + 빵\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("레몬", "빵", "", "", "")
        }
        if (falselist[i].name1 == "레몬 아이스크림") {
            te("레몬 아이스크림", "체력 재생 +500", "[제작] 레몬 + 달걀\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("레몬", "달걀", "", "", "")
        }
        if (falselist[i].name1 == "마늘 꿀절임") {
            te("마늘 꿀절임", "체력 재생 +480", "[제작] 마늘 + 꿀\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("마늘", "꿀", "", "", "")
        }
        if (falselist[i].name1 == "계란빵") {
            te("계란빵", "체력 재생 +400", "[제작] 달걀 + 빵\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("달걀", "빵", "", "", "")
        }
        if (falselist[i].name1 == "이스터 에그") {
            te("이스터 에그", "체력 재생 +600", "[제작] 달걀 + 초콜렛\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("달걀", "초콜렛", "", "", "")
        }
        if (falselist[i].name1 == "위스키 봉봉") {
            te("위스키 봉봉", "체력 재생 +400", "[제작] 위스키 + 초콜렛\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("위스키", "초콜렛", "", "", "")
        }
        if (falselist[i].name1 == "초코 아이스크림") {
            te("초코 아이스크림", "체력 재생 +550", "[제작] 얼음 + 초콜렛\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("얼음", "초콜렛", "", "", "")
        }
        if (falselist[i].name1 == "카레빵") {
            te("카레빵", "체력 재생 +360", "[제작] 카레 가루 + 빵\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("카레 가루", "빵", "", "", "")
        }
        if (falselist[i].name1 == "매운탕") {
            te("매운탕", "체력 재생 +550", "[제작] 붕어 + 뜨거운 물\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("붕어", "뜨거운 물", "", "", "")
        }
        if (falselist[i].name1 == "감자튀김") {
            te("감자튀김", "체력 재생 +700", "[제작] 감자 + 뜨거운 오일\n파란색 항공 보급", "희귀")
            up("피쉬 앤 칩스", "", "", "", "")
            down("감자", "뜨거운 오일", "", "", "")
        }
        if (falselist[i].name1 == "구운 감자") {
            te("구운 감자", "체력 재생 +600", "[제작] 감자 + 달궈진 돌멩이\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("감자", "달궈진 돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "구운 붕어") {
            te("구운 붕어", "체력 재생 +600", "[제작] 붕어 + 달궈진 돌멩이\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("붕어", "달궈진 돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "메로구이") {
            te("메로구이", "체력 재생 +480", "[제작] 대구 + 달궈진 돌멩이\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("대구", "달궈진 돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "뜨거운 라면") {
            te("뜨거운 라면", "체력 재생 +550", "[제작] 생라면 + 뜨거운 물\n파란색 항공 보급", "희귀")
            up("마늘라면", "", "", "", "")
            down("생라면", "뜨거운 물", "", "", "")
        }
        if (falselist[i].name1 == "모카빵") {
            te("모카빵", "체력 재생 +700", "[제작] 빵 + 커피 리큐르\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("빵", "커피 리큐르", "", "", "")
        }
        if (falselist[i].name1 == "스크램블 에그") {
            te("스크램블 에그", "체력 재생 +550", "[제작] 달걀 + 뜨거운 오일\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("달걀", "뜨거운 오일", "", "", "")
        }
        if (falselist[i].name1 == "초코칩 쿠키") {
            te("초코칩 쿠키", "체력 재생 +733", "[제작] 초콜렛 + 버터\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("초콜렛", "버터", "", "", "")
        }
        if (falselist[i].name1 == "초코파이 상자") {
            te("초코파이 상자", "체력 재생 +733", "[제작]초코파이 + 상자\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("초코파이", "상자", "", "", "")
        }
        if (falselist[i].name1 == "카레") {
            te("카레", "체력 재생 +480", "[제작] 카레 가루 + 뜨거운 물\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("카레 가루", "뜨거운 물", "", "", "")
        }
        if (falselist[i].name1 == "탕약") {
            te("탕약", "체력 재생 +600", "[제작] 약초 + 뜨거운 물\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("약초", "뜨거운 물", "", "", "")
        }
        if (falselist[i].name1 == "허니버터") {
            te("허니버터", "체력 재생 +650", "[제작] 버터 + 꿀\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("버터", "꿀", "", "", "")
        }
        if (falselist[i].name1 == "후라이드 치킨") {
            te("후라이드 치킨", "체력 재생 +510", "[제작] 고기 + 뜨거운 오일\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("고기", "뜨거운 오일", "", "", "")
        }
        if (falselist[i].name1 == "힐링 포션") {
            te("힐링 포션", "체력 재생 +700", "[제작] 난초 + 유리병\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("난초", "유리병", "", "", "")
        }
        if (falselist[i].name1 == "삶은 달걀") {
            te("삶은 달걀", "체력 재생 +600", "[제작] 달걀 + 뜨거운 물\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("달걀", "뜨거운 물", "", "", "")
        }
        if (falselist[i].name1 == "파운드 케이크") {
            te("파운드 케이크", "체력 재생 +600", "[제작] 버터 + 빵\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("버터", "빵", "", "", "")
        }
        if (falselist[i].name1 == "카레 고로케") {
            te("카레 고로케", "체력 재생 +550", "[제작] 카레 가루 + 뜨거운 오일\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("카레 가루", "뜨거운 오일", "", "", "")
        }
        if (falselist[i].name1 == "스테이크") {
            te("스테이크", "체력 재생 +420", "[제작] 고기 + 달궈진 돌멩이 \n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("고기", "달궈진 돌멩이", "", "", "")
        }
        if (falselist[i].name1 == "구급상자") {
            te("구급상자", "체력 재생 +950", "[제작] 지혈제 + 붕대\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("지혈제", "붕대", "", "", "")
        }
        if (falselist[i].name1 == "버터 감자구이") {
            te("버터 감자구이", "체력 재생 +650", "[제작] 감자 + 버터\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("감자", "버터", "", "", "")
        }
        if (falselist[i].name1 == "생선까스") {
            te("생선까스", "체력 재생 +700", "[제작] 대구 + 뜨거운 오일 \n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("대구", "뜨거운 오일", "", "", "")
        }
        if (falselist[i].name1 == "볶음라면") {
            te("볶음라면", "체력 재생 +550", "[제작] 생라면 + 뜨거운 오일\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("생라면", "뜨거운 오일", "", "", "")
        }
        if (falselist[i].name1 == "냉면") {
            te("냉면", "체력 재생 +650", "[제작] 생라면 + 얼음물\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("생라면", "얼음물", "", "", "")
        }
        if (falselist[i].name1 == "대환단") {
            te("대환단", "체력 재생 +900", "[제작]한방침 + 보약\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("한방침", "보약", "", "", "")
        }
        if (falselist[i].name1 == "마늘라면") {
            te("마늘라면", "체력 재생 +700", "[제작] 뜨거운 라면 + 마늘\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("뜨거운 라면", "마늘", "", "", "")
        }
        if (falselist[i].name1 == "피쉬 앤 칩스") {
            te("피쉬 앤 칩스", "체력 재생 +900", "[제작]생선까스 + 감자튀김\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("생선까스", "감자튀김", "", "", "")
        }
        if (falselist[i].name1 == "꿀") {
            name.text = "꿀"
            abil.text = "스태미너 재생 +250"
            exeplan.text = "번화가(6개), 숲(6개), 골목길(5개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            for (j in falselist.indices) {
                if (falselist[j].name1 == "콜라") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "꿀탄 우유") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "꿀물") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "뜨거운 꿀물") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "꿀 바른 대구살") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "마늘 꿀절임") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "허니버터") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "콜라") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "꿀탄 우유") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "꿀물") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "뜨거운 꿀물") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "꿀 바른 대구살") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "물") {
            name.text = "물"
            abil.text = "스태미너 재생 +100"
            exeplan.text = "수원에서 채집"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            for (j in falselist.indices) {
                if (falselist[j].name1 == "소방헬멧") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "뜨거운 물") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "물병") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "소주") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "꿀물") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "얼음물") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "방전 전지") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "독약") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "소방헬멧") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "뜨거운 물") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "물병") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "소주") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "꿀물") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "얼음") {
            name.text = "얼음"
            abil.text = "스태미너 재생 +200"
            exeplan.text = "호텔(7개), 병원(6개), 묘지(5개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            for (j in falselist.indices) {
                if (falselist[j].name1 == "만년빙") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "아이스 커피") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "얼음물") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "온더락") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "정화수") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }

            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "초코 아이스크림") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "빙화현옥수") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "빙백온침") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "만년빙") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "아이스 커피") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "얼음물") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "온더락") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "정화수") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "위스키") {
            name.text = "위스키"
            abil.text = "스태미너 재생 +450"
            exeplan.text = "고급 주택가(5개), 호텔(5개), 성당(4개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            im.isClickable = true
            qkRnrl = -1
            for (j in falselist.indices) {
                if (falselist[j].name1 == "칵테일") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "하이볼") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "온더락") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "카우보이") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "위스키 콕") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "위스키 봉봉") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "칵테일") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "하이볼") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "온더락") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "카우보이") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "위스키 콕") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "커피콩") {
            te("커피콩", "스태미너 재생 +380", "항구(6개), 고급 주택가(5개), 묘지(5개)의 상자", "일반")
            up("아이스 커피", "커피 리큐르", "카페라테", "아메리카노", "번")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "탄산수") {
            te("탄산수", "스태미너 재생 +380", "호텔(5개), 모래사장(5개), 고급 주택가(5개)의 상자", "일반")
            up("레몬에이드", "콜라", "하이볼", "이온 전지", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "우유") {
            name.text = "우유"
            abil.text = "스태미너 재생 +200"
            exeplan.text = "번화가(6개), 병원(5개), 성당(3개)의 상자"
            grade.text = "일반"
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "카페라테") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "꿀탄 우유") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "초코 우유") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "카우보이") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "깔루아 밀크") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "버터") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "감자스프") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "카페라테") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "꿀탄 우유") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "초코 우유") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "카우보이") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "깔루아 밀크") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "뜨거운 물") {
            name.text = "뜨거운 물"
            abil.text = "스태미너 재생 +200"
            exeplan.text = "[제작] 물 + 라이터"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "뜨거운 꿀물") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "아메리카노") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "정화수") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "핫초코") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "매운탕") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                /////////////////////////////////////
                if (falselist[j].name1 == "물") {
                    imadown1.setImageResource(falselist[j].Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "라이터") {
                    imadown2.setImageResource(falselist[j].Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "뜨거운 라면") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "카레") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "탕약") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "삶은 달걀") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "플러버") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "뜨거운 꿀물") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "아메리카노") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "정화수") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "핫초코") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "매운탕") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "레몬에이드") {
            te("레몬에이드", "스태미너 재생 +300", "[제작] 탄산수 + 레몬 \n 초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("탄산수", "레몬", "", "", "")
        }
        if (falselist[i].name1 == "물병") {
            te("물병", "스태미너 재생 +350", "[제작] 물 + 유리병\n" +
                    " 초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("물", "유리병", "", "", "")
        }
        if (falselist[i].name1 == "백주") {
            te("백주", "스태미너 재생 +1000", "[제작] 알코올 + 라이터 \n" +
                    " 초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("알코올", "라이터", "", "", "")
        }
        if (falselist[i].name1 == "소주") {
            te("소주", "스태미너 재생 +350", "[제작] 알코올 + 물 \n" +
                    " 초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("알코올", "물", "", "", "")
        }
        if (falselist[i].name1 == "아이스 커피") {
            te("아이스 커피", "스태미너 재생 +530", "[제작] 얼음 + 커피콩\n" +
                    " 초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("얼음", "커피콩", "", "", "")
        }
        if (falselist[i].name1 == "칵테일") {
            te("칵테일", "스태미너 재생 +300", "[제작] 위스키 + 레몬\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("위스키", "레몬", "", "", "")
        }
        if (falselist[i].name1 == "커피 리큐르") {
            te("커피 리큐르", "스태미너 재생 +530", "[제작] 커피콩 + 알코올\n" +
                    "초록색 항공 보급", "고급")
            up("깔루아 밀크", "모카빵", "", "", "")
            down("커피콩", "알코올", "", "", "")
        }
        if (falselist[i].name1 == "콜라") {
            te("콜라", "스태미너 재생 +400", "[제작] 탄산수 + 꿀\n" +
                    "초록색 항공 보급", "고급")
            up("위스키 콕", "캔 콜라", "연막탄", "", "")
            down("탄산수", "꿀", "", "", "")
        }
        if (falselist[i].name1 == "카페라테") {
            te("카페라테", "스태미너 재생 +530", "[제작] 우유 + 커피콩\n" +
                    "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("우유", "커피콩", "", "", "")
        }
        if (falselist[i].name1 == "꿀탄 우유") {
            te("꿀탄 우유", "스태미너 재생 +530", "[제작] 우유 + 꿀\n" +
                    "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("우유", "꿀", "", "", "")
        }
        if (falselist[i].name1 == "하이볼") {
            te("하이볼", "스태미너 재생 +530", "[제작] 위스키 + 탄산수\n" +
                    "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("위스키", "탄산수", "", "", "")
        }
        if (falselist[i].name1 == "초코 우유") {
            te("초코 우유", "스태미너 재생 +400", "[제작] 초콜렛 + 우유\n" +
                    "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("초콜렛", "우유", "", "", "")
        }
        if (falselist[i].name1 == "꿀물") {
            te("꿀물", "스태미너 재생 +400", "[제작] 꿀 + 물\n" +
                    "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("꿀", "물", "", "", "")
        }
        if (falselist[i].name1 == "얼음물") {
            te("얼음물", "스태미너 재생 +350", "[제작] 얼음 + 물\n" +
                    "초록색 항공 보급", "고급")
            up("냉면", "", "", "", "")
            down("얼음", "물", "", "", "")
        }
        if (falselist[i].name1 == "온더락") {
            te("온더락", "스태미너 재생 +530", "[제작] 얼음 + 위스키 \n" +
                    "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("얼음", "위스키", "", "", "")
        }
        if (falselist[i].name1 == "카우보이") {
            te("카우보이", "스태미너 재생 +530", "[제작] 우유 + 위스키\n" +
                    "초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("우유", "위스키", "", "", "")
        }
        if (falselist[i].name1 == "고량주") {
            te("고량주", "스태미너 재생 +1080", "[제작] 백주 + 라이터\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("백주", "라이터", "", "", "")
        }
        if (falselist[i].name1 == "뜨거운 꿀물") {
            te("뜨거운 꿀물", "스태미너 재생 +1080", "[제작] 뜨거운 물 + 꿀\n" +
                    "파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("뜨거운 물", "꿀", "", "", "")
        }
        if (falselist[i].name1 == "백일취") {
            te("백일취", "스태미너 재생 +500", "[제작] 백주 + 꽃\n" +
                    "파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("백주", "꽃", "", "", "")
        }
        if (falselist[i].name1 == "아메리카노") {
            te("아메리카노", "스태미너 재생 +1080", "[제작] 뜨거운 물 + 커피콩\n" +
                    "파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("뜨거운 물", "커피콩", "", "", "")
        }
        if (falselist[i].name1 == "약주") {
            te("약주", "스태미너 재생 +500", "[제작] 백주 + 약초\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("백주", "약초", "", "", "")
        }
        if (falselist[i].name1 == "위스키 콕") {
            te("위스키 콕", "스태미너 재생 +500", "[제작] 콜라 + 위스키\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("콜라", "위스키", "", "", "")
        }
        if (falselist[i].name1 == "정화수") {
            te("정화수", "스태미너 재생 +1080", "[제작] 뜨거운 물 + 얼음\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("뜨거운 물", "얼음", "", "", "")
        }
        if (falselist[i].name1 == "캔 콜라") {
            te("캔 콜라", "스태미너 재생 +1400", "[제작] 콜라 + 캔\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("콜라", "캔", "", "", "")
        }
        if (falselist[i].name1 == "핫초코") {
            te("핫초코", "스태미너 재생 +450", "[제작] 뜨거운 물 + 초콜렛\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("뜨거운 물", "초콜렛", "", "", "")
        }
        if (falselist[i].name1 == "깔루아 밀크") {
            te("깔루아 밀크", "스태미너 재생 +660", "[제작] 커피 리큐르 + 우유\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("커피 리큐르", "우유", "", "", "")
        }
        if (falselist[i].name1 == "감시 카메라") {
            te("감시 카메라", "근처의 투명한 트랩과 생존자를 드러냅니다.", "항구, 모래사장, 고급 주택가, 번화가, 병원, 양궁장, 묘지, 학교의 상자\n 박쥐, 맷돼지, 들개(사냥)", "일반")
            up("망원 카메라", "", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "올가미") {
            te("올가미", "트랩 발동: 트랩 피해 +10", "항구(6), 연못(6), 모래사장(3), 양궁장(5), 숲(5), 성당(4)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("대나무 트랩", "부비트랩", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "쥐덫") {
            te("쥐덫", "트랩 피해 +50", "연못(5), 모래사장(3), 묘지(6)의 상자\n" +
                    "맷돼지(가끔)를 처치", "")
            up("가시 발판", "개량형 쥐덫", "정글 기요틴", "폭발 트랩", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "피아노선") {
            name.text = "피아노선"
            abil.text = "트랩 피해 +130"
            exeplan.text = "모래사장(6), 고급 주택가(7), 호텔(7), 성당(6)의 상자\n" +
                    "맷돼지(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "전자 부품") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "다이너마이트") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "미스릴 실") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "표창") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "목궁") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "AK-47") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }

                        if (falselist[j].name1 == "쇠뇌") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "전자 부품") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "다이너마이트") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "미스릴 실") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "표창") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "목궁") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "가시 발판") {
            te("가시 발판", "트랩 발동: 대상의 이동속도가 1.5초간 20% 감소합니다.\n" +
                    "트랩 피해 +120", "[제작] 쥐덫 + 못\n초록색 항공 보급", "고급")
            up("폭뢰침", "히든 메이든", "리모트 마인", "", "")
            down("쥐덫", "못", "", "", "")
        }
        if (falselist[i].name1 == "다이너마이트") {
            te("다이너마이트", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                    "트랩 피해 +220", "[제작] 피아노선 + 화약\n초록색 항공 보급", "고급")
            up("RDX", "", "", "", "")
            down("피아노선", "화약", "", "", "")
        }
        if (falselist[i].name1 == "개량형 쥐덫") {
            te("개량형 쥐덫", "트랩 피해 +160", "[제작] 쥐덫 + 철광석\n초록색 항공 보급", "고급")
            up("", "", "", "", "")
            down("철광석", "쥐덫", "", "", "")
        }
        if (falselist[i].name1 == "대나무 트랩") {
            te("대나무 트랩", "트랩 발동: 대상을 0.5초 간 속박합니다.\n" +
                    "트랩 피해 +30", "[제작] 올가미 + 대나무\n초록색 항공 보급", "고급")
            up("펜듈럼 도끼", "", "", "", "")
            down("올가미", "대나무", "", "", "")
        }
        if (falselist[i].name1 == "부비트랩") {
            te("부비트랩", "트랩 발동: 대상을 0.5초 간 속박합니다.\n" +
                    "트랩 피해 +30", "[제작] 올가미 + 접착체\n초록색 항공 보급", "고급")
            up("지뢰", "", "", "", "")
            down("올가미", "접착제", "", "", "")
        }
        if (falselist[i].name1 == "소란 발생기") {
            te("소란 발생기", "트랩 피해 +40", "[제작] 캔 + 쇠구슬\n초록색 항공 보급", "고급")
            up("락커의 자켓", "", "", "", "")
            down("캔", "쇠구슬", "", "", "")
        }
        if (falselist[i].name1 == "망원 카메라") {
            te("망원 카메라", "근처의 투명한 트랩과 생존자를 드러냅니다.", "[제작] 감시 카메라 + 쌍안경, 위클라인(가끔) 처치\n초록색 항공 보급", "고급")
            up("인터벤션", "", "", "", "")
            down("감시 카메라", "쌍안경", "", "", "")
        }
        if (falselist[i].name1 == "정글 기요틴") {
            te("정글 기요틴", "트랩 발동: 대상을 0.5초 간 속박합니다.\n" +
                    "트랩 피해 +100", "[제작] 쥐덫 + 식칼\n초록색 항공 보급", "고급")
            up("더블 기요틴", "히든 메이든", "", "", "")
            down("쥐덫", "식칼", "", "", "")
        }
        if (falselist[i].name1 == "폭발 트랩") {
            te("폭발 트랩", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                    "트랩 피해 +180", "[제작] 쥐덫 + 화약\n초록색 항공 보급", "고급")
            up("화염 트랩", "크레모어", "", "", "")
            down("쥐덫", "화약", "", "", "")
        }
        if (falselist[i].name1 == "지뢰") {
            te("지뢰", "트랩 발동: 좁은 범위로 폭발하며, 피격된 대상은 1초간 기절합니다.\n" +
                    "트랩 피해 +80", "[제작] 부비트랩 + 화약\n 파란색 항공 보급", "희귀")
            up("크레모어", "", "", "", "")
            down("부비트랩", "화약", "", "", "")
        }
        if (falselist[i].name1 == "펜듈럼 도끼") {
            te("펜듈럼 도끼", "트랩 발동: 대상을 0.75초 간 속박합니다\n" +
                    "트랩 피해 +100", "[제작] 대나무 트랩 + 손도끼\n파란색 항공 보급", "희귀")
            up("더블 기요틴", "", "", "", "")
            down("손도끼", "대나무 트랩", "", "", "")
        }
        if (falselist[i].name1 == "RDX") {
            te("RDX", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                    "트랩 피해 +250", "[제작] 다이너마이트 + 고철\n파란색 항공 보급", "희귀")
            up("폭뢰침", "C-4", "스마트 폭탄", "고폭 수류탄", "영광금귀신기노")
            down("다이너마이트", "고철", "", "", "")
        }
        if (falselist[i].name1 == "미스릴 실") {
            te("미스릴 실", "트랩 피해 +300", "[제작] 미스릴 + 피아노선\n파란색 항공 보급", "희귀")
            up("천잠장갑", "", "", "", "")
            down("피아노선", "미스릴", "", "", "")
        }
        if (falselist[i].name1 == "화염 트랩") {
            te("화염 트랩", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                    "트랩 피해 +280", "[제작] 폭발 트랩 + 기름먹인 천\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("폭발 트랩", "기름먹인 천", "", "", "")
        }
        if (falselist[i].name1 == "히든 메이든") {
            te("히든 메이든", "트랩 발동: 대상의 이동속도가 2초간 30% 감소합니다.\n" +
                    "트랩 피해 +300", "[제작] 가시 발판 + 정글 기요틴\n파란색 항공 보급", "희귀")
            up("", "", "", "", "")
            down("가시 발판", "정글 기요틴", "", "", "")
        }
        if (falselist[i].name1 == "폭뢰침") {
            te("폭뢰침", "트랩 발동: 대상의 이동속도가 2.5초간 40% 감소합니다\n" +
                    "트랩 피해 +350", "[제작] RDX + 가시 발판\n보라색 항공 보급", "영웅")
            up("만천화우", "", "", "", "")
            down("RDX", "가시 발판", "", "", "")
        }
        if (falselist[i].name1 == "C-4") {
            te("C-4", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다\n" +
                    "트랩 피해 +340", "[제작] RDX + 백색 가루\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("RDX", "백색 가루", "", "", "")
        }
        if (falselist[i].name1 == "더블 기요틴") {
            te("더블 기요틴", "트랩 발동: 대상을 1초 간 속박합니다.\n" +
                    "트랩 피해 +340", "[제작] 정글 기요틴 + 펜듈럼 도끼\n", "영웅")
            up("", "", "", "", "")
            down("정글 기요틴", "펜듈럼 도끼", "", "", "")
        }
        if (falselist[i].name1 == "크레모어") {
            te("크레모어", "트랩 발동: 좁은 범위로 폭발하며, 피격된 대상은 1초간 기절합니다.\n" +
                    "트랩 피해 +260", "[제작] 지뢰 + 폭발 트랩\n보라색 항공 보급", "영웅")
            up("", "", "", "", "")
            down("지뢰", "항공 보급", "", "", "")
        }
        if (falselist[i].name1 == "리모트 마인") {
            te("리모트 마인", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                    "트랩 피해 +450", "[제작] 포스 코어 + 가시 발판\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("포스 코어", "가시 발판", "", "", "")
        }
        if (falselist[i].name1 == "스마트 폭탄") {
            te("스마트 폭탄", "트랩 발동: 0.7초 후 넓은 범위로 폭발합니다.\n" +
                    "트랩 피해 +370", "[제작] RDX + 휴대폰\n노란색 항공 보급", "전설")
            up("", "", "", "", "")
            down("RDX", "휴대폰", "", "", "")
        }
        if (falselist[i].name1 == "돌멩이") {
            name.text = "돌멩이"
            abil.text = ""
            exeplan.text = "자연 재료 돌 무더기에서 채집"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "안전모") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "유리 조각") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "백색 가루") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "달궈진 돌멩이") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "생명의 가루") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "문스톤") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "새티스팩션") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "안전모") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "유리 조각") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "백색 가루") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "달궈진 돌멩이") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "생명의 가루") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "유리병") {
            te("유리병", "", "항구(7개), 번화가(8개), 성당(6개)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("물병", "유리 조각", "화염병", "힐링 포션", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "못") {
            name.text = "못"
            abil.text = ""
            exeplan.text = "번화가(8개), 양궁장(6개), 공장(7개)의 상자, 박쥐(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "군선") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "가시 발판") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "도깨비 방망이") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "컴포지트 보우") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "샤퍼") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "이천일류") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "가시 탱탱볼") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "소드 스토퍼") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "군선") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "가시 발판") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "도깨비 방망이") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "컴포지트 보우") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "샤퍼") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "가죽") {
            name.text = "가죽"
            abil.text = ""
            exeplan.text = "닭(자주), 박쥐(자주), 들개(항상), 늑대(항상), 곰(항상)을 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "글러브") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "가죽 갑옷") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "가죽 자켓") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "가죽 방패") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "베레타 M92F") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "무릎 보호대") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "사슴 망치") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "검집") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "M16A1") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "전투화") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "글러브") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "가죽 갑옷") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "가죽 자켓") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "가죽 방패") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "베레타  M92F") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "거북이 등딱지") {
            te("거북이 등딱지", "", "항구(7개), 연못(7개), 모래사장(6개)의 상자\n" +
                    "박쥐(가끔)를 처치", "일반")
            up("거북 도복", "가죽 방패", "보약", "귀골 장갑", "뚜언 띠엔")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "고무") {
            name.text = "고무"
            abil.text = ""
            exeplan.text = "항구(8개), 골목길(7개), 양궁장(5개)의 상자\n" +
                    "박쥐(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "잠수복") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "장궁") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "슬링") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "플러버") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "기사단장의 투구") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "노") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "잠수복") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "장궁") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "슬링") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "플러버") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "기사단장의 투구") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "고철") {
            name.text = "고철"
            abil.text = ""
            exeplan.text = "항구(8개), 호텔(8개), 병원(6), 공장(9개)의 상자\n" +
                    "박쥐(가끔), 들개(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "강철") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "철판") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "하이힐") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "눈차크") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "모터") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "RDX") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "강철") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "철판") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "하이힐") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "눈차크") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "모터") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "라이터") {
            name.text = "라이터"
            abil.text = ""
            exeplan.text = "항구(8개), 골목길(8개), 공장(8개), 학교(7개)의 상자\n" +
                    "들개(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "재") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "뜨거운 물") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "뜨거운 오일") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "달궈진 돌멩이") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "백주") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "샴쉬르") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "고량주") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "화전") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "삼매진화") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "재") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "뜨거운 물") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "뜨거운 오일") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "달궈진 돌멩이") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "백주") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "레이저 포인터") {
            name.text = "레이저 포인터"
            abil.text = ""
            exeplan.text = "고급 주택가(6개), 병원(6개), 학교(6개)의 상자\n" +
                    "박쥐(가끔), 들개(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "스프링필드") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "저격 스코프") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "FN57") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "저격궁") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "플라즈마 소드") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "빔 엑스") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "듀랜달 Mk2") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "플라즈마 톤파") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "플라즈마 윔") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "스프링필드") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "저격 스코프") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "FN57") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "저격궁") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "플라즈마 소드") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "마패") {
            te("마패", "", "모래사장(6개), 골목길(7개), 절(7개)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("경찰봉", "챠크람", "티아라", "어사의", "국궁")
            down("", "", "", "", "")
        }

        if (falselist[i].name1 == "배터리") {
            te("배터리", "", "항구(7개), 번화가(8개), 공장(9개)의 상자\n" +
                    "들개(가끔)를 처치", "일반")
            up("방전 전지", "전자 부품", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "알코올") {
            te("알코올", "", "병원(4개), 공장(6개), 학교(5개)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("소주", "백주", "커피 리큐르", "지혈제", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "오일") {
            name.text = "오일"
            abil.text = ""
            exeplan.text = "고급 주택가(7개), 번화가(8개), 양궁장(5개), 공장(7개)의 상자\n" +
                    "박쥐(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "뜨거운 오일") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "기름먹인 천") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "화염병") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "매그넘-파이썬") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "강궁") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "야생마") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "마사무네") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "개틀링건") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "뜨거운 오일") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "기름먹인 천") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "화염병") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "매그넘-파이썬") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "강궁") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "옷감") {
            te("옷감", "", "호텔(7개), 번화가(8개), 절(7개)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("드레스", "덧댄 로브", "덧댄 슬리퍼", "인형", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "원석") {
            te("우너석", "", "연못(10개), 모래사장(9개), 절(8개), 숲(10개)의 상자\n" +
                    "들개(가끔)를 처치", "일반")
            up("황금", "루비", "무라마사", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "접착제") {
            te("접착제", "", "골목길(7개), 병원(6개), 공장(7개)의 상자\n" +
                    "박쥐(가끔)를 처치", "일반")
            up("부비트랩", "유리판", "", "", "")
            down("", "", "", "", "")
        }

        if (falselist[i].name1 == "종이") {
            te("종이", "", "절(7개), 양궁장(7개), 성당(6개)의 상자\n" +
                    "박쥐(가끔)를 처치", "일반")
            up("재", "정교한 도면", "", "", "")
            down("", "", "", "", "")
        }

        if (falselist[i].name1 == "철광석") {
            te("철광석", "", "호텔(7개), 묘지(7개), 숲(7개)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("강철", "아이언 너클", "레이피어", "개량형 쥐덫", "")
            down("", "", "", "", "")
        }

        if (falselist[i].name1 == "캔") {
            te("캔", "", "모래사장(4개), 번화가(6개), 학교(5개)의 상자\n" +
                    "맷돼지(가끔)를 처치", "일반")
            up("대구 간 통조림", "소란 발생기", "캔 콜라", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "화약") {
            name.text = "화약"
            abil.text = ""
            exeplan.text = "절(7개), 양궁장(6개), 묘지(7개)의 상자\n" +
                    "들개(가끔)를 처치"
            grade.text = "일반"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "수류탄") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "다이너마이트") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "폭발 트랩") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "STG-44") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "벽력궁") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "지뢰") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "벽력귀투") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "수류탄") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "다이너마이트") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "폭발 트랩") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "STG-44") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "벽력궁") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "강철") {
            name.text = "강철"
            abil.text = ""
            exeplan.text = "[제작] 고철 + 철광석, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "건틀릿") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "바스타드 소드") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "파이크") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "판금 갑옷") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "대부") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "고철") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "철광석") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "헤비 크로스보우") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "플럼바타") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "강철 방패") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "강철 무릎 보호대") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "매그넘-보아") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "건틀릿") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "바스타드 소드") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "파이크") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "판금 갑옷") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "대부") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "기름먹인 천") {
            te("기름먹인 천", "", "[제작] 오일 + 붕대, 늑대(가끔), 곰(가끔)\n초록색 항공 보급", "고급")
            up("부츠", "횃불", "화염 트랩", "브레이질 건틀릿", "대황")
            down("오일", "붕대", "", "", "")
        }
        if (falselist[i].name1 == "뜨거운 오일") {
            name.text = "뜨거운 오일"
            abil.text = ""
            exeplan.text = "[제작] 라이터 + 오일, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "감자튀김") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "스크램블 에그") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "후라이드 치킨") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "카레 고로케") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "생선까스") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "오일") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "라이터") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "볶음라면") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "감자튀김") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "스크램블 에그") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "후라이드 치킨") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "카레 고로케") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "생선까스") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "루비") {
            name.text = "루비"
            abil.text = ""
            exeplan.text = "[제작] 원석 + 망치, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "진홍 팔찌") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "보검") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "루비 스페셜") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "석양의 갑옷") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "산타 무에르테") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "원석") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "망치") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "블러드윙 너클") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "제국 왕관") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "샤자한의 검집") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "진홍 팔찌") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "보검") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "루비 스페셜") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "석양의 갑옷") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "산타 무에르테") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "방전 전지") {
            te("방전 전지", "", "[제작] 배터리 + 물, 늑대(사냥), 곰(사냥)\n초록색 항공 보급", "고급")
            up("싱글 픽업", "이온 전지", "볼 라이트닝", "벽력편", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "백색 가루") {
            name.text = "백색 가루"
            abil.text = ""
            exeplan.text = "[제작] 분필 + 돌멩이, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "류큐톤파") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "밀가루 폭탄") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "폴라리스") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "소수") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "애각창") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "배터리") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "물") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "플레셋") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "더 월") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "C-4") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "류큐톤파") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "밀가루 폭탄") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "폴라리스") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "소수") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "애각창") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "운석") {
            te("운석", "", "늑대(사냥), 곰(사냥)\n초록색 항공 보급", "고급")
            up("문스톤", "유성검", "원더풀 투나잇", "포스 코어", "카바나")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "재") {
            name.text = "재"
            abil.text = ""
            exeplan.text = "[제작] 종이 + 라이터 , 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "독약") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "회단 장갑") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "파산검") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "마탄의 사수") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "옥전결") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "종이") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "라이터") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "퍼플 헤이즈") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "대소반룡곤") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "스파이의 우산") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "독약") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "회단 장갑") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "파산검") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "마탄의 사수") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "옥전결") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "전자 부품") {
            name.text = "전자 부품"
            abil.text = ""
            exeplan.text = "[제작] 배터리 + 피아노선, 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "모터") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "레일건") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "매버릭 러너") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "휴대폰") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "볼틱레토") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "배터리") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "피아노선") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "전술-OPS 헬멧") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "모터") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "레일건") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "매버릭 러너") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "휴대폰") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "볼틱레토") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "정교한 도면") {
            name.text = "정교한 도면"
            abil.text = ""
            exeplan.text = "[제작] 종이 + 만년필, 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "매그넘-아나콘다") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "피렌체식 쌍검") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "휴대폰") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "모노호시자오") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "Tac-50") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "종이") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "만년필") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "택티컬 톤파") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "월왕구천") {
                            imaup2.setImageResource(falselist.get(j).Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "매그넘-아나콘다") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "피렌체식 쌍검") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "휴대폰") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "모노호시자오") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "Tac-50") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "철판") {
            name.text = "철판"
            abil.text = ""
            exeplan.text = "[제작] 고철 + 망치 , 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "일본도") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "검집") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "탄창") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "철궁") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "바주반드") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "고철") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "망치") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "청룡언월도") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "NTW-20") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "일본도") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "검집") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "탄창") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "철궁") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "바주반드") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "황금") {
            name.text = "황금"
            abil.text = ""
            exeplan.text = "[제작] 원석 + 곡괭이 , 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "골든 브릿지") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "금팔찌") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "금교전") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "뇌룡편") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "왕관") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "원석") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "곡괭이") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "스퀴테") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "골든래쇼 보우") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "루테늄 구슬") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "지휘관의 갑옷") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "황실 부르고넷") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "골든 브릿지") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "금팔찌") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "금교전") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "뇌룡편") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "왕관") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "달궈진 돌멩이") {
            name.text = "달궈진 돌멩이"
            abil.text = ""
            exeplan.text = "[제작] 돌멩이 + 라이터\n초록색 항공 보급"
            grade.text = "고급"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "스테이크") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "구운 붕어") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "메로구이") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "구운 감자") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "탄궁") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "돌멩이") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "라이터") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "낭아봉") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "스테이크") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "구운 붕어") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "메로구이") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "구운 감자") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "탄궁") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "생명의 나무") {
            te("생명의 나무", "", "자연 재료 신비한 나무에서 채집(1일 밤 호텔, 2일 낮 숲, 2일 밤 묘지)\n" +
                    "파란색 항공 보급", "희귀")
            up("생명의 가루", "생사부", "", "", "")
            down("", "", "", "", "")
        }
        if (falselist[i].name1 == "문스톤") {
            name.text = "문스톤"
            abil.text = ""
            exeplan.text = "[제작] 운석 + 돌멩이 , 곰, 늑대, 위클라인 박사\n파란색 항공 보급"
            grade.text = "희귀"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "큐브 워치") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "달빛 펜던트") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "자웅일대검") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "개밥바라기") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "코스믹 바이던트") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
                if (falselist[j].name1 == "운석") {
                    imadown1.setImageResource(falselist.get(j).Image1)
                    downtext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "돌멩이") {
                    imadown2.setImageResource(falselist.get(j).Image1)
                    downtext2.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "사사성광") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "큐브 워치") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "달빛 펜던트") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "자웅일대검") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "개밥바라기") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "코스믹 바이던트") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }

        if (falselist[i].name1 == "독약") {
            te("독약", "", "[제작] 재 + 물, 늑대, 곰\n파란색 항공 보급", "희귀")
            up("독침", "슈뢰딩거의 상자", "푸른색 단도", "", "")
            down("재", "물", "", "", "")
        }

        if (falselist[i].name1 == "모터") {
            te("모터", "", "[제작] 전자 부품 + 고철, 늑대, 곰\n파란색 항공 보급", "희귀")
            up("초진동나이프", "기관총", "타구봉", "초진동눈차크", "")
            down("전자 부품", "고철", "", "", "")
        }
        if (falselist[i].name1 == "미스릴") {
            name.text = "미스릴"
            abil.text = ""
            exeplan.text = "곰, 늑대, 위클라인 박사\n파란색 항공 보급"
            grade.text = "희귀"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "미스릴 실") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "주와이외즈") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "미스릴 갑옷") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "미스릴 투구") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "미스릴 부츠") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "미스릴 방패") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "미스릴 실") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "주와이외즈") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "미스릴 갑옷") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "미스릴 투구") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "미스릴 부츠") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "유리판") {
            te("유리판", "", "[제작] 유리 조각 + 접착제, 늑대, 곰\n파란색 항공 보급", "희귀")
            up("광학미채 슈트", "AK-12", "레이더", "", "")
            down("유리 조각", "접착제", "", "", "")
        }
        if (falselist[i].name1 == "이온 전지") {
            te("이온 전지", "", "[제작] 방전 전지 + 탄산수 늑대, 곰\n파란색 항공 보급", "희귀")
            up("디오스쿠로이", "일렉트론 블라스터", "미치광이왕의 카드", "토르의 망치", "장팔사모")
            down("방전 전지", "탄산수", "", "", "")
        }
        if (falselist[i].name1 == "VF 혈액 샘플") {
            name.text = "VF 혈액 샘플"
            abil.text = ""
            exeplan.text = "곰, 위클라인 박사\n파란색 항공 보급"
            grade.text = "희귀"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "변검") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "퀸 오브 하트") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "분홍신") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "다인슬라이프") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "롱기누스의 창") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "페일노트") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        imaup2.setImageResource(0)
                        uptext2.text = ""
                        imaup3.setImageResource(0)
                        uptext3.text = ""
                        imaup4.setImageResource(0)
                        uptext4.text = ""
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "변검") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "퀸 오브 하트") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "분홍신") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "다인슬라이프") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "롱기누스의 창") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
        if (falselist[i].name1 == "휴대폰") {
            te("휴대폰", "", "[제작] 정교한 도면 + 전자 부품, 늑대, 곰\n파란색 항공 보급", "희귀")
            up("바이탈 센서", "스마트 폭탄", "", "", "")
            down("정교한 도면", "전자 부품", "", "", "")
        }
        if (falselist[i].name1 == "포스 코어") {
            name.text = "포스 코어"
            abil.text = ""
            exeplan.text = "[제작] 생명의 가루 + 운석, 곰(사냥), 늑대(사냥)\n파란색 항공 보급"
            grade.text = "희귀"
            im.isClickable = true
            im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "오토-암즈") {
                    imaup1.setImageResource(falselist[j].Image1)
                    uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "헤르메스의 부츠") {
                    imaup2.setImageResource(falselist[j].Image1)
                    uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "에메랄드 타블렛") {
                    imaup3.setImageResource(falselist[j].Image1)
                    uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "리모트 마인") {
                    imaup4.setImageResource(falselist[j].Image1)
                    uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "프라가라흐") {
                    imaup5.setImageResource(falselist[j].Image1)
                    uptext5.text = falselist[j].name1
                }
            }
            im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "여의봉") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "수다르사나") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "샤릉가") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "악켈테") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        imaup5.setImageResource(0)
                        uptext5.text = ""
                    }
                    im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                    qkRnrl *= -1
                } else {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "오토-암즈") {
                            imaup1.setImageResource(falselist[j].Image1)
                            uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "헤르메스의 부츠") {
                            imaup2.setImageResource(falselist[j].Image1)
                            uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "에메랄드 타블렛") {
                            imaup3.setImageResource(falselist[j].Image1)
                            uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "리모트 마인") {
                            imaup4.setImageResource(falselist[j].Image1)
                            uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "프라가라흐") {
                            imaup5.setImageResource(falselist[j].Image1)
                            uptext5.text = falselist[j].name1
                        }
                    }
                    im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
    }

}
