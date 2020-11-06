package com.example.lajan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FormulaireInscription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formulaire_inscription)

        val btn_inscription = findViewById<Button>(R.id.form_btn_inscription)

        btn_inscription.setOnClickListener {
            val intent = Intent(this, FormulaireInscription::class.java)
            startActivity(intent)
        }

    }
}