package com.example.rollthedice_chiocci

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val mioRandom = intent.getIntExtra("numeroRandom",-1)
        val numeroInput = intent.getIntExtra("numeroInput",-1)
        val textResult  = findViewById<TextView>(R.id.textResult)
        if(numeroInput != mioRandom){
            textResult.text = "Hai perso"
        }
        else{
            textResult.text = "Hai vinto"
        }
        val diceView = findViewById<ImageView>(R.id.imageView)
        val dadi = when(mioRandom){
            1 -> R.drawable.dice_face_1
            1 -> R.drawable.dice_face_2
            1 -> R.drawable.dice_face_3
            1 -> R.drawable.dice_face_4
            1 -> R.drawable.dice_face_5
            1 -> R.drawable.dice_face_6
        }
        diceView.setImageResource(dadi as Int)
    }
}