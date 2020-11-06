package com.example.lajan

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
        var msg_accueil = findViewById<TextView>(R.id.page_accueil_msg)
        var btn_connexion = findViewById<Button>(R.id.btn_connexion)
        var btn_inscription = findViewById<Button>(R.id.btn_inscription)
        var img_accueil = findViewById<ImageView>(R.id.img_accueil)

        val animation_accueil = AnimationUtils.loadAnimation(this, R.anim.animation_accueil)
        img_accueil.startAnimation(animation_accueil)

    }
}