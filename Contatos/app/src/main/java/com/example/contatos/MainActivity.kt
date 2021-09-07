package com.example.contatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contatos.adapter.ContactAdapter
import com.example.contatos.model.Contact

class MainActivity : AppCompatActivity() {
    private val recycler: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.recyclerview)
    }

    private val SuperAdapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        updateList()
    }

    private fun updateList() {
        SuperAdapter.updateList(
            arrayListOf(
                Contact(
                    "Rafael Moura",
                    "(11) 99933-2211",
                    "img.png"
                ),
                Contact(
                    "João almeida",
                    "(11) 99549-1356",
                    "img.png"
                ),
                Contact(
                    "Patricia Lelis",
                    "(11) 98733-2500",
                    "img.png"
                ),
                Contact(
                    "Ricardo Amorim",
                    "(11) 99512-0033",
                    "img.png"
                ),
                Contact(
                    "Hugo Santos",
                    "(11) 99933-2211",
                    "img.png"
                ),
                Contact(
                    "Andressa Vitoria",
                    "(11) 9601-4032",
                    "img.png"
                ),
                Contact(
                    "Luana Silva",
                    "(11) 94333-6590",
                    "img.png"
                ),
                Contact(
                    "Julia Campos",
                    "(11) 93533-5511",
                    "img.png"
                ),
                Contact(
                    "José Almeida",
                    "(11) 99235-7611",
                    "img.png"
                ),
                Contact(
                    "Maria do Rosario",
                    "(11) 99533-2241",
                    "img.png"
                )

            )
        )
    }

    private fun bindView() {
        recycler.apply {
            adapter = SuperAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun showToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.item_menu_1 ->{
                showToast("Exibindo Item de Menu Um")
                true
            }
            R.id.item_menu_2 ->{
                showToast("Exibindo Item de Menu Dois")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}
