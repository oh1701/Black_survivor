package com.example.black_survivor_dictinary

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class map_list(val maplist:ArrayList<map_listclass>): RecyclerView.Adapter<map_list.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): map_list.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.map_recycler, parent, false)

        return ViewHolder(view).apply{
            name.setOnClickListener {
                val intent = Intent(parent.context, map_explan::class.java)
                when (position){
                    0 -> intent.putExtra("0", "골목길")
                    1 -> intent.putExtra("1", "절")
                    2 -> intent.putExtra("2", "번화가")
                    3 -> intent.putExtra("3", "연못")
                    4 -> intent.putExtra("4", "병원")
                    5 -> intent.putExtra("5", "양궁장")
                    6 -> intent.putExtra("6", "학교")
                    7 -> intent.putExtra("7", "묘지")
                    8 -> intent.putExtra("8", "공장")
                    9 -> intent.putExtra("9", "호텔")
                    10 -> intent.putExtra("10", "숲")
                    11 -> intent.putExtra("11", "성당")
                    12 -> intent.putExtra("12", "모래사장")
                    13 -> intent.putExtra("13", "고급 주택가")
                    14 -> intent.putExtra("14", "항구")
                    15 -> intent.putExtra("15", "연구소")
                }
                if(position >= 0 && position < 16)
                    parent.context.startActivity(intent)
            }
        }
    }

    override fun onBindViewHolder(holder: map_list.ViewHolder, position: Int) {
        holder.name.text = maplist.get(position).name
    }

    override fun getItemCount(): Int {
        return maplist.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.mapmap)
    }
}
class map_listclass(var name:String){

}