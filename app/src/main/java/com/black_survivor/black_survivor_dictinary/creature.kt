package com.black_survivor.black_survivor_dictinary

import android.app.Dialog
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class creature : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creature)

        MobileAds.initialize(this){}
        var adview3 = findViewById<AdView>(R.id.adview3)
        adview3.loadAd(AdRequest.Builder().build())

        var rnqns: Int = 0
        var qkRnrl: Int = -1
        var qkRnrl2:Int = -1
        var qkRnjtek:Int = -1
        val weck = findViewById<ImageView>(R.id.weckeline)
        val rv = findViewById<RecyclerView>(R.id.rv_animal)
        val aview: View = LayoutInflater.from(this).inflate(R.layout.animal_popup, null)

        var item = item_in(this)


        val dlg = Dialog(this)
        dlg.setContentView(aview)

        var animalItem = arrayListOf(
            animal_Item_list(R.drawable.a_chicken, "닭"),
            animal_Item_list(R.drawable.a_bat, "박쥐"),
            animal_Item_list(R.drawable.a_boar, "멧돼지"),
            animal_Item_list(R.drawable.a_dog, "들개"),
            animal_Item_list(R.drawable.a_wolf, "늑대"),
            animal_Item_list(R.drawable.a_bear, "곰"),
        )

        val name: TextView = aview.findViewById(R.id.te1)

        val im1: ImageView = aview.findViewById(R.id.im1)
        val dropte1: TextView = aview.findViewById(R.id.imup_text1)
        val dropte2: TextView = aview.findViewById(R.id.imup_text2)
        val dropte3: TextView = aview.findViewById(R.id.imup_text3)
        val dropte4: TextView = aview.findViewById(R.id.imup_text4)
        val dropte5: TextView = aview.findViewById(R.id.imup_text5)
        val droptitle: TextView = aview.findViewById(R.id.te4)
        val randomtitle: TextView = aview.findViewById(R.id.te5)

        val randomte1: TextView = aview.findViewById(R.id.imdown_text1)
        val randomte2: TextView = aview.findViewById(R.id.imdown_text2)
        val randomte3: TextView = aview.findViewById(R.id.imdown_text3)
        val randomte4: TextView = aview.findViewById(R.id.imdown_text4)
        val randomte5: TextView = aview.findViewById(R.id.imdown_text5)

        val drop1: ImageView = aview.findViewById(R.id.imup_1)
        val drop2: ImageView = aview.findViewById(R.id.imup_2)
        val drop3: ImageView = aview.findViewById(R.id.imup_3)
        val drop4: ImageView = aview.findViewById(R.id.imup_4)
        val drop5: ImageView = aview.findViewById(R.id.imup_5)

        val random1: ImageView = aview.findViewById(R.id.imdown_1)
        val random2: ImageView = aview.findViewById(R.id.imdown_2)
        val random3: ImageView = aview.findViewById(R.id.imdown_3)
        val random4: ImageView = aview.findViewById(R.id.imdown_4)
        val random5: ImageView = aview.findViewById(R.id.imdown_5)

        val time: TextView = aview.findViewById(R.id.te2_1)
        val skill: TextView = aview.findViewById(R.id.te22_1)
        val location: TextView = aview.findViewById(R.id.te3_1)

        val cview: View = LayoutInflater.from(this).inflate(R.layout.activity_popup, null)
        val bview: View = LayoutInflater.from(this).inflate(R.layout.activity_imsi, null)


        /*val item.imaup1: ImageView = cview.findViewById(R.id.imup_1)
        val item.imaup2: ImageView = cview.findViewById(R.id.imup_2)
        val item.imaup3: ImageView = cview.findViewById(R.id.imup_3)
        val item.imaup4: ImageView = cview.findViewById(R.id.imup_4)
        val item.imaup5: ImageView = cview.findViewById(R.id.imup_5)

        val item.imadown1: ImageView = cview.findViewById(R.id.imdown_1)
        val item.imadown2: ImageView = cview.findViewById(R.id.imdown_2)
        val item.imadown3: ImageView = cview.findViewById(R.id.imdown_3)
        val item.imadown4: ImageView = cview.findViewById(R.id.imdown_4)
        val item.imadown5: ImageView = cview.findViewById(R.id.imdown_5)*/

        val imsi: ImageView = bview.findViewById(R.id.imaging)
        val noimage: ImageView = bview.findViewById(R.id.imaging2)
        noimage.setImageResource(0)
        

        val dlg2 = Dialog(this)
        dlg2.setContentView(item.aview)
        
        fun reset2(){
            randomte1.text = ""
            randomte2.text= ""
            randomte3.text = ""
            randomte4.text = ""
            randomte5.text = ""
            random1.setImageResource(0)
            random2.setImageResource(0)
            random3.setImageResource(0)
            random4.setImageResource(0)
            random5.setImageResource(0)
        }

        fun random(a:String, b:String, c:String, d:String, e:String){
            reset2()
            randomte1.text = a
            randomte2.text = b
            randomte3.text = c
            randomte4.text = d
            randomte5.text = e
            for(i in falselist.indices){
                if(falselist[i].name1 == a)
                    random1.setImageResource(falselist[i].Image1)
                if(falselist[i].name1 == b)
                    random2.setImageResource(falselist[i].Image1)
                if(falselist[i].name1 == c)
                    random3.setImageResource(falselist[i].Image1)
                if(falselist[i].name1 == d)
                    random4.setImageResource(falselist[i].Image1)
                if(falselist[i].name1 == e)
                    random5.setImageResource(falselist[i].Image1)
            }
        }

        weck.setOnClickListener {
            im1.setImageResource(R.drawable.a_wickeline)
            name.text = "위클라인"
            skill.text = "유해 물질: 위클라인 자신의 위치에 5초간 지속되는 독을 흘립니다. 독을 밟으면 중독되어 피해를 입습니다.\n" +
                    "추적: 멀리 떨어진 적에게 빠르게 이동하여 뒤를 공격합니다.\n" +
                    "살포: 위클라인의 체력이 50% 이하가 되면 주사기에서 독을 내뿜으며 공격하고 그 자리에 독을 남깁니다. 독에 맞으면 큰 피해를 입고 중독 됩니다."
            time.text = "600초"
            location.text = "10분 후 맵 전체 활보, 처치 시 버프 획득"
            randomtitle.text = "랜덤 드랍"
            for (i in falselist.indices)
            {
                if(falselist[i].name1 == "VF 혈액 샘플") {
                    drop1.setImageResource(falselist[i].Image1)
                    dropte1.text = falselist[i].name1
                }
                if(falselist[i].name1 == "포스 코어"){
                    drop2.setImageResource(falselist[i].Image1)
                    dropte2.text = falselist[i].name1
                }
                if(falselist[i].name1 == "구급상자") {
                    drop3.setImageResource(falselist[i].Image1)
                    dropte3.text = falselist[i].name1
                }
            }
            random("문스톤","미스릴","휴대폰","생명의 가루","망원 카메라")
            dlg.show()
        }

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv.setHasFixedSize(true)
        rv.adapter = animal_rv(animalItem)

        drop1.setOnClickListener {
            var dlatl = drop1.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
        }
        drop2.setOnClickListener {
            var dlatl = drop2.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
        }
        drop3.setOnClickListener {
            var dlatl = drop3.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
        }
        random1.setOnClickListener {
            var dlatl = random1.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
        }
        random2.setOnClickListener {
            var dlatl = random2.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
        }
        random3.setOnClickListener {
            var dlatl = random3.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
        }
        random4.setOnClickListener {
            var dlatl = random4.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
        }
        random5.setOnClickListener {
            var dlatl = random5.drawable
            var bitmapdra = dlatl as BitmapDrawable
            var bitmap = bitmapdra.bitmap

            for(i in falselist.indices){
                imsi.setImageResource(falselist[i].Image1)

                var dlatl2 = imsi.drawable
                var bitmapdra2 = dlatl2 as BitmapDrawable
                var bitmap2 = bitmapdra2.bitmap

                if(bitmap == bitmap2)
                {
                    item.ImageView1.setImageResource(falselist[i].Image1)
                    item.ima_tex_clear()
                    item.falsearray(i)

                    item.grade()
                    break
                }
            }
            dlg.dismiss()
            dlg2.show()
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