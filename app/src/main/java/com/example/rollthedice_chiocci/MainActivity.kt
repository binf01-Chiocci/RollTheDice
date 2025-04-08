package com.example.rollthedice_chiocci

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var buttonroll= findViewById<Button>(R.id.buttonroll)
        buttonroll.setOnClickListener(View.OnClickListener {
            var mioRandom=estraiNumero()
            lanciaIntent(mioRandom)
        })
    }
    private fun estraiNumero(): Int {
        return (1..6).random()
    }
    private fun lanciaIntent(mioRandom: Int) {
        var mioIntent = Intent( this, SecondActivity::class.java)
        mioIntent.putExtra("NUMERO", mioRandom)
        startActivity(mioIntent)
    }
}