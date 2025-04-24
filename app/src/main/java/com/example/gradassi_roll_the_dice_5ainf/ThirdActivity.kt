package com.example.gradassi_roll_the_dice_5ainf

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.gradassi_roll_the_dice.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        val random1 = (1..2).random()
        val random2 = (1..2).random()
        var n = intent.getIntExtra("Random", -1)
        var somma = random1 + random2
        Log.d("DEBUG", "Numero uscito: $n")
        Log.d("DEBUG", "Numeri sommati: $random1 + $random2 = $somma")
        var Stringa1 = ""
        var foto : Int
        var risultato = if (n > somma) {

            Stringa1 = "Hai vinto!"
            foto =R.drawable.victory_1
        } else {
            Stringa1 = "Hai perso!"
            foto=R.drawable.loser_1
        }

        var image_victory_lose= findViewById<ImageView>(R.id.Image_victory_lose)
        image_victory_lose.setImageResource(foto)
        val textView3 = findViewById<TextView>(R.id.textView_Estrazione)
        textView3.text = "$n";
        val textView2 = findViewById<TextView>(R.id.Hai_perso_vinto)
        textView2.text = Stringa1;
    }
}
