package com.example.gradassi_roll_the_dice_5ainf

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gradassi_roll_the_dice.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        var msg = intent.getStringExtra("Messaggio")
        val textView = findViewById<TextView>(R.id.TextViewActivitySecond)
        textView.text = msg;

        var imageViewSecond = findViewById<ImageView>(R.id.imageViewActivitySecond)
        var random = intent.getIntExtra("Random", -1)
        var resource = when (random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> {
                R.drawable.dices
            }
        }
        imageViewSecond.setImageResource(resource)
        Log.d("SECOND", "FINITO DISEGNO DADO")
    }
}
