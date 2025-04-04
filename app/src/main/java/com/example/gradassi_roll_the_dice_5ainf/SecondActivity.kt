package com.example.gradassi_roll_the_dice_5ainf

import android.os.Bundle
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
        var msg =intent.getStringExtra("Messaggio")
        val textView=findViewById<TextView>(R.id.TextViewActivitySecond)
        textView.text=msg;
        }
    }
