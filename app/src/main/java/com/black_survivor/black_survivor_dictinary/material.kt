package com.example.black_survivor_dictinary

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

class material(val material_Item: ArrayList<material_Item_list>) : RecyclerView.Adapter<material.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): material.ViewHolder {

        var item = item_in(parent.context)
        
        var rnqns: Int = 0
        var qkRnrl: Int = -1
        var qkRnrl2:Int = -1
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        val aview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_popup, null)
        val bview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_imsi, null)


        val dlg = Dialog(parent.context)
        dlg.setContentView(item.aview)
        

        val imsi: ImageView = bview.findViewById(R.id.imaging)
        val noimage: ImageView = bview.findViewById(R.id.imaging2)
        noimage.setImageResource(0)
       
        fun materialarray(i:Int) {
            if (material_Item[i].name1 == "돌멩이") {
            item.name.text = "돌멩이"
            item.abil.text = ""
            item.exeplan.text = "자연 재료 돌 무더기에서 채집"
            item.grade.text = "일반"
            item.im.isClickable = true
            item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
            qkRnrl = -1

            for (j in falselist.indices) {
                if (falselist[j].name1 == "안전모") {
                    item.imaup1.setImageResource(falselist[j].Image1)
                    item.uptext1.text = falselist[j].name1
                }
                if (falselist[j].name1 == "유리 조각") {
                    item.imaup2.setImageResource(falselist[j].Image1)
                    item.uptext2.text = falselist[j].name1
                }
                if (falselist[j].name1 == "백색 가루") {
                    item.imaup3.setImageResource(falselist[j].Image1)
                    item.uptext3.text = falselist[j].name1
                }
                if (falselist[j].name1 == "달궈진 돌멩이") {
                    item.imaup4.setImageResource(falselist[j].Image1)
                    item.uptext4.text = falselist[j].name1
                }
                if (falselist[j].name1 == "생명의 가루") {
                    item.imaup5.setImageResource(falselist[j].Image1)
                    item.uptext5.text = falselist[j].name1
                }
            }
            item.im.setOnClickListener() {
                if (qkRnrl == -1) {
                    for (j in falselist.indices) {
                        if (falselist[j].name1 == "문스톤") {
                            item.imaup1.setImageResource(falselist[j].Image1)
                            item.uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "새티스팩션") {
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
                        if (falselist[j].name1 == "안전모") {
                            item.imaup1.setImageResource(falselist[j].Image1)
                            item.uptext1.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "유리 조각") {
                            item.imaup2.setImageResource(falselist[j].Image1)
                            item.uptext2.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "백색 가루") {
                            item.imaup3.setImageResource(falselist[j].Image1)
                            item.uptext3.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "달궈진 돌멩이") {
                            item.imaup4.setImageResource(falselist[j].Image1)
                            item.uptext4.text = falselist[j].name1
                        }
                        if (falselist[j].name1 == "생명의 가루") {
                            item.imaup5.setImageResource(falselist[j].Image1)
                            item.uptext5.text = falselist[j].name1
                        }
                    }
                    item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                    qkRnrl *= -1
                }
            }
        }
            if (material_Item[i].name1 == "유리병") {
                item.te("유리병", "", "항구(7개), 번화가(8개), 성당(6개)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("물병", "유리 조각", "화염병", "힐링 포션", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "못") {
                item.name.text = "못"
                item.abil.text = ""
                item.exeplan.text = "번화가(8개), 양궁장(6개), 공장(7개)의 상자, 박쥐(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "군선") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "가시 발판") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "도깨비 방망이") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "컴포지트 보우") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "샤퍼") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "이천일류") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "가시 탱탱볼") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "소드 스토퍼") {
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
                            if (falselist[j].name1 == "군선") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "가시 발판") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "도깨비 방망이") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "컴포지트 보우") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "샤퍼") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "가죽") {
                item.name.text = "가죽"
                item.abil.text = ""
                item.exeplan.text = "닭(자주), 박쥐(자주), 들개(항상), 늑대(항상), 곰(항상)을 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "글러브") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "가죽 갑옷") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "가죽 자켓") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "가죽 방패") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "베레타 M92F") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "무릎 보호대") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "사슴 망치") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "검집") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "M16A1") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "전투화") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "글러브") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "가죽 갑옷") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "가죽 자켓") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "가죽 방패") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "베레타  M92F") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (material_Item[i].name1 == "거북이 등딱지") {
                item.te("거북이 등딱지", "", "항구(7개), 연못(7개), 모래사장(6개)의 상자\n" +
                        "박쥐(가끔)를 처치", "일반")
                item.up("거북 도복", "가죽 방패", "보약", "귀골 장갑", "뚜언 띠엔")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "고무") {
                item.name.text = "고무"
                item.abil.text = ""
                item.exeplan.text = "항구(8개), 골목길(7개), 양궁장(5개)의 상자\n" +
                        "박쥐(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "잠수복") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "장궁") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "슬링") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "플러버") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "기사단장의 투구") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "노") {
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
                            if (falselist[j].name1 == "잠수복") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "장궁") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "슬링") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "플러버") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "기사단장의 투구") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "고철") {
                item.name.text = "고철"
                item.abil.text = ""
                item.exeplan.text = "항구(8개), 호텔(8개), 병원(6), 공장(9개)의 상자\n" +
                        "박쥐(가끔), 들개(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "강철") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "철판") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "하이힐") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "눈차크") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "모터") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "RDX") {
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
                            if (falselist[j].name1 == "강철") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "철판") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "하이힐") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "눈차크") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "모터") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "라이터") {
                item.name.text = "라이터"
                item.abil.text = ""
                item.exeplan.text = "항구(8개), 골목길(8개), 공장(8개), 학교(7개)의 상자\n" +
                        "들개(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "재") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "뜨거운 물") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "뜨거운 오일") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "달궈진 돌멩이") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "백주") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "샴쉬르") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "고량주") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "화전") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "삼매진화") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "재") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "뜨거운 물") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "뜨거운 오일") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "달궈진 돌멩이") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "백주") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "레이저 포인터") {
                item.name.text = "레이저 포인터"
                item.abil.text = ""
                item.exeplan.text = "고급 주택가(6개), 병원(6개), 학교(6개)의 상자\n" +
                        "박쥐(가끔), 들개(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "스프링필드") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "저격 스코프") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "FN57") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "저격궁") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "플라즈마 소드") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "빔 엑스") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "듀랜달 Mk2") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "플라즈마 톤파") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "플라즈마 윔") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "스프링필드") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "저격 스코프") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "FN57") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "저격궁") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "플라즈마 소드") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (material_Item[i].name1 == "마패") {
                item.te("마패", "", "모래사장(6개), 골목길(7개), 절(7개)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("경찰봉", "챠크람", "티아라", "어사의", "국궁")
                item.down("", "", "", "", "")
            }

            if (material_Item[i].name1 == "배터리") {
                item.te("배터리", "", "항구(7개), 번화가(8개), 공장(9개)의 상자\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("방전 전지", "전자 부품", "", "", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "알코올") {
                item.te("알코올", "", "병원(4개), 공장(6개), 학교(5개)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("소주", "백주", "커피 리큐르", "지혈제", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "오일") {
                item.name.text = "오일"
                item.abil.text = ""
                item.exeplan.text = "고급 주택가(7개), 번화가(8개), 양궁장(5개), 공장(7개)의 상자\n" +
                        "박쥐(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "뜨거운 오일") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "기름먹인 천") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "화염병") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "매그넘-파이썬") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "강궁") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "야생마") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "마사무네") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "개틀링건") {
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
                            if (falselist[j].name1 == "뜨거운 오일") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "기름먹인 천") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "화염병") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "매그넘-파이썬") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "강궁") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "옷감") {
                item.te("옷감", "", "호텔(7개), 번화가(8개), 절(7개)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("드레스", "덧댄 로브", "덧댄 슬리퍼", "인형", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "원석") {
                item.te("우너석", "", "연못(10개), 모래사장(9개), 절(8개), 숲(10개)의 상자\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("황금", "루비", "무라마사", "", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "접착제") {
                item.te("접착제", "", "골목길(7개), 병원(6개), 공장(7개)의 상자\n" +
                        "박쥐(가끔)를 처치", "일반")
                item.up("부비트랩", "유리판", "", "", "")
                item.down("", "", "", "", "")
            }

            if (material_Item[i].name1 == "종이") {
                item.te("종이", "", "절(7개), 양궁장(7개), 성당(6개)의 상자\n" +
                        "박쥐(가끔)를 처치", "일반")
                item.up("재", "정교한 도면", "", "", "")
                item.down("", "", "", "", "")
            }

            if (material_Item[i].name1 == "철광석") {
                item.te("철광석", "", "호텔(7개), 묘지(7개), 숲(7개)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("강철", "아이언 너클", "레이피어", "개량형 쥐덫", "")
                item.down("", "", "", "", "")
            }

            if (material_Item[i].name1 == "캔") {
                item.te("캔", "", "모래사장(4개), 번화가(6개), 학교(5개)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("대구 간 통조림", "소란 발생기", "캔 콜라", "", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "화약") {
                item.name.text = "화약"
                item.abil.text = ""
                item.exeplan.text = "절(7개), 양궁장(6개), 묘지(7개)의 상자\n" +
                        "들개(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "수류탄") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "다이너마이트") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "폭발 트랩") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "STG-44") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "벽력궁") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "지뢰") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "벽력귀투") {
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
                            if (falselist[j].name1 == "수류탄") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "다이너마이트") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "폭발 트랩") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "STG-44") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "벽력궁") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "강철") {
                item.name.text = "강철"
                item.abil.text = ""
                item.exeplan.text = "[제작] 고철 + 철광석, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "건틀릿") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "바스타드 소드") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "파이크") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "판금 갑옷") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "대부") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "고철") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "철광석") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "헤비 크로스보우") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "플럼바타") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "강철 방패") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "강철 무릎 보호대") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "매그넘-보아") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "건틀릿") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "바스타드 소드") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "파이크") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "판금 갑옷") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "대부") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (material_Item[i].name1 == "기름먹인 천") {
                item.te("기름먹인 천", "", "[제작] 오일 + 붕대, 늑대(가끔), 곰(가끔)\n초록색 항공 보급", "고급")
                item.up("부츠", "횃불", "화염 트랩", "브레이질 건틀릿", "대황")
                item.down("오일", "붕대", "", "", "")
            }
            if (material_Item[i].name1 == "뜨거운 오일") {
                item.name.text = "뜨거운 오일"
                item.abil.text = ""
                item.exeplan.text = "[제작] 라이터 + 오일, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "감자튀김") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "스크램블 에그") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "후라이드 치킨") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "카레 고로케") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "생선까스") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "오일") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "라이터") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "볶음라면") {
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
                            if (falselist[j].name1 == "감자튀김") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "스크램블 에그") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "후라이드 치킨") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "카레 고로케") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "생선까스") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "루비") {
                item.name.text = "루비"
                item.abil.text = ""
                item.exeplan.text = "[제작] 원석 + 망치, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "진홍 팔찌") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "보검") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "루비 스페셜") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "석양의 갑옷") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "산타 무에르테") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "원석") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "망치") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "블러드윙 너클") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "제국 왕관") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "샤자한의 검집") {
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
                            if (falselist[j].name1 == "진홍 팔찌") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "보검") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "루비 스페셜") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "석양의 갑옷") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "산타 무에르테") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "방전 전지") {
                item.te("방전 전지", "", "[제작] 배터리 + 물, 늑대(사냥), 곰(사냥)\n초록색 항공 보급", "고급")
                item.up("싱글 픽업", "이온 전지", "볼 라이트닝", "벽력편", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "백색 가루") {
                item.name.text = "백색 가루"
                item.abil.text = ""
                item.exeplan.text = "[제작] 분필 + 돌멩이, 늑대(사냥), 곰(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "류큐톤파") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "밀가루 폭탄") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "폴라리스") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "소수") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "애각창") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "배터리") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "물") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "플레셋") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "더 월") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "C-4") {
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
                            if (falselist[j].name1 == "류큐톤파") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "밀가루 폭탄") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "폴라리스") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "소수") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "애각창") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "운석") {
                item.te("운석", "", "늑대(사냥), 곰(사냥)\n초록색 항공 보급", "고급")
                item.up("문스톤", "유성검", "원더풀 투나잇", "포스 코어", "카바나")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "재") {
                item.name.text = "재"
                item.abil.text = ""
                item.exeplan.text = "[제작] 종이 + 라이터 , 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "독약") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "회단 장갑") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "파산검") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "마탄의 사수") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "옥전결") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "종이") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "라이터") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "퍼플 헤이즈") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "대소반룡곤") {
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
                            if (falselist[j].name1 == "독약") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "회단 장갑") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "파산검") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "마탄의 사수") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "옥전결") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "전자 부품") {
                item.name.text = "전자 부품"
                item.abil.text = ""
                item.exeplan.text = "[제작] 배터리 + 피아노선, 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "모터") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "레일건") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "매버릭 러너") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "휴대폰") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "볼틱레토") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "배터리") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "피아노선") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "전술-OPS 헬멧") {
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
                            if (falselist[j].name1 == "모터") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "레일건") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "매버릭 러너") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "휴대폰") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "볼틱레토") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "정교한 도면") {
                item.name.text = "정교한 도면"
                item.abil.text = ""
                item.exeplan.text = "[제작] 종이 + 만년필, 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "매그넘-아나콘다") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "피렌체식 쌍검") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "휴대폰") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "모노호시자오") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "Tac-50") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "종이") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "만년필") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "택티컬 톤파") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "월왕구천") {
                                item.imaup2.setImageResource(falselist.get(j).Image1)
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
                            if (falselist[j].name1 == "매그넘-아나콘다") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "피렌체식 쌍검") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "휴대폰") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "모노호시자오") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "Tac-50") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "철판") {
                item.name.text = "철판"
                item.abil.text = ""
                item.exeplan.text = "[제작] 고철 + 망치 , 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "일본도") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "검집") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "탄창") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "철궁") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "바주반드") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "고철") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "망치") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "청룡언월도") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "NTW-20") {
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
                            if (falselist[j].name1 == "일본도") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "검집") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "탄창") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "철궁") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "바주반드") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "황금") {
                item.name.text = "황금"
                item.abil.text = ""
                item.exeplan.text = "[제작] 원석 + 곡괭이 , 곰(사냥), 늑대(사냥)\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "골든 브릿지") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "금팔찌") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "금교전") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "뇌룡편") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "왕관") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "원석") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "곡괭이") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "스퀴테") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "골든래쇼 보우") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "루테늄 구슬") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "지휘관의 갑옷") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "황실 부르고넷") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "골든 브릿지") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "금팔찌") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "금교전") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "뇌룡편") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "왕관") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "달궈진 돌멩이") {
                item.name.text = "달궈진 돌멩이"
                item.abil.text = ""
                item.exeplan.text = "[제작] 돌멩이 + 라이터\n초록색 항공 보급"
                item.grade.text = "고급"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "스테이크") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "구운 붕어") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "메로구이") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "구운 감자") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "탄궁") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "돌멩이") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "라이터") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "낭아봉") {
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
                            if (falselist[j].name1 == "스테이크") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "구운 붕어") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "메로구이") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "구운 감자") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "탄궁") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (material_Item[i].name1 == "생명의 나무") {
                item.te("생명의 나무", "", "자연 재료 신비한 나무에서 채집(1일 밤 호텔, 2일 낮 숲, 2일 밤 묘지)\n" +
                        "파란색 항공 보급", "희귀")
                item.up("생명의 가루", "생사부", "", "", "")
                item.down("", "", "", "", "")
            }
            if (material_Item[i].name1 == "문스톤") {
                item.name.text = "문스톤"
                item.abil.text = ""
                item.exeplan.text = "[제작] 운석 + 돌멩이 , 곰, 늑대, 위클라인 박사\n파란색 항공 보급"
                item.grade.text = "희귀"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "큐브 워치") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "달빛 펜던트") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "자웅일대검") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "개밥바라기") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "코스믹 바이던트") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "운석") {
                        item.imadown1.setImageResource(falselist.get(j).Image1)
                        item.downtext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "돌멩이") {
                        item.imadown2.setImageResource(falselist.get(j).Image1)
                        item.downtext2.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "사사성광") {
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
                            if (falselist[j].name1 == "큐브 워치") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "달빛 펜던트") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "자웅일대검") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "개밥바라기") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "코스믹 바이던트") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (material_Item[i].name1 == "독약") {
                item.te("독약", "", "[제작] 재 + 물, 늑대, 곰\n파란색 항공 보급", "희귀")
                item.up("독침", "슈뢰딩거의 상자", "푸른색 단도", "스파이의 우산", "")
                item.down("재", "물", "", "", "")
            }

            if (material_Item[i].name1 == "모터") {
                item.te("모터", "", "[제작] 전자 부품 + 고철, 늑대, 곰\n파란색 항공 보급", "희귀")
                item.up("초진동나이프", "기관총", "타구봉", "초진동눈차크", "")
                item.down("전자 부품", "고철", "", "", "")
            }
            if (material_Item[i].name1 == "미스릴") {
                item.name.text = "미스릴"
                item.abil.text = ""
                item.exeplan.text = "곰, 늑대, 위클라인 박사\n파란색 항공 보급"
                item.grade.text = "희귀"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "미스릴 실") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "주와이외즈") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "미스릴 갑옷") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "미스릴 투구") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "미스릴 부츠") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "미스릴 방패") {
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
                            if (falselist[j].name1 == "미스릴 실") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "주와이외즈") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "미스릴 갑옷") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "미스릴 투구") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "미스릴 부츠") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "유리판") {
                item.te("유리판", "", "[제작] 유리 조각 + 접착제, 늑대, 곰\n파란색 항공 보급", "희귀")
                item.up("광학미채 슈트", "AK-12", "레이더", "", "")
                item.down("유리 조각", "접착제", "", "", "")
            }
            if (material_Item[i].name1 == "이온 전지") {
                item.te("이온 전지", "", "[제작] 방전 전지 + 탄산수 늑대, 곰\n파란색 항공 보급", "희귀")
                item.up("디오스쿠로이", "일렉트론 블라스터", "미치광이왕의 카드", "토르의 망치", "장팔사모")
                item.down("방전 전지", "탄산수", "", "", "")
            }
            if (material_Item[i].name1 == "VF 혈액 샘플") {
                item.name.text = "VF 혈액 샘플"
                item.abil.text = ""
                item.exeplan.text = "곰, 위클라인 박사\n파란색 항공 보급"
                item.grade.text = "희귀"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "변검") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "퀸 오브 하트") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "분홍신") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "다인슬라이프") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "롱기누스의 창") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "페일노트") {
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
                            if (falselist[j].name1 == "변검") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "퀸 오브 하트") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "분홍신") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "다인슬라이프") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "롱기누스의 창") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (material_Item[i].name1 == "휴대폰") {
                item.te("휴대폰", "", "[제작] 정교한 도면 + 전자 부품, 늑대, 곰\n파란색 항공 보급", "희귀")
                item.up("바이탈 센서", "스마트 폭탄", "", "", "")
                item.down("정교한 도면", "전자 부품", "", "", "")
            }
            if (material_Item[i].name1 == "포스 코어") {
                item.name.text = "포스 코어"
                item.abil.text = ""
                item.exeplan.text = "[제작] 생명의 가루 + 운석, 곰(사냥), 늑대(사냥)\n파란색 항공 보급"
                item.grade.text = "희귀"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "오토-암즈") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "헤르메스의 부츠") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "에메랄드 타블렛") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "리모트 마인") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "프라가라흐") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "여의봉") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "수다르사나") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "샤릉가") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "악켈테") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            item.imaup5.setImageResource(0)
                            item.uptext5.text = ""
                        }
                        item.im.text = ("상위 아이템2 (터치 시 상위 아이템1로 변경)")
                        qkRnrl *= -1
                    } else {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "오토-암즈") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "헤르메스의 부츠") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "에메랄드 타블렛") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "리모트 마인") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "프라가라흐") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
        }

        return material.ViewHolder(view).apply {
            imagebutton1.setOnClickListener()
            {
                item.reset()
                val curpos: Int = adapterPosition
                for (i in material_Item.indices) {
                    if (curpos == i) {
                        item.ImageView1.setImageResource(material_Item[i].Image1)
                        Log.d("확인", i.toString())

                        materialarray(i)

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


    override fun onBindViewHolder(holder: material.ViewHolder, position: Int) {
        holder.imagebutton1.setImageResource(material_Item.get(position).Image1)
        holder.name1.text = material_Item.get(position).name1.toString()
    }

    override fun getItemCount(): Int { //아이템리스트 코틀린의 사이즈 리턴.
        return material_Item.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name1 = itemView.findViewById<TextView>(R.id.name1)
        val imagebutton1 = itemView.findViewById<ImageButton>(R.id.imagebutton1)
    }

    class material_Item_list(val name1: String, val Image1: Int) {
    }
}