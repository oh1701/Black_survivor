package com.example.black_survivor_dictinary

import android.app.Activity
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import com.example.black_survivor_dictinary.databinding.ActivityVideoBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlin.properties.Delegates

class video : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var vv:VideoView = findViewById(R.id.vv)
        lateinit var videouri: Uri
        var leb = 1
        binding.textLevel.text = leb.toString() + " 레벨"
        var a by Delegates.notNull<Int>()
        var b by Delegates.notNull<Double>()
        var c by Delegates.notNull<Double>()
        var d by Delegates.notNull<Double>()

        val skill_exeplan = findViewById<TextView>(R.id.skill_exeplan)
        val skill_exeplan2 = findViewById<TextView>(R.id.skill_exeplan2)
        val weapon_Image = findViewById<ImageView>(R.id.weapon_skill_Image)
        var levelup:Int = 1

        var adview = findViewById<AdView>(R.id.adView10)
        MobileAds.initialize(this) {}
        val adRequest = AdRequest.Builder().build()
        adview.loadAd(adRequest)

        fun table(a:Any, b:Any, c:Any, d:Any){
            binding.table1.text = a.toString()
            binding.table2.text = b.toString() + "%"
            binding.table3.text = c.toString() + "%"
            binding.table4.text = d.toString() + "%"
        }

        if (intent.hasExtra("도끼")) {
            weapon_Image.setImageResource(R.drawable.berserk)
            skill_exeplan.text = "적에게 기본 공격을 할 때마다 버서크 효과가 중첩되며, 중첩 수에 따라 공격력이 증가합니다.\n" +
                    "버서크 스킬을 사용하면 버서크 효과 중첩 당 공격력 증가량이 상승하고 잃은 체력에 비례해서 추가로 공격력이 증가합니다."
            skill_exeplan2.text = "최대 중첩 가능 수 : 5\n" +
                    "중첩 당 공격력 증가(패시브) : 2%\n" +
                    "중첩 당 공격력 증가(사용 시) : 5~15%(남은 체력 비례)\n" +
                    "지속 시간 : 5/7초\n" +
                    "쿨다운 : 60초"

            binding.ImageName.text = "도끼"
            binding.skillName.text = "버서크"

            a = 1
            b = 1.4
            c = 2.5
            d = 1.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/4ae9b20e3638425ef9aab72a245c290d8528211ae8699793aa982193bed7ec9fbeccc7b985c03552e34eeb1b90b1154781ab152de25b6e00ad37e0e6dd76da227d7064e6c23a45b64873159c8585428b56f30b6891f7a906778457beea137890")
        }
        else if (intent.hasExtra("쌍검")) {
            weapon_Image.setImageResource(R.drawable.dualswordrampage)
            skill_exeplan.text = "지정한 방향으로 돌진하며 경로상에 있는 모든 적들에게 피해를 입힙니다.\n" +
                    "공격에 성공하면 스킬을 한 번 더 사용할 수 있습니다."
            skill_exeplan2.text = "피해량 : (0.3/0.5 공격력)×6\n" +
                    "사정거리 : 1.5m\n" +
                    "시전 시간 : 0.66초\n" +
                    "지속 시간 : 0.75초\n" +
                    "쿨다운 : 40초"
            binding.ImageName.text = "쌍검"
            binding.skillName.text = "쌍검난무"

            a = 1
            b = 1.4
            c = 2.8
            d = 1.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/f4bf083b8ebb9501f874100febff96965072f2d47886187dda915ae9173c89cde67250fce7d06a2ad8fcbcac63d9608dff008acc69daac11d12e955f8cbfa112fe41f105834f4dc841c55f9c88e6b61484af75e5a329742c9e0f2f6ab31ce5e5")
        }
        else if (intent.hasExtra("권총")) {
            weapon_Image.setImageResource(R.drawable.revolber)
            skill_exeplan.text = "이동속도가 증가하며 빠르게 재장전 합니다.\n" +
                    "패시브 스킬과 무기 스킬을 제외한 모든 스킬의 쿨다운이 감소합니다."
            skill_exeplan2.text = "이동 속도증가 : 35%/70%\n" +
                    "시전 시간 : 즉시\n" +
                    "지속 시간 : 3초\n" +
                    "쿨다운 : 50/25초"
            binding.ImageName.text = "권총"
            binding.skillName.text = "무빙리로드"

            a = 1
            b = 3.0
            c = 4.5
            d = 2.4
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://ww.namu.la/s/fdedb855f304708aedc0a9f1706fb29ebad66accd7d2cd35256d1d33bfe78143dbd5e14a576b054e2e5e6e8518ec151826fffd4ea80459d28e6dde8f565f6e0a905262488533f6cef952b1ef045cbe048fa227854c5fffebd2ec5e8351d998e9")

        }
        else if (intent.hasExtra("돌격소총")) {
            weapon_Image.setImageResource(R.drawable.overheat)
            skill_exeplan.text = "기본 공격력을 적을 타격하면 과열 중첩을 얻습니다.\n" +
                    "과열 중첩이 모두 충전된 순간 과열 스킬을 사용할 수 있습니다.\n" +
                    "과열 상태에서는 공격속도 상한치가 무시되며 기본 공격시에 1타/3타모두 넉백 효과가 추가 됩니다."
            skill_exeplan2.text = "공격 속도 증가 : 40%/60%\n" +
                    "기본 공격을 하지 않을 시 초당 중첩 감소량 : 10\n" +
                    "시전 시간 : 즉시\n" +
                    "지속 시간 : 5초\n" +
                    "쿨다운 : 30초"
            binding.ImageName.text = "돌격소총"
            binding.skillName.text = "과열"

            a = 1
            b = 4.0
            c = 1.5
            d = 2.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/1b4566429f02290e0f7a9185220491db62d70c0f2b3af31b470e3ee6e27c7dc0e6d513da8e8cdb5623451534cac4e9be1051dc49c4130104794d14e3c8bd6713397b0da8c73ad085bd814ba1289c39db8635d00eba9932776aee395675032240")
        }
        else if (intent.hasExtra("저격총")) {
            weapon_Image.setImageResource(R.drawable.sniper)
            skill_exeplan.text = "지정된 방향으로 저격 모드를 활성화 합니다.\n" +
                    "저격 모드가 되면 바라보는 방향의 시야가 넓어지지만 범위는 좁아집니다.\n" +
                    "시야내의 적을 선택시 몇초간 적에게 조준선이 보여진 후 총을 발사해 피해를 입힙니다."
            skill_exeplan2.text = "피해량 : (2.5/3.0 공격력)\n" +
                    "사정거리 : 20m\n" +
                    "지속 시간 : 5초\n" +
                    "쿨다운 : 40/30초\n"
            binding.ImageName.text = "저격총"
            binding.skillName.text = "저격"

            a = 1
            b = 0.0
            c = 4.8
            d = 2.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://ww.namu.la/s/eb09953ac7d8caae958790d14b6194cc99ba72198069104bd64357ad22e1e80504eab56aa938ff73fb02453fe430b38d563f0b26fba7bcb0fda0ad12d00b9b8fb9f651ac3a23ef8ebf9255f708f463b99f9cf985f1f51d3a317adeb7166dccef")
        }
        else if (intent.hasExtra("글러브")) {
            weapon_Image.setImageResource(R.drawable.glove)
            skill_exeplan.text = "다음 기본 공격이 사거리가 증가하고 더 많은 피해를 줍니다."
            skill_exeplan2.text = "피해량: 1.0 공격력 + 최종 피해량의 100%/200% + 50/100 고정 피해\n" +
                    "사정거리 : 기본 공격 + 0.7m\n" +
                    "쿨다운 : 15초"
            binding.ImageName.text = "글러브"
            binding.skillName.text = "어퍼컷"

            a = 1 //레벨
            b = 3.6 // 공속
            c = 2.5 // 추가피해
            d = 2.0 //스킬 증폭
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/4d0252e3eec72ad580a34b5924bb78d927c84fb5d8e6d246a3f66e573729cf406dd68f8c49dbc0a220f7c43f6e7cbbb9d4592ce9286d079f5b004089ba727429feb9771094cb60f7377da68b52a8aaeb6d7a7c3c0fe985be0ae2d54a16515007")
        }
        else if (intent.hasExtra("톤파")) {
            weapon_Image.setImageResource(R.drawable.tonpa)
            skill_exeplan.text = "모든 방향에서 오는 피해를 막고, 공격한 대상에게 피해를 되돌려 줍니다."
            skill_exeplan2.text = "피해 반사 : 받은 피해의 50%/70%\n" +
                    "시전 시간 : 즉시\n" +
                    "지속 시간 : 0.75 초\n" +
                    "쿨다운 : 30초"
            binding.ImageName.text = "톤파"
            binding.skillName.text = "고속 회전"

            a = 1
            b = 1.8
            c = 3.8
            d = 3.2
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/9f9d3328c276e645a468baa1ce27e4af7391d84cf0dc128eabef8aa9f5cb49a5eb29c9a2b0dd5e9d18585167c91f425c7c7888d43ba10b3493f47a8f2231014e6d5c7f3531b3c03dc78d3c3ad47bce234921bd996c0c1216f2ffcedb2317e43e")
        }
        else if (intent.hasExtra("망치")) {
            weapon_Image.setImageResource(R.drawable.hammer)
            skill_exeplan.text = "지정한 방향으로 망치를 내려쳐 피해를 입히고 몇초간 방어력을 감소 시킵니다."
            skill_exeplan2.text = "피해량 : 150/300(+1.0/2.0 방어력)\n" +
                    "방어력 감소 : 25%/40%\n" +
                    "사정거리 : 3m\n" +
                    "시전 시간 : 0.5초\n" +
                    "방어력 감소 지속 시간 : 3/5초\n" +
                    "쿨다운 : 30초"
            binding.ImageName.text = "망치"
            binding.skillName.text = "갑옷깨기"

            a = 1
            b = 0.4
            c = 5.0
            d = 1.5
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://ww.namu.la/s/95dc96f04d62b494ee3430bb7fc7c387f2872027e8f10f0c7a7601036ea22a852d0d22416d4ffa3531b38b9fe1ec011e19160e273534f480d46e8d2afebc5a16427ae3943a02841f422d17207ac773831224c5c3d3090ed7b8f64d1550c70677")
        }
        else if (intent.hasExtra("방망이")) {
            weapon_Image.setImageResource(R.drawable.swing)
            skill_exeplan.text = "전방 180도 범위의 모든 적에게 피해를 주고 뒤로 넉백시킵니다.\n" +
                    "넉백 된 적이 벽에 부딪히면 0.5초간 기절합니다."
            skill_exeplan2.text = "피해량 : 200/400(+1.0/2.0 공격력)\n" +
                    "넉백 거리 : 4m\n" +
                    "사정거리 : 2.3m\n" +
                    "시전 시간 : 0.67초\n" +
                    "쿨다운 : 30초\n"
            binding.ImageName.text = "방망이"
            binding.skillName.text = "풀스윙"

            a = 1
            b = 3.0
            c = 4.0
            d = 1.2
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://ww.namu.la/s/2d649216433bb4975ddd25a5f3896e8e7774ef970edc051df173df2b19364b98e8e78fce73be0fe8e1b218c825efab47cfc6d11601871ee7b73c20fbcc59385dcbefbe10ce9644b514d98e47b0d5bfb56f8d72d0c951d50b7b00a67033c4846e")
        }
        else if (intent.hasExtra("레이피어")) {
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
            b = 2.7
            c = 4.0
            d = 2.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://ww.namu.la/s/434b7f633a76816c58e5ccebc1fa347b0f85d6aeb6931a7eeadb64be10a48cd1f3a6ace400b8215cbba4eb5e32570d0c17dbde5e0440c3ae7178d11d7ef853712b8f1c83c091a12c33fd92873aaa369845198a0dec0f670769aa9c9ff99470dd")
        }
        else if (intent.hasExtra("창")) {
            weapon_Image.setImageResource(R.drawable.shadowstab)
            skill_exeplan.text = "지정한 방향으로 창을 강하게 내질러서 피해를 입히고 이동 속도를 감소 시킵니다.\n" +
                    "일정거리 안의 대상에게는 넉백 효과를 줍니다."
            skill_exeplan2.text = "피해량 : (1.0/1.5 공격력)\n" +
                    "이동 속도 감소 : 70%\n" +
                    "사정거리 : 2m/4m\n" +
                    "시전 시간 : 0.3초\n" +
                    "쿨다운 : 30초\n"
            binding.ImageName.text = "창"
            binding.skillName.text = "그림자 찌르기"

            a = 1
            b = 0.7
            c = 4.2
            d = 1.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/b423d48b1e805a7ec62b6f0aa77f6ab77f35f9e91b6ca5ddc4795da1523c5b46592d6924b5886020d277181b8f9474c16b04c7406bc81219562cc52a1e4ccfafb258e553c164a0b0d4ea844930cfcf286410ea303ea8b5c0854130535d360285")
        }
        else if (intent.hasExtra("활")) {
            weapon_Image.setImageResource(R.drawable.bow)
            skill_exeplan.text = "지정한 지점으로 화살 다발을 발사하여 화살비가 내리게 합니다.\n" +
                    "발사된 화살은 몇 초 후에 목표 지점에 떨어지며 피격된 대상은 피해를 입고 공격 속도와 이동 속도를 감소 시킵니다.\n" +
                    "화살비의 중심에 있을 경우 더 큰 피해를 입게 됩니다."
            skill_exeplan2.text = "기본 피해량 : 150/250(+1.0 공격력)\n" +
                    "중심부 피해량 : 300/500(+2.0 공격력)\n" +
                    "사정거리 : 30m\n" +
                    "시전 시간 : 0.3초\n" +
                    "쿨다운 : 15초\n"
            binding.ImageName.text = "활"
            binding.skillName.text = "곡사"

            a = 1
            b = 2.2
            c = 3.0
            d = 2.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/9e328acb26f1c3e52d6ceb32dba74d0b352a717921479ad9fc7179cc20ef9dff7975b50c501d1061f7f4d0220b01bc26256cd41d7e217edd7247258d4ae747af60ee1bba59f9f2a00c5f68262bfce03eb49d2f8642a760107b3aa2b5e89c98c5")
        }
        else if (intent.hasExtra("석궁")) {
            weapon_Image.setImageResource(R.drawable.crossbow)
            skill_exeplan.text = "지정한 방향으로 석궁을 쏩니다.\n" +
                    "피격된 대상은 피해를 입고 뒤로 밀려나게 됩니다.\n" +
                    "밀려난 적이 벽에 부딪히면 몇 초간 기절하며 추가 피해를 받습니다."
            skill_exeplan2.text = "피해량 : (1.5 공격력)/(2.5 공격력)\n" +
                    "사정거리 : 5.5m\n" +
                    "넉백 거리 : 4.75m\n" +
                    "시전 시간 : 0.5초\n" +
                    "쿨다운 : 30초\n"
            binding.ImageName.text = "석궁"
            binding.skillName.text = "강노"

            a = 1
            b = 2.0
            c = 5.0
            d = 1.8
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://ww.namu.la/s/3a4e2517a34d59de122659d5d7b3a1ea05c23f6f5a21a4bc12a4ee27f65b098d50de577f26e8678367cfabcad6e4a6cbe5aa989df01860fe6da43c594e86dcaaab59ca1ffffeb472aad4de46eca499ea08b13a7e63458542c5120db0f4a801a1")
        }
        else if (intent.hasExtra("투척")) {
            weapon_Image.setImageResource(R.drawable.smokescreen)
            skill_exeplan.text = "지정한 위치에 연막탄을 터트립니다.\n" +
                    "연막 안에 있는 적은 시야가 감소하고 이동 속도가 감소합니다."
            skill_exeplan2.text = "이동 속도 감소 : 20%/40%\n" +
                    "시전 시간 : 0.15초\n" +
                    "지속 시간 : 5/7초\n" +
                    "쿨다운 : 20/15초"
            binding.ImageName.text = "투척"
            binding.skillName.text = "연막"

            a = 1
            b = 0.9
            c = 5.0
            d = 2.0
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://ww.namu.la/s/28e6f53ed9ad8bd6c800bce596ab873704496db824f9e6755ea053fb9e6c7a85d97fe7625f44ab6864c3e669e34bf68c0dec21bb5744572fada69247b0eadf407bf1c8d26f79ba8cf6a02dc00088aeda176b56bde030caa20991f72f3d15ae12")
        }
        else if (intent.hasExtra("암기")) {
            weapon_Image.setImageResource(R.drawable.ninja)
            skill_exeplan.text = "일정 범위에 몇초간 유지되는 마름쇠를 뿌려 밟은 적에게 피해를 입힙니다.\n" +
                    "피해를 받은 적은 몇초간 이동속도가 감소합니다.\n" +
                    "\n" +
                    "마름쇠를 연속해서 밟으면 최초 피해의 40%에 해당하는 피해를 받습니다."
            skill_exeplan2.text = "피해량 : 110/180(+0.3 공격력)\n" +
                    "이동 속도 감소 : 30%/40%\n" +
                    "시전 시간 : 0.3초\n" +
                    "지속 시간 : 6초\n" +
                    "쿨다운 : 35초"
            binding.ImageName.text = "암기"
            binding.skillName.text = "마름쇠"

            a = 1
            b = 1.8
            c = 4.0
            d = 1.8
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/3b8e1eb2c94897148ceadca77b44e40ffec5ebf51e4bdfe7db549875dc2c97c2adda38bbafa4c55f5aa286d121f9266baad82027419309292c6a54fc4581a676acc26e0d8c55209c0621b47f6759d06e08634132e6a5d24f1f519691a14719cb")
        }
        else if (intent.hasExtra("기타")) {
            weapon_Image.setImageResource(R.drawable.guitar)
            skill_exeplan.text = "지정한 방향으로 음파를 날려 적중한 대상에게 피해를 입힙니다.\n" +
                    "음파에 맞은 대상은 소리에 홀려 몇 초간 음파를 날린 대상에게 이동합니다."
            skill_exeplan2.text = "피해량 : (1.25 공격력)/(2.0 공격력)\n" +
                    "시전 시간 : 즉시\n" +
                    "지속 시간 : 1.5초\n" +
                    "쿨다운 : 30초"
            binding.ImageName.text = "기타"
            binding.skillName.text = "Love&..."

            a = 1
            b = 1.5
            c = 1.5
            d = 2.5
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/ba0344574d2180b9c37be9973dbb2c92070f22f757780711142baccb3786628bc1ec5cd9ba7b752923f587c70996506c2269bc70d00f4c07986d0a25451da9d19b7065a19d0cf7b448fadcc078d7670b93a830c5d4545b06eaec83d76a385f79")
        }
        else if (intent.hasExtra("쌍절곤")) {
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
            c = 3.5
            d = 3.5
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/f9b27451c91cc9bbc3408f984260e74ddb0690ab220ddeacb9b8b866ec7bd293c340733fbfae270732ed0ecd77cf8d0b539e247121d0e049d353e5202bb19dad39965250e8d8e6b0fdb7a4d2891c2ce404b87ba87bb93266afbd54c6e423a399")
        }
        else if (intent.hasExtra("채찍")) {
            weapon_Image.setImageResource(R.drawable.whip_wep)
            skill_exeplan.text = "지정한 방향으로 채찍을 날려 처음 닿은 적에게 피해를 입히고 1초 동안 시전자의 2.5m 앞으로 당겨옵니다. 2.5m보다 가까이 있는 적은 당겨오지 않고 0.75초 간 공중에 띄웁니다."
            skill_exeplan2.text = "피해량 : 100/150(+공격력의 30%)\n" +
                    "사거리 8m\n" +
                    "쿨다운: 30/20초"
            binding.ImageName.text = "채찍"
            binding.skillName.text = "갈고리"

            a = 1
            b = 3.6
            c = 2.5
            d = 2.0
            table(a, b, c, d)
            videouri =
                    Uri.parse("https://w.namu.la/s/3a4b9ee3967ab1f9a6105f52c1a631778cff10b1485c698782bd7dbcf7cbc2d7df4188f6d8f6052d87c1b2342bd69ac486f7effed41e6f43a1b17e2a7b2b81051f956579ba045a889df2b006ee7acbe2af722884e7f386b0eb29768e345f649f")
        }

        else if (intent.hasExtra("단검")) {
            weapon_Image.setImageResource(R.drawable.cloakanddagger)
            skill_exeplan.text = "망토 효과로 인해 간 투명해지고 이동 속도가 증가합니다.\n증가한 이동 속도는 일정시간에 걸쳐 감소합니다.\n단검 효과가 활성화 된 상태에서 적에게 기본 공격을 하면 적의 뒤로 이동해서 치명타 피해를 입히고 대상의 현재 체력 일정 비율 만큼 추가 피해를 입힙니다."
            skill_exeplan2.text = "망토 이동 속도 증가 : 40%\n단검 추가 피해 : 현재 체력의 10%\n시전 시간 : 0.2초\n망토 지속 시간 : 2/3.5초\n단검 지속 시간 : 4초\n쿨다운 : 40/25초"
            binding.ImageName.text = "단검"
            binding.skillName.text = "단검과 망토"

            a = 1
            b = 2.7
            c = 5.0
            d = 1.5
            table(a,b,c,d)
            videouri =
                    Uri.parse("https://w.namu.la/s/72516315409c277597081639180c4cd2b58277f49fab7e11f8d76ce04c1019b11bd151f739607bf147c4d02feecb6f862856e46432062aef3a322b24589979e91df2208aeebac539f01cdb135767684b7b99210de57f9c887cfe21c3e7869a4f")
        }
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
            c = 10.0
            d = 1.5
            table(a,b,c,d)

            videouri =
                    Uri.parse("https://w.namu.la/s/72516315409c277597081639180c4cd2b58277f49fab7e11f8d76ce04c1019b11bd151f739607bf147c4d02feecb6f862856e46432062aef3a322b24589979e91df2208aeebac539f01cdb135767684b7b99210de57f9c887cfe21c3e7869a4f")
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


