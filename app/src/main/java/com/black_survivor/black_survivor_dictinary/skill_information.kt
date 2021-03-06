package com.black_survivor.black_survivor_dictinary

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.black_survivor.black_survivor_dictinary.databinding.ActivitySkillInformationBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class skill_information : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySkillInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}
        var adview9 = findViewById<AdView>(R.id.adView9)
        adview9.loadAd(AdRequest.Builder().build())

        var a = -1
        binding.change.visibility = View.GONE
        binding.texc.visibility = View.GONE

        fun changeskill(click: Int, name: String) {
            when (click) {
                1 -> {
                    if (name == "실비아") {
                        binding.skill2.setImageResource(R.drawable.m_silvia_bike_q)
                        binding.qName.text = "[ Q ] 파워 슬라이드"
                        var spanq: Spannable = binding.qName.text as Spannable
                        spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.qExeplan1.text =
                                "실비아가 바이크로 선회하며 범위 내의 적들에게 60/102/144/186/228(+공격력의 70%)의 피해를 입힙니다. \n" +
                                        "스킬 사용 중 이동이 가능합니다."
                        binding.qExeplan2.text = "쿨다운 : 3.5/3/2.5/2/1.5초\n" +
                                "피해 범위 : 2.5m\n" +
                                "연료 5 소모"

                        binding.skill3.setImageResource(R.drawable.m_silvia_bike_w)
                        binding.wName.text = "[ W ] 프론트 플립"
                        var spanw: Spannable = binding.wName.text as Spannable
                        spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.wExeplan1.text =
                                "실비아가 바라보는 방향으로 점프하여 범위 안의 적들에게 90/130/170/210/250(+공격력의 60%)의 피해를 입히고 0.4초 간 공중에 띄웁니다."
                        binding.wExeplan2.text =
                                "쿨다운 : 10/9/8/7/6초\n" +
                                        "사거리 : 3.5m, 피해 범위 : 1.75m\n" +
                                        "연료 5 소모"

                        binding.skill4.setImageResource(R.drawable.m_silvia_bike_e)
                        binding.eName.text = "[ E ] 윌리"
                        var spane: Spannable = binding.eName.text as Spannable
                        spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.eExeplan1.text = "실비아가 지정한 적에게 바이크의 앞바퀴를 들며 돌진하여 40/65/90/115/140(+공격력의 60%)의 피해를 주고 1m만큼 밀어냅니다.\n" +
                                "바이크의 현재 이동속도의 6/10/14/18/22배의 추가 피해를 입힙니다."
                        binding.eExeplan2.text =
                                "쿨다운 : 14/13/12/11/10초\n" +
                                        "사거리 : 4m\n" +
                                        "연료 5 소모"

                        binding.skill5.setImageResource(R.drawable.m_silvia_bike_r)
                        binding.rName.text = "[ R ] 기동전"
                        var spanr: Spannable = binding.rName.text as Spannable
                        spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.rExeplan1.text = "실비아가 바이크에서 내려 인간 폼으로 돌아옵니다.\n" +
                                "3초 이내의 다음 기본공격은 100%/125%/150%의 피해를 줍니다."
                        binding.rExeplan2.text = "스태미너 소모 : 없음\n쿨다운 : 2초"
                    } else if (name == "바바라") {
                        binding.skill2.setImageResource(R.drawable.barbara_q2)
                        binding.qName.text = "[ Q ] BT-Mk2 센트리건"
                        var spanq: Spannable = binding.qName.text as Spannable
                        spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.qExeplan1.text = "숏 서킷: (오버 클럭 Q): 바바라가 센트리건을 설치하고 해당 위치로 순간이동합니다. 기존에 설치되어 있던 센트리건은 자폭하며 50/75/100(+공격력의 40%)의 피해를 입힙니다.\n" +
                                "바바라가 순간이동 후, 주위에 적들에게 50/75/100(+공격력의 60%)의 피해를 입히며 4초 동안 피해를 입은 적 당 센트리건의 공격속도가 10% 상승합니다.\n" +
                                "오버클럭 숏 서킷 사용 시 오버 클럭의 쿨다운이 20% 감소합니다."
                        binding.qExeplan2.text = "피해량 : 15/30/45/60/75(+공격력의 15%)\n" +
                                "사정거리 : 7m\n" +
                                "포탑: 3.5m\n" +
                                "스테미너 소모 : 60/70/80/90/100\n" +
                                "쿨다운 : 15초"

                        binding.skill3.setImageResource(R.drawable.barbara_w2)
                        binding.wName.text = "[ W ] 이온 레이저"
                        var spanw: Spannable = binding.wName.text as Spannable
                        spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.wExeplan1.text = "레이저 충전: (오버 클럭): 7초동안 레이저 충전이 되며 지속 기간 동안 이온 레이저와 센트리 건의 레일건 피해량이 5/10/15%상승합니다. 센트리건은 레이저 충전 상태동안 일반 공격이 강화되어 레일건으로 공격합니다.\n" +
                                "이온 레이저(W)의 스태미너 소모량이 사라지고 쿨다운이 97% 감소합니다.\n"
                        binding.wExeplan2.text = "피해량 : 30/60/90/120/150 (+공격력의 25%)\n" +
                                "레일건 피해량 : 40/80/120/160/200 (+센트리건 공격력의 50%)\n" +
                                "사정거리 : 7m\n" +
                                "스테미너 소모 : 50/60/70/80/90\n" +
                                "쿨다운 : 4초"

                        binding.skill4.setImageResource(R.drawable.barbara_e2)
                        binding.eName.text = "[ E ] 자력 폭풍"
                        var spane: Spannable = binding.eName.text as Spannable
                        spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.eExeplan1.text = "광자력 폭풍 (오버 클럭) : 자력 폭풍 범위가 유지시간 동안 점점 커집니다." +
                                "스킬을 다시 사용시 or 5초 후, 범위 내의 적들에게 60/80/100/120/140(+공격력의 35%)의 피해와 1.25초 동안 스턴을 주며 자력 폭풍보다 추가로 20/25/30%의 보호막을 얻습니다."
                        binding.eExeplan2.text = "피해량 : 5/8/10/13/16 (+공격력의 5%) (+적 최대 체력의 0.5/1/1.5/2/2.5%)\n" +
                                "폭발 피해 : 60/80/100/120/140 (+공격력의 35%)\n" +
                                "스테미너 소모 : 80/90/100/110/120\n" +
                                "쿨다운 : 20/18/16/14/12초"
                    }
                    else if (name == "알렉스") {

                        binding.skill2.setImageResource(R.drawable.alex_melee_q)
                        binding.qName.text = "[ Q ] 기습"
                        var spanq: Spannable = binding.qName.text as Spannable
                        spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.qExeplan1.text = "알렉스가 대상에게 빠르게 돌진하여 의 피해를 입힙니다.\n" +
                                "적중한 대상이 있다면 12초 동안 공격력이 4% 증가합니다.\n" +
                                "이 효과는 최대 3회 중첩되며, 코일건(원거리 Q)과도 중첩됩니다."
                        binding.qExeplan2.text = "피해량 : 30/65/100/135/170(+공격력의 40%)\n" +
                                "사정거리 : 4m\n" +
                                "스테미너 소모 : 50/55/60/65/70\n" +
                                "쿨다운 : 8.5/7.5/6.5/5.5/4.5초"

                        binding.skill3.setImageResource(R.drawable.alex_melee_w)
                        binding.wName.text = "[ W ] 플라즈마 마인"
                        var spanw: Spannable = binding.wName.text as Spannable
                        spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.wExeplan1.text = "알렉스가 지정한 지점에 플라즈마 마인을 발사하여 0.7초 후 범위 안의 적들에게 피해를 입히고 중심부로 끌어당깁니다."
                        binding.wExeplan2.text = "피해량 : 60/90/120/150/180(+공격력의 40%)\n" +
                                "사정거리 : 6.5m\n" +
                                "피해 범위:2.2m\n" +
                                "스테미너 소모 : 50/55/60/65/70\n" +
                                "쿨다운 : 10초"

                        binding.skill4.setImageResource(R.drawable.alex_melee_e)
                        binding.eName.text = "[ E ] 교란"
                        var spane: Spannable = binding.eName.text as Spannable
                        spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.eExeplan1.text = "지속 효과 : 알렉스의 치명타 확률이 6/9/12/15/18% 증가합니다.\n" +
                                "알렉스가 5초 동안 유지되는 홀로그램 분신을 생성하고, 지정한 방향으로 빠르게 이동하며 즉시 잠입상태가 됩니다. 홀로그램 분신은 범위 안의 적들에게 도발을 하여 1초 동안 자신을 공격하게 합니다.\n" +
                                "(도발 범위 2.5m)\n" +
                                "분신이 지속되는 동안 교란의 기본 지속 효과가 2배로 적용됩니다.\n" +
                                "스킬 사용 후 잠입 상태를 1초 동안 유지하면, 무기를 변경할 수 있는 상태가 됩니다.\n" +
                                "이 상태는 5초 동안 지속되며, 잠입이 해제되거나 무기를 변경하면 즉시 사라집니다.\n" +
                                "\n" +
                                "잠입 효과는 6레벨 이후에 적용됩니다."
                        binding.eExeplan2.text = "사정거리 : 2m\n" +
                                "스테미너 소모 : 50/55/60/65/70\n" +
                                "쿨다운 : 16초"
                    }
                }

                -1 ->
                    if (name == "실비아") {
                        binding.passiveName.text = "[ Passive ] 그란투리스모"
                        var span: Spannable = binding.passiveName.text as Spannable
                        span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.passiveExeplan1.text = "실비아는 연구소를 제외한 새로운 지역에 진입 할 때마다 공격 속도, 스킬 증폭이 증가합니다.\n" +
                                "15개 지역을 모두 탐색하면 스킬 증폭이 15% 증가합니다.\n" +
                                "30초 마다 다른 지역에 진입하면 1초 후 연료를 획득합니다.\n" +
                                "바이크에 타지 않은 상태에서 3초 마다 1의 연료를 획득합니다."
                        binding.passiveExeplan2.text = "공격속도 증가량 1 / 2 / 3%\n" +
                                "연료 획득량 7 / 9 / 11%\n" +
                                "스킬 증폭 증가량 0.6 / 0.9 / 1.2 %"

                        binding.skill2.setImageResource(R.drawable.silvia_human_q)
                        binding.qName.text = "[ Q ] 스피드건"
                        var spanq: Spannable = binding.qName.text as Spannable
                        spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.qExeplan1.text =
                                "실비아가 대상을 지정하여 스피드건을 쏘아 경로 상의 적들에게 30/65/100/135/170(+공격력의 40%)의 피해를 입히고, 자신과 경로상의 아군들에게는 40/60/80/100/120(+공격력의 50%)의 체력을 회복시킵니다.\n" +
                                        "자신을 제외한 스킬에 적중한 대상의 수만큼 각각 5의 연료를 획득합니다."
                        binding.qExeplan2.text = "쿨다운 : 7.5/6.75/6/5.25/4.5초\n" +
                                "타겟 지정 거리 : 5m, 피해 범위 : 7m, 너비 : 1m\n" +
                                "스태미너 소모 : 50/60/70/80/90"

                        binding.skill3.setImageResource(R.drawable.silvia_human_w)
                        binding.wName.text = "[ W ] 피니시라인"
                        var spanw: Spannable = binding.wName.text as Spannable
                        spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.wExeplan1.text =
                                "실비아가 지정한 위치에 피니시라인을 생성하여 라인에 닿은 적에게 40/60/80/100/120(+공격력의 30%)의 피해를 입히고, 이동속도를 2초 동안 25/35/45/55/65%만큼 느려지게 합니다. 이동속도 감소 효과는 한 번만 적용됩니다."
                        binding.wExeplan2.text =
                                "쿨다운 : 16/15/14/13/12초\n" +
                                        "사거리 : 7m, 너비 : 5/5.5/6/6.5/7m\n" +
                                        "스태미너 소모 : 35/40/45/50/55"

                        binding.skill4.setImageResource(R.drawable.silvia_human_e)
                        binding.eName.text = "[ E ] 스페어휠"
                        var spane: Spannable = binding.eName.text as Spannable
                        spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.eExeplan1.text = "실비아가 지정한 방향으로 스페어휠을 굴려 적중한 적에게 거리에 따라 80/100/120/140/160(+공격력의 60%)에서 최대 154/187/220/253/286(+공격력의 132%)의 피해를 입힙니다.\n" +
                                "적이 3m 안에서 적중되면 밀려납니다. 3m 밖에서 적중하면, 적중한 거리에 따라 2~24의 연료를 획득합니다."
                        binding.eExeplan2.text =
                                "쿨다운 : 13/12/11/10/9초\n" +
                                        "사거리 : 15m, 너비 : 1m\n" +
                                        "스태미너 소모 : 50/60/70/80/90"

                        binding.skill5.setImageResource(R.drawable.silvia_human_r)
                        binding.rName.text = "[ R ] 기동전"
                        var spanr: Spannable = binding.rName.text as Spannable
                        spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.rExeplan1.text = "실비아가 바이크에 탑승하여 1초마다 5의 연료를 소모하며, 기본 이동속도가 0.30/0.375/0.45만큼 증가하고 바이크 스킬을 사용할 수 있습니다."
                        binding.rExeplan2.text = "연료가 30이상일 때 스킬을 사용할 수 있습니다.\n" +
                                "바이크 상태에서는 기본 공격과 무기 스킬을 사용할 수 없습니다.\n" +
                                "처음 바이크 모드로 변경하면 1.5초 동안 예열을 합니다. 예열 시간 동안 이동속도가 40/20/0% 감소합니다.\n" +
                                "바이크 탑승 시 방어력이 2/16/30 증가합니다.\n" +
                                "바이크는 10도 이내의 선회각으로 이동하면 속력이 서서히 증가하여 최대 70%까지 증가합니다.\n" +
                                "10도 이상 회전하면 회전각에 비례해 최대 80%까지 감속합니다."
                    } else if (name == "바바라") {
                        binding.skill1.setImageResource(R.drawable.barbara_t)
                        binding.passiveName.text = "[ Passive ] 개조"
                        var span: Spannable = binding.passiveName.text as Spannable
                        span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.passiveExeplan1.text = "'바바라 레벨에 비례하여 공격력의 6.5%, 방어력의 4.5%만큼 센트리건이 강화됩니다.'\n" +
                                "'센트리건이 레일건에 적중하거나 자력 폭풍을 생성할 때마다 공격속도가 상승하며, 최대 3번 중첩됩니다.'"
                        binding.passiveExeplan2.text = "공격속도 : 15/20/25%"


                        binding.skill2.setImageResource(R.drawable.barbara_q)
                        binding.qName.text = "[ Q ] BT-Mk2 센트리건"
                        var spanq: Spannable = binding.qName.text as Spannable
                        spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.qExeplan1.text = "바바라가 지정한 위치에 150(+바바라 최대 체력의 12/16/20/24/28%)의 체력을 가진 센트리건을 설치하여 범위 안의 적들에게 피해를 입힙니다.\n" +
                                "센트리건은 15초 동안 유지하고 주위에 적에게 총알을 발사하여 15(+바바라 레벨 X 바바라 공격력의 7.5%)의 피해를 입힙니다.\n" +
                                "센트리건이 설치될 때 전에 설치한 센트리건은 부서지며, 설치한 센트리건이 바바라와 멀어지면 센트리건을 회수하고 쿨다운이 30% 감소합니다."
                        binding.qExeplan2.text = "피해량 : 15/30/45/60/75(+공격력의 15%)\n" +
                                "사정거리 : 7m\n" +
                                "포탑: 3.5m\n" +
                                "스테미너 소모 : 60/70/80/90/100\n" +
                                "쿨다운 : 15초"

                        binding.skill3.setImageResource(R.drawable.barbara_w)
                        binding.wName.text = "[ W ] 이온 레이저"
                        var spanw: Spannable = binding.wName.text as Spannable
                        spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.wExeplan1.text = "'바바라가 고출력 포신으로 이온 레이저를 두 발 발사하여 경로상의 적들에게 각각 의 피해를 입히고, 이동속도를 1.5초 동안 20% 감소시킵니다.\n" +
                                "두 발에 동시에 적중된 적에게는 각 레이저 피해량이 35%감소하고, 오버 클럭(R) 쿨다운이 1초 감소됩니다.\n" +
                                "센트리건에 레이저가 적중하면 센트리건이 충전되고, 적에게 레일건을 발사하여 적들에게 피해를 입힙니다."
                        binding.wExeplan2.text = "피해량 : 30/60/90/120/150 (+공격력의 25%)\n" +
                                "레일건 피해량 : 40/80/120/160/200 (+센트리건 공격력의 50%)\n" +
                                "사정거리 : 7m\n" +
                                "스테미너 소모 : 50/60/70/80/90\n" +
                                "쿨다운 : 4초"

                        binding.skill4.setImageResource(R.drawable.barbara_e)
                        binding.eName.text = "[ E ] 자력 폭풍"
                        var spane: Spannable = binding.eName.text as Spannable
                        spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.eExeplan1.text = "'바바라가 최대 4초 동안 유지되는 자력폭풍을 자신과 센트리건에 함께 생성하여 자신의 이동속도를 20% 증가시키고 범위 안의 적들에게 0.5초 마다 고정 피해를 입힙니다.'\n" +
                                "스킬을 다시 사용하거나, 지속시간이 끝나면 자력 폭풍은 폭발하며 범위 안의 적들에게 피해를 입히고, 자력 폭풍이 유지한 동안 입힌 모든 피해량의 30%만큼 보호막을 획득합니다.\n" +
                                "보호막은 바바라 최대 체력의 50% 까지 획득할 수 있습니다.\n" +
                                "바바라와 센트리건의 자력 폭풍 폭발 피해를 동시에 받은 적은 0.75초 동안 기절합니다."
                        binding.eExeplan2.text = "피해량 : 5/8/10/13/16 (+공격력의 5%) (+적 최대 체력의 1/1.5/2/2.5/3%)\n" +
                                "폭발 피해 : 60/80/100/120/140 (+공격력의 35%)\n" +
                                "스테미너 소모 : 80/90/100/110/120\n" +
                                "쿨다운 : 20/18/16/14/12초"

                        binding.skill5.setImageResource(R.drawable.barbara_r)
                        binding.rName.text = "[ R ] 오버 클럭"
                        var spanr: Spannable = binding.rName.text as Spannable
                        spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.rExeplan1.text = "'오버 클럭 스킬을 사용하면 즉시 다음 Q, W, E 스킬을 사용할 수 있으며, 각 스킬에 따라 추가효과가 발동됩니다."
                        binding.rExeplan2.text = "스테미너 소모 : 100(모든 구간)\n" +
                                "쿨다운 : 95/80/65초"
                    }
                    else if (name == "알렉스") {
                        binding.skill1.setImageResource(R.drawable.alex_passive)
                        binding.passiveName.text = "[ Passive ] 잠입"
                        var span: Spannable = binding.passiveName.text as Spannable
                        span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.passiveExeplan1.text = "알렉스는 6레벨 부터 7초 동안 전투를 하지 않으면 잠입상태가 되어 탐지 범위 바깥의 적은 알렉스를 볼 수 없습니다.\n" +
                                "잠입 상태가 될 때, 탐지 범위 안에 적이 있으면 이동 속도가 증가합니다.\n" +
                                "알렉스는 착용 가능한 모든 무기의 숙련도가 동일하게 증가합니다.\n" +
                                "근접 무기(톤파, 양손검)를 장착하면 체력(50/100/150)과 방어력(5/10/15)이 증가합니다."
                        binding.passiveExeplan2.text = "잠입 탐지 범위 : 7M\n" +
                                "잠입 경고 범위 : (낮) 12m (밤) 10m"

                        binding.skill2.setImageResource(R.drawable.alex_range_q)
                        binding.qName.text = "[ Q ] 코일 건"
                        var spanq: Spannable = binding.qName.text as Spannable
                        spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.qExeplan1.text = "알렉스가 코일건을 발사하여 적중한 적에게 피해를 입힙니다.\n" +
                                "적중한 대상이 있다면 15초 동안 공격력이 4% 증가합니다. 이 효과는 최대 3회 중첩되며, 기습(근접 Q)과도 중첩됩니다.\n"
                        binding.qExeplan2.text = "피해량 : 50/90/130/170/210(+공격력의 30%)\n" +
                                "체력회복 : 40/60/80/100/120(+0.5 공격력)\n" +
                                "사정거리 : 9m\n" +
                                "스테미너 소모 : 50/60/70/80/90\n" +
                                "쿨다운 : 7/6.5/6/5.5/5초"

                        binding.skill3.setImageResource(R.drawable.alex_range_w)
                        binding.wName.text = "[ W ] 타겟 마커"
                        var spanw: Spannable = binding.wName.text as Spannable
                        spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.wExeplan1.text = "알렉스가 지정한 지점에 타겟 마커를 발사하여 범위 안의 적들에게 피해를 입히고,\n" +
                                "대상의 시야를 1.6/1.8/2.0/2.2/2.4초 동안 제공받습니다.\n" +
                                "스킬이 적중되면 알렉스의 기본 공격 사거리가 2.0/2.2/2.4/2.6/2.8초 동안 1.5m만큼 증가합니다."
                        binding.wExeplan2.text = "피해량 : 40/60/80/100/120(+공격력의 40%)\n" +
                                "사정거리 : 6.5m\n" +
                                "스테미너 소모 : 25/35/45/55/65\n" +
                                "쿨다운 : 13초"

                        binding.skill4.setImageResource(R.drawable.alex_range_e)
                        binding.eName.text = "[ E ] 펄스 스팅"
                        var spane: Spannable = binding.eName.text as Spannable
                        spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.eExeplan1.text = "지속 효과 : 알렉스의 공격속도가 6/9/12/15/18% 증가합니다.\n" +
                                "알렉스가 지정한 방향으로 펄스 스팅을 발사하여 적중한 대상에게 피해를 입히고\n" +
                                "이동속도를 70%만큼 느려지게 했다가 1.5초에 걸쳐 서서히 회복시킵니다.\n" +
                                "동시에, 반대 방향으로 빠르게 이동하며 즉시 잠입 상태가 됩니다.\n" +
                                "스킬 사용 후 잠입 상태를 1초 동안 유지하면, 무기를 한 번 변경할 수 있는 상태가 됩니다.\n" +
                                "이 상태는 5초 동안 지속되며, 잠입이 해제되거나 무기를 변경하면 즉시 사라집니다.\n" +
                                "잠입 효과는 6레벨 이후에 적용됩니다.\n"
                        binding.eExeplan2.text = "피해량 : 40/60/80/100/120(+공격력의 40%)\n" +
                                "사정거리 : 6m\n" +
                                "스테미너 소모 : 90\n" +
                                "쿨다운 : 22/20/18/16/14초"


                        binding.skill5.setImageResource(R.drawable.alex_r)
                        binding.rName.text = "[ R ] 정밀 폭격"
                        var spanr: Spannable = binding.rName.text as Spannable
                        spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                        binding.rExeplan1.text = "알렉스가 지정한 지점에 위성 미사일을 유도하여\n" +
                                "범위 안의 적들에게 피해를 입히고, 중심부의 적들에게는 더 많은 피해를 입힙니다.\n" +
                                "모든 범위의 적중한 대상은 0.6초 동안 이동 속도가 50% 감소됩니다.\n" +
                                "이후 0.5초 간격으로 총 8회에 걸쳐 각각 40/60/80(+공격력의 30%)의 피해를 입히며,\n" +
                                "중심부의 적들에게는 60/80/100(+공격력의 40%)의 피해를 입힙니다. 모든 범위의 적중한 대상은 0.4초 동안 이동 속도가 30% 감소됩니다."
                        binding.rExeplan2.text = "피해량 : 60/90/120 (+공격력의 40%)\n" +
                                "중심부 : 100/125/150(+공격력의 50%)\n" +
                                "사정거리 : 30m\n" +
                                "피해 범위 : 4.5m\n" +
                                "중심 범위 : 2m\n" +
                                "스테미너 소모 : 100\n" +
                                "시전시간 : 즉시 시전\n" +
                                "쿨다운 : 140/130/120초"
                    }
            }
        }
            if (intent.hasExtra("아야")) {
                binding.skill1.setImageResource(R.drawable.aya_ayat)
                binding.passiveName.text = "[ Passive ] 아야의 정의"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "아야가 공격 당하면 잠깐 동안 보호막이 생성되어 피해를 막아줍니다.\n" +
                        "적에게 기본 공격을 할 때마다 아야의 정의의 쿨다운이 조금 감소합니다."
                binding.passiveExeplan2.text = "보호막 : 150/175/200(+0.3 공격력)\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 1.5초\n" +
                        "쿨다운 : 30초\n" +
                        "기본 공격 시 쿨다운 감소량 : 2초"

                binding.skill2.setImageResource(R.drawable.aya_ayaq)
                binding.qName.text = "[ Q ] 2연발"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "아야가 대상을 향해 2번 빠르게 사격합니다.\n" +
                        "2번째 사격은 추가 피해를 줍니다."
                binding.qExeplan2.text = "피해량 : 1.0 공격력 + 35/90/145/200/255(+0.2 공격력)\n" +
                        "사정거리 : 기본 공격 사거리\n" +
                        "스테미너 소모 : 80/90/100/110/120\n" +
                        "쿨다운 : 7/6.5/6/5.5/5초"

                binding.skill3.setImageResource(R.drawable.aya_ayaw)
                binding.wName.text = "[ W ] 고정 사격"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "아야가 한 방향으로 잠시동안 총을 난사합니다"
                binding.wExeplan2.text = "피해량 : 20/40/60/80/100(+0.3/0.35/0.4/0.45/0.5 공격력)×10\n" +
                        "사정거리 : 4m\n" +
                        "스테미너 소모 : 100/110/120/130/140\n" +
                        "시전 시간 : 0.17초\n" +
                        "쿨다운 : 18/16.5/15/13.5/12초"

                binding.skill4.setImageResource(R.drawable.aya_ayae)
                binding.eName.text = "[ E ] 무빙턴"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "아야가 지정한 방향으로 재빠르게 이동합니다."
                binding.eExeplan2.text = "사정거리 : 4m\n" +
                        "스테미너 소모 : 85/90/95/100/105\n" +
                        "시전 시간 : 즉시\n" +
                        "쿨다운 : 20/17/14/11/8초"

                binding.skill5.setImageResource(R.drawable.aya_ayar)
                binding.rName.text = "[ R ] 공포탄"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "아야가 하늘로 공포탄을 발사하여 주변 적들을 놀래킵니다.\n" +
                        "놀란 적들은 피해를 받고 몇초간 행동 불가 상태가 됩니다."
                binding.rExeplan2.text = "피해량 : 200/300/400(+0.6 공격력) ~ 400/600/800(+1.2 공격력)\n" +
                        "사정거리 : 4.5m\n" +
                        "스테미너 소모 : 100\n" +
                        "시전 시간 : 1.17초\n" +
                        "속박 지속 시간 : 0.5초 ~ 최대 1.5/1.75/2초\n" +
                        "쿨다운 : 100/70/40초"

            }
            if (intent.hasExtra("피오라")) {
                binding.skill1.setImageResource(R.drawable.fiora_fiorat)
                binding.passiveName.text = "[ Passive ] 뚜셰 (Touché)"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "피오라가 적에게 기본 공격으로 피해를 입히면 뚜셰 중첩을 얻습니다.\n" +
                        "중첩이 최대가 되면 일정시간 뚜셰 표식이 활성화됩니다."
                binding.passiveExeplan2.text = "활성화 필요 중첩 : 5/4/3"

                binding.skill2.setImageResource(R.drawable.fiora_fiora_q)
                binding.qName.text = "[ Q ] 팡뜨 (Fente)"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "피오라가 지정된 방향으로 무기를 휘둘러 피해를 입힙니다.\n"
                binding.qExeplan2.text = "피해량 : 60/120/180/240/300(0.25 공격력))\n" +
                        "뚜셰 활성화 시 피해량 : 피해량 120% + 치명타 피해 증가율\n" +
                        "사정거리 : 5.5m, 폭:1.3\n" +
                        "스테미너 소모 : 40/50/60/70/80\n" +
                        "시전 시간 : 0.33초\n" +
                        "이동속도 감소 1.5초간 15%\n" +
                        "표식을 터뜨릴 경우 이동속도 감소 1.5초간 70% 추가\n" +
                        "쿨다운 : 9/8/7/6/5초\n"

                binding.skill3.setImageResource(R.drawable.fiora_fioraw)
                binding.wName.text = "[ W ] 아따끄 꽁뽀제 (Attaque Composée)"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "피오라의 다음 기본 공격이 빠르게 대상을 두 번 공격하게 됩니다.\n" +
                        "피오라가 뚜셰 표식을 터뜨릴 때마다 아따끄 꽁뽀제의 쿨다운 시간이 5초씩 감소합니다."
                binding.wExeplan2.text = "첫 번째 공격 피해량: (0.6/0.7/0.8/0.9/1.0 공격력)\n" +
                        "두 번째 공격 피해량 :공격력의 20/30/40/50/60%\n" +
                        "스테미너 소모 : 70\n" +
                        "시전 시간 : 0.5초\n" +
                        "지속 시간 : 4초\n" +
                        "쿨다운 : 20/17/14/11/8초"

                binding.skill4.setImageResource(R.drawable.fiora_fiora_e)
                binding.eName.text = "[ E ] 마르셰 & 롱빼 (Marche & Rompre)"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "피오라가 지정한 방향으로 돌진해서 부딪힌 적에게 피해를 입히고 몇초간 이동속도를 감소 시킵니다."
                binding.eExeplan2.text = "피해량 : 90/130/170/210/250(+0.4 공격력)\n" +
                        "뚜셰 활성화 시 피해량 : 피해량 120% + 치명타 피해 증가율\n" +
                        "뚜셰 활성화 시 팡뜨 쿨다운 감소 : 4초\n" +
                        "사정거리 : 5m,4m\n" +
                        "스테미너 소모 : 100\n" +
                        "시전 시간 : 0.2초\n" +
                        "지속 시간 : 1.5초\n" +
                        "쿨다운 : 16/14/12/10/8초\n"

                binding.skill5.setImageResource(R.drawable.fiora_fiora_r)
                binding.rName.text = "[ R ] 갸르드"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "피오라가 정교한 자세를 취하며 보다 강력한 공격을 합니다.\n" +
                        "기본 공격을 할 때마다 스테미너를 소비하며 추가 피해를 입힙니다.\n"
                binding.rExeplan2.text = "피해량 : 20/35/50(+공격력의 4/18/32%)\n" +
                        "사정거리 : 기본 공격 사거리\n" +
                        "스테미너 소모 : 20/40/60\n" +
                        "시전 시간 : 즉시(활성화/비활성화 가능)\n" +
                        "쿨다운 : 1초(비활성화시)"
            }
            if (intent.hasExtra("재키")) {
                binding.skill1.setImageResource(R.drawable.jackie_jackie_t)
                binding.passiveName.text = "[ Passive ] 피의 축제"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "재키가 누군가를 처치하면 일시적으로 공격력이 상승합니다.\n" +
                        "\n" +
                        "※2가지의 피의 축제 효과는 중첩 됩니다.\n"
                binding.passiveExeplan2.text = "다른 플레이어나 곰 처치 시 공격력 상승: 5%/12%/25%\n" +
                        "곰 이외의 야생동물 처치 시 공격력 상승: 3%/8%/15%\n" +
                        "지속시간: 25/27.5/30초"

                binding.skill2.setImageResource(R.drawable.jackie_jackie_q)
                binding.qName.text = "[ Q ] 연참"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "재키가 지정한 방향으로 무기를 두 번 휘둘러서 피해를 입힙니다.\n" +
                        "피해를 입은 대상은 6초 동안 '출혈' 에 걸려 추가 피해를 입습니다.\n"
                binding.qExeplan2.text = "1타 피해량 : 30/65/100/135/180(+0.25 공격력)\n" +
                        "2타 피해량: 20/45/70/95/120(+0.65 공격력)\n" +
                        "출혈: 120/150/180/210/240\n" +
                        "사정거리 : 2.5m\n" +
                        "스테미너 소모: 50/60/70/80/90\n" +
                        "출혈 지속시간: 5초\n" +
                        "시전시간: 0.17초\n" +
                        "쿨다운 : 10/9.5/9/8.5/8초\n"

                binding.skill3.setImageResource(R.drawable.jackie_jackie_w)
                binding.wName.text = "[ W ] 아드레날린 분비"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "재키가 아드레날린을 활성화하여 몇초간 이동속도가 증가합니다.\n" +
                        "활성화된 동안 '출혈' 에 걸린 적을 공격하면 추가 피해를 입히고 재키의 체력이 회복 됩니다.\n" +
                        "출혈중인 적 방향으로 이동 시 추가 이동 속도를 부여받습니다."
                binding.wExeplan2.text = "출혈 대상 추가 피해: +0.1/0.12/0.15/0.17/0.2 공격력\n" +
                        "이동 속도 증가: +8%/11%/14%/17%/20%\n" +
                        "체력 회복: 12/19/26/33/40(+0.1 공격력)\n" +
                        "스테미너 소모: 90/100/110/120/130\n" +
                        "시전시간: 즉시\n" +
                        "지속시간 : 5초\n" +
                        "쿨다운 : 17/16/15/14/13초"

                binding.skill4.setImageResource(R.drawable.jackie_jackie_e)
                binding.eName.text = "[ E ] 습격"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "재키가 지정한 위치로 점프하여 주변의 적들에게 피해를 입힙니다.\n" +
                        "'출혈' 에 걸린적은 몇초간 이동속도가 감소합니다.\n"
                binding.eExeplan2.text = "피해량: 10/70/130/190/250(+ 0.3/0.4/0.5/0.6/0.7 공격력)\n" +
                        "일반 적중 시 둔화 : 25%\n"
                "출혈에 걸린 적 명중 시 둔화: 45%\n" +
                        "사정거리 : 6m\n" +
                        "스테미너 소모: 70/85/100/115/130\n" +
                        "시전시간: 즉시\n" +
                        "쿨다운 : 20/18/16/14/12초"

                binding.skill5.setImageResource(R.drawable.jackie_jackie_r)
                binding.rName.text = "[ R ] 전기톱 살인마"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "재키가 몇초간 전기톱을 꺼내듭니다.\n" +
                        "공격속도가 증가하고 기본 공격으로 출혈을 걸 수 있습니다.\n" +
                        "전기톱 살인마 효과가 끝날때 전기톱을 크게 휘둘러 재키 주변에 피해를 입히고 원래 무기로 돌아옵니다.\n" +
                        "스킬 시전 7초 후 재사용 시 효과 종료 스킬 발동이 가능합니다."
                binding.rExeplan2.text = "공격 속도 증가: 20%/25%/30%\n" +
                        "효과 종료 시 피해량: 300/500/700(+1.0 공격력)\n" +
                        "사정거리: 기본 공격 사거리 + 3m\n" +
                        "스테미너 소모 : 120/150/180\n" +
                        "시전시간: 즉시\n" +
                        "지속시간: 15초\n" +
                        "쿨다운 : 120/100/80초"
            }
            if (intent.hasExtra("현우")) {
                binding.skill1.setImageResource(R.drawable.hyunwoo_hyunwoo_t)
                binding.passiveName.text = "[ Passive ] 도그파이트"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "현우가 적을 공격하거나 공격 받을 때마다 도그파이트 중첩을 얻습니다.\n" +
                        "도그파이트가 활성화되면 다음 기본 공격으로 체력을 회복합니다.\n" +
                        "적 타격시: 중첩 4를 얻습니다.\n" +
                        "피격시 : 중첩 1을 얻습니다.\n" +
                        "활성화 수치: 55 중첩"
                binding.passiveExeplan2.text = "활성화 필요 중첩 : 55\n" +
                        "체력 회복 : 최대 체력의 4%/8%/12%\n" +
                        "시전 시간 : 즉시"

                binding.skill2.setImageResource(R.drawable.hyunwoo_hyunwoo_q)
                binding.qName.text = "[ Q ] 발 밟기"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "현우가 지정된 위치를 강하게 밟아, 밟힌 적에게 피해를 입히고 잠시 동안 이동속도를 감소시킵니다."
                binding.qExeplan2.text = "피해량 : 100/150/200/250/300(+0.3 공격력)\n" +
                        "이동 속도 감소 : -40%\n" +
                        "사정거리 : 3m\n" +
                        "스테미너 소모 : 60/70/80/90/100\n" +
                        "시전 시간 : 즉시\n" +
                        "둔화 지속 시간 : 2초\n" +
                        "쿨다운 : 8.5/7.5/6.5/5.5/4.5초"

                binding.skill3.setImageResource(R.drawable.hyunwoo_hyunwoo_w)
                binding.wName.text = "[ W ] 허세"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "현우가 허세를 발동하여 잠시 동안 방어력을 얻습니다.\n" +
                        "허세가 발동된 후 잠깐 동안 이동방해효과를 무시합니다."
                binding.wExeplan2.text = "추가 방어력 : 6/20/34/48/62(+ 0.1 방어력)\n" +
                        "스테미너 소모 : 50\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간(방어력 증가) : 2.5초\n" +
                        "지속 시간(방해 효과 무시) : 1초\n" +
                        "쿨다운 : 32/27/22/17/12초"

                binding.skill4.setImageResource(R.drawable.hyunwoo_hyunwoo_e)
                binding.eName.text = "[ E ] 선빵필승"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "현우가 지정한 방향으로 돌진하며, 적과 부딪히면 대상에게 피해를 입히고 적을 밀어냅니다.\n" +
                        "밀려난 적이 벽에 부딪히면 잠시 동안 기절합니다. \n" +
                        "적중 시 쿨다운이 20% 감소합니다."
                binding.eExeplan2.text = "처음 적과 부딪힐 때 피해 : 상대방 현재 체력의 5%/8%/11%/14%/17%(+0.8 방어력)\n" +
                        "벽에 부딪힐 시 추가 피해 : 60/95/130/165/200(+ 0.15 방어력)\n" +
                        "방어력 감소 : 7/9/11/13/15%\n" +
                        "사정거리 : 5m\n" +
                        "스테미너 소모 : 70/75/80/85/90\n" +
                        "기절 지속 시간 : 1.5초\n" +
                        "쿨다운 : 18/17/16/15/14초\n"

                binding.skill5.setImageResource(R.drawable.hyunwoo_hyunwoo_r)
                binding.rName.text = "[ R ] 핵펀치"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "현우가 힘을 충전한 후 강력한 한 방을 날려 피해를 입힙니다.\n" +
                        "힘을 모은 시간에 따라 공격 범위와 피해량이 증가합니다."
                binding.rExeplan2.text = "피해량 : 200~600/300~900/400~1200(+0.7~2.1 공격력)\n" +
                        "사정거리 : 3m ~ 4.2m\n" +
                        "스테미너 소모 : 150\n" +
                        "시전 시간 : 1.2 ~ 3초\n" +
                        "쿨다운 : 70/65/60초"
            }
            if (intent.hasExtra("아드리아나")) {
                binding.skill1.setImageResource(R.drawable.adriana_adriana_t)
                binding.passiveName.text = "[ Passive ] 활활"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "아드리아나는 스킬을 사용하여 화염지대를 생성 할 수 있습니다.\n" +
                        "화염지대의 대상은 화상 지속 피해를 받고 이동속도가 감소됩니다.\n" +
                        "화상은 중첩 될 때마다 피해량이 증가합니다.\n" +
                        "화염지대가 유지되는 동안 아드리아나는 스태미너를 회복합니다."
                binding.passiveExeplan2.text = "기본 피해량 : 0.56초마다 4/8/12(+0.2 공격력)\n" +
                        "중첩 당 증가 피해량 : 20%(최대 10회 중첩)\n" +
                        "이동 속도 감소: 30%\n" +
                        "스태미너 회복 : 0.5초마다 최대 스태미너의 1/1.5/2%"

                binding.skill2.setImageResource(R.drawable.adriana_adriana_q)
                binding.qName.text = "[ Q ] 방화"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "아드리아나가 지정한 방향으로 화염방사기의 불길을 뿜어내어 고정 피해를 입힙니다.\n" +
                        "(고정 피해는 방어력을 무시하며 스킬 증폭의 영향을 받지 않습니다.)"
                binding.qExeplan2.text =
                        "피해량 : 0.23초마다 12/15/18/21/24(+0.1/0.15/0.2/0.25/0.3 공격력)x9\n" +
                                "사정거리: 6m, 폭: 0.9m\n" +
                                "스태미너 소모 : 30/50/70/90/110\n" +
                                "지속시간 : 2초\n" +
                                "쿨다운 : 7/6.5/6/5.5/5초"

                binding.skill3.setImageResource(R.drawable.adriana_adriana_w)
                binding.wName.text = "[ W ] 기름 뿌리기"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "아드리아나가 지정한 위치에 기름을 발사하여 일정시간 유지되는 기름 지대를 생성합니다.\n" +
                        "기름 지대에 스킬을 사용하여 불을 붙이면 5초 간 유지되는 화염지대가 생성됩니다.\n" +
                        "기름지대 안의 적은 이동속도가 감소하며 이동 스킬을 사용할 수 없습니다."
                binding.wExeplan2.text = "이동속도 감소 : 30%\n" +
                        "사정거리 : 12m\n" +
                        "스태미너 소모 : 80\n" +
                        "지속시간 : 5초\n" +
                        "쿨다운 : 0.3초\n" +
                        "충전 시간: 22/18.5/15/11.5/8초(최대 2개 충전 가능)\n"

                binding.skill4.setImageResource(R.drawable.adriana_adriana_e)
                binding.eName.text = "[ E ] 불길 쇄도"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "아드리아나가 지정한 방향으로 돌진합니다.\n" +
                        "아드리아나가 이동한 경로에 5초 간 유지되는 화염지대가 생성됩니다."
                binding.eExeplan2.text = "사정거리 : 6m\n" +
                        "스태미너 소모 : 80\n" +
                        "쿨다운 : 20/19/18/17/16초"

                binding.skill5.setImageResource(R.drawable.adriana_adriana_r)
                binding.rName.text = "[ R ] 화염 난사"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "아드리아나가 지정한 위치로 화염병을 던집니다.\n" +
                        "바닥에 떨어진 화염병은 폭발하면서 피해를 입히고 바깥으로 밀어냅니다.\n" +
                        "화염병이 폭발한 자리에는 5초 간 화염지대가 생성되며, 화염병은 일정 시간마다 충전되며 최대 3회 충전됩니다."
                binding.rExeplan2.text = "피해량 : 70/130/190(+0.4 공격력)\n" +
                        "사정거리 : 14m,범위 반지름 1.5m\n" +
                        "스태미너 소모 : 120/150/180\n" +
                        "쿨다운 : 40/32/24초(최대 3회 충전 가능, 0.3초 투척 쿨타임)"
            }
            if (intent.hasExtra("키아라")) {
                binding.skill1.setImageResource(R.drawable.chiara_chiara_t)
                binding.passiveName.text = "[ Passive ] 낙인"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "키아라의 스킬에 적중된 적은 낙인이 새겨져 방어력이 감소됩니다.\n" +
                        "낙인은 6초 동안 유지되며 최대 4 까지 중첩됩니다.\n" +
                        "낙인 중첩이 최대까지 쌓인 적이 있으면 키아라의 이동 속도가 6초 동안 상승합니다."
                binding.passiveExeplan2.text = "낙인 1개당 방어력 감소량: 2 / 4 / 6%\n" +
                        "낙인 4중첩 시 얻는 추가 이동속도: 4 / 6 / 8%"

                binding.skill2.setImageResource(R.drawable.chiara_chiara_q)
                binding.qName.text = "[ Q ] 부정의 손길"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "키아라가 지정한 방향으로 부정한 기운을 분출하여 경로상의 적들에게 피해를 줍니다.\n" +
                        "부정한 기운은 1.2초 동안 유지되며 이동 속도를 30%만큼 감소시킵니다.\n" +
                        "0.5초 이상 스킬을 누르고 있으면 부정한 기운을 발사 할 수 있습니다.\n" +
                        "스킬을 0.5초 이하로 짧게 사용하면 쿨다운이 20% 감소합니다."
                binding.qExeplan2.text = "피해량 : 60/100/140/180/200 (+0.6 공격력)\n" +
                        "사정거리 : 4.5m-10m\n" +
                        "스테미너 소모 : 50/55/60/65/70\n" +
                        "쿨다운 : 10/9/8/7/6초"

                binding.skill3.setImageResource(R.drawable.chiara_chiara_w1)
                binding.wName.text = "[ W ] 뒤틀린 기도"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "키아라가 피해를 흡수하는 보호막을 생성하여 6초 동안 유지시킵니다.\n" +
                        "3초후 보호막이 남아있으면 스킬을 다시 사용하여 보호막을 폭발시킬 수 있게 됩니다.\n" +
                        "보호막이 폭발하면 범위 안의 적들에게 피해를 입힙니다."
                binding.wExeplan2.text = "피해량 : 80/120/160/200/240(+0.6 공격력)\n" +
                        "보호막 흡수량: 90/125/160/195/230(+0.75 공격력)\n" +
                        "사정거리 : 5.5m\n" +
                        "스테미너 소모 : 50/60/70/80/90\n" +
                        "시전시간 : 즉시 시전\n" +
                        "쿨다운 : 16/15/14/13/12초"

                binding.skill4.setImageResource(R.drawable.chiara_chiara_e)
                binding.eName.text = "[ E ] 집착"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "키아라가 지정한 방향으로 집착의 사슬을 발사하여 적중한 적에게 피해를 입히고 사슬을 연결합니다.\n" +
                        "사슬의 연결이 2초 이상 유지되면 피해를 입히고 대상을 1.5초 동안 속박시킵니다."
                binding.eExeplan2.text = "적중 시 피해량 : 40/60/80/100/120(+0.3 공격력)\n" +
                        "속박 시 피해량 : 70/110/150/190/230(+0.7 공격력)\n" +
                        "사정거리 : 7m\n" +
                        "사슬 연결 유지 사정거리 : 8m\n" +
                        "스테미너 소모 : 80\n" +
                        "시전 시간 : 즉시 시전\n" +
                        "쿨다운 : 17/15/14/12.5/11초"

                binding.skill5.setImageResource(R.drawable.chiara_chiara_r)
                binding.rName.text = "[ R ] 폭주 / 심판"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "키아라가 폭주하여 날개를 펼치며 12초 동안 변신합니다.\n" +
                        "변신하는 동안 기본 공격이 원거리로 변경되고, 최대체력이 증가합니다.\n" +
                        "폭주 범위안의 적들에게 매 초마다 피해를 입히고, 피해량에 비례해 자신의 체력을 회복합니다.\n" +
                        "폭주 중인 키아라는 낙인이 최대 중첩까지 쌓인 적의 시야를 획득하며, 대상에게 심판을 시전 할 수 있습니다.\n" +
                        "\n심판 : 낙인이 최대 중첩인 대상에게 스킬을 다시 사용하면 대상에게 빠르게 낙하하여 고정 피해를 입히고 폭주 상태를 종료합니다. 심판으로 적을 처치하면 폭주의 재사용 대기시간이 50% 감소합니다."
                binding.rExeplan2.text = "초 당 범위 피해량 : 20/27/34(+0.15 공격력)\n" +
                        "심판 고정 피해량 : 200/300/400(+1.0 공격력),\n" +
                        "추가 체력 : 100/200/300\n" +
                        "체력 회복 : 피해량의 20%\n" +
                        "스테미너 소모 : 100/120/140\n" +
                        "시전 중 기본 공격 사거리 : 5.25m\n" +
                        "범위 피해 사정거리 : 4.5m\n" +
                        "심판 사정거리: 8m\n" +
                        "시전 시간 : 즉시 시전\n" +
                        "쿨다운 : 100/80/60초\n"
            }
            if (intent.hasExtra("하트")) {
                binding.skill1.setImageResource(R.drawable.hart_hart_t_1)
                binding.passiveName.text = "[ Passive ] Feedback"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "- 기본 효과 -\n" +
                        "하트가 기본 공격으로 피해를 줄때마다 스테미너를 회복합니다.\n" +
                        "\n" +
                        "- 진화 효과 -\n" +
                        "기본 공격시, 진화 포인트 1개당 1개의 추가 음파를 발사합니다."
                binding.passiveExeplan2.text = "스태미너 회복 : 1%/1.5%/2%\n" +
                        "진화 시 추가 일반 공격 피해량 : (0.15 공격력)"

                binding.skill2.setImageResource(R.drawable.hart_hart_q_1)
                binding.qName.text = "[ Q ] Delay"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "- 기본 효과 -\n" +
                        "하트가 기타를 쳐서 음파의 충전을 시작하고, 다시 기타를 쳐서 충전된 음파를 날립니다.\n" +
                        "충전된 시간에 따라 음파의 위력이 증가합니다\n" +
                        "\n" +
                        "- 진화 효과 -\n" +
                        "음파에 맞은 적의 이동속도가 감소합니다.\n" +
                        "35/50%의 이동속도 감소 효과를 줍니다."
                binding.qExeplan2.text =
                        "피해량 : 80-160/100-200/120-240/140-280/160-320(+0.3-0.6 공격력)\n" +
                                "사정거리 : 8m\n" +
                                "스테미너 소모 : 100\n" +
                                "진화 시 둔화: 30%/50%\n" +
                                "진화 시 둔화 지속 시간 : 1.5초\n" +
                                "시전 시간 : 즉시~4초\n" +
                                "쿨다운 : 4초"

                binding.skill3.setImageResource(R.drawable.hart_hart_w_1)
                binding.wName.text = "[ W ] Overdrive"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "- 기본 효과 -\n" +
                        "하트가 기타를 치면 몇초간 공격력이 증가합니다.\n" +
                        "\n" +
                        "- 진화 효과 -\n" +
                        "적에게 발사하는 최초의 음파에 방어력 감소 효과가 추가 됩니다.\n" +
                        "진화 횟수에 따라 방어력 감소량이 증가합니다."
                binding.wExeplan2.text = "공격력 증가 : 12%/19%/26%/33%/40%\n" +
                        "진화 시 첫 음파 방어력 감소 : 30%/45%\n" +
                        "스테미너 소모 : 85/90/95/100/105\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 7초\n" +
                        "쿨다운 : 22/20/18/16/14초\n"

                binding.skill4.setImageResource(R.drawable.hart_hart_e_1)
                binding.eName.text = "[ E ] Flanger"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "- 기본 효과 -\n" +
                        "하트가 지정한 방향으로 짧게 이동합니다. 이 스킬은 2회 다시 사용할 수 있습니다.\n" +
                        "이동중에 기타를 치면서 범위안의 적에게 음파를 날려 피해를 입힙니다.\n" +
                        "\n" +
                        "- 진화 효과 -\n" +
                        "스킬 피해 증폭량이 상승합니다. 진화 횟수 만큼 증폭량이 상승합니다."
                binding.eExeplan2.text = "피해량 : 20/30/40/50/60(+ 0.4 공격력)\n" +
                        "진화 시 스킬 증폭 증가 : 16%/23%\n" +
                        "사정거리 : 2m / 3m\n" +
                        "스테미너 소모 : 25/30/35/40/45\n" +
                        "시전 시간 : 즉시\n" +
                        "쿨다운 : 17/15/13/11/9초\n"

                binding.skill5.setImageResource(R.drawable.hart_hart_r_1)
                binding.rName.text = "[ R ] Peacemaker"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "- 기본 효과 -\n" +
                        "하트가 5초간 기타를 쳐서 범위 내의 모든 대상을 춤추게 합니다.\n" +
                        "기타를 치는 동안 매초마다 자신의 체력을 회복하며 춤을 추는 모든 대상은 이동속도가 고정됩니다.\n" +
                        "\n" +
                        "- 진화 효과 -\n" +
                        "춤을 추는 모든 대상의 스테미너를 매 초마다 감소시킵니다.\n" +
                        "진화 횟수 만큼 스테미너 감소량이 증가합니다."
                binding.rExeplan2.text = "초당 체력 회복량 : 20/30/40+최대체력의 2/3/4%" +
                        "진화 시 초당 스태미너 감소량 : 80/180\n" +
                        "사정거리 : 7/8/9m\n" +
                        "스테미너 소모 : 180/200/220\n" +
                        "쿨다운 : 120/100/80초"
            }
            if (intent.hasExtra("혜진")) {
                binding.skill1.setImageResource(R.drawable.hyejin_skill_hyejin_passive)
                binding.passiveName.text = "[ Passive ] 삼재"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "혜진은 같은 대상에게 스킬을 3번 적중시키면 삼재를 걸어 대상을 공포 상태로 만듭니다.\n" +
                        "공포에 걸린 대상은 12초 동안 다시 공포에 걸리지 않습니다."
                binding.passiveExeplan2.text = "시전 시간 : 즉시\n" +
                        "지속시간 : 0.7/1.1/1.5초"

                binding.skill2.setImageResource(R.drawable.hyejin_skill_hyejin_q)
                binding.qName.text = "[ Q ] 제압부"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "혜진이 지정한 방향으로 제압부를 날려 적중한 대상에게 피해를 주고 1초동안 둔화 50%를 겁니다\n" +
                        "제압부는 최대 2개까지 충전 할 수 있습니다."
                binding.qExeplan2.text = "피해량 : 100/120/140/160/180(+0.4 공격력)\n" +
                        "사정거리 : 11.75m\n" +
                        "스테미너 소모 : 40\n" +
                        "시전시간 : 0.3초\n" +
                        "쿨다운 : 20/17/14/11/8초"

                binding.skill3.setImageResource(R.drawable.hyejin_skill_hyejin_w)
                binding.wName.text = "[ W ] 흡령부"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "혜진이 지정한 위치에 일정시간 동안 유지되는 흡령부를 소환합니다.\n" +
                        "흡령부는 스킬을 다시 사용하거나 유지시간이 종료되면 발동되어, 범위 안의 적들에게 피해를 주고 속박시킵니다.\n" +
                        "흡령부의 피해량은 소환 시간이 길어질수록 증가합니다."
                binding.wExeplan2.text = "최소 피해량 : 15/20/25/30/35(+0.5 공격력)\n" +
                        "최대 피해량 : 140/205/270/335/400(+0.5 공격력)\n" +
                        "스태미너 소모 : 60/65/70/75/80\n" +
                        "지속시간 : 3초(속박 : 1초)\n" +
                        "쿨다운 : 22/19/16/13/10초"

                binding.skill4.setImageResource(R.drawable.hyejin_skill_hyejin_e)
                binding.eName.text = "[ E ] 이동부"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "혜진이 지정한 방향으로 이동부를 날려 경로 상의 적들에게 피해를 줍니다.\n" +
                        "스킬을 다시 사용하면 이동부의 위치로 순간이동하며 주변의 적들에게 피해를 줍니다."
                binding.eExeplan2.text =
                        "피해량 : 45/70/95/120/145(+0.3 공격력)/이동시 : 50/80/110/140/170(+0.7 공격력)\n" +
                                "사정거리 : 8.5m/피해 범위 = 1.8m\n" +
                                "스테미너 소모 : 120/110/100/90/80\n" +
                                "시전시간 : 0.25초\n" +
                                "재시전가능시간 : 1.8초\n" +
                                "쿨다운 : 16/14.5/13/11.5/10초"

                binding.skill5.setImageResource(R.drawable.hyejin_skill_hyejin_r)
                binding.rName.text = "[ R ] 오대존명왕진"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "혜진이 1초 동안 정신집중하여 5개의 부적을 소환하며 주변 적들에게 피해를 줍니다.\n" +
                        "부적들은 일정시간 동안 혜진의 주위를 돌며 충돌한 적들에게 피해를 주고 사라집니다.\n" +
                        "정신집중을 하는 동안 이동속도가 30% 느려지며,이동부가 날아가고 있는 동안에는 스킬을 사용하여 순간이동 할 수 있습니다."
                binding.rExeplan2.text = "피해량 : 150/275/400(+0.85 공격력)\n" +
                        "부적 피해량 : 80/140/200(+0.4 공격력)\n" +
                        "사정거리 : 5.5m\n" +
                        "부적 피해 범위 : 0.5m\n" +
                        "스테미너 소모 : 100\n" +
                        "시전 시간 : 1초(정신집중)\n" +
                        "지속시간: 20초\n" +
                        "쿨다운 : 120/90/60초\n"
            }
            if (intent.hasExtra("아이솔")) {
                binding.skill1.setImageResource(R.drawable.isol_isolt)
                binding.passiveName.text = "[ Passive ] 유격전"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "아이솔이 트랩을 설치하는 시간이 감소합니다.\n" +
                        "아이솔이 설치한 트랩에 피해를 받은 대상은 일정시간 동안 방어력이 감소합니다"
                binding.passiveExeplan2.text = "트랩 설치 시간 감소 : 0.1/0.2/0.3초\n" +
                        "방어력 감소 : 5/15/25%\n" +
                        "방어력 감소 지속 시간 : 3초\n" +
                        "기억력:아이솔은 한 번이라도 시야에 들어온 적의 트랩을 기억하며 볼 수 있습니다"

                binding.skill2.setImageResource(R.drawable.isol_isolq)
                binding.qName.text = "[ Q ] 셈텍스 폭탄"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "아이솔이 적이나 지면에 부착되는 폭탄을 던집니다.\n" +
                        "폭탄을 지면에 설치한 경우 5초 뒤 3m 범위로 폭발합니다.\n" +
                        "셈텍스 폭탄이 지면에 닿을때 폭탄 중심에 적이 1.6m 이내에 있으면 폭탄은 적에게 달라붙고 6초 뒤에 터지면서 0.5 [최대 1]초 동안 속박을 줍니다\n" +
                        "시한 폭탄이 붙은 적에게 일반 및 스킬로 피해를 주면 폭발 시간이 0.5초 줄어들며 추가 피해를 줍니다"
                binding.qExeplan2.text = "피해량 : 50/75/100/125/150(+0.4 공격력)\n" +
                        "추가 피해량 : 8/12/16/20/24(+0.2 공격력)\n" +
                        "사정거리 : 6m\n" +
                        "스테미너 소모 : 90/110/130/140/160\n" +
                        "시전 시간 : 0.27초\n" +
                        "쿨다운 : 18/16/14/12/10초"

                binding.skill3.setImageResource(R.drawable.isol_isolw)
                binding.wName.text = "[ W ] 화망"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "아이솔이 전방을 향해 무기를 난사하여 0.66초 간격으로 4번의 피해를 줍니다.\n" +
                        "피해를 받은 적은 마지막 피해를 받은 순간부터 일정 시간 동안 이동속도가 감소합니다."
                binding.wExeplan2.text = "피해량 : 18/27/36/45/54(+0.65 공격력)x4\n" +
                        "이동 속도 감소 : 15%\n" +
                        "사정거리 : 6m\n" +
                        "스테미너 소모 : 70/85/100/115/130\n" +
                        "지속 시간 : 2초\n" +
                        "쿨다운 : 16/15/14/13/12초"

                binding.skill4.setImageResource(R.drawable.isol_isole)
                binding.eName.text = "[ E ] 은밀 기동"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "아이솔이 앞으로 구르며 이동합니다.\n" +
                        "이동 후 잠시 은신 상태가 됩니다."
                binding.eExeplan2.text = "구르는 거리: 4m\n" +
                        "스테미너 소모 : 110/115/120/125/130\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 2.5/2.75/3/3.25/3.5초\n" +
                        "쿨다운 : 22/19/16/13/10초"

                binding.skill5.setImageResource(R.drawable.isol_isolr)
                binding.rName.text = "[ R ] MOK제 폭탄"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "아이솔이 Mok제 폭탄을 설치합니다.\n" +
                        "Mok제 폭탄은 4m의 범위로 폭발하며 피해를 주고 이동속도를 2초동안 20 / 25 / 30% 저하 시킵니다"
                binding.rExeplan2.text = "피해량 : 100/150/200(+0.3 공격력)\n" +
                        "사정거리 : 1m\n" +
                        "스테미너 소모 : 80\n" +
                        "시전 시간 : 0.54초\n" +
                        "지속 시간 : 40초\n" +
                        "쿨다운 : 30/25/20초"
            }
            if (intent.hasExtra("리 다이린")) {
                binding.skill1.setImageResource(R.drawable.dailin_dailint)
                binding.passiveName.text = "[ Passive ] 취기"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "리 다이린은 술마시기를 사용해 취기를 채울 수 있습니다.\n" +
                        "취기가 일정 이상 올라가면 취권을 획득하며, 취권을 사용하면 추가 데미지를 줄 수 있습니다.\n" +
                        "만약 리 다이린이 만취상태가 되면, 5초 동안 침묵 상태가 되며 맹호청권을 얻습니다.\n" +
                        "\n" +
                        "맹호청권: 스킬을 사용한 후 기본 공격을 하면 두 번 연속 공격합니다. 두 번째 공격은 0.4/0.6/0.8 공격력의 피해를 입힙니다.\n" +
                        "리화자 : 술 아이템을 사용하면 15초 동안 공격속도가 20%/30%/40% 증가합니다."
                binding.passiveExeplan2.text = "시전시간 : 즉시\n" +
                        "지속시간 : 10초"

                binding.skill2.setImageResource(R.drawable.dailin_dailinq)
                binding.qName.text = "[ Q ] 호연각"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text =
                        "리 다이린이 앞으로 돌진하며 범위 내에 적들에게 피해를 입힙니다.이 스킬은 2회 다시 사용할 수 있습니다\n" +
                                "\n" +
                                "취권: 돌진 거리가 늘어나고 피해가 증가합니다"
                binding.qExeplan2.text = "기본 피해량 : 25/45/65/85/105(+0.6 공격력)\n" +
                        "취권 적용 시 피해량 : 28/56/84/112/140(+0.7 공격력)\n" +
                        "사정거리 : 2.25m(취권: 2.5m)\n" +
                        "시전시간 : 0.14초\n" +
                        "쿨다운 : 12/11.5/11/10.5/10초"

                binding.skill3.setImageResource(R.drawable.dailin_dailinw)
                binding.wName.text = "[ W ] 술마시기"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text =
                        "리 다이린이 0.8초 동안 술을 마시며 취기를 충전하고 모든 기본 공격을 회피합니다. 리 다이린이 기본공격을 하면 술마시기 재사용 대기시간을 1초 줄입니다.\n" +
                                "\n" +
                                "술고래 : 술마시기를 완료하면 취기량에 따라 다음 기본 공격 또는 맹호청권의 피해량이 취기 1당 0.2% 증가합니다."
                binding.wExeplan2.text =
                        "시전 시간: 0.8초\n" +
                                "지속 시간: 5초\n" +
                                "쿨다운 : 8/7/6/5/4초"

                binding.skill4.setImageResource(R.drawable.dailin_dailine)
                binding.eName.text = "[ E ] 술뿌리기"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "리 다이린이 술을 머금고 부채꼴 모양으로 술을 뿜습니다.\n" +
                        "범위 안 적들에게 적중한 적에게 20% 이동속도 감소 효과와 피해를 입힙니다.\n" +
                        "취권: 적중한 적을 추가로 2초 간 침묵 시킵니다."
                binding.eExeplan2.text = "피해량 : 80/135/190/245/300(+0.5 공격력)\n" +
                        "지속 시간 : 0.8/1.1/1.4/1.7/2.0초\n" +
                        "쿨다운 : 13/12/11/10/9초"

                binding.skill5.setImageResource(R.drawable.dailin_dailinr)
                binding.rName.text = "[ R ] 취호격파산"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text =
                        "리 다이린이 저지불가 상태로 돌진하여 부딪힌 적을 제압하며 2번 연타하여 각 타격마다 적이 잃은 체력에 비례해 피해를 입힙니다.\n" +
                                "\n" +
                                "취권: 적을 4번 연타합니다."
                binding.rExeplan2.text = "피해량 : 40/70/100(+0.2 공격력) ~ 120/210/300(+0.6 공격력)\n" +
                        "사정거리 : 5.5m\n" +
                        "시전 시간 : 즉시\n" +
                        "쿨다운 : 185/150/115초(적중 시 40% 감소)"
            }
            if (intent.hasExtra("매그너스")) {
                binding.skill1.setImageResource(R.drawable.magnus_magnus_t)
                binding.passiveName.text = "[ Passive ] 맷집"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "매그너스는 감소된 체력 만큼 방어력이 상승합니다."
                binding.passiveExeplan2.text = "감소한 체력 1% 당 방어력 증가 : 0.2%/0.4%/0.6%"

                binding.skill2.setImageResource(R.drawable.magnus_magnus_q)
                binding.qName.text = "[ Q ] 파쇄탄"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "매그너스가 지면을 강하게 쳐 돌덩이를 날려 피해를 입힙니다.\n" +
                        "돌덩이에 명중 된 대상은 이동 속도가 감소 되며,\n" +
                        "감소된 이동속도는 지속시간에 걸쳐 서서히 회복됩니다."
                binding.qExeplan2.text = "피해량 : 40/100/160/220/280(+0.6 공격력)\n" +
                        "이동 속도 감소 : 30%/36%/42%/48%/54%\n" +
                        "사정거리 ; 11m\n" +
                        "스테미너 소모 : 90/100/110/120/130\n" +
                        "시전시간 : 0.8초\n" +
                        "쿨다운 : 18/15.5/13/10.5/8초"

                binding.skill3.setImageResource(R.drawable.magnus_magnus_w)
                binding.wName.text = "[ W ] 17 대 1"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "매그너스가 몇 초간 무기를 휘둘러 피해를 입힙니다.\n" +
                        "이동을 방해 받은 적에게는 1.5배의 피해를 입힙니다.\n" +
                        "스킬 1회 명중 시 쿨다운이 1초 감소됩니다.\n" +
                        "해당 스킬 사용 중에는 저지불가 상태가 됩니다."
                binding.wExeplan2.text = "총 피해량 : 10×6/20×6/20×7/30×7/30×8(+0.2 방어력)(+0.4 공격력)\n" +
                        "사정거리 : 2.5m\n" +
                        "사용 중 이동 속도 감소 : 20%\n" +
                        "스테미너 소모 : 80/90/100/110/120\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 4초\n" +
                        "쿨다운 : 8.5초\n"

                binding.skill4.setImageResource(R.drawable.magnus_magnus_e)
                binding.eName.text = "[ E ] 강타"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "대상을 후려쳐 피해를 입히고 매그너스가 바라보는 좌측 방향으로 날려버립니다."
                binding.eExeplan2.text = "피해량 : 60/115/170/225/280(+0.4 공격력)\n" +
                        "사정거리 : 3m\n" +
                        "스테미너 소모 : 80/90/100/110/120\n" +
                        "시전 시간 : 0.2초\n" +
                        "벽에 부딪힐 시 기절 지속 시간 : 1.3초\n" +
                        "쿨다운 : 13/12/11/10/9초\n"

                binding.skill5.setImageResource(R.drawable.magnus_magnus_r)
                binding.rName.text = "[ R ] 폭주 바이크"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "매그너스가 바이크를 소환하여 탑승한 채로 몇초간 이동합니다.\n" +
                        "스킬을 다시 사용하면 매그너스는 바이크를 앞으로 던지며 탈출합니다.\n" +
                        "돌진한 바이크가 적이나 벽에 충돌하게 되면 폭발하여 일정 범위에 피해를 입힙니다.\n" +
                        "적중 시 쿨다운이 40초 감소됩니다."
                binding.rExeplan2.text = "피해량 : 200/350/500(+2.0 공격력)\n" +
                        "돌진 사정거리 : 8m\n" +
                        "폭발 사정거리 : 4m\n" +
                        "스테미너 소모 : 100/150/200\n" +
                        "시전 시간 : 0.2초\n" +
                        "지속 시간 : 7초\n" +
                        "쿨다운 : 125/115/105초"
            }
            if (intent.hasExtra("나딘")) {
                binding.skill1.setImageResource(R.drawable.nadine_nadine_t)
                binding.passiveName.text = "[ Passive ] 야성 & 천리안"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "야성: 나딘이 야생동물을 사냥할 때 마다 야성 중첩을 획득 합니다.\n" +
                        "천리안: 일정 범위내의 야생동물을 미니맵에 표시 합니다."
                binding.passiveExeplan2.text = "닭,박쥐, 멧돼지 처치 시 획득 중첩 : 1/2/3\n" +
                        "들개, 늑대 처치 시 획득 중첩 : 3/4/5\n" +
                        "곰 처치 시 획득 중첩 : 11/13/15"

                binding.skill2.setImageResource(R.drawable.nadine_nadine_q)
                binding.qName.text = "[ Q ] 황소의 눈"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "나딘이 몇초간 힘을 모아 화살을 발사합니다.\n" +
                        "힘을 모으는 시간 동안 이동속도가 감소하고 스킬 사정거리가 증가합니다.\n" +
                        "야성 중첩을 일정 수준 이상 획득했다면 최대 공격 사정거리가 증가합니다."
                binding.qExeplan2.text =
                        "피해량 : 70-140/115-230/160-320/205-410/250-500(+0.6~1.2 공격력)(+1 야성)\n" +
                                "최대 사정거리 : 기본 공격 사거리×2.5(최대)\n" +
                                "스테미너 소모 : 60/65/70/75/80\n" +
                                "시전 시간 : 즉시\n" +
                                "쿨다운 : 7초"

                binding.skill3.setImageResource(R.drawable.nadine_nadine_w)
                binding.wName.text = "[ W ] 다람쥐 덫"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "나딘이 지정한 위치에 다람쥐 덫을 던집니다. 덫에 맞은 적은 피해를 입습니다.\n" +
                        "일정시간 내에 한번 더 덫을 던질 수 있으며, 두 덫이 정해진 거리에 있다면 연결됩니다.\n" +
                        "연결된 덫에 걸린 적은 이동속도가 감소하며 나딘에게 몇 초 간 시야를 제공합니다.\n" +
                        "다람쥐 덫에 의한 둔화 지속시간 중, 해당 둔화피해를 입힌 나딘의 다른 다람쥐 덫에 받는 피해가 70% 감소됩니다."
                binding.wExeplan2.text = "투척 피해량 : 100/170/240/310/380(+0.6 공격력)\n" +
                        "트랩 피해량 : 100/140/180/220/260(+0.6 공격력)\n" +
                        "이동 속도 감소 : 70%\n" +
                        "공격 속도 감소: 70%\n" +
                        "사정거리 : 7m\n" +
                        "스테미너 소모 : 50\n" +
                        "시전 시간 : 0.3초\n" +
                        "트랩 유지 시간 : 60초\n" +
                        "쿨다운 : 26/22/18/14/10초\n" +
                        "\n"

                binding.skill4.setImageResource(R.drawable.nadine_nadine_e)
                binding.eName.text = "[ E ] 원숭이 와이어"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "패시브: 나딘의 기본 공격 속도가 증가합니다.\n" +
                        "사용: 나딘이 지정한 위치에 와이어를 발사합니다.\n" +
                        "발사한 와이어는 일정시간 동안 유지되며, 설치된 동안에는 공격속도가 추가로 증가합니다.\n" +
                        "스킬을 한번 더 사용하면 나딘이 와이어의 위치로 이동합니다."
                binding.eExeplan2.text = "패시브 공격 속도 증가 : 10%/15%/20%/25%/30%\n" +
                        "설치 중 추가 공격속도 증가 : 10%/15%/20%/25%/30%\n" +
                        "사정거리 : 7m\n" +
                        "스테미너 소모 : 70/75/80/85/90\n" +
                        "시전 시간 : 0.2초\n" +
                        "지속 시간 : 8초\n" +
                        "쿨다운 : 24/21/18/15/12초"

                binding.skill5.setImageResource(R.drawable.nadine_nadine_r)
                binding.rName.text = "[ R ] 늑대 맹습"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "일정 시간 나딘의 3번째 기본 공격에 늑대를 소환하여 적을 공격하게 합니다.\n" +
                        "늑대는 피해를 입히고 대상의 공격속도와 이동속도를 감소 시킵니다."
                binding.rExeplan2.text = "피해량 : 50/100/150(+0.5 공격력)(+1.0 야성)\n" +
                        "이동 속도 감소 : 35%\n" +
                        "공격 속도 감소 : 35%\n" +
                        "스테미너 소모 : 150\n" +
                        "지속 시간 : 8/9/10초\n" +
                        "쿨다운 : 90/75/60초"
            }
            if (intent.hasExtra("시셀라")) {
                binding.skill1.setImageResource(R.drawable.sissela_sisselat)
                binding.passiveName.text = "[ Passive ] 삶은 고통이에요."
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "시셀라는 현재 체력이 낮아질수록 체력 회복량과 스킬 증폭이 증가합니다.\n" +
                        "초당 체력 재생: 2/4/6 ~ 26/36/46 (체력 재생 증가율의 영향을 받지 않습니다.)\n" +
                        "스킬 증폭: 2/5/8 ~ 10/25/40\n" +
                        "윌슨이 시셀라에게 복귀할 때 마다 다음 기본 공격은 추가 피해를 주고 2초 동안 이동속도를 10/20/30% 느려지게 합니다.\n" +
                        "(3초의 내부 쿨다운이 있습니다)"
                binding.passiveExeplan2.text = "피해량 : 18(+1.2 공격력) + (시셀라의 레벨*10)\n" +
                        "시전 시간 : 즉시\n" +
                        "쿨다운 : 3초"

                binding.skill2.setImageResource(R.drawable.sissela_sisselaq)
                binding.qName.text = "[ Q ] 윌슨 도와줘!"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text =
                        "윌슨이 지정한 위치로 날아가며 경로상의 적들에게 피해를 주고, 지정 위치에 도착하면 범위 안의 적들에게 추가 피해를 줍니다."
                binding.qExeplan2.text = "경로상 피해량 : 40/60/80/100/120(+0.3 공격력)\n" +
                        "지정 위치 피해량 : 60/90/120/150/180(+0.5 공격력)\n" +
                        "사정거리 : 8m(피해 범위 : 2m)\n" +
                        "체력 소모 : 50/60/70/80/90\n" +
                        "쿨다운 : 6.5/5.75/5/4.25/3.5 초"

                binding.skill3.setImageResource(R.drawable.sissela_sisselaw)
                binding.wName.text = "[ W ] 어딨어 윌슨?"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "윌슨이 시셀라를 감싸 일정 시간 모든 피해를 받지 않고, 목표로 지정할 수 없는 상태가 됩니다.\n" +
                        "지속시간이 끝나거나 도중에 스킬을 다시 사용하면 주변 적들에게 피해를 주고 2m 밀어냅니다."
                binding.wExeplan2.text = "피해량 : 30/90/150/210/270(+0.7 공격력)\n" +
                        "사정거리 : 2m\n" +
                        "체력 소모 : 60/80/100/120/140\n" +
                        "최대 지속 시간 : 1.5초\n" +
                        "시전시간 : 즉시\n" +
                        "쿨다운 : 19.5/18/16.5/15/13.5초"

                binding.skill4.setImageResource(R.drawable.sissela_sisselae)
                binding.eName.text = "[ E ] 나랑 놀자!"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "윌슨이 지정한 방향으로 몸을 길게 쭉 뻗어 부딪힌 대상을 끌어옵니다.\n" +
                        "아군 대상: 3초간 지속되는 보호막을 부여하며 나랑 놀자! (E) 의 쿨다운이 2초 감소합니다.\n" +
                        "적군 대상: 적을 1초간 기절 시킵니다."
                binding.eExeplan2.text = "피해량 : 40/90/140/190/240(+0.6 공격력)\n" +
                        "보호막 : 75/125/175/225/275(+0.5 공격력)\n" +
                        "사정거리 : 4.5m\n" +
                        "스태미너 소모 : 60/70/80/90/100\n" +
                        "시전시간 : 즉시\n" +
                        "쿨다운 : 14/13/12/11/10초"

                binding.skill5.setImageResource(R.drawable.sissela_sisselar)
                binding.rName.text = "[ R ] 모두 해방이에요"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text =
                        "시셀라가 1초간 정신집중 하여 3초 후에, 시셀라 자신을 포함한 모든 플레이어(아군 제외) 에게 피해를 줍니다. 시셀라는 이 피해를 받아도 HP가 100 이하로 떨어지지 않습니다.\n" +
                                "피해를 준 이후, 5초 동안 삶은 고통이에요 (패시브) 효과가 2배가 됩니다.\n" +
                                "[피해량 세부 규칙]\n" +
                                "1. 시셀라 주변 10m 혹은 같은 지역: 100% 피해를 받습니다.\n" +
                                "2. 시셀라의 10m 밖의 다른 지역 : 50% 피해를 받습니다.\n" +
                                "해당 스킬로 가한 데미지는 무기 숙련도 증가에 30%만 반영됩니다."
                binding.rExeplan2.text = "피해량 : 150/275/400(+1.0 공격력)\n" +
                        "스태미너 소모 : 120/150/180\n" +
                        "시전 시간 : 1초(채널링)\n" +
                        "쿨다운 : 150/135/120초"
            }
            if (intent.hasExtra("쇼우")) {
                binding.skill1.setImageResource(R.drawable.xiukai_xiukait)
                binding.passiveName.text = "[ Passive ] 요리사의 열정"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "쇼우가 제작한 음식과 음료는 30%의 추가 회복 보너스를 받습니다.\n" +
                        "고급 등급 이상의 음식과 음료를 제작하면 요리사의 열정 스택을 얻습니다.\n" +
                        "얻은 스택 1당 쇼우의 최대 체력이 8 증가 합니다."
                binding.passiveExeplan2.text = "시전 시간 : 즉시\n" +
                        "제작 등급에 따른 획득 스택 (1,2,3레벨)\n" +
                        "1레벨 : 1/1/3 \n" +
                        "2레벨 : 2/2/4 \n" +
                        "3레벨 : 3/3/5"

                binding.skill2.setImageResource(R.drawable.xiukai_xiukaiq)
                binding.qName.text = "[ Q ] 소스범벅"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text =
                        "쇼우가 지정한 방향으로 자극적인 소스통을 던져 적중한 대상에게 피해를 주고, 이동 속도를 2초간 30% 감소 시킵니다."
                binding.qExeplan2.text = "피해량 : 70/110/150//190/230(+0.5 공격력)\n" +
                        "사정거리 : 8.5m\n" +
                        "체력 소모 : 20/35/50/65/80\n" +
                        "시전시간 : 0.26초\n" +
                        "쿨다운 : 7/6.5/6/5.5/5초"

                binding.skill3.setImageResource(R.drawable.xiukai_xiukaiw)
                binding.wName.text = "[ W ] 내려 찍기"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text =
                        "쇼우가 큼직한 웍을 지면에 강하게 내리찍어 주변의 적들에게 피해를 주고, 이동속도를 1.5초간 20/27.5/35/42.5/50% 감소 시킵니다.\n" +
                                "이동방해 효과가 걸린 대상에게는 추가 효과를 줍니다.\n" +
                                "\n" +
                                "추가 효과: 이동속도 감소 효과: 1.5초 추가\n" +
                                "쇼우 최대 체력의 1.5/2.5/3.5/4.5/5.5% 만큼의 피해를 추가로 입힙니다."
                binding.wExeplan2.text =
                        "피해량 : 10/55/100/145/190(+0.6 공격력) + 쇼우 최대 체력의 2 / 2.5 / 3 / 3.5 / 4%\n" +
                                "사정거리 : 4m\n" +
                                "체력 소모 : 20/35/50/65/80\n" +
                                "쿨다운 : 16/14/12/10/8초"

                binding.skill4.setImageResource(R.drawable.xiukai_xiukaie)
                binding.eName.text = "[ E ] 웍 돌진"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "쇼우가 지정한 방향으로 웍을 타고 힘차게 돌진하며, 적중한 대상에게 피해를 입힙니다.\n" +
                        "대상이 이동방해 효과에 걸려있으면 전체 체력에 비례한 추가 피해를 입히고 1초간 공중에 띄웁니다."
                binding.eExeplan2.text =
                        "피해량 : 70/100/130/160/190(+0.6 공격력) + 쇼우 최대 체력의 2%\n" +
                                "사정거리 : 7m\n" +
                                "체력 소모 : 20/35/45/55/65\n" +
                                "쿨다운 : 18/16/14/12/10초"

                binding.skill5.setImageResource(R.drawable.xiukai_xiukair)
                binding.rName.text = "[ R ] 뜨거운 맛"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "쇼우가 화염을 뿜으며 범위안의 적에게 3초간 6번의 피해를 줍니다.\n" +
                        "이동방해가 걸린 대상에게는 추가로 3초간 10/15/20%의 방어력 감소 효과를 줍니다.\n" +
                        "대상이 이동방해에 걸려있을 시 방어력 감소 유지 시간은 공격할 때 마다 초기화 됩니다."
                binding.rExeplan2.text = "피해량 : 20/65/110(+0.5 공격력)+(패시브 스택 x 1.0)\n" +
                        "사정거리 : 6.5m(90도 범위)\n" +
                        "체력 소모 : 100/120/140\n" +
                        "지속 시간 : 3초\n" +
                        "쿨다운 : 75초"
            }
            if (intent.hasExtra("쇼이치")) {
                binding.skill1.setImageResource(R.drawable.s_shoichi_t)
                binding.passiveName.text = "[ Passive ] 부당거래"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "쇼이치는 스킬을 적중하여 부당거래 스택을 최대 5회까지 중첩할 수 있습니다.\n" +
                        "부당거래의 스택마다 치명타 확률이 5/7/9% 증가합니다.\n" +
                        "부당거래가 최대로 중첩되면 기본 공격 피해량이 10/15/20% 증가합니다.\n" +
                        "단검을 회수할때, 주변 적에게 추가로 피해를 입힙니다."
                binding.passiveExeplan2.text = "피해량: 10/45/80(+0.4 공격력)\n" +
                        "사정거리: 5m"

                binding.skill2.setImageResource(R.drawable.s_shoichi_q)
                binding.qName.text = "[ Q ] 표리"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text =
                        "쇼이치가 지정된 방향으로 날카로운 찌르기를 시전합니다.\n" +
                                "스킬이 적중하면 다음 표리 스킬의 쿨다운이 2초 감소하며, 8초 동안 강화됩니다.\n" +
                                "강화된 표리 스킬은 공격 범위가 증가하고, 정면에 단검을 생성합니다."
                binding.qExeplan2.text = "피해량: 10/65/120/175/230(+0.45 공격력)\n" +
                        "사정거리: 3m(일반) / 3.5m(강화)\n" +
                        "스테미너 소모: 50/55/60/65/70\n" +
                        "쿨다운: 6초"

                binding.skill3.setImageResource(R.drawable.s_shoichi_w)
                binding.wName.text = "[ W ] 비약"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text =
                        "쇼이치가 적 또는 단검으로 빠르게 돌진하며, 경로상의 적에게 피해를 줍니다.\n" +
                                "단검을 회수하면 쿨다운이 초기화됩니다."
                binding.wExeplan2.text =
                        "피해량: 10/40/70/100/130(+0.3 공격력)\n" +
                                "사정거리: 5.5m\n" +
                                "스테미너 소모: 80\n" +
                                "쿨다운: 16/15/14/13/12초"

                binding.skill4.setImageResource(R.drawable.s_shoichi_e)
                binding.eName.text = "[ E ] 협상"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "쇼이치가 2m 뒤로 물러나며 전방으로 단검을 던집니다.\n" +
                        "적중한 적에게 피해를 입히고 이동속도를 감소시킵니다.\n" +
                        "적중한 적의 뒤쪽에 단검이 생성됩니다."
                binding.eExeplan2.text =
                        "피해량: 35/75/115/155/195(+0.3 공격력)\n" +
                                "이동속도: -10/-20/-30/-40/-50%\n" +
                                "스테미너 소모: 90\n" +
                                "쿨다운: 18/16/14/12/10초"

                binding.skill5.setImageResource(R.drawable.s_shoichi_r)
                binding.rName.text = "[ R ] 무자비"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "쇼이치가 단검 가방을 휘둘러 주변의 적들에게 피해를 주고 이동속도를 감소시킵니다.\n" +
                        "가방을 휘두를 때 4개의 단검을 사방에 던져 경로상의 적에게 추가로 피해를 줍니다."
                binding.rExeplan2.text = "최초 피해량: 50/150/250(+0.3 공격력)\n" +
                        "단검 피해량: 25/60/95(+0.3 공격력)\n" +
                        "스테미너 소모: 150\n" +
                        "쿨다운: 120/100/80초"
            }

            if (intent.hasExtra("실비아")) {
                binding.skill1.setImageResource(R.drawable.silvia_t)
                binding.change.visibility = View.VISIBLE
                binding.texc.visibility = View.VISIBLE

                changeskill(a, "실비아")
                binding.skill1.setOnClickListener {
                    a *= -1
                    changeskill(a, "실비아")
                }
            }

            if (intent.hasExtra("유키")) {
                binding.skill1.setImageResource(R.drawable.yuki_yuki_passive)
                binding.passiveName.text = "[ Passive ] 완벽한 옷매무새"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text =
                        "유키가 적에게 피해를 줄 때 단추를 1개 소모하여 추가 고정 피해를 입힙니다. (단추가 없을 때는 적용되지 않습니다.)\n" +
                                "단추는 비 전투 상태에서 서서히 회복됩니다.\n" +
                                "옷매무새 정리 (W)를 사용하면 단추를 최대치로 회복 할 수 있습니다."
                binding.passiveExeplan2.text = "고정 피해량 : 15/30/45\n" +
                        "비전투 시 회복까지 걸리는 시간: 4초"

                binding.skill2.setImageResource(R.drawable.yuki_yuki_q)
                binding.qName.text = "[ Q ] 머리치기!"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "유키의 다음 공격이 추가 피해를 입히고 대상의 이동속도를 감소 시킵니다.\n" +
                        "완벽한 옷매무새 단추가 있다면 0.5초 기절시킵니다."
                binding.qExeplan2.text = "피해량 : 20/50/80/110/140\n" +
                        "스테미너 소모 : 70\n" +
                        "시전시간 : 0.23초\n" +
                        "지속 시간 : 1초\n" +
                        "이동속도 감소 지속 시간 : 1초\n" +
                        "쿨다운 : 9/8/7/6/5초"

                binding.skill3.setImageResource(R.drawable.yuki_yuki_w)
                binding.wName.text = "[ W ] 옷매무새 정리"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "지속 효과: 유키가 피해를 입을때마다 재사용 대기시간이 1초 감소합니다.\n" +
                        "\n" +
                        "사용 효과: 유키가 옷매무새를 정리하는 동안 빗겨치고 일격 (E)의 재사용 대기시간이 5.5/6/6.5/7/7.5초 감소합니다.\n" +
                        "스킬 시전중에는 방어력이 50% 증가합니다.\n" +
                        "이동 중에 사용할 수 있습니다."
                binding.wExeplan2.text = "스태미너 소모 : 90\n" +
                        "시전시간 : 즉시\n" +
                        "단추 충전 : 1초\n" +
                        "지속 시간 : 1초\n" +
                        "쿨다운 : 18/16/14/12/10초"

                binding.skill4.setImageResource(R.drawable.yuki_yuki_e)
                binding.eName.text = "[ E ] 빗겨치고 일격"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "유키가 지정한 방향으로 돌진하여 가장 먼저 부딪힌 적에게 피해를 입힙니다.\n" +
                        "공격당한 대상은 잠시 기본 공격이 봉쇄됩니다.\n" +
                        "적중시 재사용 대기시간이 3초 감소됩니다."
                binding.eExeplan2.text = "피해량 : 65/125/185/245/305(+0.4 공격력)\n" +
                        "사정거리 : 5m\n" +
                        "스테미너 소모 : 90/100/110/120/130\n" +
                        "시전시간 : 0.13초\n" +
                        "지속시간 : 0.75초\n" +
                        "쿨다운 : 17/16/15/14/13초"

                binding.skill5.setImageResource(R.drawable.yuki_yuki_r)
                binding.rName.text = "[ R ] 화무십일홍"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "유키가 검에 손을 가져가서 순식간에 공간을 베어버립니다.\n" +
                        "유키는 자신이 벤 적에게 피해를 입히고 이동속도를 감소 시키며 표식을 남깁니다.\n" +
                        "유키가 검을 검집에 집어 넣는 순간 표식이 폭발하며 대상의 최대 체력의 15/20/25%에 해당하는 고정 피해를 입힙니다."
                binding.rExeplan2.text = "피해량 : 250/375/500(+1.5 공격력)\n" +
                        "표식 폭발 고정 피해량 : 대상의 최대 체력의 15/20/25%\n" +
                        "이동속도 감소: 70%\n" +
                        "사정거리 : 5.5m\n" +
                        "스테미너 소모 : 120/150/180\n" +
                        "시전 시간 : 1초\n" +
                        "쿨다운 : 120/100/80초"
            }
            if (intent.hasExtra("자히르")) {
                binding.skill1.setImageResource(R.drawable.zahir_zahir_tm)
                binding.passiveName.text = "[ Passive ] 사신의 눈"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text =
                        "적에게 스킬을 명중시키면 적에게 몇초간 유지되는 사신의 눈 표식을 부여하고 자히르는 이동 속도 증가 효과를 얻습니다.\n" +
                                "사신의 눈 표식이 있는 적에게 스킬을 명중시키면 추가 피해와 효과가 발생하며 사신의 눈 표식을 사용합니다.\n" +
                                "자히르가 적 플레이어를 처치하면 몇 초동안 전체 지역의 시체를 보여줍니다."
                binding.passiveExeplan2.text = "추가 피해량 : 10/35/60(+0.3 공격력)\n" +
                        "이동 속도 증가 : 25%\n" +
                        "시전 시간 : 즉시\n" +
                        "표식 지속 시간 : 5초\n" +
                        "시체 확인 쿨다운 : 300초"

                binding.skill2.setImageResource(R.drawable.zahir_zahir_qm)
                binding.qName.text = "[ Q ] 나랴아나스트라"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "자히르가 신의 힘을 빌려 일정 범위에 피해를 입힙니다.\n" +
                        "\n" +
                        "사신의 눈 효과 : 추가 피해를 주며 대상의 플레이어 처치 수가 자히르보다 많으면 몇 초간 그 차이만큼의 방어력을 감소시킵니다."
                binding.qExeplan2.text = "기본 피해량 : 40/100/160/220/280(+0.5 공격력)\n" +
                        "사신의 눈 적용 시 피해량 : 75/150/225/300/375(+0.5 공격력)\n" +
                        "사정거리 : 6m\n" +
                        "스테미너 소모 : 70/85/100/115/130\n" +
                        "무기 소모 : 1개\n" +
                        "시전시간 : 0.2초\n" +
                        "쿨다운 : 8/7.5/7/6.5/6초"

                binding.skill3.setImageResource(R.drawable.zahir_zahir_wm)
                binding.wName.text = "[ W ] 간디바"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "간디바를 제외한 자히르의 스킬이 적에게 적중시 자히르 등뒤를 떠다니는 2개의 차크람을 얻습니다.\n" +
                        "차크람을 1개 소모하여 지정한 방향으로 차크람을 발사하여 피해를 입힙니다.\n" +
                        "\n" +
                        "사신의 눈 효과 : 차크람이 명중한 상대에게 둔화 효과를 적용하며 간디바를 제외한 자히르의 다른 스킬 쿨다운이 1.5초 감소합니다."
                binding.wExeplan2.text = "피해량 : 20/50/80/110/140(+0.3 공격력)\n" +
                        "차크람 최대 보유 가능 개수 : 5개\n" +
                        "차크람 유지 시간 : 20초\n" +
                        "이동 속도 감소 : 15%(사신의 눈 대상)\n" +
                        "사정거리 : 7m\n" +
                        "시전 시간 : 0.2초\n" +
                        "쿨다운: 0.5초"

                binding.skill4.setImageResource(R.drawable.zahir_zahir_em)
                binding.eName.text = "[ E ] 바이바야스트라"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "자히르가 바람을 날려 경로상의 대상에게 피해를 입힙니다.\n" +
                        "피해를 입은 대상은 에어본 상태가 되고 몇 초간 이동속도가 감소합니다.\n" +
                        "\n" +
                        "사신의 눈 효과 : 적중한 대상의 에어본 시간이 증가합니다."
                binding.eExeplan2.text = "피해량 : 80/110/140/170/200(+0.5 공격력)\n" +
                        "사정거리 : 6.8m\n" +
                        "스테미너 소모 : 100/120/140/160/180\n" +
                        "무기 소모 : 1개\n" +
                        "시전 시간 : 0.17초\n" +
                        "에어본 지속 시간 : 0.5초\n" +
                        "사신의 눈 적용 시 에어본 지속 시간 : 1초\n" +
                        "쿨다운 : 20/18/16/14/12초"

                binding.skill5.setImageResource(R.drawable.zahir_zahir_rm)
                binding.rName.text = "[ R ] 바르가바스트라"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "자히르가 크게 힘을 모아 넓은 범위에 차크람을 퍼붓습니다.\n" +
                        "적에게 사신의 눈 표식이 없다면 표식을 부여합니다."
                binding.rExeplan2.text = "최초 피해량 : 50/140/230(+0.5 공격력)\n" +
                        "이후 피해량 : 40/80/120(+0.65 공격력)x4\n" +
                        "사정거리 : 5m\n" +
                        "스테미너 소모 : 120/150/180\n" +
                        "시전 시간 : 0.4초\n" +
                        "쿨다운 : 100/85/70초"
            }
            if (intent.hasExtra("엠마")) {
                binding.skill1.setImageResource(R.drawable.emma_emma_passive)
                binding.passiveName.text = "[ Passive ] CheerUP♡"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text =
                        "엠마는 일정시간 마다 기본 공격을 할 때 최대 스태미너의 %만큼 추가 피해를 입히고, 스태미너의 %만큼의 보호막을 획득합니다."
                binding.passiveExeplan2.text = "추가 피해량 : 최대 스태미너의 3%/3.5%/4%\n" +
                        "보호막 획득량 : 100/125/150 + 스태미너의 3%/6%/9%\n" +
                        "쿨다운 : 15/13/11초"

                binding.skill2.setImageResource(R.drawable.emma_emma_q)
                binding.qName.text = "[ Q ] 비둘기 딜러"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text =
                        "엠마가 지정한 방향으로 카드를 날려 적에게 피해를 입히고 자신의 위치에 은신 상태의 비둘기를 남깁니다. 엠마가 카드를 날릴 때, 비둘기가 근처에 있다면 비둘기가 카드로 변하며 날아가 동일한 피해를 입힙니다.\n" +
                                "\n" +
                                "엠마가 날린 카드에 적이 적중되면 비둘기 딜러의 쿨다운이 1초 감소됩니다. 엠마와 비둘기가 날린 카드에 한 대상이 모두 맞으면 이동속도가 감소됩니다."
                binding.qExeplan2.text = "피해량 : 40/80/120/160/200(+0.5 공격력)\n" +
                        "비둘기 유지 시간 : 10초\n" +
                        "이동속도 감소 : 40%\n" +
                        "사정거리 : 10m\n" +
                        "스태미너 소모 : 60/70/80/90/100\n" +
                        "쿨다운 : 5.5초"

                binding.skill3.setImageResource(R.drawable.emma_emma_w)
                binding.wName.text = "[ W ] 폭죽 모자"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text =
                        "엠마가 지정한 위치로 모자를 던지면, 잠시 후에 폭발하여 범위 안의 적들에게 피해를 입힙니다. 적을 적중시키면 폭죽 모자의 쿨다운이 3초 감소됩니다."
                binding.wExeplan2.text = "피해량 : 60/120/180/240/300(+0.75 공격력)\n" +
                        "사정거리 : 7m\n" +
                        "범위 : 1.7m\n" +
                        "스태미너 소모 : 60/70/80/90/100\n" +
                        "쿨다운 : 11/10.5/10/9.5/9초"

                binding.skill4.setImageResource(R.drawable.emma_emma_e)
                binding.eName.text = "[ E ] 마술 토끼"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "지속 효과: 엠마는 스태미너를 소모할 때마다, 소모한 스태미너의 %만큼 체력을 회복합니다.\n" +
                        "\n" +
                        "엠마가 지정한 적 대상에게 마술빔을 날려 1.5초 간 이동 외에 다른 행동을 할 수 없는 토끼로 변하게 합니다. 토끼가 된 대상은 이동속도가 감소됩니다. 빈사상태의 적에게 스킬을 사용할 수 없습니다."
                binding.eExeplan2.text = "회복량 : 소모한 스태미너의 16/17/18/19/20%\n" +
                        "이동속도 감소 : 0.8\n" +
                        "사정거리 : 5.5m\n" +
                        "스태미너 소모 : 70/80/90/100/110\n" +
                        "쿨다운 : 16/15/14/13/12초"

                binding.skill5.setImageResource(R.drawable.emma_emma_r)
                binding.rName.text = "[ R ] Change☆"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text =
                        "엠마 자신이 소환한 비둘기, 모자, 토끼를 지정하여 해당 위치로 순간이동 하고 대상에 따라 추가 마술을 시연합니다.\n" +
                                "\n" +
                                "◆ 비둘기: 비둘기가 엠마의 위치로 이동하며 경로상의 적들에게 피해를 입히고 1.5초 간 속박시킵니다.\n" +
                                "◆ 모자: 모자가 엠마의 위치로 이동하며 범위 안의 적들에게 피해를 입히고 모자 중심으로 끌어당깁니다.\n" +
                                "◆ 토끼: 토끼 주변의 적들에게 마술을 걸어 1초 간 토끼로 만듭니다. 토끼가 된 대상은 이동속도가 감소됩니다. 패시브 쿨타임이 초기화됩니다."
                binding.rExeplan2.text = "비둘기 효과\n" +
                        "피해량 : 1251500/175(+0.45 공격력)\n" +
                        "속박 시간: 0.5초\n\n" +
                        "모자 효과\n" +
                        "피해량 : 200/225/250(+0.75 공격력)\n\n" +
                        "토끼 효과\n" +
                        "토끼 지속시간 : 1초\n" +
                        "이동속도 감소 : 0.8\n\n" +
                        "충전 : 2회, 24 / 21 / 18초" +
                        "쿨다운 : 3초"
            }
            if (intent.hasExtra("레녹스")) {
                binding.skill1.setImageResource(R.drawable.c_lenox_t)
                binding.passiveName.text = "[ Passive ] 낚시꾼/위풍당당"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text =
                        "낚시꾼: 레녹스는 낚시로 물고기를 획득할 때 무기를 제외한 아이템을 1개 추가로 획득합니다.\n" +
                                "위풍당당: 지정된 시간마다 기본 공격으로 적 플레이어를 공격 할 때 최대 체력의 10%만큼 피해를 흡수하는 보호막을 획득합니다. 보호막은 최대 6초 동안 유지됩니다."
                binding.passiveExeplan2.text = "낚시꾼 확률: 일반: 85%/ 고급: 14% / 희귀: 1%\n" +
                        "위풍당당 쿨다운: 20/16/12초"

                binding.skill2.setImageResource(R.drawable.c_lenox_q)
                binding.qName.text = "[ Q ] 회오리 비늘"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text =
                        "레녹스가 원형 범위에 적들에게 피해를 입힙니다. 가장자리에는 레녹스의 최대 체력에 일정 비율 만큼 추가로 피해를 줍니다. 적에게 공격을 적중시키면 1스택을 얻고, 스택당 회오리 비늘의 쿨타임을 1초 감소시킵니다. (최대 2스택)\n" +
                                "2명 이상의 적에게 스킬 적중 시 피해가 45% 감소됩니다."
                binding.qExeplan2.text = "피해량: 20/50/80/110/140 + (+공격력의 30%)\n" +
                        "가장자리 추가 피해량: 최대 체력의 /7/7.5/8/8.5/9%\n" +
                        "사정거리: 4.5m\n" +
                        "가장자리 범위: 3m ~ 4.5m\n" +
                        "스태미너 소모: 30/50/70/90/110\n" +
                        "쿨다운: 4초\n"

                binding.skill3.setImageResource(R.drawable.c_lenox_w)
                binding.wName.text = "[ W ] 날카로운 독니"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text =
                        "레녹스가 채찍을 두 번 휘두릅니다. 첫 번째 휘두르기로 주변의 적들에게 피해를 입히고 1.5초간 이동속도를 20% 느려지게 합니다. 두 번째 휘두르기는 경로상의 적들에게 피해를 주고 0.5초 동안 침묵시킵니다. 두 번째 휘두르기에 적이 적중되면 레녹스의 이동속도가 3초 동안 20% 증가합니다."
                binding.wExeplan2.text = "첫 번째 피해량: 20/30/40/50/60(+공격력의 30%)\n" +
                        "두 번째 피해량: 50/85/120/155/190(+공격력의 60%)\n" +
                        "첫 번째 휘두르는 범위: 3m(원형)\n" +
                        "두 번째 휘두르는 범위: 6m, 너비 1.25m\n" +
                        "스태미너 소모: 80/90/100/110/120\n" +
                        "쿨다운: 12/11/10/9/8초"

                binding.skill4.setImageResource(R.drawable.c_lenox_e)
                binding.eName.text = "[ E ] 휩쓸기"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "레녹스가 뒤에서 앞으로 채찍을 휘두르며 범위 안의 적들에게 피해를 입히고 밀어낸 후, 이동속도를 1초동안 느려지게 합니다."
                binding.eExeplan2.text = "피해량: 20/80/140/200/260(+공격력의 30%)\n" +
                        "이동속도 감소: 20/25/30/35/40%\n" +
                        "범위: 가로 2.5m, 세로 4m\n" +
                        "넉백(0.5초 간): 1.5m\n" +
                        "스태미너 소모: 60/65/70/75/80\n" +
                        "쿨다운: 9초"

                binding.skill5.setImageResource(R.drawable.c_lenox_r)
                binding.rName.text = "[ R ] 푸른뱀"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text =
                        "레녹스가 채찍을 X자 형태로 빠르게 두 번 휘둘러 각각 피해를 입히고 지정된 시간 동안 푸른뱀 표식을 줍니다.\n" +
                                "푸른뱀: 푸른뱀 표식을 가진 적의 이동 거리 1m 당 고정 피해를 입힙니다. 두 번 모두 적중한 대상은 한 번 적중한 대상보다 큰 고정피해를 입힙니다."
                binding.rExeplan2.text = "피해량: 50/100/150(+공격력의 80%)\n" +
                        "사거리: 7.5m\n" +
                        "스태미너 소모: 100/120/140\n" +
                        "쿨다운 120/100/80초\n" +
                        "푸른뱀 표식 지속시간: 4/4.5/5초\n" +
                        "푸른뱀 고정 피해량: 1m 당 15/20/25\n" +
                        "강화된 고정 피해량: 1m 당 30/35/40"
            }

            if (intent.hasExtra("로지")) {
                binding.skill1.setImageResource(R.drawable.c_rozzi_t)
                binding.passiveName.text = "[ Passive ] 더블샷"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text =
                        "로지는 스킬을 사용한 후 4초 이내에 기본 공격을 하면 빠르게 두 번 연속 발사하여, 각각의 피해를 입힙니다.\n" +
                                "\n" +
                                "로지는 초콜릿이 들어간 음식을 먹으면 체력 회복량의 50%만큼 스태미너를 회복하고, 초콜릿이 들어간 음료를 마시면 스태미너 회복량의 50%만큼 체력을 회복합니다."
                binding.passiveExeplan2.text = ""

                binding.skill2.setImageResource(R.drawable.c_rozzi_q)
                binding.qName.text = "[ Q ] 이지샷"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text =
                        "로지가 지정한 방향으로 총을 발사하여 경로상의 적들에게 피해를 입힙니다.\n" +
                                "총에 맞은 대상이 있으면 2초 이내의 다음 이동 명령에 빠르게 돌진하며, 이지샷의 쿨다운이 2초 감소합니다."
                binding.qExeplan2.text = "피해량 : 30/70/110/150/290(+공격력의 25%)\n" +
                        "사정거리 : 5.5m, 폭 1m\n" +
                        "스태미너 소모 : 60/65/70/75/80\n" +
                        "돌진 거리 : 2.75m\n" +
                        "쿨다운 : 6초"

                binding.skill3.setImageResource(R.drawable.c_rozzi_w)
                binding.wName.text = "[ W ] 스핀샷"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text =
                        "로지가 총을 난사하여 주변의 적들에게 피해를 입히고, 3초동안 방어력 및 치유 효과를 40% 감소시킵니다."
                binding.wExeplan2.text = "피해량 : 85/125/165/205/245(+공격력의 35%)\n" +
                        "이동속도 : 0.4초간 +100% \n" +
                        "사정거리 : 3m \n" +
                        "스태미너 소모 : 70/80/90/100/110 \n" +
                        "시전시간 : 0.27초 , 지속 시간 : 2.5초 \n" +
                        "쿨다운 : 8.5/8/7.5/7/6.5초"

                binding.skill4.setImageResource(R.drawable.c_rozzi_e)
                binding.eName.text = "[ E ] 에어샷"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "로지가 지정한 대상을 점프하여 넘어가며 대상이 있던 위치에 총을 발사하여 의 피해를 입힙니다.\n" +
                        "로지는 점프하는 동안 모든 피해를 받지 않고, 목표로 지정할 수 없는 상태가 됩니다. 피해를 입힌 대상이 있다면 3초 안에 지정한 대상에게 스킬을 다시 사용하여 의 피해를 입히며 밀어냅니다. 밀려난 대상이 벽에 부딫히면 0.75초 동안 기절합니다."
                binding.eExeplan2.text = "피해량 : 50/70/90/110/130(+공격력의 40% ~ 45%) \n" +
                        "사정거리 : 점프 = 3m, 도착 지점 = 대상 뒤 2.5m, 넉백 : 4.5m \n" +
                        "스태미너 소모 70/80/90/100/110 \n" +
                        "시전시간 : 넉백 0.27초\n" +
                        "쿨다운 18/16/14/12/10초"

                binding.skill5.setImageResource(R.drawable.c_rozzi_r)
                binding.rName.text = "[ R ] 셈텍스탄 Mk-II"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text =
                        "로지가 적이나 지면에 부착되고 3초 후에 폭발하는 폭탄을 발사합니다.\n" +
                                "폭탄을 적에게 붙였다면 이동속도가 15/20/25% 감소하고, 폭발할 때 피해를 입힙니다.\n"+
                                "부착된 폭탄이 터지기 전에 대상에게 기본 공격을 5회 적중하면 즉시 터지며 대상 최대 체력의 3/6/9%만큼의 고정 피해를 추가로 입힙니다.\n" +
                                "스킬을 적중하면 2회 공격으로 간주합니다. 폭탄을 즉시 터트리면 셈텍스탄 Mk-II 스킬의 쿨다운이 45% 감소하고, 1초 동안 이동속도가 15% 증가합니다.\n" +
                                "즉시 폭발 시 이동 속도가 1초간 20/25/30% 감소됩니다."
                binding.rExeplan2.text = "피해량 : 100/175/250(+공격력의 35%) \n" +
                        "이동속도 : +0.2/0.25/0.3 \n" +
                        "사정거리 : 5m \n" +
                        "부착, 폭발 반경 : 1.2m , 1.75m \n" +
                        "스태미너 소모 : 90 \n" +
                        "시전시간 : 0.21초 \n" +
                        "쿨다운 18초"
            }


            if (intent.hasExtra("루크")) {
                binding.skill1.setImageResource(R.drawable.luke_t)
                binding.passiveName.text = "[ Passive ] 청소 완료"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "만족감: 루크는 실험체를 처치하면 자신의 잃은 체력을 일정 비율 회복하고, 위클라인을 처치해도 자신의 잃은 체력의 일정 비율 회복합니다.\n" +
                        "\n" +
                        "- 청소 완료: 루크는 실험체, 야생동물 처치 및 보급상자를 획득 할때마다 청소 완료 중첩을 획득합니다.\n" +
                        "10/30/50 중첩일 때 진화 포인트를 획득합니다.\n" +
                        "50 중첩 부터 10 중첩마다 만족감 효과가 1%씩 증가합니다."
                binding.passiveExeplan2.text = "재생 : 5/8/12 % 잃은 체력 회복 \n" +
                        "위클라인 처치시 10/15/20% 잃은 체력 회복"

                binding.skill2.setImageResource(R.drawable.luke_q)
                binding.qName.text = "[ Q ] 클리닝 서비스"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "루크가 세제통을 던져 처음 적중한 적에게 피해를 입히고, 해당 적에 대한 시야를 얻습니다. 다음 4초 안에 스킬을 재사용할 수 있습니다.\n" +
                        "재사용 시: 루크가 발사체에 맞은 적에게 돌진하여 적의 보호막을 파괴하고, 피해를 입힙니다."
                binding.qExeplan2.text = "피해량 : 투사체 15/40/65/90/150 (+0.5 공격력), 재사용 시 50/80/110/140/170(+1.0공격력)\n" +
                        "사정거리 : 8m / 폭 0.6m, 재사용 가능거리 11m \n" +
                        "스태미너 소모 : 30/50/70/80/110 \n" +
                        "쿨다운 : 18/15.5/13/10.5/8초 \n" +
                        "\n 진화 효과 \n" +
                        " - 재사용하는 클리닝 서비스 피해량의 80% 만큼 체력을 즉시 회복"

                binding.skill3.setImageResource(R.drawable.luke_w)
                binding.wName.text = "[ W ] 강박증"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "지속 효과: 루크에게 적용되는 방해효과(에어본/둔화/속박/기절/제압)의 지속시간이 12% 감소합니다.\n" +
                        "\n" +
                        "사용 효과: 5초동안 기본 공격을 강화하여 20/35/50/65/80(+공격력의 20%)의 스킬 피해를 추가로 입힙니다.\n" +
                        "강화된 기본 공격으로 적에게 피해를 입히면 2초 동안 공격속도가 8% 증가하며, 최대 5번까지 중첩됩니다.\n"
                binding.wExeplan2.text = "피해량 : 20/35/50/65/80(+0.2 공격력) \n" +
                        "스태미너 소모 : 70/85/100/115/130 \n" +
                        "지속시간 : 5초 \n" +
                        "쿨다운 : 지속시간 종료 후 10/9/8/7/6초\n" +
                        "\n 진화 효과 \n - 강박증으로 강화된 기본 공격으로 적에게 피해를 입힐 시 클리닝 서비스 쿨다운 0.5초 감소"

                binding.skill4.setImageResource(R.drawable.luke_e)
                binding.eName.text = "[ E ] 무소음 청소기"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "지속 효과: 루크는 공격을 하거나 대상을 처치할 때 미니맵에 소음 핑이 발생하지 않습니다.\n" +
                        "사용 효과: 루크가 지정한 적의 뒤로 즉시 이동하여 권총으로 의 피해를 입힙니다.\n"
                binding.eExeplan2.text = "피해량 60/90/120/150/180(+0.4 공격력) \n" +
                        "사정거리 : 3m \n" +
                        "스태미너 소모 : 70/85/100/115/130 \n" +
                        "쿨다운 22/19/16/13/10초\n" +
                        "\n 진화 효과 \n - 무소음 청소기로 피해를 입힌 대상을 1초 동안 70% 둔화"

                binding.skill5.setImageResource(R.drawable.luke_r)
                binding.rName.text = "[ R ] 애프터 서비스"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "루크의 청소도구에서 관통형 총알을 발사하여, 적의 잃은 체력에 비례해 피해를 입히고\n" +
                        "2초 동안 이동속도를 50% 감소시킵니다.\n" +
                        "루크는 적 대상의 시야를 얻고 뒤로 밀려납니다."
                binding.rExeplan2.text = "피해량 : 200/300/400(+0.75 공격력) ~ 500/600/700(+1.6 공격력) \n" +
                        "사정거리 : 12m / 폭 1.5m \n" +
                        "스태미너 소모 : 120/140/160 \n" +
                        "쿨다운 : 85/70/55초\n" +
                        "\n 진화 효과 \n" +
                        " - 루크가 발사한 관통형 총알이 적에게 명중 시 클리닝 서비스 쿨다운 초기화"
            }
            if (intent.hasExtra("캐시")) {
                binding.skill1.setImageResource(R.drawable.cathy_t)
                binding.passiveName.text = "[ Passive ] 외과 전문의"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "외과 전문의: 캐시가 적에게 피해를 입히면 3초 동안 공격력의 20%의 고정 피해를 입히는 외상 상태가 됩니다.\n" +
                        "기본 공격은 1개, 스킬 공격은 2개의 외상 스택을 부여하여 5스택이 쌓이면 4초 동안 최대 체력의 3%(+공격력의 80%)만큼 고정 피해를 입히는 치명적 외상 상태가 됩니다.\n" +
                        "캐시는 치명적 외상 상태의 적에게 치명타를 입히면 10/25/40% 만큼 치명타 피해가 증가합니다."
                binding.passiveExeplan2.text = "포스트옵 : 적에게 스킬피해를 입히면 2초간 100/125/150(공격력의 25%)의 피해를 막아주는 보호막을 획득하고, 이동 속도가 12/15/18% 증가합니다. 치명타 피해를 입히면 포스트옵의 쿨다운이 1초 감소합니다"

                binding.skill2.setImageResource(R.drawable.cathy_q)
                binding.qName.text = "[ Q ] 동맥절제술"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "캐시가 적에게 빠르게 돌진하여 의 피해를 입힙니다.\n" +
                        "적이 기본 공격 사거리 안에 있으면 제자리에서 즉시 공격하여 30%의 추가 피해를 입히고 포스트옵의 쿨다운이 1초 감소합니다.\n" +
                        "치명타 피해 증가량만큼 피해량이 증가합니다. \n" +
                        "캐시가 적을 치명적 외상 상태로 만들면 동맥절제술의 쿨다운이 40/50/60/70/80% 감소합니다."
                binding.qExeplan2.text = "피해량 : 20/50/80/110/140 (+ 0.4 공격력) \n" +
                        "사정거리 : 3m \n" +
                        "스태미너 소모 : 50/60/70/80/90 \n" +
                        "쿨다운 : 12/11.5/11/10.5/10초"



                binding.skill3.setImageResource(R.drawable.cathy_w)
                binding.wName.text = "[ W ] 엠퓨테이션"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "캐시가 전방으로 톱을 날카롭게 휘둘러 피해를 입히고 이동속도를 2초 동안 30% 느려지게 합니다.\n" +
                        "스킬의 바깥 범위에 적중한 적은 2초 동안 이동 스킬을 사용할 수 없는 고정 상태가 됩니다."
                binding.wExeplan2.text = "피해량 : 35/70/105/140/175 (+ 0.2 공격력) \n" +
                        "가장자리 적중 시 추가 피해 +45 (+ 0.35 공격력)\n" +
                        "사정거리 : 4m, 부채꼴 범위 80도 \n" +
                        "스태미너 소모 : 70\n" +
                        "쿨다운 : 16/15/14/13/12초"

                binding.skill4.setImageResource(R.drawable.cathy_e)
                binding.eName.text = "[ E ] 수쳐"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "캐시가 실이 묶인 바늘을 던져 피해를 입히고 0.5초동안 속박시킵니다.\n" +
                        "바늘이 적중하면 관통하여 최대 1명의 적에게 추가로 적중 할 수 있습니다.\n" +
                        "관통한 바늘이 적에게 적중하면 적중한 대상들을 서로 끌어당겨 1.3초간 기절시키고, 추가 피해를 입힙니다."
                binding.eExeplan2.text = "피해량 : 30/40/50/60/70 (+ 0.3 공격력) \n" +
                        "추가 피해 : 10/20/30/40/50 (+ 0.2 공격력) \n" +
                        "사정거리 : 5m \n" +
                        "스태미너 소모 70 : \n" +
                        "쿨다운 : 24/22/20/18/16초 \n" +
                        "관통한 바늘이 벽에 충돌하면 처음 바늘에 적중한 적을 벽으로 밀어내 1.5초간 기절시키고, 30/40/50/60/70 ( +0.3 공격력) 의 추가 피해를 입힙니다."


                binding.skill5.setImageResource(R.drawable.cathy_r)
                binding.rName.text = "[ R ] 이머전시 OP"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "기본 지속 효과: 캐시는 빈사 상태의 아군을 회복시키면 2/3/4초간 아군의 최대 체력을 초당 5%씩 회복시키는 영역을 생성합니다.\n" +
                        "캐시가 지정한 방향으로 톱을 휘두르며 빠르게 이동하여, 범위 내의 적들에게 피해를 입히며 즉시 치명적 외상을 부여합니다. 피해량은 대상의 잃은 체력에 따라 300/500/700(+공격력의 150%)까지 증가할 수 있습니다.\n" +
                        "(적 현재 체력이 최대 체력의 30%일 때 최대가 됩니다.\n" +
                        "범위 내의 아군들은 체력이 120/200/280(+ 공격력의 40%) 만큼 회복됩니다. 아군의 체력이 20% 미만이면 180/300/420(+공격력의 60%) 만큼 회복됩니다."
                binding.rExeplan2.text = "피해량 : 120/200/280 (+ 0.6 공격력) ~ 240/400/560 (+ 1.2 공격력)\n" +
                        "사정거리 : 3m ~ 6m, 너비 : 3m \n" +
                        "스태미너 소모 120/135/150 \n" +
                        "쿨다운 : 120/110/100초"
            }
            if (intent.hasExtra("아델라")) {
                binding.skill1.setImageResource(R.drawable.adela_t)
                binding.passiveName.text = "[ Passive ] 퀸즈 갬빗 디클라인드"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "아델라는 기본 공격의 사정거리가 2.5m 증가하는 대신 공격 속도가 고정되고, 공격 속도가 0.01 증가하면 공격력이 0.2/0.6/1.0 증가합니다.\n" +
                        "또한 치명타 확률이 2/6/10% 증가하고, 치명타가 발동되면 이동속도가 2초 동안 4/8/12% 증가합니다."
                binding.passiveExeplan2.text = "이동속도 : 4/8/12% (2초) \n" +
                        "사정거리 : 2.5m 증가"

                binding.skill2.setImageResource(R.drawable.adela_q)
                binding.qName.text = "[ Q ] 프로모션"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "아델라가 지정한 지점에 폰을 배치하여 피해를 입힙니다.\n" +
                        "폰을 사용할 때마다 스택이 쌓이고 3스택이 되면 다음 스킬을 사용 할 때 퀸을 배치하여 피해를 입히고 1초 동안 기절시킵니다. 프로모션 스킬을 6초 안에 다시 사용하지 않으면 스택이 초기화됩니다.\n" +
                        "폰과 퀸은 8초 동안 유지되며, 프로모션은 쿨다운 감소의 영향을 받지 않습니다."
                binding.qExeplan2.text = "피해량 : <폰> 30/60/90/120/150(+0.6 공격력) \n" +
                        "<퀸> 40/80/120/160/200(+1.0 공격력) \n" +
                        "사정거리 : 7m\n" +
                        "스태미너 소모 : 60/70/80/90/100 \n" +
                        "쿨다운 4/3.5/3/2.5/2초"

                binding.skill3.setImageResource(R.drawable.adela_w)
                binding.wName.text = "[ W ] 나이트 포크"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "아델라가 지정한 지점에 나이트를 배치 하면 피해를 입힌 후, 다시 점프하여 도착지점에 각각의 피해를 입힙니다.\n" +
                        "첫 번째 착지 할 때 4m 안에 폰, 퀸, 룩이 있으면 착지점과 반대편으로 밀어내며 각각 다른 효과를 줍니다.\n" +
                        "폰과 퀸 : 이동하다 적을 만나면 멈추고 프로모션(Q)과 동일한 피해를 주며 0.75초 동안 공중에 띄웁니다.\n" +
                        "룩 : 이동하며 경로 상의 적들에게 캐슬링(E)과 동일한 피해를 입히고 1.25초 동안 공중에 띄웁니다.\n" +
                        "나이트는 8초 동안 유지되며 나이트를 다시 배치하면 이전의 나이트는 즉시 사라집니다.\n" +
                        "다른 기물의 피해 효과를 발동할 때, 45% 감소된 피해량 적용"
                binding.wExeplan2.text = "피해량 : 45/90/135/180/225 (+공격력의 30%)\n" +
                        "사정거리 : 6m\n" +
                        "스테미너 소모 : 90/100/110/120/130\n" +
                        "쿨다운 : 18/16/14/12/10초"

                binding.skill4.setImageResource(R.drawable.adela_e)
                binding.eName.text = "[ E ] 캐슬링"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "아델라가 지정한 지점에 룩을 돌격시켜 경로 상의 적들에게 피해를 입히고,\n" +
                        "경로상에 폰, 퀸, 나이트가 있으면 즉시 피해효과를 발동합니다.\n" +
                        "폰과 퀸 : 프로모션(Q)과 동일한 피해를 입힙니다.\n" +
                        "나이트 : 나이트 포크(W)와 동일한 피해를 입히고 이동속도를 1초 동안 30% 느려지게 합니다.\n" +
                        "\n" +
                        "4초 이내에 10m 범위 안에서 스킬을 다시 사용하면 아델라와 룩의 위치가 변경됩니다. 룩은 8초 동안 유지되며 룩을 다시 배치하면 이전의 룩은 즉시 사라집니다.\n" +
                        "다른 기물의 피해 효과를 발동할 때, 45% 감소된 피해량 적용"
                binding.eExeplan2.text = "피해량 : 65/110/155/200/245 (+공격력의 50%)\n" +
                        "사정거리 : 6m\n" +
                        "스테미너 소모 : 70/85/100/115/130\n" +
                        "쿨다운 : 22/20.5/19/17.5/16초"


                binding.skill5.setImageResource(R.drawable.adela_r)
                binding.rName.text = "[ R ] 체크 메이트"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "아델라가 공중으로 떠올라 2초 동안 모든 피해를 받지 않고,\n" +
                        "목표로 지정할 수 없는 상태가 되었다가 착지하며 범위 안의 적들에게 피해를 입힙니다.\n" +
                        "스킬을 시전할 때 배치한 말 하나당 적 최대 체력의 3%만큼 추가 피해를 입힙니다.\n" +
                        "착지 할 때 모든 체스 말들은 피해효과를 발동하고 사라집니다.'"
                binding.rExeplan2.text = "피해량 : 100/200/300 (+공격력의 50%)\n" +
                        "스테미너 소모 : 90(모든 구간)\n" +
                        "지속시간 : 2초\n" +
                        "쿨다운 : 85/75/65초"
            }
            if (intent.hasExtra("버니스")) {
                binding.skill1.setImageResource(R.drawable.bernice_t)
                binding.passiveName.text = "[ Passive ] 산탄"
                var span: Spannable = binding.passiveName.text as Spannable
                span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.passiveExeplan1.text = "버니스는 기본 공격을 할 때 2/3/4 개의 탄환을 발사하며, 기본 사정거리가 4m로 고정됩니다.\n" +
                        "탄환은 적 대상에게 적중한 수에 비례하여 피해를 입힙니다.\n" +
                        "스킬 레벨에 따라 재장전 시간이 빨라집니다."
                binding.passiveExeplan2.text = "피해량 : 공격력의 70/85/100% ~ 공격력의 91/115/133%\n" +
                        "시전시간 : 즉시\n" +
                        "지속시간 : 1.5초\n" +
                        "쿨다운 : 30초"

                binding.skill2.setImageResource(R.drawable.bernice_q)
                binding.qName.text = "[ Q ] 레그샷"
                var spanq: Spannable = binding.qName.text as Spannable
                spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.qExeplan1.text = "버니스가 관통형 탄을 발사하여 피해를 입히고, 3초 동안 이동속도를 10/15/20/25/30% 감소시킵니다.\n" +
                        "속박이 걸린 적 대상에게는 피해를 입히고, 2초 동안 이동속도를 30/35/40/45/50% 감소시킵니다.\n"
                binding.qExeplan2.text = "피해량 : 70/110/150/190/230(+공격력의 60%) ~ 100/140/180/220/260(+공격력의 60%)\n" +
                        "사정거리 : 11m, 반지름 0.75m(폭 1.5m)\n" +
                        "스테미너 소모 : 60/70/80/90/100\n" +
                        "시전시간 : 즉시\n" +
                        "쿨다운 : 8/7.5/7/6.5/6초"

                binding.skill3.setImageResource(R.drawable.bernice_w)
                binding.wName.text = "[ W ] 사냥 덫"
                var spanw: Spannable = binding.wName.text as Spannable
                spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.wExeplan1.text = "버니스가 20/25/30/35/40초 동안 유지되는 사냥 덫을 설치하여, 밟은 적 대상에게 3초 동안 피해를 입히고 1초 동안 속박시킵니다.\n" +
                        "사냥 덫은 최대 3/3/4/4/5개까지 보유할 수 있으며, 한 번에 1/2/2/3/3개를 설치할 수 있습니다.\n"
                binding.wExeplan2.text = "피해량 : 20/30/40/50/60(+공격력의 10%)\n" +
                        "스테미너 소모 : 30/35/40/45/50"

                binding.skill4.setImageResource(R.drawable.bernice_e)
                binding.eName.text = "[ E ] 매의 눈"
                var spane: Spannable = binding.eName.text as Spannable
                spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.eExeplan1.text = "지속 효과: 버니스는 사냥 덫에 걸린 적에게 4초 동안 지속되는 사냥 표식을 부여하여 대상자의 시야를 제공받으며, 대상자쪽으로 이동할 때 이동속도가 12/14/16/18/20% 증가합니다.\n" +
                        "사냥 표식 대상자에게 기본 공격을 적중시키면 레그샷(Q)의 쿨다운을 0.5초, 올가미 탄(R)의 쿨다운이 1/1/1.5/1.5/2초 감소됩니다.\n" +
                        "버니스의 매가 상공을 맴돌며 8초 동안 버니스의 시야를 3/3/4/4/4.5 증가시키고, 6초마다 근처의 적에게 4초 동안 지속되는 사냥 표식을 부여합니다."
                binding.eExeplan2.text = "스테미너 소모 : 60/75/90/105/120\n" +
                        "쿨다운 : 14/12/10/8/6초\n" +
                        "(매의 눈 지속시간이 끝나야 쿨다운이 돌아감)"


                binding.skill5.setImageResource(R.drawable.bernice_r)
                binding.rName.text = "[ R ] 올가미 탄"
                var spanr: Spannable = binding.rName.text as Spannable
                spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
                binding.rExeplan1.text = "버니스가 지정한 방향으로 올가미 탄을 발사하여 적중한 대상에게 피해를 입히고, 속박합니다.\n" +
                        "올가미탄의 속박이 끝나면 폭발하여 속박 대상에게 피해를 입히고, 3m 범위 내의 가장 가까운 적 대상에게 전이되어 동일한 효과를 발동합니다.\n" +
                        "올가미 탄은 최대 3번 전이 될 수 있습니다."
                binding.rExeplan2.text = "피해량 : 150/200/250(+공격력의 50%) ~ 100/150/200(+공격력의 50%)\n" +
                        "사정거리 : 12m, 반지름:0.7m(폭 1.4m)\n" +
                        "스테미너 소모 : 120/150/180\n" +
                        "시전시간 : 즉시\n" +
                        "지속시간 : 1.5초\n" +
                        "쿨다운 : 140/120/100"
            }
            if (intent.hasExtra("바바라")) {
                binding.skill1.setImageResource(R.drawable.barbara_t)
                binding.change.visibility = View.VISIBLE
                binding.texc.visibility = View.VISIBLE

                changeskill(a, "바바라")
                binding.skill1.setOnClickListener {
                    a *= -1
                    changeskill(a, "바바라")
                }
            }

            if (intent.hasExtra("알렉스")) {
                binding.skill1.setImageResource(R.drawable.alex_passive)
                binding.change.visibility = View.VISIBLE
                binding.texc.visibility = View.VISIBLE

                changeskill(a, "알렉스")
                binding.skill1.setOnClickListener {
                    a *= -1
                    changeskill(a, "알렉스")
                }
            }

        if (intent.hasExtra("수아")) {
            binding.skill1.setImageResource(R.drawable.sua_p)
            binding.passiveName.text = "[ Passive ] 마음의 양식"
            var span: Spannable = binding.passiveName.text as Spannable
            span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.passiveExeplan1.text = "수아는 스킬을 사용하면 마음의 양식을 얻어 다음 기본 공격이 대상에게 피해를 입히고, 주변 2m 범위에 피해를 입힙니다.\n" +
                    "마음의 양식으로 입힌 피해량의 30%만큼 체력을 즉시 회복합니다.\n" +
                    "마음의 양식은 최대 3중첩까지 보유할 수 있으며, 중첩이 하나라도 있다면 공격속도가 상승합니다.\n" +
                    "마음의 양식으로 적에게 피해를 입히면 모든 스킬의 쿨다운이 1.5초 감소합니다.\n" +
                    "쿨다운 감소 효과는 피해를 입힌 대상의 수와 관계없이 한 번만 적용됩니다."
            binding.passiveExeplan2.text = "피해량 : 20/60/100(+공격력의 60%)(+방어력의 60%)\n" +
                    "주변 2m 범위 : 10/30/50(+공격력의 30%)(+방어력의 30%)\n" +
                    "공격속도 : +40%"

            binding.skill2.setImageResource(R.drawable.sua_q)
            binding.qName.text = "[ Q ] 오딧세이"
            var spanq: Spannable = binding.qName.text as Spannable
            spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.qExeplan1.text = "수아가 지정한 위치에 두개의 책을 생성하여 잠시 후 중심부로 모으며 범위 안의 적들에게 피해를 입히고, 3.5초 동안 책갈피를 남깁니다. \n" +
                    "책갈피가 남은 대상에게 새로운 책갈피를 남기면 20/40/60/80/100(+공격력의 60%)의 피해를 입히고, 기존의 책갈피는 사라집니다. 책의 충돌 지점에 있는 적들은 0.75초 동안 기절시킵니다."
            binding.qExeplan2.text = "피해량 : 45/75/105/135/165 (+공격력의 40%)\n" +
                    "사정거리 : 8m\n" +
                    "스테미너 소모 : 50/60/70/80/90\n" +
                    "쿨다운 : 14/12/10/8/6초"

            binding.skill3.setImageResource(R.drawable.sua_w)
            binding.wName.text = "[ W ] 파랑새"
            var spanw: Spannable = binding.wName.text as Spannable
            spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.wExeplan1.text = "아군 및 자신에게 사용하면 파랑새가 3초 동안\n" +
                    "50/90/130/170/210(+공격력의 20%)의 스킬 피해를 흡수하고, 저지불가 상태가 되는 보호막을 씌워줍니다.\n" +
                    "적에게 사용하면 파랑새가 피해를 입히고, 1.1/1.2/1.3/1.4/1.5초 동안 적 대상을 실명시킵니다."
            binding.wExeplan2.text = "피해량 : 25/50/75/110/135 (+공격력의 40%)\n" +
                    "사정거리 : 6m\n" +
                    "스테미너 소모 : 70/85/100/115/130\n" +
                    "쿨다운 : 26/24/22/20/18초"

            binding.skill4.setImageResource(R.drawable.sua_e)
            binding.eName.text = "[ E ] 돈키호테"
            var spane: Spannable = binding.eName.text as Spannable
            spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.eExeplan1.text = "수아가 무기를 랜스로 바꿔 전방으로 돌진해 처음 적중한 적에게 피해를 입히고,\n" +
                    "1초 동안 이동속도를 50%만큼 감소시킵니다.\n" +
                    "책갈피 혹은 기절 상태의 적 대상에게는 피해를 입히고, 대상을 공중에 띄워올립니다.\n" +
                    "적 대상에게 적중하면 돈키호테의 쿨다운이 20%만큼 감소합니다."
            binding.eExeplan2.text = "피해량 : 90/120/150/180/210 (+공격력의 40%)\n" +
                    "책갈피 대상: 120/160/200/240/280 (+공격력의 60%)\n" +
                    "스테미너 소모 : 90/110/130/150/170\n" +
                    "쿨다운 : 20/18.5/17/15.5/14초"


            binding.skill5.setImageResource(R.drawable.sua_r)
            binding.rName.text = "[ R ] 기억력"
            var spanr: Spannable = binding.rName.text as Spannable
            spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.rExeplan1.text = "한 번 읽은 책의 내용을 전부 기억하는 수아는 가장 최근에 사용한 스킬을 다시 기억하여 사용합니다."
            binding.rExeplan2.text = "쿨다운 : 60/50/40초"
        }
            /*
                if (intent.hasExtra("")) {
            binding.skill1.setImageResource(R.drawable.)
            binding.passiveName.text = "[ Passive ] "
            var span: Spannable = binding.passiveName.text as Spannable
            span.setSpan(ForegroundColorSpan(Color.RED), 0, 11, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.passiveExeplan1.text = ""
            binding.passiveExeplan2.text = ""

            binding.skill2.setImageResource(R.drawable.)
            binding.qName.text = "[ Q ] "
            var spanq: Spannable = binding.qName.text as Spannable
            spanq.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.qExeplan1.text = ""
            binding.qExeplan2.text = ""

            binding.skill3.setImageResource(R.drawable.)
            binding.wName.text = "[ W ] "
            var spanw: Spannable = binding.wName.text as Spannable
            spanw.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.wExeplan1.text = ""
            binding.wExeplan2.text = ""

            binding.skill4.setImageResource(R.drawable.)
            binding.eName.text = "[ E ] "
            var spane: Spannable = binding.eName.text as Spannable
            spane.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.eExeplan1.text = ""
            binding.eExeplan2.text = ""


            binding.skill5.setImageResource(R.drawable.)
            binding.rName.text = "[ R ] "
            var spanr: Spannable = binding.rName.text as Spannable
            spanr.setSpan(ForegroundColorSpan(Color.RED), 0, 5, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
            binding.rExeplan1.text = ""
            binding.rExeplan2.text = ""
        }
        */
        }
}