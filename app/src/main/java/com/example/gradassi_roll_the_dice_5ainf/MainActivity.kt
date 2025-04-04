package com.example.gradassi_roll_the_dice_5ainf

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gradassi_roll_the_dice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            val btnRoll : Button = findViewById(R.id.button_roll)
            btnRoll.setOnClickListener(View.OnClickListener {
                val toast= Toast.makeText(this,"Lancio del dado",Toast.LENGTH_LONG)
                toast.show()
                val  mioIntent: Intent =Intent(this, SecondActivity::class.java)
                val mioRandom = (1..6).random()
                mioIntent.putExtra("Messaggio","Numero estratto: $mioRandom")
                startActivity(mioIntent)

            })
        }
    }

