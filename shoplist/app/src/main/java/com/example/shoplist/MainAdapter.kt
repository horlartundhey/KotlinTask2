package com.example.shoplist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    val shoppingList = listOf("Clothes", "Food", "shoes")

    override  fun getItemCount(): Int{
        return shoppingList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val shoppingList = shoppingList.get(position)
        holder?.view?.textView_shopping_list_items?.text = shoppingList
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}