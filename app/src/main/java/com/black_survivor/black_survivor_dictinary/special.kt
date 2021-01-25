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


class special(val special_Item: ArrayList<special_Item_list>) : RecyclerView.Adapter<special.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): special.ViewHolder {

        var rnqns: Int = 0
        var qkRnrl: Int = -1
        var qkRnrl2:Int = -1
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        val aview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_popup, null)
        val bview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_imsi, null)

        var item = item_in(parent.context)

        val dlg = Dialog(parent.context)
        dlg.setContentView(item.aview)


        val imsi: ImageView = bview.findViewById(R.id.imaging)
        val noimage: ImageView = bview.findViewById(R.id.imaging2)
        noimage.setImageResource(0)

        fun specialarray(i:Int){
            if (special_Item[i].name1 == "감시 카메라") {
            item.te("감시 카메라", "근처의 투명한 트랩과 생존자를 드러냅니다.", "항구, 모래사장, 고급 주택가, 번화가, 병원, 양궁장, 묘지, 학교의 상자\n 박쥐, 맷돼지, 들개(사냥)", "일반")
            item.up("망원 카메라", "", "", "", "")
            item.down("", "", "", "", "")
        }
            if (special_Item[i].name1 == "올가미") {
                item.te("올가미", "트랩 발동: 트랩 피해 +10", "항구(6), 연못(6), 모래사장(3), 양궁장(5), 숲(5), 성당(4)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("대나무 트랩", "부비트랩", "", "", "")
                item.down("", "", "", "", "")
            }
            if (special_Item[i].name1 == "쥐덫") {
                item.te("쥐덫", "트랩 피해 +50", "연못(5), 모래사장(3), 묘지(6)의 상자\n" +
                        "맷돼지(가끔)를 처치", "")
                item.up("가시 발판", "개량형 쥐덫", "정글 기요틴", "폭발 트랩", "")
                item.down("", "", "", "", "")
            }
            if (special_Item[i].name1 == "피아노선") {
                item.name.text = "피아노선"
                item.abil.text = "트랩 피해 +130"
                item.exeplan.text = "모래사장(6), 고급 주택가(7), 호텔(7), 성당(6)의 상자\n" +
                        "맷돼지(가끔)를 처치"
                item.grade.text = "일반"
                item.im.isClickable = true
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                qkRnrl = -1

                for (j in falselist.indices) {
                    if (falselist[j].name1 == "전자 부품") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "다이너마이트") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "미스릴 실") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "표창") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "목궁") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "AK-47") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }

                            if (falselist[j].name1 == "쇠뇌") {
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
                            if (falselist[j].name1 == "전자 부품") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "다이너마이트") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "미스릴 실") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "표창") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "목궁") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (special_Item[i].name1 == "가시 발판") {
                item.te("가시 발판", "트랩 발동: 대상의 이동속도가 1.5초간 20% 감소합니다.\n" +
                        "트랩 피해 +120", "[제작] 쥐덫 + 못\n초록색 항공 보급", "고급")
                item.up("폭뢰침", "히든 메이든", "리모트 마인", "", "")
                item.down("쥐덫", "못", "", "", "")
            }
            if (special_Item[i].name1 == "다이너마이트") {
                item.te("다이너마이트", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                        "트랩 피해 +220", "[제작] 피아노선 + 화약\n초록색 항공 보급", "고급")
                item.up("RDX", "", "", "", "")
                item.down("피아노선", "화약", "", "", "")
            }
            if (special_Item[i].name1 == "개량형 쥐덫") {
                item.te("개량형 쥐덫", "트랩 피해 +160", "[제작] 쥐덫 + 철광석\n초록색 항공 보급", "고급")
                item.up("", "", "", "", "")
                item.down("철광석", "쥐덫", "", "", "")
            }
            if (special_Item[i].name1 == "대나무 트랩") {
                item.te("대나무 트랩", "트랩 발동: 대상을 0.5초 간 속박합니다.\n" +
                        "트랩 피해 +30", "[제작] 올가미 + 대나무\n초록색 항공 보급", "고급")
                item.up("펜듈럼 도끼", "", "", "", "")
                item.down("올가미", "대나무", "", "", "")
            }
            if (special_Item[i].name1 == "부비트랩") {
                item.te("부비트랩", "트랩 발동: 대상을 0.5초 간 속박합니다.\n" +
                        "트랩 피해 +30", "[제작] 올가미 + 접착체\n초록색 항공 보급", "고급")
                item.up("지뢰", "", "", "", "")
                item.down("올가미", "접착제", "", "", "")
            }
            if (special_Item[i].name1 == "소란 발생기") {
                item.te("소란 발생기", "트랩 피해 +40", "[제작] 캔 + 쇠구슬\n초록색 항공 보급", "고급")
                item.up("락커의 자켓", "", "", "", "")
                item.down("캔", "쇠구슬", "", "", "")
            }
            if (special_Item[i].name1 == "망원 카메라") {
                item.te("망원 카메라", "근처의 투명한 트랩과 생존자를 드러냅니다.", "[제작] 감시 카메라 + 쌍안경, 위클라인(가끔) 처치\n초록색 항공 보급", "고급")
                item.up("인터벤션", "", "", "", "")
                item.down("감시 카메라", "쌍안경", "", "", "")
            }
            if (special_Item[i].name1 == "정글 기요틴") {
                item.te("정글 기요틴", "트랩 발동: 대상을 0.5초 간 속박합니다.\n" +
                        "트랩 피해 +100", "[제작] 쥐덫 + 식칼\n초록색 항공 보급", "고급")
                item.up("더블 기요틴", "히든 메이든", "", "", "")
                item.down("쥐덫", "식칼", "", "", "")
            }
            if (special_Item[i].name1 == "폭발 트랩") {
                item.te("폭발 트랩", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                        "트랩 피해 +180", "[제작] 쥐덫 + 화약\n초록색 항공 보급", "고급")
                item.up("화염 트랩", "크레모어", "", "", "")
                item.down("쥐덫", "화약", "", "", "")
            }
            if (special_Item[i].name1 == "지뢰") {
                item.te("지뢰", "트랩 발동: 좁은 범위로 폭발하며, 피격된 대상은 1초간 기절합니다.\n" +
                        "트랩 피해 +80", "[제작] 부비트랩 + 화약\n 파란색 항공 보급", "희귀")
                item.up("크레모어", "", "", "", "")
                item.down("부비트랩", "화약", "", "", "")
            }
            if (special_Item[i].name1 == "펜듈럼 도끼") {
                item.te("펜듈럼 도끼", "트랩 발동: 대상을 0.75초 간 속박합니다\n" +
                        "트랩 피해 +100", "[제작] 대나무 트랩 + 손도끼\n파란색 항공 보급", "희귀")
                item.up("더블 기요틴", "", "", "", "")
                item.down("손도끼", "대나무 트랩", "", "", "")
            }
            if (special_Item[i].name1 == "RDX") {
                item.te("RDX", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                        "트랩 피해 +250", "[제작] 다이너마이트 + 고철\n파란색 항공 보급", "희귀")
                item.up("폭뢰침", "C-4", "스마트 폭탄", "고폭 수류탄", "영광금귀신기노")
                item.down("다이너마이트", "고철", "", "", "")
            }
            if (special_Item[i].name1 == "미스릴 실") {
                item.te("미스릴 실", "트랩 피해 +300", "[제작] 미스릴 + 피아노선\n파란색 항공 보급", "희귀")
                item.up("천잠장갑", "", "", "", "")
                item.down("피아노선", "미스릴", "", "", "")
            }
            if (special_Item[i].name1 == "화염 트랩") {
                item.te("화염 트랩", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                        "트랩 피해 +280", "[제작] 폭발 트랩 + 기름먹인 천\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("폭발 트랩", "기름먹인 천", "", "", "")
            }
            if (special_Item[i].name1 == "히든 메이든") {
                item.te("히든 메이든", "트랩 발동: 대상의 이동속도가 2초간 30% 감소합니다.\n" +
                        "트랩 피해 +300", "[제작] 가시 발판 + 정글 기요틴\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("가시 발판", "정글 기요틴", "", "", "")
            }
            if (special_Item[i].name1 == "폭뢰침") {
                item.te("폭뢰침", "트랩 발동: 대상의 이동속도가 2.5초간 40% 감소합니다\n" +
                        "트랩 피해 +350", "[제작] RDX + 가시 발판\n보라색 항공 보급", "영웅")
                item.up("만천화우", "", "", "", "")
                item.down("RDX", "가시 발판", "", "", "")
            }
            if (special_Item[i].name1 == "C-4") {
                item.te("C-4", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다\n" +
                        "트랩 피해 +340", "[제작] RDX + 백색 가루\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("RDX", "백색 가루", "", "", "")
            }
            if (special_Item[i].name1 == "더블 기요틴") {
                item.te("더블 기요틴", "트랩 발동: 대상을 1초 간 속박합니다.\n" +
                        "트랩 피해 +340", "[제작] 정글 기요틴 + 펜듈럼 도끼\n", "영웅")
                item.up("", "", "", "", "")
                item.down("정글 기요틴", "펜듈럼 도끼", "", "", "")
            }
            if (special_Item[i].name1 == "크레모어") {
                item.te("크레모어", "트랩 발동: 좁은 범위로 폭발하며, 피격된 대상은 1초간 기절합니다.\n" +
                        "트랩 피해 +260", "[제작] 지뢰 + 폭발 트랩\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("지뢰", "항공 보급", "", "", "")
            }
            if (special_Item[i].name1 == "리모트 마인") {
                item.te("리모트 마인", "트랩 발동: 1.5초 후 넓은 범위로 폭발합니다.\n" +
                        "트랩 피해 +450", "[제작] 포스 코어 + 가시 발판\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("포스 코어", "가시 발판", "", "", "")
            }
            if (special_Item[i].name1 == "스마트 폭탄") {
                item.te("스마트 폭탄", "트랩 발동: 0.7초 후 넓은 범위로 폭발합니다.\n" +
                        "트랩 피해 +370", "[제작] RDX + 휴대폰\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("RDX", "휴대폰", "", "", "")
            }
            
        }

        return special.ViewHolder(view).apply {
            imagebutton1.setOnClickListener()
            {
                item.reset()
                val curpos: Int = adapterPosition
                for (i in special_Item.indices) {
                    if (curpos == i) {
                        item.ImageView1.setImageResource(special_Item[i].Image1)
                        Log.d("확인", i.toString())

                        specialarray(i)
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
    override fun onBindViewHolder(holder: special.ViewHolder, position: Int) {
        holder.imagebutton1.setImageResource(special_Item.get(position).Image1)
        holder.name1.text = special_Item.get(position).name1.toString()
    }

    override fun getItemCount(): Int { //아이템리스트 코틀린의 사이즈 리턴.
        return special_Item.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name1 = itemView.findViewById<TextView>(R.id.name1)
        val imagebutton1 = itemView.findViewById<ImageButton>(R.id.imagebutton1)
    }

    class special_Item_list(val name1: String, val Image1: Int) {
    }
}
