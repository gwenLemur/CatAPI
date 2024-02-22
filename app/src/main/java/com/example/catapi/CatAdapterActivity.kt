package com.example.catapi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.catapi.models.CatObj

class CatAdapterActivity(var catList: MutableList<CatObj>) :
    RecyclerView.Adapter<CatAdapterActivity.ViewHolder>(){
        class ViewHolder(view: View): RecyclerView.ViewHolder(view){
            val textViewCodes: TextView
            val textViewTitle: TextView
            val textViewUrl: TextView
            val layout: ConstraintLayout

            init{
                textViewCodes = view.findViewById(R.id.code)
                textViewTitle = view.findViewById(R.id.title)
                textViewUrl = view.findViewById(R.id.url)
                layout = view.findViewById(R.id.layout)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
            return ViewHolder(view)
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cats = catList[position]
        val context = holder.layout.context
        holder.textViewCodes.text = cats.status_code.toString()
        holder.textViewTitle.text = cats.title
        holder.textViewUrl.text = cats.url

//        holder.layout.setOnClickListener {
//
//            //Intent here
//            val catIntent = Intent(context, CatDisplayActivity::class.java)
//            catIntent.putExtra("currCat", cats)
//            context.startActivity(catIntent)
//
//        }
    }

    override fun getItemCount() = catList.size
}

