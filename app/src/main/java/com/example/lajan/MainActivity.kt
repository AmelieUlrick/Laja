package com.example.lajan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Déclaration des éléments utilisés
        val btn_connexion = findViewById<Button>(R.id.btn_connexion)
        val btn_inscription = findViewById<Button>(R.id.btn_inscription)
        val img_accueil = findViewById<ImageView>(R.id.img_accueil)

        //Déclaration animation sur les éléments
        val animation_accueil = AnimationUtils.loadAnimation(this, R.anim.animation_accueil)
        img_accueil.startAnimation(animation_accueil)

        btn_connexion.setOnClickListener {
            val intent = Intent(this, FormulaireConnexion::class.java)
            startActivity(intent)
        }
        btn_inscription.setOnClickListener {
            val intent = Intent(this, FormulaireInscription::class.java)
            startActivity(intent)
        }


    }
}