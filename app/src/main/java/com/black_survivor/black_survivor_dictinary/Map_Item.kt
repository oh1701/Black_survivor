package com.example.black_survivor_dictinary

import android.app.Dialog
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Map_Item(val map_Item:ArrayList<map_Itemlist>): RecyclerView.Adapter<Map_Item.ViewHolder1>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Map_Item.ViewHolder1 {

        var item = item_in(parent.context)
        
        var rnqns: Int = 0
        var qkRnrl: Int = -1
        var qkRnrl2: Int = -1
        val view = LayoutInflater.from(parent.context).inflate(R.layout.map_itemlist_xm, parent, false)

        val aview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_popup, null)
        val bview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_imsi, null)


        val dlg = Dialog(parent.context)
        dlg.setContentView(item.aview)

        val imsi: ImageView = bview.findViewById(R.id.imaging)
        val noimage: ImageView = bview.findViewById(R.id.imaging2)
        noimage.setImageResource(0)

        
        return ViewHolder1(view).apply {
            Ima.setOnClickListener {
                item.reset()
                val curpos: Int = adapterPosition
                loop@ for (i in map_Item.indices) {
                    if (curpos == i) {
                        item.ImageView1.setImageResource(map_Item[i].Ima)
                        val dlatl = item.ImageView1.drawable
                        var bitmapdra = dlatl as BitmapDrawable
                        var bitmap = bitmapdra.bitmap

                        for (j in falselist.indices) {
                            imsi.setImageResource(falselist[j].Image1)

                            var dlatl2 = imsi.drawable
                            var bitmapdra2 = dlatl2 as BitmapDrawable
                            var bitmap2 = bitmapdra2.bitmap
                            if (bitmap == bitmap2) {
                                item.falsearray(j)

                                item.grade()
                                break@loop
                            }
                        }
                    }
                }
                dlg.show()
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

    override fun onBindViewHolder(holder: Map_Item.ViewHolder1, position: Int) {
        holder.Ima.setImageResource(map_Item.get(position).Ima)
        holder.name.text = map_Item.get(position).name
    }

    override fun getItemCount(): Int {
        return map_Item.size
    }

    class ViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Ima = itemView.findViewById<ImageButton>(R.id.Imbu)
        val name = itemView.findViewById<TextView>(R.id.mapitem_name)
    }

    class map_Itemlist(val Ima: Int, val name: String) {
    }
}