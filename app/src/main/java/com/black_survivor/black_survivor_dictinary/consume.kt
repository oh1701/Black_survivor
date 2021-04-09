package com.black_survivor.black_survivor_dictinary

import android.app.Dialog
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class consume(val consume_Item: ArrayList<consume_Item_list>) : RecyclerView.Adapter<consume.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): consume.ViewHolder {
        var rnqns: Int = 0
        var qkRnrl: Int = -1
        var qkRnrl2: Int = -1
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        val aview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_popup, null)
        val bview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_imsi, null)

        val dlg = Dialog(parent.context)
        
        var item = item_in(parent.context)

        dlg.setContentView(item.aview)

        val imsi: ImageView = bview.findViewById(R.id.imaging)
        val noimage: ImageView = bview.findViewById(R.id.imaging2)
        noimage.setImageResource(0)
        
        fun consumearray(i: Int) {
            if (consume_Item[i].name1 == "감자") {
            item.te("감자", "체력 재생 +130", "감자 덩굴에서 채집", "일반")
            item.up("감자빵", "감자스프", "감자튀김", "구운 감자", "버터 감자구이")
            item.down("", "", "", "", "")
        }
            
            if (consume_Item[i].name1 == "대구") {
                item.te("대구", "체력 재생 +130", "바다 낚시(모래사장, 고급 주택가, 항구)에서 채집", "일반")
                item.up("꿀 바른 대구살", "대구 간 통조림", "매운탕", "메로구이", "생선까스")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "레몬") {
                item.te("레몬", "체력 재생", "호텔(6개), 고급 주택가(5개), 병원(4개)의 상자", "일반")
                item.up("레몬에이드", "칵테일", "시트러스 케이크", "레몬 아이스크림", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "마늘") {
                item.te("마늘", "체력 재생 +200", "골목길(6개), 절(6개), 묘지(5개)의 상자", "일반")
                item.up("마늘빵", "마늘 베이컨 말이", "마늘 꿀절임", "마늘라면", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "반창고") {
                item.te("반창고", "체력 재생 +320", "병원(4개)의 상자", "일반")
                item.up("지혈제", "", "", "", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "붕어") {
                item.te("붕어", "체력 재생 +130", "민물 낚시에서 채집", "일반")
                item.up("붕어빵", "구운 붕어", "달걀 생선 필레", "", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "빵") {
                item.name.text = "빵"
                item.abil.text = "체력 재생 +275"
                item.exeplan.text = "학교(6개), 성당(4개), 항구(4개)의 상자"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                item.im.isClickable = true
                qkRnrl = -1
                qkRnrl2 = -1
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "마늘빵") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "붕어빵") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "초코파이") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "번") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "햄버거") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1 && qkRnrl2 == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "감자빵") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "시트러스 케이크") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "계란빵") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "카레빵") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "모카빵") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템3으로 변경)")
                        qkRnrl *= -1
                    } else if (qkRnrl == 1 && qkRnrl2 == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "파운드 케이크") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            item.imaup2.setImageResource(0)
                            item.uptext2.text = ""
                            item.imaup3.setImageResource(0)
                            item.uptext3.text = ""
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템3 (터치 시 상위 아이템1로 변경)")
                        qkRnrl2 *= -1
                    } else if (qkRnrl == 1 && qkRnrl2 == 1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "마늘빵") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "붕어빵") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "초코파이") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "번") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "햄버거") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                        qkRnrl2 *= -1
                    }
                }
            }

            if (consume_Item[i].name1 == "고기") {
                item.te("고기", "체력 재생 +200", "닭, 멧돼지, 늑대, 곰을 처치", "일반")
                item.up("탄두리", "마늘 베이컨 말이", "햄버거", "후라이드 치킨", "스테이크")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "달걀") {
                item.name.text = "달걀"
                item.abil.text = "체력 재생 +200"
                item.exeplan.text = "묘지(6개), 양궁장(5개), 숲(5개)의 상자"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                item.im.isClickable = true
                qkRnrl = -1
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "달걀 생선 필레") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "레몬 아이스크림") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "계란빵") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "이스터 에그") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "스크램블 에그") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "삶은 달걀") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            item.imaup2.setImageResource(0)
                            item.uptext2.text = ""
                            item.imaup3.setImageResource(0)
                            item.uptext3.text = ""
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "달걀 생선 필레") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "레몬 아이스크림") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "계란빵") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "이스터 에그") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "스크램블 에그") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (consume_Item[i].name1 == "생라면") {
                item.te("생라면", "체력 재생 +275", "항구(6개), 골목길(6개), 양궁장(5개)의 상자", "일반")
                item.up("뜨거운 라면", "볶음라면", "냉면", "", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "약초") {
                item.te("약초", "체력 재생 +300", "연못(7개), 절(6개), 숲(6개)의 상자", "일반")
                item.up("약주", "보약", "난초", "탕약", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "초콜렛") {
                item.name.text = "초콜렛"
                item.abil.text = "체력 재생 +275"
                item.exeplan.text = "번화가(6개), 고급 주택가(5개), 양궁장(4개)의 상자"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "초코 우유") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "핫초코") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "초코파이") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "이스터 에그") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "위스키 봉봉") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }

                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "초코 아이스크림") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "초코칩 쿠키") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            item.imaup3.setImageResource(0)
                            item.uptext3.text = ""
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "초코 우유") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "핫초코") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "초코파이") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "이스터 에그") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "위스키 봉봉") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (consume_Item[i].name1 == "카레 가루") {
                item.te("카레 가루", "체력 재생 +200", "고급 주택가(5개), 공장(5개)의 상자", "일반")
                item.up("탄두리", "카레빵", "카레", "카레 고로케", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "꿀 바른 대구살") {
                item.te("꿀 바른 대구살", "체력 재생 +700", "[제작] 꿀 + 대구\n초록색 항공 보급", "고급")
                item.up("글레이프니르", "", "", "", "")
                item.down("꿀", "대구", "", "", "")
            }
            if (consume_Item[i].name1 == "대구 간 통조림") {
                item.te("대구 간 통조림", "체력 재생 +650", "[제작] 캔 + 대구\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("캔", "대구", "", "", "")
            }
            if (consume_Item[i].name1 == "마늘빵") {
                item.te("마늘빵", "체력 재생 +500", "[제작] 빵 + 마늘\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("빵", "마늘", "", "", "")
            }
            if (consume_Item[i].name1 == "버터") {
                item.te("버터", "체력 재생 +450", "[제작] 우유 + 나뭇가지\n초록색 항공 보급", "고급")
                item.up("초코칩 쿠키", "허니버터", "파운드 케이크", "버터 감자구이", "")
                item.down("우유", "나뭇가지", "", "", "")
            }
            if (consume_Item[i].name1 == "보약") {
                item.te("보약", "체력 재생 +650", "[제작] 거븍이 등딱지 + 약초\n초록색 항공 보급", "고급")
                item.up("대환단", "", "", "", "")
                item.down("약초", "거북이 등딱지", "", "", "")
            }
            if (consume_Item[i].name1 == "붕어빵") {
                item.te("붕어빵", "체력재생 +400", "[제작] 빵 + 붕어\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("빵", "붕어", "", "", "")
            }
            if (consume_Item[i].name1 == "성수") {
                item.te("성수", "체력 재생 +600", "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "지혈제") {
                item.te("지혈제", "체력 재생 +650", "[제작] 알코올 + 반창고\n초록색 항공 보급", "고급")
                item.up("구급상자", "", "", "", "")
                item.down("반창고", "알코올", "", "", "")
            }
            if (consume_Item[i].name1 == "초코파이") {
                item.te("초코파이", "체력 재생 +600", "[제작] 빵 + 초콜렛\n초록색 항공 보급", "고급")
                item.up("초코파이 상자", "", "", "", "")
                item.down("빵", "초콜렛", "", "", "")
            }
            if (consume_Item[i].name1 == "한방침") {
                item.te("한방침", "체력 재생 +800", "[제작] 알코올 + 바늘\n초록색 항공 보급", "고급")
                item.up("대환단", "", "", "", "")
                item.down("바늘", "알코올", "", "", "")
            }
            if (consume_Item[i].name1 == "난초") {
                item.te("난초", "체력 재생 +480", "[제작] 약초 + 꽃\n초록색 항공 보급", "고급")
                item.up("힐링포션", "", "", "", "")
                item.down("꽃", "약초", "", "", "")
            }
            if (consume_Item[i].name1 == "탄두리") {
                item.te("탄두리", "체력 재생 +600", "[제작] 카레 가루 + 고기\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("카레 가루", "고기", "", "", "")
            }
            if (consume_Item[i].name1 == "마늘 베이컨 말이") {
                item.te("마늘 베이컨 말이", "체력 재생 +650", "[제작] 마늘 + 고기\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("마늘", "고기", "", "", "")
            }
            if (consume_Item[i].name1 == "번") {
                item.te("번", "체력 재생 +650", "[제작] 빵 + 커피콩\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("빵", "커피콩", "", "", "")
            }
            if (consume_Item[i].name1 == "햄버거") {
                item.te("햄버거", "체력 재생 +600", "[제작] 고기 + 빵\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("고기", "빵", "", "", "")
            }
            if (consume_Item[i].name1 == "감자빵") {
                item.te("감자빵", "체력 재생 +360", "[제작] 감자 + 빵\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("감자", "빵", "", "", "")
            }
            if (consume_Item[i].name1 == "감자스프") {
                item.te("감자스프", "체력 재생 +600", "[제작] 감자 + 우유\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("감자", "우유", "", "", "")
            }
            if (consume_Item[i].name1 == "달걀 생선 필레") {
                item.te("달걀 생선 필레", "체력 재생 +700", "[제작] 붕어 + 달걀\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("붕어", "달걀", "", "", "")
            }
            if (consume_Item[i].name1 == "시트러스 케이크") {
                item.te("시트러스 케이크", "체력 재생 +380", "[제작] 레몬 + 빵\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("레몬", "빵", "", "", "")
            }
            if (consume_Item[i].name1 == "레몬 아이스크림") {
                item.te("레몬 아이스크림", "체력 재생 +500", "[제작] 레몬 + 달걀\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("레몬", "달걀", "", "", "")
            }
            if (consume_Item[i].name1 == "마늘 꿀절임") {
                item.te("마늘 꿀절임", "체력 재생 +480", "[제작] 마늘 + 꿀\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("마늘", "꿀", "", "", "")
            }
            if (consume_Item[i].name1 == "계란빵") {
                item.te("계란빵", "체력 재생 +400", "[제작] 달걀 + 빵\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("달걀", "빵", "", "", "")
            }
            if (consume_Item[i].name1 == "이스터 에그") {
                item.te("이스터 에그", "체력 재생 +600", "[제작] 달걀 + 초콜렛\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("달걀", "초콜렛", "", "", "")
            }
            if (consume_Item[i].name1 == "위스키 봉봉") {
                item.te("위스키 봉봉", "체력 재생 +400", "[제작] 위스키 + 초콜렛\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("위스키", "초콜렛", "", "", "")
            }
            if (consume_Item[i].name1 == "초코 아이스크림") {
                item.te("초코 아이스크림", "체력 재생 +550", "[제작] 얼음 + 초콜렛\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("얼음", "초콜렛", "", "", "")
            }
            if (consume_Item[i].name1 == "카레빵") {
                item.te("카레빵", "체력 재생 +450", "[제작] 카레 가루 + 빵\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("카레 가루", "빵", "", "", "")
            }
            if (consume_Item[i].name1 == "매운탕") {
                item.te("매운탕", "체력 재생 +550", "[제작] 대구 + 뜨거운 물\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("대구", "뜨거운 물", "", "", "")
            }
            if (consume_Item[i].name1 == "감자튀김") {
                item.te("감자튀김", "체력 재생 +700", "[제작] 감자 + 뜨거운 오일\n파란색 항공 보급", "희귀")
                item.up("피쉬 앤 칩스", "", "", "", "")
                item.down("감자", "뜨거운 오일", "", "", "")
            }
            if (consume_Item[i].name1 == "구운 감자") {
                item.te("구운 감자", "체력 재생 +600", "[제작] 감자 + 달궈진 돌멩이\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("감자", "달궈진 돌멩이", "", "", "")
            }
            if (consume_Item[i].name1 == "구운 붕어") {
                item.te("구운 붕어", "체력 재생 +600", "[제작] 붕어 + 달궈진 돌멩이\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("붕어", "달궈진 돌멩이", "", "", "")
            }
            if (consume_Item[i].name1 == "메로구이") {
                item.te("메로구이", "체력 재생 +480", "[제작] 대구 + 달궈진 돌멩이\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("대구", "달궈진 돌멩이", "", "", "")
            }
            if (consume_Item[i].name1 == "뜨거운 라면") {
                item.te("뜨거운 라면", "체력 재생 +550", "[제작] 생라면 + 뜨거운 물\n파란색 항공 보급", "희귀")
                item.up("마늘라면", "", "", "", "")
                item.down("생라면", "뜨거운 물", "", "", "")
            }
            if (consume_Item[i].name1 == "모카빵") {
                item.te("모카빵", "체력 재생 +700", "[제작] 빵 + 커피 리큐르\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("빵", "커피 리큐르", "", "", "")
            }
            if (consume_Item[i].name1 == "스크램블 에그") {
                item.te("스크램블 에그", "체력 재생 +550", "[제작] 달걀 + 뜨거운 오일\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("달걀", "뜨거운 오일", "", "", "")
            }
            if (consume_Item[i].name1 == "초코칩 쿠키") {
                item.te("초코칩 쿠키", "체력 재생 +733", "[제작] 초콜렛 + 버터\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("초콜렛", "버터", "", "", "")
            }
            if (consume_Item[i].name1 == "초코파이 상자") {
                item.te("초코파이 상자", "체력 재생 +733", "[제작]초코파이 + 상자\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("초코파이", "상자", "", "", "")
            }
            if (consume_Item[i].name1 == "카레") {
                item.te("카레", "체력 재생 +550", "[제작] 카레 가루 + 뜨거운 물\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("카레 가루", "뜨거운 물", "", "", "")
            }
            if (consume_Item[i].name1 == "탕약") {
                item.te("탕약", "체력 재생 +600", "[제작] 약초 + 뜨거운 물\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("약초", "뜨거운 물", "", "", "")
            }
            if (consume_Item[i].name1 == "허니버터") {
                item.te("허니버터", "체력 재생 +650", "[제작] 버터 + 꿀\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("버터", "꿀", "", "", "")
            }
            if (consume_Item[i].name1 == "후라이드 치킨") {
                item.te("후라이드 치킨", "체력 재생 +510", "[제작] 고기 + 뜨거운 오일\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("고기", "뜨거운 오일", "", "", "")
            }
            if (consume_Item[i].name1 == "힐링 포션") {
                item.te("힐링 포션", "체력 재생 +700", "[제작] 난초 + 유리병\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("난초", "유리병", "", "", "")
            }
            if (consume_Item[i].name1 == "삶은 달걀") {
                item.te("삶은 달걀", "체력 재생 +600", "[제작] 달걀 + 뜨거운 물\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("달걀", "뜨거운 물", "", "", "")
            }
            if (consume_Item[i].name1 == "파운드 케이크") {
                item.te("파운드 케이크", "체력 재생 +600", "[제작] 버터 + 빵\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("버터", "빵", "", "", "")
            }
            if (consume_Item[i].name1 == "카레 고로케") {
                item.te("카레 고로케", "체력 재생 +600", "[제작] 카레 가루 + 뜨거운 오일\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("카레 가루", "뜨거운 오일", "", "", "")
            }
            if (consume_Item[i].name1 == "스테이크") {
                item.te("스테이크", "체력 재생 +420", "[제작] 고기 + 달궈진 돌멩이 \n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("고기", "달궈진 돌멩이", "", "", "")
            }
            if (consume_Item[i].name1 == "구급상자") {
                item.te("구급상자", "체력 재생 +950", "[제작] 지혈제 + 붕대\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("지혈제", "붕대", "", "", "")
            }
            if (consume_Item[i].name1 == "버터 감자구이") {
                item.te("버터 감자구이", "체력 재생 +650", "[제작] 감자 + 버터\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("감자", "버터", "", "", "")
            }
            if (consume_Item[i].name1 == "생선까스") {
                item.te("생선까스", "체력 재생 +700", "[제작] 대구 + 뜨거운 오일 \n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("대구", "뜨거운 오일", "", "", "")
            }
            if (consume_Item[i].name1 == "볶음라면") {
                item.te("볶음라면", "체력 재생 +600", "[제작] 생라면 + 뜨거운 오일\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("생라면", "뜨거운 오일", "", "", "")
            }
            if (consume_Item[i].name1 == "냉면") {
                item.te("냉면", "체력 재생 +650", "[제작] 생라면 + 얼음물\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("생라면", "얼음물", "", "", "")
            }
            if (consume_Item[i].name1 == "대환단") {
                item.te("대환단", "체력 재생 +900", "[제작]한방침 + 보약\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("한방침", "보약", "", "", "")
            }
            if (consume_Item[i].name1 == "마늘라면") {
                item.te("마늘라면", "체력 재생 +700", "[제작] 뜨거운 라면 + 마늘\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("뜨거운 라면", "마늘", "", "", "")
            }
            if (consume_Item[i].name1 == "피쉬 앤 칩스") {
                item.te("피쉬 앤 칩스", "체력 재생 +920", "[제작]생선까스 + 감자튀김\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("생선까스", "감자튀김", "", "", "")
            }
            if (consume_Item[i].name1 == "꿀") {
                item.name.text = "꿀"
                item.abil.text = "스태미너 재생 +250"
                item.exeplan.text = "번화가(6개), 숲(6개), 골목길(5개)의 상자"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "콜라") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "꿀탄 우유") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "꿀물") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "뜨거운 꿀물") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "꿀 바른 대구살") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "마늘 꿀절임") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "허니버터") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            item.imaup3.setImageResource(0)
                            item.uptext3.text = ""
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "콜라") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "꿀탄 우유") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "꿀물") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "뜨거운 꿀물") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "꿀 바른 대구살") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (consume_Item[i].name1 == "물") {
                item.name.text = "물"
                item.abil.text = "스태미너 재생 +200"
                item.exeplan.text = "수원에서 채집"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "소방헬멧") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "뜨거운 물") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "물병") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "소주") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "꿀물") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "얼음물") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "방전 전지") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "독약") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "소방헬멧") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "뜨거운 물") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "물병") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "소주") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "꿀물") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (consume_Item[i].name1 == "얼음") {
                item.name.text = "얼음"
                item.abil.text = "스태미너 재생 +200"
                item.exeplan.text = "호텔(7개), 병원(7개), 묘지(7개)의 상자"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "만년빙") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "아이스 커피") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "얼음물") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "온더락") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "정화수") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }

                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "초코 아이스크림") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "빙화현옥수") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "빙백온침") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "만년빙") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "아이스 커피") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "얼음물") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "온더락") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "정화수") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (consume_Item[i].name1 == "위스키") {
                item.name.text = "위스키"
                item.abil.text = "스태미너 재생 +450"
                item.exeplan.text = "고급 주택가(5개), 호텔(5개), 성당(4개)의 상자"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                item.im.isClickable = true
                qkRnrl = -1
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "칵테일") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "하이볼") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "온더락") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "카우보이") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "위스키 콕") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "위스키 봉봉") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            item.imaup2.setImageResource(0)
                            item.uptext2.text = ""
                            item.imaup3.setImageResource(0)
                            item.uptext3.text = ""
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "칵테일") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "하이볼") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "온더락") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "카우보이") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "위스키 콕") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (consume_Item[i].name1 == "커피콩") {
                item.te("커피콩", "스태미너 재생 +380", "항구(6개), 고급 주택가(5개), 묘지(5개)의 상자", "일반")
                item.up("아이스 커피", "커피 리큐르", "카페라테", "아메리카노", "번")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "탄산수") {
                item.te("탄산수", "스태미너 재생 +380", "호텔(5개), 모래사장(5개), 고급 주택가(5개)의 상자", "일반")
                item.up("레몬에이드", "콜라", "하이볼", "이온 전지", "")
                item.down("", "", "", "", "")
            }
            if (consume_Item[i].name1 == "우유") {
                item.name.text = "우유"
                item.abil.text = "스태미너 재생 +200"
                item.exeplan.text = "번화가(6개), 병원(5개), 성당(3개)의 상자"
                item.grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "카페라테") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "꿀탄 우유") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "초코 우유") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "카우보이") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "깔루아 밀크") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "버터") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "감자스프") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            item.imaup3.setImageResource(0)
                            item.uptext3.text = ""
                            item.imaup4.setImageResource(0)
                            item.uptext4.text = ""
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "카페라테") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "꿀탄 우유") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "초코 우유") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "카우보이") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "깔루아 밀크") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (consume_Item[i].name1 == "뜨거운 물") {
                item.name.text = "뜨거운 물"
                item.abil.text = "스태미너 재생 +350"
                item.exeplan.text = "[제작] 물 + 라이터"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "뜨거운 꿀물") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "아메리카노") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "정화수") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "핫초코") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "매운탕") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    /////////////////////////////////////
                    if (falselist[j].name1 == "물") {
                        item.imadown1.setImageResource(falselist[j].Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "라이터") {
                        item.imadown2.setImageResource(falselist[j].Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "뜨거운 라면") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "카레") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "탕약") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "삶은 달걀") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "플러버") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "뜨거운 꿀물") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "아메리카노") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "정화수") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "핫초코") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "매운탕") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (consume_Item[i].name1 == "레몬에이드") {
                item.te("레몬에이드", "스태미너 재생 +300", "[제작] 탄산수 + 레몬 \n 초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("탄산수", "레몬", "", "", "")
            }
            if (consume_Item[i].name1 == "물병") {
                item.te("물병", "스태미너 재생 +350", "[제작] 물 + 유리병\n" +
                        " 초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("물", "유리병", "", "", "")
            }
            if (consume_Item[i].name1 == "백주") {
                item.te("백주", "스태미너 재생 +1000", "[제작] 알코올 + 라이터 \n" +
                        " 초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("알코올", "라이터", "", "", "")
            }
            if (consume_Item[i].name1 == "소주") {
                item.te("소주", "스태미너 재생 +400", "[제작] 알코올 + 물 \n" +
                        " 초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("알코올", "물", "", "", "")
            }
            if (consume_Item[i].name1 == "아이스 커피") {
                item.te("아이스 커피", "스태미너 재생 +550", "[제작] 얼음 + 커피콩\n" +
                        " 초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("얼음", "커피콩", "", "", "")
            }
            if (consume_Item[i].name1 == "칵테일") {
                item.te("칵테일", "스태미너 재생 +300", "[제작] 위스키 + 레몬\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("위스키", "레몬", "", "", "")
            }
            if (consume_Item[i].name1 == "커피 리큐르") {
                item.te("커피 리큐르", "스태미너 재생 +530", "[제작] 커피콩 + 알코올\n" +
                        "초록색 항공 보급", "고급")
                item.up("깔루아 밀크", "모카빵", "", "", "")
                item.down("커피콩", "알코올", "", "", "")
            }
            if (consume_Item[i].name1 == "콜라") {
                item.te("콜라", "스태미너 재생 +400", "[제작] 탄산수 + 꿀\n" +
                        "초록색 항공 보급", "고급")
                item.up("위스키 콕", "캔 콜라", "연막탄", "", "")
                item.down("탄산수", "꿀", "", "", "")
            }
            if (consume_Item[i].name1 == "카페라테") {
                item.te("카페라테", "스태미너 재생 +530", "[제작] 우유 + 커피콩\n" +
                        "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("우유", "커피콩", "", "", "")
            }
            if (consume_Item[i].name1 == "꿀탄 우유") {
                item.te("꿀탄 우유", "스태미너 재생 +530", "[제작] 우유 + 꿀\n" +
                        "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("우유", "꿀", "", "", "")
            }
            if (consume_Item[i].name1 == "하이볼") {
                item.te("하이볼", "스태미너 재생 +530", "[제작] 위스키 + 탄산수\n" +
                        "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("위스키", "탄산수", "", "", "")
            }
            if (consume_Item[i].name1 == "초코 우유") {
                item.te("초코 우유", "스태미너 재생 +400", "[제작] 초콜렛 + 우유\n" +
                        "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("초콜렛", "우유", "", "", "")
            }
            if (consume_Item[i].name1 == "꿀물") {
                item.te("꿀물", "스태미너 재생 +400", "[제작] 꿀 + 물\n" +
                        "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("꿀", "물", "", "", "")
            }
            if (consume_Item[i].name1 == "얼음물") {
                item.te("얼음물", "스태미너 재생 +350", "[제작] 얼음 + 물\n" +
                        "초록색 항공 보급", "고급")
                item.up("냉면", "", "", "", "")
                item.down("얼음", "물", "", "", "")
            }
            if (consume_Item[i].name1 == "온더락") {
                item.te("온더락", "스태미너 재생 +530", "[제작] 얼음 + 위스키 \n" +
                        "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("얼음", "위스키", "", "", "")
            }
            if (consume_Item[i].name1 == "카우보이") {
                item.te("카우보이", "스태미너 재생 +530", "[제작] 우유 + 위스키\n" +
                        "초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("우유", "위스키", "", "", "")
            }
            if (consume_Item[i].name1 == "고량주") {
                item.te("고량주", "스태미너 재생 +1080", "[제작] 백주 + 라이터\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("백주", "라이터", "", "", "")
            }
            if (consume_Item[i].name1 == "뜨거운 꿀물") {
                item.te("뜨거운 꿀물", "스태미너 재생 +1080", "[제작] 뜨거운 물 + 꿀\n" +
                        "파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("뜨거운 물", "꿀", "", "", "")
            }
            if (consume_Item[i].name1 == "백일취") {
                item.te("백일취", "스태미너 재생 +500", "[제작] 백주 + 꽃\n" +
                        "파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("백주", "꽃", "", "", "")
            }
            if (consume_Item[i].name1 == "아메리카노") {
                item.te("아메리카노", "스태미너 재생 +1080", "[제작] 뜨거운 물 + 커피콩\n" +
                        "파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("뜨거운 물", "커피콩", "", "", "")
            }
            if (consume_Item[i].name1 == "약주") {
                item.te("약주", "스태미너 재생 +500", "[제작] 백주 + 약초\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("백주", "약초", "", "", "")
            }
            if (consume_Item[i].name1 == "위스키 콕") {
                item.te("위스키 콕", "스태미너 재생 +500", "[제작] 콜라 + 위스키\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("콜라", "위스키", "", "", "")
            }
            if (consume_Item[i].name1 == "정화수") {
                item.te("정화수", "스태미너 재생 +1080", "[제작] 뜨거운 물 + 얼음\n파란색 항공 보급", "희귀")
                item.up("요명월", "", "", "", "")
                item.down("뜨거운 물", "얼음", "", "", "")
            }
            if (consume_Item[i].name1 == "캔 콜라") {
                item.te("캔 콜라", "스태미너 재생 +1400", "[제작] 콜라 + 캔\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("콜라", "캔", "", "", "")
            }
            if (consume_Item[i].name1 == "핫초코") {
                item.te("핫초코", "스태미너 재생 +500", "[제작] 뜨거운 물 + 초콜렛\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("뜨거운 물", "초콜렛", "", "", "")
            }
            if (consume_Item[i].name1 == "깔루아 밀크") {
                item.te("깔루아 밀크", "스태미너 재생 +700", "[제작] 커피 리큐르 + 우유\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("커피 리큐르", "우유", "", "", "")
            }
        }

        return consume.ViewHolder(view).apply {
            imagebutton1.setOnClickListener()
            {
                item.reset()
                val curpos: Int = adapterPosition
                for (i in consume_Item.indices) {
                    if (curpos == i) {
                        item.ImageView1.setImageResource(consume_Item[i].Image1)
                        Log.d("확인", i.toString())

                        consumearray(i)

                        item.grade()

                        dlg.show()
                    }
                }
                item.imaup1.setOnClickListener() {
                    if (item.imaup1.drawable != null) {

                        val drawable1: Drawable = item.imaup1.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }
                    }
                }

                item.imaup2.setOnClickListener() {
                    if (item.imaup2.drawable != null) {
                        val drawable1: Drawable = item.imaup2.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }
                    }
                }
                item.imaup3.setOnClickListener() {
                    if (item.imaup3.drawable != null) {

                        val drawable1: Drawable = item.imaup3.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }
                    }
                }
                item.imaup4.setOnClickListener() {
                    if (item.imaup4.drawable != null) {

                        val drawable1: Drawable = item.imaup4.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }
                    }
                }
                item.imaup5.setOnClickListener() {
                    if (item.imaup5.drawable != null) {

                        val drawable1: Drawable = item.imaup5.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }
                    }
                }
                //이후 하위아이템
                item.imadown1.setOnClickListener() {
                    if (item.imadown1.drawable != null) {
                        val drawable1: Drawable = item.imadown1.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }

                    }
                }

                item.imadown2.setOnClickListener() {
                    if (item.imadown2.drawable != null) {
                        val drawable1: Drawable = item.imadown2.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }

                    }
                }
                item.imadown3.setOnClickListener() {
                    if (item.imadown3.drawable != null) {
                        val drawable1: Drawable = item.imadown3.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()


                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }

                    }
                }
                item.imadown4.setOnClickListener() {
                    if (item.imadown4.drawable != null) {
                        val drawable1: Drawable = item.imadown4.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()


                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }

                    }
                }
                item.imadown5.setOnClickListener() {
                    if (item.imadown5.drawable != null) {
                        val drawable1: Drawable = item.imadown5.drawable
                        val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                        val bitmap: Bitmap = bitmapdrawable1.bitmap

                        item.reset()

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)

                                    item.ima_tex_clear()
                                    //item.falsearray
                                    item.falsearray(j)

                                    item.grade()

                                    break
                                }
                            }
                        }

                    }
                }
            }
        }
    }

    override fun onBindViewHolder(holder: consume.ViewHolder, position: Int) {
        holder.imagebutton1.setImageResource(consume_Item.get(position).Image1)
        holder.name1.text = consume_Item.get(position).name1.toString()
    }

    override fun getItemCount(): Int { //아이템리스트 코틀린의 사이즈 리턴.
        return consume_Item.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name1 = itemView.findViewById<TextView>(R.id.name1)
        val imagebutton1 = itemView.findViewById<ImageButton>(R.id.imagebutton1)
        }

    class consume_Item_list(val name1: String, val Image1: Int) {
    }
}
