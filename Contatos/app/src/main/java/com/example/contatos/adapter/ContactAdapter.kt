package com.example.contatos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contatos.R
import com.example.contatos.model.Contact

class ContactAdapter: RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>(){

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent,false)
        return ContactAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


    fun updateList(list: List<Contact>){
        this.list.clear()
        this.list.addAll(list)
    }

    class ContactAdapterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val tvName: TextView = itemView.findViewById(R.id.tv_name)
        private val tvPhone: TextView = itemView.findViewById(R.id.tv_phone)
        private val tvPhotograph: ImageView = itemView.findViewById(R.id.iv_image)

        fun bind(contact: Contact){
            tvName.text = contact.name
            tvPhone.text = contact.phone
        }
    }
}