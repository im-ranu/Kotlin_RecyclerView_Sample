package com.guysapp.kotlin_retrofit_sample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_user_item.view.*

class UserAdapter(val items : ArrayList<String> ,val context : Context) :
        RecyclerView.Adapter<UserAdapter.ViewHolder> (){





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.single_user_item,parent,false))

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder?.tvAnimalType?.text = items.get(position)
    }


    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalType = view.tvUserName
    }
}