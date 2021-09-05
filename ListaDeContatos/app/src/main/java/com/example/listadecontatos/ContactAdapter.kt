package com.example.listadecontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter: RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>(){

    private val list: MutableList<Contact> = mutableListOf()

    // cria o layout e prepara para popular
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactAdapterViewHolder(view)
    }

    // responsavel por rodar em cada item  no seu array, obter o valor de cada item e preencher na tela o famoso binding
    // popular o item na recycler view
    // lê o item do seu array e popula na lista do recycler view
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(list:List<Contact>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    // View holder class take care of each item in the list
    class ContactAdapterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val tvname: TextView = itemView.findViewById(R.id.tv_name)
        private val tvphone: TextView = itemView.findViewById(R.id.tv_phone)
        private val ivimage: TextView = itemView.findViewById(R.id.iv_image)

        fun bind(contact: Contact){
            tvname.text = contact.name
            tvphone.text = contact.phone

        }
    }
}