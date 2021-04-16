package com.black_survivor.black_survivor_dictinary
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.black_survivor.black_survivor_dictinary.databinding.ActivityVideoBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlin.properties.Delegates

class video : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this){}
        var adview10 = findViewById<AdView>(R.id.adView10)
        adview10.loadAd(AdRequest.Builder().build())

        var vv:VideoView = findViewById(R.id.vv)
        lateinit var videouri: Uri
        var leb = 1
        binding.textLevel.text = leb.toString() + " 레벨"
        var a by Delegates.notNull<Int>() // 레벨
        var b by Delegates.notNull<Double>() // 공속
        var c by Delegates.notNull<Double>() // 기본공격추가피해
        var d by Delegates.notNull<Double>() // 스킬증폭

        val skill_exeplan = findViewById<TextView>(R.id.skill_exeplan)
        val skill_exeplan2 = findViewById<TextView>(R.id.skill_exeplan2)
        val weapon_Image = findViewById<ImageView>(R.id.weapon_skill_Image)
        var levelup:Int = 1

        fun table(a:Any, b:Any, c:Any, d:Any){
            binding.table1.text = a.toString()
            binding.table2.text = b.toString() + "%"
            binding.table3.text = c.toString() + "%"
            binding.table4.text = d.toString() + "%"
        }

        if (intent.hasExtra("단검")) {
            weapon_Image.setImageResource(R.drawable.cloakanddagger)
            skill_exeplan.text =
                "망토 효과로 인해 간 투명해지고 이동 속도가 증가합니다.\n증가한 이동 속도는 일정시간에 걸쳐 감소합니다.\n단검 효과가 활성화 된 상태에서 적에게 기본 공격을 하면 적의 뒤로 이동해서 치명타 피해를 입히고 대상의 현재 체력 일정 비율 만큼 추가 피해를 입힙니다."
            skill_exeplan2.text =
                "망토 이동 속도 증가 : 25/40%\n단검 추가 피해 : 현재 체력의 8%\n시전 시간 : 0.2초\n망토 지속 시간 : 2/3.5초\n단검 지속 시간 : 4초\n쿨다운 : 45/30초"
            binding.ImageName.text = "단검"
            binding.skillName.text = "망토와 단검"

            a = 1
            b = 2.7
            c = 5.0
            d = 1.5
            table(a, b, c, d)
            videouri =
                Uri.parse("https://w.namu.la/s/036eb0c440f549932320a48886dc3641098bec8d0b28f21eea03d94fac5f98c342e232cbf9cdb4c11047c8dc1099b7210449edf4945e3a157b25d3090830eeca492a164d34ac78bd682425dc9889d13b2d51e4ef41783bb756f57c819b638b3f")}
            else if (intent.hasExtra("양손검")) {
                weapon_Image.setImageResource(R.drawable.parry)
                skill_exeplan.text = "지정한 방향으로 일정 시간 동안 자세를 취해서 모든 공격과 효과를 방어 합니다.\n" +
                        "일정 시간이 지나면 지정한 방향으로 돌진하며, 경로상에 있는 모든 적에게 피해를 입힙니다."
                skill_exeplan2.text = "피해량: 2/2.5 공격력\n" +
                        "지속 시간 : 0.75초\n" +
                        "쿨다운 : 30초"

                binding.ImageName.text = "양손검"
                binding.skillName.text = "빗겨 흘리기"

                a = 1
                b = 3.3
                c = 5.0
                d = 1.5
                table(a, b, c, d)

                videouri =
                    Uri.parse("https://w.namu.la/s/dcb93d23e24f460953156f2475968411c774d9bf5db6078b180ae3b06fc74ef80b434da85423c6fce0e4c0276c79675e623a0d16dc86a36e00f2d3bc43d2f770d68c4a86632a87972c294b4908794f59f7a72b16da047c23e9bc2e2cab470b09")
            } else if (intent.hasExtra("도끼")) {
                weapon_Image.setImageResource(R.drawable.berserk)
                skill_exeplan.text = "적에게 기본 공격을 할 때마다 버서크 효과가 중첩되며, 중첩 수에 따라 공격력이 증가합니다.\n" +
                        "버서크 스킬을 사용하면 버서크 효과 중첩 당 공격력 증가량이 상승하고 잃은 체력에 비례해서 추가로 공격력이 증가합니다."
                skill_exeplan2.text = "최대 중첩 가능 수 : 5\n" +
                        "중첩 당 공격력 증가(패시브) : 1.5%\n" +
                        "중첩 당 공격력 증가(사용 시) : 5~15%(남은 체력 비례)\n" +
                        "지속 시간 : 6/8초\n" +
                        "쿨다운 : 50초"

                binding.ImageName.text = "도끼"
                binding.skillName.text = "버서크"

                a = 1
                b = 1.4
                c = 2.5
                d = 1.0
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/f2f873bdc62e366322f06ee91d740ae2f0ca6799d7f0f3ccd2edebaae2651bde163d76de69be78fb37defa1fe662f6e695bd2285d434dec9758e1a1d8de197829718896e1507e555d91e7543c6e770f308b2cf4a17d7d688a1508d0985bad905")
            } else if (intent.hasExtra("쌍검")) {
                weapon_Image.setImageResource(R.drawable.dualswordrampage)
                skill_exeplan.text = "지정한 방향으로 돌진하며 경로상에 있는 모든 적들에게 피해를 입힙니다.\n" +
                        "공격에 성공하면 스킬을 한 번 더 사용할 수 있습니다."
                skill_exeplan2.text = "피해량 : (0.25/0.4 공격력)×6\n" +
                        "사정거리 : 1.5m\n" +
                        "시전 시간 : 0.66초\n" +
                        "지속 시간 : 0.75초\n" +
                        "쿨다운 : 40초"
                binding.ImageName.text = "쌍검"
                binding.skillName.text = "쌍검난무"

                a = 1
                b = 1.7
                c = 2.8
                d = 1.3
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/8dfba8d47bb476a6c797dfe46ed1f50386e58519d6c2a8962576ea7f7ce925ff791fa959aec3d9e43d623ab9ad185703759a6f68706141b7c887b7f2c0bd7d4f12bbfa17756e307e97a1a8824e507f8f15039d2da3393991b919b2e0b69b7749")
            } else if (intent.hasExtra("권총")) {
                weapon_Image.setImageResource(R.drawable.revolber)
                skill_exeplan.text = "이동속도가 증가하며 빠르게 재장전 합니다.\n" +
                        "패시브 스킬과 무기 스킬을 제외한 모든 스킬의 쿨다운이 감소합니다."
                skill_exeplan2.text = "이동 속도증가 : 25%/50%\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 3초\n" +
                        "쿨다운 : 55/30초"
                binding.ImageName.text = "권총"
                binding.skillName.text = "무빙리로드"

                a = 1
                b = 3.3
                c = 4.1
                d = 2.6
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/648f24da9f36cd3427fba5301341c24014f0772d3299b1631791983b9d1f60ea888284c49ee9167fa57c2fde3d53c1d49179663c74b43d5dfa610c525953a56ddce5c4b201e067afd2acfa6ab5f4e483ffe28bbf86f14bb80377457bba2c8ec7")

            } else if (intent.hasExtra("돌격소총")) {
                weapon_Image.setImageResource(R.drawable.overheat)
                skill_exeplan.text = "기본 공격력을 적을 타격하면 과열 중첩을 얻습니다.\n" +
                        "과열 중첩이 모두 충전된 순간 과열 스킬을 사용할 수 있습니다.\n" +
                        "과열 상태에서는 공격속도 상한치가 무시되며 기본 공격시에 1타/3타모두 추가피해 효과가 추가 됩니다."
                skill_exeplan2.text = "공격 속도 증가 : 40%/60%\n" +
                        "기본 공격을 하지 않을 시 초당 중첩 감소량 : 10\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 5초\n" +
                        "추가 피해 : 5/7\n" +
                        "쿨다운 : 30초"
                binding.ImageName.text = "돌격소총"
                binding.skillName.text = "과열"

                a = 1
                b = 4.0
                c = 1.5
                d = 1.5
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/f91d0806d2faf1de9691e26aa29bef72ada6f701c1a1bec1c15d8fcedd10d344b1f69b134acf6587bf2103e1ce579c4ca69d0efe39bcc3d973d885f86eb9eaa0e7b8b373f81feff01031996d308f023896412dccabf91bed1b187902f7b1fcfb")
            } else if (intent.hasExtra("저격총")) {
                weapon_Image.setImageResource(R.drawable.sniper)
                skill_exeplan.text = "지정된 방향으로 저격 모드를 활성화 합니다.\n" +
                        "저격 모드가 되면 바라보는 방향의 시야가 넓어지지만 범위는 좁아집니다.\n" +
                        "시야내의 적을 선택시 몇초간 적에게 조준선이 보여진 후 총을 발사해 피해를 입힙니다."
                skill_exeplan2.text = "피해량 : 220/300 (2.5/3.0 공격력)\n" +
                        "사정거리 : 20m\n" +
                        "지속 시간 : 5초\n" +
                        "쿨다운 : 35/25초"
                binding.ImageName.text = "저격총"
                binding.skillName.text = "저격"

                a = 1
                b = 0.0
                c = 4.8
                d = 2.2
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/c60c4aee80025a1aea039be3f77ad54e24c9295e6cecb2ae783b59cd14add2c8316ed962284c4017f85ad3bc1761e20d39fd85ef60e22c8b8ffdf42366f27a437bfb12cd969fbbf2657d90710e17ceb2d926854700cfbe2a94bef8f67259e36f")
            } else if (intent.hasExtra("글러브")) {
                weapon_Image.setImageResource(R.drawable.glove)
                skill_exeplan.text = "다음 기본 공격이 사거리가 증가하고 더 많은 피해를 줍니다."
                skill_exeplan2.text = "피해량: 1.0 공격력 + 최종 피해량의 140%/200% + 50/100 고정 피해\n" +
                        "사정거리 : 기본 공격 + 1.0m\n" +
                        "쿨다운 : 12/10초"
                binding.ImageName.text = "글러브"
                binding.skillName.text = "어퍼컷"

                a = 1 //레벨
                b = 3.3 // 공속
                c = 2.5 // 추가피해
                d = 1.8 //스킬 증폭
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/912e2c1adf7950ba436321a13d002bafefd186b61513eae7dfb6ca1a7f160c1133d2b73e217ed005956e901719e5b67eb0113f3f47b133caa03412faba7823aff1680c1078794d207d255f4af1387195f50125e990392e1f27ebdeea5f5accfc")
            } else if (intent.hasExtra("톤파")) {
                weapon_Image.setImageResource(R.drawable.tonpa)
                skill_exeplan.text = "모든 방향에서 오는 피해를 막고, 공격한 대상에게 피해를 되돌려 줍니다."
                skill_exeplan2.text = "피해 반사 : 받은 피해의 60%/80%\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 0.75 초\n" +
                        "쿨다운 : 25/20초"
                binding.ImageName.text = "톤파"
                binding.skillName.text = "고속 회전"

                a = 1
                b = 1.8
                c = 4.1
                d = 3.7
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/3d8695c48612c72019c699a8e5d473d22b84db808a94b4edb567b39f9a94fa721ee978d5040193cde5d6aa20104da0b311c0ccc096ff1d13240474ab81978b4e9b7bb69b9e4fdf7d523395e4694f6851d35df135c0e113bc1084bc514a4cd001")
            } else if (intent.hasExtra("망치")) {
                weapon_Image.setImageResource(R.drawable.hammer)
                skill_exeplan.text = "지정한 방향으로 망치를 내려쳐 피해를 입히고 몇초간 방어력을 감소 시킵니다."
                skill_exeplan2.text = "피해량 : 150/300(+1.0/2.0 방어력)\n" +
                        "방어력 감소 : 20%/35%\n" +
                        "사정거리 : 3m\n" +
                        "시전 시간 : 0.5초\n" +
                        "방어력 감소 지속 시간 : 5/7초\n" +
                        "쿨다운 : 30초"
                binding.ImageName.text = "망치"
                binding.skillName.text = "갑옷깨기"

                a = 1
                b = 0.8
                c = 5.0
                d = 1.8
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/1287ea1e3172ca4e6f347e4b3004bd31da4cd7265c6e3e0419cbba32465d1c6e5a4c56ef23bc70d424f2546c6b29fb2e459264029eb4ed4a73872a186edbee404b58d6b2b7de21d5311ea83fff8090df5a8a0c39730a512bd667fd15d20f3f4b")
            } else if (intent.hasExtra("방망이")) {
                weapon_Image.setImageResource(R.drawable.swing)
                skill_exeplan.text = "전방 180도 범위의 모든 적에게 피해를 주고 뒤로 넉백시킵니다.\n" +
                        "넉백 된 적이 벽에 부딪히면 0.5초간 기절합니다."
                skill_exeplan2.text = "피해량 : 200/400(+1.0/2.0 공격력)\n" +
                        "넉백 거리 : 4.5m\n" +
                        "사정거리 : 2.0m\n" +
                        "시전 시간 : 0.67초\n" +
                        "쿨다운 : 25초"
                binding.ImageName.text = "방망이"
                binding.skillName.text = "풀스윙"

                a = 1
                b = 3.0
                c = 4.0
                d = 1.2
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/a9bbb8e37f29c1895b00cf905c6b28978c0d08cfd95d2951a6dd29bd64b6aebd249ab866153527d6f484b06cfaf923198f174a79bc7e16cb4f7ce298ff51a4bfc358442cb17d86640fcf6131dc4607200e50093f4c03f553c2f3de0680db9bef")
            } else if (intent.hasExtra("레이피어")) {
                weapon_Image.setImageResource(R.drawable.quickcut)
                skill_exeplan.text = "지정한 대상에게 돌진하여 피해를 입힙니다.\n" +
                        "치명타 피해량이 증가할수록 피해량이 증가합니다."
                skill_exeplan2.text = "피해량 : (2.0 공격력)\n" +
                        "사정거리 : 5m\n" +
                        "시전 시간 : 0.13초\n" +
                        "쿨다운 : 20/12초"
                binding.ImageName.text = "레이피어"
                binding.skillName.text = "섬격"

                a = 1
                b = 2.5
                c = 4.2
                d = 2.0
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/ed9d419e369adc540999ac2c29428788595045a0e80a9439025164da1d8dc5f826ff241595c0842784b56adf8c8ef16784d30ba61f2cd46269678a0b8c9619baedb8925b0f852583d2bae00f18de1e69c20cc9b5b8c74b68beace484afadfd59")
            } else if (intent.hasExtra("창")) {
                weapon_Image.setImageResource(R.drawable.shadowstab)
                skill_exeplan.text = "지정한 방향으로 창을 강하게 내질러서 피해를 입히고 이동 속도를 감소 시킵니다.\n" +
                        "일정거리 안의 대상에게는 넉백 효과를 줍니다."
                skill_exeplan2.text = "피해량 : (1.0/1.5 공격력)\n" +
                        "이동 속도 감소 : 55%\n" +
                        "사정거리 : 2m/4m\n" +
                        "시전 시간 : 0.3초\n" +
                        "쿨다운 : 30초"
                binding.ImageName.text = "창"
                binding.skillName.text = "그림자 찌르기"

                a = 1
                b = 0.7
                c = 3.8
                d = 1.2
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/6c62838e1bb857cf17bdab0a13e36d3a6f1fe2a32cbd20aba760d1938f15c5df83575f4da5824674e12d51f075c77fa2e68544a8f060829d3e54c37ac240ba1da9d3de9351c994ac8700d797ed47ed6d3051edfa97452b23000bf1f2e7d74f05")
            } else if (intent.hasExtra("활")) {
                weapon_Image.setImageResource(R.drawable.bow)
                skill_exeplan.text = "지정한 지점으로 화살 다발을 발사하여 화살비가 내리게 합니다.\n" +
                        "발사된 화살은 몇 초 후에 목표 지점에 떨어지며 피격된 대상은 피해를 입고 공격 속도와 이동 속도를 감소 시킵니다.\n" +
                        "화살비의 중심에 있을 경우 더 큰 피해를 입게 됩니다."
                skill_exeplan2.text = "기본 피해량 : 150/250(+1.0 공격력)\n" +
                        "중심부 피해량 : 300/500(+2.0 공격력)\n" +
                        "사정거리 : 30m\n" +
                        "시전 시간 : 0.3초\n" +
                        "쿨다운 : 20/15초"
                binding.ImageName.text = "활"
                binding.skillName.text = "곡사"

                a = 1
                b = 2.4
                c = 3.0
                d = 2.0
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/1a76f12d1c90bbe4c809342dce40948b618fddc3271a61a691d085b6500202816d330ce3f9322a34ed205609a9adf30f9d45bd661a47d3b83c1bf030032fdcb56f5c4c43c50dab0929c0c5f1dfe531dbfd98db0e20125d408c00893675842357")
            } else if (intent.hasExtra("석궁")) {
                weapon_Image.setImageResource(R.drawable.crossbow)
                skill_exeplan.text = "지정한 방향으로 석궁을 쏩니다.\n" +
                        "피격된 대상은 피해를 입고 뒤로 밀려나게 됩니다.\n" +
                        "밀려난 적이 벽에 부딪히면 몇 초간 기절하며 추가 피해를 받습니다."
                skill_exeplan2.text = "피해량 : (1.5 공격력)/(2.5 공격력)\n" +
                        "사정거리 : 5.5m\n" +
                        "넉백 거리 : 4.75m\n" +
                        "시전 시간 : 0.5초\n" +
                        "쿨다운 : 30초"
                binding.ImageName.text = "석궁"
                binding.skillName.text = "강노"

                a = 1
                b = 2.2
                c = 5.0
                d = 1.8
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/d2c54c7b320fb4115b19fbc0b60676ccde3d5b6025a02e8f880951db5860020b2d14704119d7bcdf92a88f98e5761922b29435ed6e53ce6bff7f792ea24e857473d7d620cc3f88cc185956b120e0ebad311c4bf76c395ad402104f44c9792e15")
            } else if (intent.hasExtra("투척")) {
                weapon_Image.setImageResource(R.drawable.smokescreen)
                skill_exeplan.text = "지정한 위치에 연막탄을 터트립니다.\n" +
                        "연막 안에 있는 적은 시야가 감소하고 이동 속도가 감소합니다."
                skill_exeplan2.text = "이동 속도 감소 : 10%/25%\n" +
                        "시전 시간 : 0.15초\n" +
                        "지속 시간 : 5/7초\n" +
                        "쿨다운 : 35/20초"
                binding.ImageName.text = "투척"
                binding.skillName.text = "연막"

                a = 1
                b = 0.9
                c = 5.0
                d = 2.0
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/ff782ca17cb1d63d59b8d11200b3a90a86782af2b216885491843ff0d219ae0a57ff1a7beb6a1a3afab4ac9f6af14818ffc5220b616fcd1541023a405b743b8947d8ae63fa9e8c8226df29c31826ca99267abd89d95c1c47c8e1fe4ac96905fd")
            } else if (intent.hasExtra("암기")) {
                weapon_Image.setImageResource(R.drawable.ninja)
                skill_exeplan.text = "일정 범위에 몇초간 유지되는 마름쇠를 뿌려 밟은 적에게 피해를 입힙니다.\n" +
                        "피해를 받은 적은 몇초간 이동속도가 감소합니다.\n" +
                        "마름쇠를 연속해서 밟으면 최초 피해의 40%에 해당하는 피해를 받습니다."
                skill_exeplan2.text = "피해량 : 90/170(+0.3 공격력)\n" +
                        "이동 속도 감소 : 20%/40%\n" +
                        "시전 시간 : 0.3초\n" +
                        "지속 시간 : 6초\n" +
                        "쿨다운 : 30초"
                binding.ImageName.text = "암기"
                binding.skillName.text = "마름쇠"

                a = 1
                b = 2.0
                c = 4.0
                d = 1.8
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/b069e345ee0729daca837da8e1ec6a707c6af8922af1cba4812be051ed75d0b9a21c3831e5b2c137d47055dc4cfce63f3a306707219d214456705830c8a106da2092680e252a54d1598b84bd17ffb0f25687c386db8af0ec03745e6607b40e89")
            } else if (intent.hasExtra("기타")) {
                weapon_Image.setImageResource(R.drawable.guitar)
                skill_exeplan.text = "지정한 방향으로 음파를 날려 적중한 대상에게 피해를 입힙니다.\n" +
                        "음파에 맞은 대상은 소리에 홀려 몇 초간 음파를 날린 대상에게 이동합니다."
                skill_exeplan2.text = "피해량 : (1.2 공격력)/(2.0 공격력)\n" +
                        "시전 시간 : 즉시\n" +
                        "지속 시간 : 1.2초\n" +
                        "쿨다운 : 27초"
                binding.ImageName.text = "기타"
                binding.skillName.text = "Love&..."

                a = 1
                b = 1.5
                c = 2.0
                d = 2.2
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/05456822d66556304c8f515aed44ec0e6df6e1c04a6e23c5888cad74142fb54dcb5c351cb9ec771a0280707ef310b1ce4c71af63721f10551abdf9cbd79c0e3f6896567ee704e30ea424301fa30dd79504dac0986ad10453f2bb8b541b6e4a74")
            } else if (intent.hasExtra("쌍절곤")) {
                weapon_Image.setImageResource(R.drawable.china_weapon)
                skill_exeplan.text = "쌍절곤을 빠르게 휘둘러서 생긴 바람을 모아 지정한 방향으로 날립니다.\n" +
                        "바람의 구체는 쌍절곤을 휘두른 시간에 따라 더욱 커지는 피해를 입히며, 대상을 기절시킬 수 있습니다."
                skill_exeplan2.text = "피해량 : 150~300(+0.5~1.5 공격력)/250~600(+0.5~1.5 공격력)\n" +
                        "시전 시간 : 0.5~1.5초\n" +
                        "1초 이상 집중 시 기절 지속 시간 : 1.25초\n" +
                        "쿨다운 : 25초"
                binding.ImageName.text = "쌍절곤"
                binding.skillName.text = "맹룡과강"

                a = 1
                b = 1.5
                c = 3.2
                d = 3.2
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/7f8399d0fad67e808e142a881a80f943fad9dd35743a46a9d84c84c8c472954fed6bd516cf71783369c0ad8d3b4c1b593a81b0276626aaf328cf3304b6a3b5fea44cea5907b506e78e16d58b53d2df120e16e6458d0320d4446f40e6f7ea8e45")
            }
            else if (intent.hasExtra("채찍")) {
                weapon_Image.setImageResource(R.drawable.whip_wep)
                skill_exeplan.text =
                    "지정한 방향으로 채찍을 날려 처음 닿은 적에게 피해를 입히고 1초 동안 시전자의 2.5m 앞으로 당겨옵니다. 2.5m보다 가까이 있는 적은 당겨오지 않고 0.75초 간 공중에 띄웁니다."
                skill_exeplan2.text = "피해량 : 100/150(+공격력의 30%)\n" +
                        "사거리 8m\n" +
                        "쿨다운: 40/30초"
                binding.ImageName.text = "채찍"
                binding.skillName.text = "갈고리"

                a = 1
                b = 3.6
                c = 2.5
                d = 2.0
                table(a, b, c, d)
                videouri =
                    Uri.parse("https://w.namu.la/s/f3f9f8dbbbe9d878ad3d1bff178a8e8536462bb30155ebe5ec635fe481d620e38f43d359181fd060e5aee76b45d0bd71226af200e7165ff2d6cf3d3e9a5aea28e68977f79da1777abd33e49ac35dadcd703df4a376e86fdae94ed33dc6508bb0")
            }



        vv.setMediaController (MediaController(this))
        vv.setVideoURI (videouri)
        vv.start()

        binding.up.setOnClickListener(){
            if(levelup <20 && levelup > 0 && leb < 20 && leb > 0) {
                levelup += 1
                leb += 1
                var i = a * levelup
                var w = b * levelup
                var e = c * levelup
                var r = d * levelup
                var qqq = String.format("%.1f", w)
                var www = String.format("%.1f", e)
                var eee = String.format("%.1f", r)
                table(i,qqq,www,eee)
                binding.textLevel.text = leb.toString() + " 레벨"
            }
        }

        binding.down.setOnClickListener(){
            if(levelup > 1 && levelup < 21 && leb > 1 && leb < 21)
            {
                levelup -= 1
                var i = a * levelup
                var w = b * levelup
                var e = c * levelup
                var r = d * levelup
                var qqq = String.format("%.1f", w)
                var www = String.format("%.1f", e)
                var eee = String.format("%.1f", r)
                table(i,qqq,www,eee)
                leb -= 1
                binding.textLevel.text = leb.toString() + " 레벨"
            }
        }
    }


    override fun onPause() {
        var vv:VideoView = findViewById(R.id.vv)
        super.onPause()
        if (vv != null && vv.isPlaying) {   //vv가 null이 아니고 실행중인경우
            vv.pause()
        }
    }

    override fun onDestroy() {
        var vv:VideoView = findViewById(R.id.vv)
        super.onDestroy()

        if (vv != null) {// vv가 null이 아닌경우
            vv.stopPlayback()
        }


    }

    override fun onBackPressed() {
        var vv:VideoView = findViewById(R.id.vv)
        if(vv.isPlaying){
            vv.pause()
            super.onBackPressed()
        }
        else {
            super.onBackPressed()
        }
    }

}


