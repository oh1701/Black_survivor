package com.black_survivor.black_survivor_dictinary

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

class Item_Adapter(val ItemList : ArrayList<Item_list>) : RecyclerView.Adapter<Item_Adapter.ViewHolder>() {

    var a:Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Item_Adapter.ViewHolder {


        val item = item_in(parent.context)

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        val aview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_popup, null)
        val bview: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_imsi, null)

        val dlg = Dialog(parent.context)
        dlg.setContentView(item.aview)

        val noimage: ImageView = bview.findViewById(R.id.imaging2)
        noimage.setImageResource(0)

            return Item_Adapter.ViewHolder(view).apply {
                imagebutton1.setOnClickListener()
                {
                    item.reset()
                    val curpos: Int = adapterPosition
                    for (i in ItemList.indices) {
                        if (curpos == i) {
                            item.ImageView1.setImageResource(ItemList[i].Image1)

                            val drawable1: Drawable = item.ImageView1.drawable
                            val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                            val bitmap: Bitmap = bitmapdrawable1.bitmap

                            for(e in falselist.indices) {
                                item.imsi.setImageResource(falselist[e].Image1)

                                val drawable2: Drawable = item.imsi.drawable
                                val bitmapdrawable2: BitmapDrawable = drawable2 as BitmapDrawable
                                val bitmap2: Bitmap = bitmapdrawable2.bitmap
                                if (bitmap == bitmap2) {
                                    item.falsearray(e)

                                    item.grade()

                                    dlg.show()
                                    break
                                }
                            }
                        }
                    }

                    item.imaup1.setOnClickListener() {
                        if (item.imaup1.drawable != null) {

                            val drawable1: Drawable = item.imaup1.drawable
                            val bitmapdrawable1: BitmapDrawable = drawable1 as BitmapDrawable
                            val bitmap: Bitmap = bitmapdrawable1.bitmap

                            item.reset()

                            if (item.rnqns == 0) {
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

                                if (item.rnqns == 0) {
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

                            if (item.rnqns == 0) {
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

                            if (item.rnqns == 0) {
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

                            if (item.rnqns == 0) {
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

                            if (item.rnqns == 0) {
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

                            if (item.rnqns == 0) {
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


                            if (item.rnqns == 0) {
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


                            if (item.rnqns == 0) {
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

                            if (item.rnqns == 0) {
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

    class Item_list(val name1: String, val Image1: Int) {

    }

    override fun onBindViewHolder(holder: Item_Adapter.ViewHolder, position: Int) {
        holder.imagebutton1.setImageResource(ItemList[position].Image1)
        holder.name1.text = ItemList[position].name1.toString()
    }

    override fun getItemCount(): Int { //아이템리스트 코틀린의 사이즈 리턴.
        return ItemList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name1:TextView = itemView.findViewById(R.id.name1)
        val imagebutton1:ImageButton = itemView.findViewById(R.id.imagebutton1)

    }

}