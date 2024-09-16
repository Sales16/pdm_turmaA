package br.com.eduardo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.eduardo.model.Produto
import java.math.BigDecimal

class MainActivity : AppCompatActivity(){
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemProdutoAdapter(produtos = listOf(
            Produto(nome = "Maçã", descricao = "verde", valor = BigDecimal(15.99))
        ))
        recyclerView.layoutManager = (LinearLayoutManager(this))
    }
}