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

class defend(val defend_Item: ArrayList<defend_Item_list>) : RecyclerView.Adapter<defend.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): defend.ViewHolder {

        var rnqns: Int = 0
        var qkRnrl: Int = -1
        var qkRnrl2:Int = -1
        val aview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_popup, null)
        val bview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_imsi, null)

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false) //리스트아이템 레이아웃을 부모 화면 전체에 맞춰
        // view라는 변수에 붙여줌.
        


        val noimage:ImageView = bview.findViewById(R.id.imaging2)
        noimage.setImageResource(0)

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

        var item = item_in(parent.context)

        val dlg = Dialog(parent.context)

        dlg.setContentView(item.aview)

        fun defendarray(i:Int) {
            if (defend_Item[i].name1 == "머리띠") {
                item.te("머리띠", "방어력 +4, 최대 스태미너 +130", "번화가(8개), 절(7개), 묘지(7개)의 상자\n" +
                        "박쥐(사냥)", "일반")
                item.up("가면", "머리테", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "모자") {
                item.te("모자", "방어력 +4, 쿨다운 감소 +5%", "연못(7개), 양궁장(6개), 학교(6개)의 상자\n" +
                        "박쥐(가끔)를 처치", "일반")
                item.up("베레모", "사슬 코이프", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "자전거 헬멧") {
                item.te("자전거 헬멧", "최대 체력 +90", "모래사장(6개), 성당(6개), 학교(8개)의 상자\n" +
                        "맷돼지(가끔)를 처치", "일반")
                item.up("안전모", "방탄모", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "가면") {
                item.te("가면", "방어력 +10, 최대 스태미너 +130, 이동속도 +0.08", "[제작] 머리띠 + 깃털\n 초록색 항공 보급", "고급")
                item.up("투구", "변검", "", "", "")
                item.down("머리띠", "깃털", "", "", "")
            }
            if (defend_Item[i].name1 == "머리테") {
                item.te("머리테", "방어력 +14, 최대 스태미너 +270", "[제작] 머리띠 + 나뭇가지\n초록색 항공 보급", "고급")
                item.up("티아라", "왕관", "월계관", "천사의 고리", "")
                item.down("머리띠", "나뭇가지", "", "", "")
            }
            if (defend_Item[i].name1 == "베레모") {
                item.te("베레모", "방어력 +10, 최대 체력 +60, 쿨다운 감소 +7%", "[제작] 모자 + 가위 \n 초록색 항공 보급", "고급")
                item.up("방탄모", "왕관", "", "", "")
                item.down("모자", "가위", "", "", "")
            }
            if (defend_Item[i].name1 == "사슬 코이프") {
                item.te("사슬 코이프", "방어력 +14, 쿨다운 감소+6%", "[제작] 모자 + 쇠사슬\n초록색 항공 보급", "고급")
                item.up("투구", "미스릴 투구", "", "", "")
                item.down("모자", "쇠사슬", "", "", "")
            }
            if (defend_Item[i].name1 == "안전모") {
                item.te("안전모", "최대 체력 +200", "[제작] 자전거 헬멧 + 돌멩이\n초록색 항공 보급", "고급")
                item.up("소방 헬멧", "", "", "", "")
                item.down("돌멩이", "자전거 헬멧", "", "", "")
            }
            if (defend_Item[i].name1 == "방탄모") {
                item.te("방탄모", "방어력 +15, 최대 체력 +90, 쿨다운 감소 +8%", "[제작] 베레모 + 자전거 헬멧\n파란색 항공 보급", "희귀")
                item.up("전술-OPS 헬멧", "", "", "", "")
                item.down("베레모", "자전거 헬멧", "", "", "")
            }
            if (defend_Item[i].name1 == "소방 헬멧") {
                item.te("소방 헬멧", "최대 체력 +250", "[제작] 안전모 + 물\n파란색 항공 보급", "희귀")
                item.up("오토바이 헬멧", "", "", "", "")
                item.down("안전모", "물", "", "", "")
            }
            if (defend_Item[i].name1 == "티아라") {
                item.te("티아라", "방어력 +16, 최대 스태미너 +400", "[제작] 머리테 + 마패\n파란색 항공 보급", "희귀")
                item.up("수정 티아라", "", "", "", "")
                item.down("머리테", "마패", "", "", "")
            }
            if (defend_Item[i].name1 == "왕관") {
                item.te("왕관", "방어력 +16, 최대 체력 +360, 스킬 증폭 +8%", "[제작] 베레모 +황금\n파란색 항공 보급", "희귀")
                item.up("제국 왕관", "", "", "", "")
                item.down("베레모", "황금", "", "", "")
            }
            if (defend_Item[i].name1 == "투구") {
                item.te("투구", "방어력 +20, 최대 스태미너 +130, 이동속도 +0.08, 쿨다운 감소 +7%", "[제작]사슬 코이프 + 가면\n파란색 항공 보급", "희귀")
                item.up("기사단장의 투구", "황실 부르고넷", "", "", "")
                item.down("사슬 코이프", "가면", "", "", "")
            }
            if (defend_Item[i].name1 == "오토바이 헬멧") {
                item.te("오토바이 헬멧", "공격력 +10, 최대 체력 +300, 시야 +1.0", "[제작] 소방 헬멧 + 쌍안경\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("소방 헬멧", "쌍안경", "", "", "")
            }
            if (defend_Item[i].name1 == "미스릴 투구") {
                item.te("미스릴 투구", "방어력 +38, 공격속도 +12%, 이동속도 +0.2, 쿨다운 감소 +15%", "[제작] 미스릴 + 사슬 코이프\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("미스릴", "사슬 코이프", "", "", "")
            }
            if (defend_Item[i].name1 == "수정 티아라") {
                item.te("수정 티아라", "방어력 +21, 최대 스태미너 +600, 치명타 확률 +22%", "[제작]티아라 + 유리 조각\n", "영웅")
                item.up("", "", "", "", "")
                item.down("티아라", "유리 조각", "", "", "")
            }
            if (defend_Item[i].name1 == "전술-OPS 헬멧") {
                item.te("전술-OPS 헬멧", "방어력 +15, 최대 체력 +120, 공격속도 +25%, 쿨다운 감소 +12%", "[제작] 방탄모 + 전자 부품\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("방탄모", "전자 부품", "", "", "")
            }
            if (defend_Item[i].name1 == "기사단장의 투구") {
                item.te("기사단장의 투구", "방어력 +28, 최대 스태미너 +200, 이동속도 +0.1, 쿨다운 감소 +8%, 스킬 피해 감소 +11%", "[제작] 투구 + 고무\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("투구", "고무", "", "", "")
            }
            if (defend_Item[i].name1 == "제국 왕관") {
                item.te("제국 왕관", "방어력 +20, 최대 체력 +350, 스킬 증폭 +10%", "[제작] 왕관 + 루비\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("왕관", "루비", "", "", "")
            }
            if (defend_Item[i].name1 == "황실 부르고넷") {
                item.te("황실 부르고넷", "방어력 +10, 최대 스태미너 +300, 이동속도 +0.08, 쿨다운 감소 +8%, 스킬 증폭 +14%", "[제작] 투구 + 황금\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("투구", "황금", "", "", "")
            }
            if (defend_Item[i].name1 == "변검") {
                item.te("변검", "방어력 +10, 최대 스태미너 +300, 이동속도 +0.2, 생명력 흡수 +22%, 비전투중 이동속도 +0.3", "[제작] 가면 + VF 혈액 샘플\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("가면", "VF 혈액 샘플", "", "", "")
            }
            if (defend_Item[i].name1 == "월계관") {
                item.te("월계관", "방어력 +20, 최대 스태미너 +580, 체력 재생 +2, 스태미너 재생 +2, 기본 공격 추가 피해 +21", "[제작]삼매진화 + 머리테\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("삼매진화", "머리테", "", "", "")
            }
            if (defend_Item[i].name1 == "바람막이") {
                item.te("바람막이", "최대 체력 +50, 기본 공격 피해 감소 +3", "고급 주택가(6개), 호텔(7개), 학교(7개)의 상자", "일반")
                item.up("가죽 자켓", "군복", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "승복") {
                item.te("승복", "방어력 +5, 쿨다운 감소 +5%", "절(9개), 양궁장(5개)의 상자", "일반")
                item.up("거북 도복", "덧댄 로브", "진신 사리", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "전신 수영복") {
                item.te("전신 수영복", "방어력 +1, 스킬 피해 감소 +5%", "항구(7개), 모래사장(6개), 골목길(7개)의 상자", "일반")
                item.up("비키니", "잠수복", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "천 갑옷") {
                item.te("천 갑옷", "방어력 +11", "절(8개), 양궁장(6개), 묘지(7개)의 상자", "일반")
                item.up("가죽 갑옷", "판금 갑옷", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "가죽 갑옷") {
                item.te("가죽 갑옷", "방어력 +15", "[제작] 천 갑옷 + 가죽\n초록색 항공 보급", "고급")
                item.up("사슬 갑옷", "석양의 갑옷", "미스릴 갑옷", "", "")
                item.down("천 갑옷", "가죽", "", "", "")
            }
            if (defend_Item[i].name1 == "가죽 자켓") {
                item.te("가죽 자켓", "방어력 +8, 최대 체력 +70, 기본 공격 피해 감소 +6", "[제작] 바람막이 + 가죽\n초록색 항공 보급", "고급")
                item.up("라이더 자켓", "", "", "", "")
                item.down("바람막이", "가죽", "", "", "")
            }
            if (defend_Item[i].name1 == "거북 도복") {
                item.te("거북 도복", "방어력 +10, 쿨다운 감소 +10%", "[제작] 승복 + 거북이 등딱지\n초록색 항공 보급", "고급")
                item.up("용의 도복", "", "", "", "")
                item.down("승복", "거북이 등딱지", "", "", "")
            }
            if (defend_Item[i].name1 == "군복") {
                item.te("군복", "최대 체력 +50, 기본 공격 피해 감소 +10", "[제작] 바람막이 + 나뭇가지\n초록색 항공 보급", "고급")
                item.up("정장", "방탄조끼", "", "", "")
                item.down("바람막이", "나뭇가지", "", "", "")
            }
            if (defend_Item[i].name1 == "덧댄 로브") {
                item.te("덧댄 로브", "방어력 +5, 체력 재생 +1, 쿨다운 감소 +7%", "[제작] 승복 + 붕대\n초록색 항공 보급", "고급")
                item.up("한복", "EOD 슈트", "", "", "")
                item.down("승복", "붕대", "", "", "")
            }
            if (defend_Item[i].name1 == "드레스") {
                item.te("드레스", "공격력 +8, 방어력 +8, 스태미너 재생 +100%", "[제작] 옷감 + 가위\n초록색 항공 보급", "고급")
                item.up("치파오", "불꽃 드레스", "", "", "")
                item.down("옷감", "가위", "", "", "")
            }
            if (defend_Item[i].name1 == "비키니") {
                item.te("비키니", "방어력 +4, 스킬 피해 감소 +11%", "[제작]전신 수영복 + 가위\n초록색 항공 보급", "고급")
                item.up("아마조네스 아머", "", "", "", "")
                item.down("전신 수영복", "가위", "", "", "")
            }
            if (defend_Item[i].name1 == "잠수복") {
                item.te("잠수복", "방어력 +9, 스킬 피해 감소 +10%", "[제작] 전신 수영복 + 고무\n", "고급")
                item.up("광학미채 슈트", "배틀 슈트", "", "", "")
                item.down("전신 수영복", "고무", "", "", "")
            }
            if (defend_Item[i].name1 == "라이더 자켓") {
                item.te("라이더 자켓", "방어력 +11, 최대 체력 +70, 기본 공격 피해 감소 +9", "[제작]가죽 자켓 + 쇠사슬\n파란색 항공 보급", "희귀")
                item.up("락커의 자켓", "", "", "", "")
                item.down("가죽 자켓", "쇠사슬", "", "", "")
            }
            if (defend_Item[i].name1 == "사슬 갑옷") {
                item.te("사슬 갑옷", "방어력 +30", "[제작] 가죽 갑옷 + 쇠사슬\n파란색 항공 보급", "희귀")
                item.up("지휘관의 갑옷", "", "", "", "")
                item.down("가죽 갑옷", "쇠사슬", "", "", "")
            }
            if (defend_Item[i].name1 == "정장") {
                item.te("정장", "생명력 흡수 +5%, 기본 공격 피해 감소 +12", "[제작] 군복 + 리본\n파란색 항공 보급", "희귀")
                item.up("집사복", "", "", "", "")
                item.down("군복", "리본", "", "", "")
            }
            if (defend_Item[i].name1 == "치파오") {
                item.te("치파오", "공격력 +10, 방어력 +10, 스태미너 재생 +120%", "[제작] 드레스 + 면도칼\n파란색 항공 보급", "희귀")
                item.up("용의 도복", "", "", "", "")
                item.down("드레스", "면도칼", "", "", "")
            }
            if (defend_Item[i].name1 == "판금 갑옷") {
                item.te("판금 갑옷", "방어력 +38, 최대 체력 +100, 이동속도 -0.1", "[제작] 천 갑옷 + 강철\n파란색 항공 보급", "희귀")
                item.up("성기사의 갑옷", "아마조네스 아머", "", "", "")
                item.down("천 갑옷", "강철", "", "", "")
            }
            if (defend_Item[i].name1 == "한복") {
                item.te("한복", "방어력 +12, 체력 재생 +1, 쿨다운 감소 +10%", "[제작] 덧댄 로브 + 꽃\n", "희귀")
                item.up("어사의", "퀸 오브 하트", "", "", "")
                item.down("덧댄 로브", "꽃", "", "", "")
            }
            if (defend_Item[i].name1 == "방탄조끼") {
                item.te("방탄조끼", "방어력 +10, 최대 체력 +130, 기본 공격 피해 감소 +10", "[제작] 군복 + 철판\n파란색 항공 보급", "희귀")
                item.up("배틀 슈트", "EOD 슈트", "", "", "")
                item.down("군복", "철판", "", "", "")
            }
            if (defend_Item[i].name1 == "석양의 갑옷") {
                item.te("석양의 갑옷", "방어력 +20, 최대 체력 +360", "[제작] 가죽 갑옷 + 루비\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("가죽 갑옷", "루비", "", "", "")
            }
            if (defend_Item[i].name1 == "어사의") {
                item.te("어사의", "방어력 +23, 시야 +1, 최대 체력 +2.5, 쿨다운 감소 +15%", "[제작] 한복 + 마패\n", "희귀")
                item.up("활빈검", "", "", "", "")
                item.down("한복", "마패", "", "", "")
            }
            if (defend_Item[i].name1 == "광학미채 슈트") {
                item.te("광학미채 슈트", "공격력 +10, 방어력 +18, 치명타 확률 +22%, 스킬 피해 감소 +10%", "[제작] 잠수복 + 유리판\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("잠수복", "유리판", "", "", "")
            }
            if (defend_Item[i].name1 == "락커의 자켓") {
                item.te("락커의 자켓", "공격력 +30, 방어력 +18, 비전투중 이동속도 +0.1, 기본 공격 피해 감소 +15, 스킬 적중 시 치유 감소 -40% (원거리 25%)", "[제작] 라이더 자켓 + 소란 발생기\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("라이더 자켓", "소란 발생기", "", "", "")
            }
            if (defend_Item[i].name1 == "미스릴 갑옷") {
                item.te("미스릴 갑옷", "방어력 +65, 공격속도 +12%, 이동속도 +0.2, 스킬 피해 고정 감소 +14", "[제작] 미스릴 + 가죽 갑옷\n보라색 항공 보급", "미스릴 갑옷")
                item.up("", "", "", "", "")
                item.down("미스릴", "가죽 갑옷", "", "", "")
            }
            if (defend_Item[i].name1 == "성기사의 갑옷") {
                item.te("성기사의 갑옷", "방어력 +35, 체력 재생 +150%, 기본 공격 추가 피해 +15", "[제작] 판금 갑옷 + 성자의 유산\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("판금 갑옷", "성자의 유산", "", "", "")
            }
            if (defend_Item[i].name1 == "아마조네스 아머") {
                item.te("아마조네스 아머", "방어력 +28, 최대 체력 +155, 스킬 피해 감소 +20%", "[제작] 판금 갑옷 + 비키니\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("판금 갑옷", "비키니", "", "", "")
            }
            if (defend_Item[i].name1 == "용의 도복") {
                item.te("용의 도복", "공격력 +11, 방어력 +10, 스태미너 재생 +120%, 쿨다운 감소 +10%, 기본 공격 사거리 +1", "[제작] 치파오 + 거북 도복\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("치파오", "거북 도복", "", "", "")
            }
            if (defend_Item[i].name1 == "지휘관의 갑옷") {
                item.te("지휘관의 갑옷", "방어력 +26, 스킬 증폭 +18%", "[제작] 사슬 갑옷 + 황금\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("사슬 갑옷", "황금", "", "", "")
            }
            if (defend_Item[i].name1 == "집사복") {
                item.te("집사복", "공격력 +30, 이동속도 +0.2, 생명력 흡수 +20%, 기본 공격 피해 감소 +10", "[제작] 정장 + 먼지털이개\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("정장", "먼지털이개", "", "", "")
            }
            if (defend_Item[i].name1 == "배틀 슈트") {
                item.te("배틀 슈트", "방어력 +25, 최대 체력 +170, 기본 공격 피해 감소 +15, 스킬 피해 감소 +12%", "[제작] 방탄조끼 + 잠수복\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("방탄조끼", "잠수복", "", "", "")
            }
            if (defend_Item[i].name1 == "EOD 슈트") {
                item.te("EOD 슈트", "방어력 +25, 최대 체력 +250, 체력 재생 +1, 쿨다운 감소 +10%, 기본 공격 피해 감소 +10", "[제작] 방탄조끼 + 덧댄 로브\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("방탄조끼", "덧댄 로브", "", "", "")
            }
            if (defend_Item[i].name1 == "불꽃 드레스") {
                item.te("불꽃 드레스", "방어력 +30, 공격력 +20, 체력 재생 +2, 스태미너 재생 +2, 스태미너 재생 +75%, 기본 공격 추가 피해 +20", "[제작] 삼매진화 + 드레스\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("삼매진화", "드레스", "", "", "")
            }
            if (defend_Item[i].name1 == "카바나") {
                item.te("카바나", "방어력 +40, 스킬 증폭 +20%", "[제작] 운석 + 지휘관의 갑옷\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("운석", "지휘관의 갑옷", "", "", "")
            }
            if (defend_Item[i].name1 == "퀸 오브 하트") {
                item.te("퀸 오브 하트", "방어력 +37, 체력 재생 +3, 쿨다운 감소 +25%", "[제작] VF 혈액 샘플 + 한복\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("VF 혈액 샘플", "한복", "", "", "")
            }
            if (defend_Item[i].name1 == "손목시계") {
                item.te("손목시계", "공격속도 +10%", "고급 주택가(6개), 호텔(6개), 번화가(7개)의 상자\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("바이탈 센서", "고장난 시계", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "붕대") {
                item.te("붕대", "체력 재생 +0.8", "항구(7개), 병원(7개), 공장(6개), 학교(8)의 상자\n" +
                        "박쥐(가끔)를 처치", "일반")
                item.up("바이탈 센서", "분대장 완장", "브레이서", "구급상자", "기름먹인 천")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "팔찌") {
                item.te("팔찌", "최대 스태미너 +200", "연못(7개), 고급 주택가(6개), 골목길(7개)의 상자\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("금팔찌", "진홍 팔찌", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "고장난 시계") {
                item.te("고장난 시계", "쿨다운 감소 + 5%", "[제작] 손목시계 + 접착제", "고급")
                item.up("틴달로스의 팔찌", "큐브 워치", "", "", "")
                item.down("손목시계", "접착제", "", "", "")
            }
            if (defend_Item[i].name1 == "틴달로스의 팔찌") {
                item.te("틴달로스의 팔찌", "스킬 증폭 +12%, 쿨다운 감소 +12% ", "[제작] 고장난 시계 + 금팔찌", "영웅")
                item.up("", "", "", "", "")
                item.down("고장난 시계", "금팔찌", "", "", "")
            }
            if (defend_Item[i].name1 == "가죽 방패") {
                item.te("가죽 방패", "공격력 +5, 방어력 +15", "[제작] 거북이 등딱지 + 가죽\n초록색 항공 보급", "고급")
                item.up("강철 방패", "미스릴 방패", "아이기스", "", "")
                item.down("거북이 등딱지", "가죽", "", "", "")
            }
            if (defend_Item[i].name1 == "분대장 완장") {
                item.te("분대장 완자", "체력 재생 +1.5, 치명타 피해량 +15%", "[제작] 붕대 + 바늘\n초록색 항공 보급", "고급")
                item.up("기사의 신조", "", "", "", "")
                item.down("붕대", "바늘", "", "", "")
            }
            if (defend_Item[i].name1 == "브레이서") {
                item.te("브레이서", "방어력 +13, 체력 재생 +1", "[제작] 붕대 + 가죽\n초록색 항공 보급", "고급")
                item.up("바주반드", "드라우프니르", "오토-암즈", "", "")
                item.down("붕대", "가죽", "", "", "")
            }
            if (defend_Item[i].name1 == "검집") {
                item.te("검집", "공격력 +18, 기본 공격 피해 감소 +", "[제작] 가죽 + 철판\n파란색 항공 보급", "희귀")
                item.up("샤자한의 검집", "", "", "", "")
                item.down("가죽", "철판", "", "", "")
            }
            if (defend_Item[i].name1 == "금팔찌") {
                item.te("금팔찌", "최대 스태미너 +220, 스킬 증폭 +12%", "[제작] 팔찌 + 황금\n파란색 항공 보급", "희귀")
                item.up("드라우프니르", "틴달로스의 팔찌", "", "", "")
                item.down("팔찌", "황금", "", "", "")
            }
            if (defend_Item[i].name1 == "바주반드") {
                item.te("바주반드", "방어력 +25, 기본 공격 피해 감소 +8, 치명타 피해감소 +6%", "[제작] 브레이서 + 철판\n파란색 항공 보급", "희귀")
                item.up("소드 스토퍼", "", "", "", "")
                item.down("브레이서", "철판", "", "", "")
            }
            if (defend_Item[i].name1 == "진홍 팔찌") {
                item.te("진홍 팔찌", "최대 체력 +200, 최대 스태미너 +250", "[제작] 팔찌 + 가시 발판\n파란색 항공 보급", "희귀")
                item.up("스카디의 팔찌", "아이기스", "", "", "")
                item.down("팔찌", "가시 발판", "", "", "")
            }
            if (defend_Item[i].name1 == "강철 방패") {
                item.te("강철 방패", "공격력 +23, 방어력 +20, 이동속도 -0.05", "[제작] 방패 + 강철\n파란색 항공 보급", "희귀")
                item.up("기사의 신조", "", "", "", "")
                item.down("가죽 방패", "강철", "", "", "")
            }
            if (defend_Item[i].name1 == "큐브 워치") {
                item.te("큐브 워치", "방어력 +22, 공격속도 +50%, 쿨다운 감소 + 8%", "[제작] 고장난 시계 + 문스톤\n보란색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("고장난 시계", "문스톤", "", "", "")
            }
            if (defend_Item[i].name1 == "소드 스토퍼") {
                item.te("소드 스토퍼", "방어력 +33, 기본 공격 피해 감소 +8, 치명타 피해 감소 +8%, 기본 공격 시 치유 감소 -40% (원거리 25%)", "[제작] 바주반드 + 못\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("바주반드", "못", "", "", "")
            }
            if (defend_Item[i].name1 == "드라우프니르") {
                item.te("드라우프니르", "방어력 +10, 최대 스태미너 +240, 체력 재생 +1, 스킬 증폭 17%", "[제작] 금팔찌 + 브레이서\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("금팔찌", "브레이서", "", "", "")
            }
            if (defend_Item[i].name1 == "미스릴 방패") {
                item.te("미스릴 방패", "공격력 +30, 방어력 +30, 공격속도 +12%, 이동속도 +0.1", "[제작] 미스릴 + 가죽 방패\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("미스릴", "가죽 방패", "", "", "")
            }
            if (defend_Item[i].name1 == "바이탈 센서") {
                item.te("바이탈 센서", "방어력 +15, 공격속도 +35%", "[제작] 손목 시계 + 휴대폰\n보라색 항공 보급", "영웅")
                item.up("레이더", "", "", "", "")
                item.down("손목 시계", "휴대폰", "", "", "")
            }
            if (defend_Item[i].name1 == "기사의 신조") {
                item.te("기사의 신조", "공격력 +30, 방어력 +20, 체력 재생 +1.5, 이동속도 -0.03, 치명타 피해량 +25%", "[제작] 강철 방패 + 분대장 완장\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("강철 방패", "분대장 완장", "", "", "")
            }
            if (defend_Item[i].name1 == "샤자한의 검집") {
                item.te("샤자한의 검집", "공격력 +30, 최대 체력 +260, 기본 공격 피해 감소 +2", "[제작] 검집 + 루비\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("검집", "루비", "", "", "")
            }
            if (defend_Item[i].name1 == "캐리비안 장식총") {
                item.te("캐리비안 장식총", "공격력 +10, 생명력 흡수 +6%", "[제작] 발터 PPK + 리본\n 초록색 항공 보급", "고급")
                item.up("해적의 증표", "", "", "", "")
                item.down("발터 PPK", "리본", "", "", "")
            }
            if (defend_Item[i].name1 == "해적의 증표") {
                item.te("해적의 증표", "공격력 +15, 생명력 흡수 +6%, 치명타 확률 +12%", "[제작] 캐리비안 장식총 + 식칼\n파라색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("캐리비안 장식총", "식칼", "", "", "")
            }
            if (defend_Item[i].name1 == "아이기스") {
                item.te("아이기스", "체력 +320, 스태미너 +250, 공격력 +5, 방어력 +15", "[제작] 진홍 팔찌 + 가죽 방패\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("진홍 팔찌", "가죽 방패", "", "", "")
            }
            if (defend_Item[i].name1 == "스카디의 팔찌") {
                item.te("스카디의 팔찌", "최대 체력 +200, 최대 스태미너 +250, 체력 재생 +1.5, 스태미너 재생 +1.5, 스킬 증폭 +27", "[제작] 만년빙 + 진홍 팔찌\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("만년빙", "진홍 팔찌", "", "", "")
            }
            if (defend_Item[i].name1 == "레이더") {
                item.te("레이더", "방어력 +15, 공격속도 +40%, 치명타 확률 +24%", "[제작] 바이탈 센서 + 유리판\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("바이탈 센서", "유리판", "", "", "")
            }
            if (defend_Item[i].name1 == "오토-암즈") {
                item.te("오토-암즈", "공격력 +45, 방어력 +35, 체력 재생 +1", "[제작] 브레이서 + 포스 코어\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("브레이서", "포스 코어", "", "", "")
            }
            if (defend_Item[i].name1 == "슬리퍼") {
                item.te("슬리퍼", "스태미너 재생 +0.5, 이동속도 +0.04", "번화가(8개), 병원(7개), 학교(7개)의 상자\n" +
                        "박쥐(가끔)를 처치", "일반")
                item.up("하이힐", "덧댄 슬리퍼", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "운동화") {
                item.te("운동화", "이동속도 +0.08", "고급 주택가(6개), 골목길(9개), 양궁장(7개)의 상자\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("힐리스", "부츠", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "타이즈") {
                item.te("타이즈", "방어력 +5, 이동속도 +0.04", "번화가(8개), 병원(6개), 숲(7개)의 상자\n" +
                        "맷돼지(가끔)를 처치\n", "일반")
                item.up("무릎 보호대", "체인 레깅스", "", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "무릎 보호대") {
                item.te("무릎 보호대", "방어력 +8, 이동속도 +0.16", "[제작] 타이즈 + 접착제\n초록색 항공 보급", "고급")
                item.up("강철 무릎 보호대", "타기온 브레이스", "", "", "")
                item.down("타이즈", "접착제", "", "", "")
            }
            if (defend_Item[i].name1 == "타기온 브레이스") {
                item.te("타기온 브레이스", "방어력 15, 이동속도 +0.38, 쿨다운 감소 10%", "[제작] 무릎 보호대 + 모터\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("무릎 보호대", "모터", "", "", "")
            }
            if (defend_Item[i].name1 == "체인 레깅스") {
                item.te("체인 레깅스", "방어력 +10, 이동속도 +0.14", "[제작]타이즈 + 쇠사슬\n초록색 항공 보급", "고급")
                item.up("미스릴 부츠", "부케팔로스", "케르베로스", "", "")
                item.down("타이즈", "쇠사슬", "", "", "")
            }
            if (defend_Item[i].name1 == "하이힐") {
                item.te("하이힐", "스태미너 재생 +0.8, 이동속도 +0.17", "[제작] 슬리퍼 + 고철\n초록색 항공 보급", "고급")
                item.up("킬힐", "", "", "", "")
                item.down("슬리퍼", "고철", "", "", "")
            }
            if (defend_Item[i].name1 == "힐리스") {
                item.te("힐리스", "이동속도 +0.09, 비전투중 이동 속도 +0.5", "[제작] 운동화 + 쇠구슬\n초록색 항공 보급", "고급")
                item.up("매버릭 러너", "헤르메스의 부츠", "", "", "")
                item.down("운동화", "쇠구슬", "", "", "")
            }
            if (defend_Item[i].name1 == "덧댄 슬리퍼") {
                item.te("덧댄 슬리퍼", "스태미너 재생 +0.5, 스태미너 재생 +30%, 이동속도 +0.16", "[제작] 슬리퍼 + 옷감\n초록색 항공 보급", "고급")
                item.up("풍화륜", "글레이셜 슈즈", "", "", "")
                item.down("슬리퍼", "옷감", "", "", "")
            }
            if (defend_Item[i].name1 == "부츠") {
                item.te("부츠", "체력 재생 +0.6, 공격속도 +2%, 이동속도 +0.22", "[제작] 운동화 + 기름먹인 천\n파란색 항공 보급", "희귀")
                item.up("전투화", "EOD 부츠", "", "", "")
                item.down("운동화", "기름먹인 천", "", "", "")
            }
            if (defend_Item[i].name1 == "강철 무릎 보호대") {
                item.te("강철 무릎 보호대", "방어력 +20, 이동속도 +0.24", "[제작] 무릎 보호대 + 강철\n파란색 항공 보급", "희귀")
                item.up("EOD 부츠", "", "", "", "")
                item.down("강철", "무릎 보호대", "", "", "")
            }
            if (defend_Item[i].name1 == "매버릭 러너") {
                item.te("매버릭 러너", "공격속도 +10%, 이동속도 +0.3, 비전투중 이동속도 +0.25", "[제작] 힐리스 + 전자 부품\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("힐리스", "전자 부품", "", "", "")
            }
            if (defend_Item[i].name1 == "전투화") {
                item.te("전투화", "체력 재생 +0.6, 공격속도 +7%, 이동속도 +0.27", "[제작] 부츠 + 기즉\n파란색 항공 보급", "희귀")
                item.up("경량화 부츠", "클링온 부츠", "", "", "")
                item.down("부츠", "가죽", "", "", "")
            }
            if (defend_Item[i].name1 == "킬힐") {
                item.te("킬힐", "공격력 +5, 스태미너 재생 +0.8, 이동속도 +0.18, 치명타 확률 +10%", "[제작] 하이힐 + 유리 조각\n파란색 항공 보급", "희귀")
                item.up("분홍신", "부케팔로스", "", "", "")
                item.down("하이힐", "유리 조각", "", "", "")
            }
            if (defend_Item[i].name1 == "풍화륜") {
                item.te("풍화륜", "스태미너 재생 +0.5, 스태미너 재생 +50%, 이동속도 +0.33, 스킬증폭 +12", "[제작] 덧댄 슬리퍼 + 재\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("덧댄 슬리퍼", "재", "", "", "")
            }
            if (defend_Item[i].name1 == "경량화 부츠") {
                item.te("경량화 부츠", "체력 재생 +1, 공격속도 +35%, 이동속도 +0.4", "[제작] 전투화 + 깃털\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("전투화", "깃털", "", "", "")
            }
            if (defend_Item[i].name1 == "미스릴 부츠") {
                item.te("미스릴 부츠", "방어력 +18, 공격속도 +12%, 이동속도 +0.5", "[제작] 미스릴 + 체인 레깅스\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("미스릴", "체인 레깅스", "", "", "")
            }
            if (defend_Item[i].name1 == "부케팔로스") {
                item.te("부케 팔로스", "공격력 +10, 방어력 +10, 스태미너 재생 +1, 이동속도 +0.33, 치명타 확률 +15%", "[제작]킬힐 + 체인 레깅스\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("킬힐", "체인 레깅스", "", "", "")
            }
            if (defend_Item[i].name1 == "클링온 부츠") {
                item.te("클링온 부츠", "체력 재생 +0.7, 공격속도 +15, 이동속도 +0.35, 기본 공격 시 치유 감소 -40% (원거리 25%)", "[제작] 전투화 + 못\n보라색 항공 보급", "영웅")
                item.up("", "", "", "", "")
                item.down("전투화", "못", "", "", "")
            }
            if (defend_Item[i].name1 == "EOD 부츠") {
                item.te("EOD 부츠", "방어력 +26, 체력 재생 +1, 스태미너 재생 +0.5, 이동속도 +0.35", "[제작] 부츠 + 강철 무릎 보호대\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("부츠", "강철 무릎 보호대", "", "", "")
            }
            if (defend_Item[i].name1 == "글레이셜 슈즈") {
                item.te("글레이셜 슈즈", "체력 재생 +1.5, 스태미너 재생 +1.5, 스태미너 재생 +60%, 이동속도 +0.3, 비전투중 이동속도 +0.35, 스킬증폭 +22", "[제작] 덧댄 슬리퍼 + 만년빙\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("만년빙", "덧댄 슬리퍼", "", "", "")
            }
            if (defend_Item[i].name1 == "헤르메스의 부츠") {
                item.te("헤르메스의 부츠", "방어력 +35, 이동속도 +0.4, 비전투중 이동 속도+0.2", "[제작] 포스 코어 + 힐리스\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("포스 코어", "힐리스", "", "", "")
            }
            if (defend_Item[i].name1 == "분홍신") {
                item.te("분홍신", "공격력 +5, 스태미너 재생 +1, 이동속도 +0.4, 치명타 확률 +15%, 생명력 흡수 +12%", "[제작] 킬힐 + VF 혈액 샘플\n노란색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("킬힐", "VF 혈액 샘플", "", "", "")
            }
            if (defend_Item[i].name1 == "깃털") {
                name.text = "깃털"
                abil.text = "이동속도 +0.06"
                exeplan.text = "병원(7개), 묘지(7개), 숲(7개)의 상자, 맷돼지(가끔)를 처치"
                grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                item.im.isClickable = true
                qkRnrl = -1
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "경량화 도끼") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "가면") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "경량화 부츠") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "백우선") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "먼지털이개") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "강창") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "윙 너클") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "다트") {
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
                            if (falselist[j].name1 == "경량화 도끼") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "가면") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "경량화 부츠") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "백우선") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "먼지털이개") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }

            if (defend_Item[i].name1 == "꽃") {
                name.text = "꽃"
                abil.text = "쿨다운 감소 +7%"
                exeplan.text = "연못(7개),고급 주택가(7), 묘지(7개), 숲(7개)의 상자\n" +
                        "맷돼지(가끔)를 처치"
                grade.text = "일반"
                item.im.text = "상위 아이템1 (터치 시 상위 아이템2로 변경)"
                item.im.isClickable = true
                qkRnrl = -1
                for (j in falselist.indices) {
                    if (falselist[j].name1 == "장미칼") {
                        item.imaup1.setImageResource(falselist[j].Image1)
                        item.uptext1.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "한복") {
                        item.imaup2.setImageResource(falselist[j].Image1)
                        item.uptext2.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "운명의 꽃") {
                        item.imaup3.setImageResource(falselist[j].Image1)
                        item.uptext3.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "백일취") {
                        item.imaup4.setImageResource(falselist[j].Image1)
                        item.uptext4.text = falselist[j].name1
                    }
                    if (falselist[j].name1 == "난초") {
                        item.imaup5.setImageResource(falselist[j].Image1)
                        item.uptext5.text = falselist[j].name1
                    }
                }
                item.im.setOnClickListener() {
                    if (qkRnrl == -1) {
                        for (j in falselist.indices) {
                            if (falselist[j].name1 == "매화비표") {
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
                            if (falselist[j].name1 == "장미칼") {
                                item.imaup1.setImageResource(falselist[j].Image1)
                                item.uptext1.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "한복") {
                                item.imaup2.setImageResource(falselist[j].Image1)
                                item.uptext2.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "운명의 꽃") {
                                item.imaup3.setImageResource(falselist[j].Image1)
                                item.uptext3.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "백일취") {
                                item.imaup4.setImageResource(falselist[j].Image1)
                                item.uptext4.text = falselist[j].name1
                            }
                            if (falselist[j].name1 == "난초") {
                                item.imaup5.setImageResource(falselist[j].Image1)
                                item.uptext5.text = falselist[j].name1
                            }
                        }
                        item.im.text = ("상위 아이템1 (터치 시 상위 아이템2로 변경)")
                        qkRnrl *= -1
                    }
                }
            }
            if (defend_Item[i].name1 == "리본") {
                item.te("리본", "생명력 흡수 +5%", "연못(7개),고급 주택가(7), 학교(7개)의 상자\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("정장", "인형", "달빛 펜던트", "캐리비안 장식총", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "부채") {
                item.te("부채", "스킬증폭 +9", "번화가(8개), 숲(8개), 성당(6개)의 상자\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("군선", "우치와", "우산", "바람 채찍", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "불경") {
                item.te("불경", "스킬 증폭 +7%", "절(10개)의 상자\n" +
                        "박쥐(가끔), 들개(가끔)를 처치", "일반")
                item.up("진신사리", "부적", "법륜", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "상자") {
                item.te("상자", "최대 체력 +90", "항구(7개), 연못(7), 성당(6)의 상자\n" +
                        "박쥐(가끔)를 처치", "일반")
                item.up("탄창", "슈뢰딩거의 상자", "초코파이 상자", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "성배") {
                item.te("성배", "체력 재생 +120%", "성당(10개)\n" +
                        "박쥐(가끔),맷돼지(가끔)를 처치", "일반")
                item.up("엑스칼리버", "성자의 유산", "천국의 계단", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "십자가") {
                item.te("십자가", "기본 공격 추가 피해 +7", "골목길(7개), 성당(9개)\n" +
                        "들개(가끔)를 처치", "일반")
                item.up("아론다이트", "성자의 유산", "디바인 피스트", "안티오크의 수류탄", "흑건")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "쌍안경") {
                item.te("쌍안경", "기본 공격 추가 피해 +7", "모래사장(6개), 골목길(7개), 호텔(6), 공장(7)\n" +
                        "박쥐(가끔), 들개(가끔)를 처치", "일반")
                item.up("오토바이 헬멧", "저격 스코프", "망원 카메라", "", "")
                item.down("", "", "", "", "")
            }
            if (defend_Item[i].name1 == "성자의 유산") {
                item.te("성자의 유산", "체력 재생 +150%, 기본 공격 추가 피해 +8", "[제작] 십자가 + 성배\n초록색 항공 보급", "고급")
                item.up("카른웬난", "성기사의 갑옷", "진리는 나의 빛", "다그다의 망치", "다비드 슬링")
                item.down("십자가", "성배", "", "", "")
            }
            if (defend_Item[i].name1 == "운명의 꽃") {
                item.te("운명의 꽃", "치명타 확률 +15%, 쿨다운 감소 +8%", "[제작] 꽃 + 트럼프 카드\n초록색 항공 보급", "고급")
                item.up("에메랄드 타블렛", "매화검", "", "", "")
                item.down("꽃", "트럼프 카드", "", "", "")
            }
            if (defend_Item[i].name1 == "유리 조각") {
                item.te("유리 조각", "치명타 확률 +13%", "[제작] 유리병 + 돌멩이\n초록색 항공 보급", "고급")
                item.up("호푸어드", "수정 티아라", "킬힐", "유리판", "유리 너클")
                item.down("유리병", "돌멩이", "", "", "")
            }
            if (defend_Item[i].name1 == "인형") {
                item.te("인형", "스태미너 재생 +80%\n" +
                        "생명력 흡수 +12%", "[제작] 리본 + 옷감\n초록색 항공 보급", "고급")
                item.up("우치와", "구원의 여신상", "단영촌천투", "", "")
                item.down("리본", "옷감", "", "", "")
            }
            if (defend_Item[i].name1 == "저격 스코프") {
                item.te("저격 스코프", "공격력 +10, 시야 +4.5m", "[제작] 레이저 포인터 + 쌍안경 \n초록색 항공 보급", "고급")
                item.up("저격 크로스보우", "험버커 픽업", "", "", "")
                item.down("레이저 포인터", "쌍안경", "", "", "")
            }
            if (defend_Item[i].name1 == "진신사리") {
                item.te("진신사리", "쿨다운 감소 +8%, 스킬 증폭 +8%", "[제작] 불경 + 승복\n초록색 항공 보급", "고급")
                item.up("파라슈", "진리는 나의 빛", "여래수투", "틴 스피릿", "")
                item.down("불경", "승복", "", "", "")
            }
            if (defend_Item[i].name1 == "화살통") {
                item.te("화살통", "공격속도 +25%", "[제작] 가죽 + 대나무\n초록색 항공 보급", "고급")
                item.up("궁기병의 화살통", "", "", "", "")
                item.down("가죽", "대나무", "", "", "")
            }
            if (defend_Item[i].name1 == "먼지털이개") {
                item.te("먼지털이개", "공격력 +9, 이동속도 +0.1", "[제작] 단봉 + 깃털, 늑대(사냥)\n초록색 항공 보급", "고급")
                item.up("집사복", "궁기병의 화살통", "엘레강스", "", "")
                item.down("단봉", "깃털", "", "", "")
            }
            if (defend_Item[i].name1 == "군선") {
                item.te("군선", "스킬 증폭 +12, 스킬 적중시 치유 감소 -25%", "[제작] 부채 + 못\n초록색 항공 보급", "고급")
                item.up("백우선", "방천화극", "", "", "")
                item.down("부채", "못", "", "", "")
            }
            if (defend_Item[i].name1 == "백우선") {
                item.te("백우선", "이동속도 +0.12, 스킬증폭 +18, 스킬 적중 시 치유 감쇼 -40% (원거리 25%)", "[제작] 군선 + 깃털\n파란색 항공 보급", "희귀")
                item.up("하르페", "엘리멘탈 보우", "", "", "")
                item.down("군선", "깃털", "", "", "")
            }
            if (defend_Item[i].name1 == "생명의 가루") {
                item.te("생명의 가루", "체력 재생 +1.5, 스태미너 재생 +1.5", "[제작] 생명의 나무 + 돌멩이, 곰(사냥), 위클라인(사냥)\n파란색 항공 보급", "희귀")
                item.up("만년빙", "삼매진화", "포스 코어", "", "")
                item.down("생명의 나무", "돌멩이", "", "", "")
            }
            if (defend_Item[i].name1 == "우치와") {
                item.te("우치와", "스태미너 재생 +80%, 생명력 흡수 +14%, 스킬 증폭 +23", "[제작] 인형 + 부채\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("인형", "부채", "", "", "")
            }
            if (defend_Item[i].name1 == "탄창") {
                item.te("탄창", "최대 체력 +330, 기본 공격 피해 감소 +6", "[제작] 상자 + 철판\n파란색 항공 보급", "희귀")
                item.up("XCR", "", "", "", "")
                item.down("상자", "철판", "", "", "")
            }
            if (defend_Item[i].name1 == "궁기병의 화살통") {
                item.te("궁기병의 화살통", "공격력 +13, 공격속도 +30%, 이동속도 +0.1", "[제작] 화살통 + 먼지털이개\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("화살통", "먼지털이개", "", "", "")
            }
            if (defend_Item[i].name1 == "달빛 펜던트") {
                item.te("달빛 펜던트", "공격력 +24, 시야 +1, 생명력 흡수 +16%", "[제작] 리본 + 문스톤, 곰(사냥), 위클라인(사냥)\n파란색 항공 보급", "희귀")
                item.up("방망이", "", "", "", "")
                item.down("리본", "문스톤", "", "", "")
            }
            if (defend_Item[i].name1 == "슈뢰딩거의 상자") {
                item.te("슈뢰딩거의 상자", "최대 체력 +360, 스킬 증폭 +7", "[제작] 상자 + 독약\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("상자", "독약", "", "", "")
            }
            if (defend_Item[i].name1 == "진리는 나의 빛") {
                item.te("진리는 나의 빛", "체력 재생 +150%, 쿨다운 감소 +10%, 기본 공격 추가 피해 +12, 스킬 증폭 +10%", "[제작] 진신사리 + 성자의 유산\n파란색 항공 보급", "희귀")
                item.up("", "", "", "", "")
                item.down("진신사리", "성자의 유산", "", "", "")
            }
            if (defend_Item[i].name1 == "만년빙") {
                item.te("만년빙", "체력 재생 +1.5, 스태미너 재생 +1.5, 스킬 증폭 +18", "[제작] 생명의 가루 + 얼음\n보라색 항공 보급", "영웅")
                item.up("스카디의 팔찌", "글레이셜 슈즈", "", "", "")
                item.down("생명의 가루", "얼음", "", "", "")
            }
            if (defend_Item[i].name1 == "삼매진화") {
                item.te("삼매진화", "체력 재생 +1.5, 스태미너 재생 +1.5, 기본 공격 추가 피해 +15", "[제작] 생명의 가루 + 라이터\n보라색 항공 보급", "영웅")
                item.up("레바테인", "월계관", "불꽃 드레스", "화첨창", "")
                item.down("생명의 가루", "라이터", "", "", "")
            }
            if (defend_Item[i].name1 == "에메랄드 타블렛") {
                item.te("에메랄드 타블렛", "공격력 +18, 방어력 +18, 치명타 확률 +15%, 쿨다운 감소 +10%", "[제작] 포스 코어 + 운명의 꽃\n노라색 항공 보급", "전설")
                item.up("", "", "", "", "")
                item.down("포스 코어", "운명의 꽃", "", "", "")
            }
            if (defend_Item[i].name1 == "비파단도") {
                item.te("비파단도", "공격력 +5, 스킬증폭 +8%", "[제작]\n녹슨 검 + 마패", "고급")
                item.up("월왕구천", "", "", "", "")
                item.down("녹슨 검", "마패", "", "", "")
            }
            if (defend_Item[i].name1 == "월왕구천") {
                item.te("월왕구천", "공격력 +15, 스킬증폭 20%", "[제작]\n비파단도 + 정교한 도면", "희귀")
                item.up("", "", "", "", "")
                item.down("비파단도", "정교한 도면", "", "", "")
            }
            if (defend_Item[i].name1 == "요명월") {
                item.te("요명월", "방어력 +11, 스태미너 재생 +160%, 고정 스킬 피해 감소 +18, 시야 +1.5", "[제작]\n정화수 + 문스톤", "영웅")
                item.up("", "", "", "", "")
                item.down("정화수", "문스톤", "", "", "")
            }
            if (defend_Item[i].name1 == "천사의 고리") {
                item.te("천사의 고리", "공격력 +35, 방어력 +30, 최대 스태미너 +300, 치명타 피해량 감소 +8%", "[제작]\n머리테 + 포스 코어", "전설")
                item.up("", "", "", "", "")
                item.down("머리테", "포스 코어", "", "", "")
            }
}

        //////////////////////////
        return defend.ViewHolder(view).apply {
            imagebutton1.setOnClickListener()
            {
                item.reset()
                val curpos: Int = adapterPosition
                for (i in defend_Item.indices) {
                    if (curpos == i) {
                        item.ImageView1.setImageResource(defend_Item[i].Image1)
                        Log.d("확인", i.toString())

                        defendarray(i)

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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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
                                item.imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = item.imsi.drawable
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

    override fun onBindViewHolder(holder: defend.ViewHolder, position: Int) {
        holder.imagebutton1.setImageResource(defend_Item.get(position).Image1)
        holder.name1.text = defend_Item.get(position).name1.toString()
    }

    override fun getItemCount(): Int { //아이템리스트 코틀린의 사이즈 리턴.
        return defend_Item.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name1 = itemView.findViewById<TextView>(R.id.name1)
        val imagebutton1 = itemView.findViewById<ImageButton>(R.id.imagebutton1)

    }
    class defend_Item_list(val name1: String, val Image1: Int) {
    }
}
