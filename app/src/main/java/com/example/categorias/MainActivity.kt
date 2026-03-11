package com.example.categorias

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.LinearLayout
import android.widget.Toast
import androidx.cardview.widget.CardView

class CategoriasActivity : AppCompatActivity() {

    // Cards de Categoria
    private lateinit var cardPromocao: CardView
    private lateinit var cardMaisVendidos: CardView
    private lateinit var cardBovinos: CardView
    private lateinit var cardSuinos: CardView
    private lateinit var cardAves: CardView
    private lateinit var cardEquinos: CardView
    private lateinit var cardCaprinos: CardView
    private lateinit var cardSementes: CardView
    private lateinit var cardDefensivos: CardView
    private lateinit var cardFertilizantes: CardView
    private lateinit var cardSacarias: CardView
    private lateinit var cardCafeicultura: CardView

    // Cards de Menu
    private lateinit var cardTrocarConta: CardView
    private lateinit var cardDesconectar: CardView
    private lateinit var cardSAC: CardView

    // Bottom Navigation
    private lateinit var navInicio: LinearLayout
    private lateinit var navCarrinho: LinearLayout
    private lateinit var navEntrega: LinearLayout
    private lateinit var navMenu: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupCategoryClickListeners()
        setupMenuClickListeners()
        setupBottomNavigation()
    }

    private fun initViews() {
        // Categorias
        cardPromocao       = findViewById(R.id.cardPromocao)
        cardMaisVendidos   = findViewById(R.id.cardMaisVendidos)
        cardBovinos        = findViewById(R.id.cardBovinos)
        cardSuinos         = findViewById(R.id.cardSuinos)
        cardAves           = findViewById(R.id.cardAves)
        cardEquinos        = findViewById(R.id.cardEquinos)
        cardCaprinos       = findViewById(R.id.cardCaprinos)
        cardSementes       = findViewById(R.id.cardSementes)
        cardDefensivos     = findViewById(R.id.cardDefensivos)
        cardFertilizantes  = findViewById(R.id.cardFertilizantes)
        cardSacarias       = findViewById(R.id.cardSacarias)
        cardCafeicultura   = findViewById(R.id.cardCafeicultura)

        // Menu
        cardTrocarConta    = findViewById(R.id.cardTrocarConta)
        cardDesconectar    = findViewById(R.id.cardDesconectar)
        cardSAC            = findViewById(R.id.cardSAC)

        // Bottom Nav
        navInicio   = findViewById(R.id.navInicio)
        navCarrinho = findViewById(R.id.navCarrinho)
        navEntrega  = findViewById(R.id.navEntrega)
        navMenu     = findViewById(R.id.navMenu)
    }

    private fun setupCategoryClickListeners() {
        cardPromocao.setOnClickListener {
            navigateToCategory("Promoção")
        }

        cardMaisVendidos.setOnClickListener {
            navigateToCategory("Mais Vendidos")
        }

        cardBovinos.setOnClickListener {
            navigateToCategory("Bovinos")
        }

        cardSuinos.setOnClickListener {
            navigateToCategory("Suínos")
        }

        cardAves.setOnClickListener {
            navigateToCategory("Aves")
        }

        cardEquinos.setOnClickListener {
            navigateToCategory("Equinos")
        }

        cardCaprinos.setOnClickListener {
            navigateToCategory("Caprinos")
        }

        cardSementes.setOnClickListener {
            navigateToCategory("Sementes")
        }

        cardDefensivos.setOnClickListener {
            navigateToCategory("Defensivos")
        }

        cardFertilizantes.setOnClickListener {
            navigateToCategory("Fertilizantes")
        }

        cardSacarias.setOnClickListener {
            navigateToCategory("Sacarias")
        }

        cardCafeicultura.setOnClickListener {
            navigateToCategory("Cafeicultura")
        }
    }

    private fun setupMenuClickListeners() {
        cardTrocarConta.setOnClickListener {
            Toast.makeText(this, "Trocar de conta", Toast.LENGTH_SHORT).show()
        }

        cardDesconectar.setOnClickListener {
            showDesconectarDialog()
        }

        cardSAC.setOnClickListener {
            Toast.makeText(this, "Atendimento ao cliente (SAC)", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupBottomNavigation() {
        navInicio.setOnClickListener {
            Toast.makeText(this, "Início", Toast.LENGTH_SHORT).show()
        }

        navCarrinho.setOnClickListener {
            Toast.makeText(this, "Carrinho", Toast.LENGTH_SHORT).show()
        }

        navEntrega.setOnClickListener {
            Toast.makeText(this, "Entrega", Toast.LENGTH_SHORT).show()
        }

        navMenu.setOnClickListener {
            Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show()
        }
    }

    private fun navigateToCategory(categoria: String) {
        Toast.makeText(this, "Categoria: $categoria", Toast.LENGTH_SHORT).show()
    }


    private fun showDesconectarDialog() {
        androidx.appcompat.app.AlertDialog.Builder(this)
            .setTitle("Desconectar")
            .setMessage("Deseja realmente sair da sua conta?")
            .setPositiveButton("Sim") { _, _ ->
                Toast.makeText(this, "Desconectado!", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }
}

