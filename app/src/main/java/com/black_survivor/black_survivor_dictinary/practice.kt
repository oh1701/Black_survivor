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

class practice(val pracList : ArrayList<prac_list>) : RecyclerView.Adapter<practice.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): practice.ViewHolder {

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
        
        return practice.ViewHolder(view).apply {
            imagebutton1.setOnClickListener()
            {
                item.reset()
                val curpos: Int = adapterPosition
                for (i in pracList.indices) {
                    if (curpos == i) {
                        item.ImageView1.setImageResource(pracList[i].Image1)
                        Log.d("확인", i.toString())

                        item.falsearray(i)

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


                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap

                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()

                                item.falsearray(i)
                                item.grade()

                                rnqns = 1
                                break
                            }
                        }

                        if (rnqns == 0) {
                            for (j in falselist.indices) {
                                imsi.setImageResource(falselist[j].Image1)

                                val drawable2: Drawable = imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap

                                if (bitmap == bitmap2) {
                                    item.ImageView1.setImageResource(falselist[j].Image1)
                                    item.ima_tex_clear()
                                    

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

                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap

                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break


                            }
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
                                        

                                        item.grade()

                                        break
                                    }
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


                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap

                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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


                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap

                            if (bitmap == bitmap2) {
                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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

                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap

                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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


                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap
                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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

                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap
                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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


                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap
                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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


                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap
                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()
                                item.falsearray(i)

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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


                        for (i in pracList.indices) {
                            imsi.setImageResource(pracList[i].Image1)

                            val drawable2: Drawable = imsi.drawable
                            val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                            val bitmap2: Bitmap = bitmapdrawable2.bitmap
                            if (bitmap == bitmap2) {

                                item.ImageView1.setImageResource(pracList[i].Image1)
                                item.ima_tex_clear()

                                item.grade()
                                rnqns = 1
                                break
                            }
                        }
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

    class prac_list(val name1: String, val Image1: Int) {

    }

    override fun onBindViewHolder(holder: practice.ViewHolder, position: Int) {
        holder.imagebutton1.setImageResource(pracList.get(position).Image1)
        holder.name1.text = pracList.get(position).name1.toString()
    }

    override fun getItemCount(): Int { //아이템리스트 코틀린의 사이즈 리턴.
        return pracList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name1 = itemView.findViewById<TextView>(R.id.name1)
        val imagebutton1 = itemView.findViewById<ImageButton>(R.id.imagebutton1)

    }

}