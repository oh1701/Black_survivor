package com.example.black_survivor_dictinary

import android.app.Dialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class defend(val defend_Item: ArrayList<ViewHolder.defend_Item_list>) : RecyclerView.Adapter<defend.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): defend.ViewHolder {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false) //리스트아이템 레이아웃을 부모 화면 전체에 맞춰
        // view라는 변수에 붙여줌.
        return ViewHolder(view).apply {
            imagebutton1.setOnClickListener(){
                val curpos: Int = adapterPosition
                for (i in 0..117) { //클릭했을때 맞는 팝업창 나오게.
                    if (curpos == i) {
                        val aview:View = LayoutInflater.from(parent.context).inflate(R.layout.activity_popup, null)
                        val ImageView1:ImageView = aview.findViewById(R.id.im1)
                        ImageView1.setImageResource(defend_Item.get(position).Image1)
                        if(i == 0)
                        {
                            val Imageup1:ImageButton = aview.findViewById(R.id.imup_1)
                            val Imageup2:ImageButton = aview.findViewById(R.id.imup_2)
                            val Imageup3:ImageButton = aview.findViewById(R.id.imup_3)
                            val Imageup4:ImageButton = aview.findViewById(R.id.imup_4)
                            val Imageup5:ImageButton = aview.findViewById(R.id.imup_5)

                            Imageup1.setImageResource(R.drawable.head_circlet)
                            Imageup2.setImageResource(R.drawable.head_mask)

                        }
                        val dlg = Dialog(parent.context)
                        dlg.setContentView(aview)
                        dlg.show()
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

        init {

            imagebutton1.setOnClickListener {

                val curpos: Int = adapterPosition
                for (i in 0..117) {
                    if (curpos == i) {
                    }
                }
            }
        }
    }
    class defend_Item_list(val name1: String, val Image1: Int, val name2: String, val Image2: Int , val name3: String, val Image3: Int, val name4: String, val Image4: Int) {
    }
}
