package com.example.gradassi_roll_the_dice_5ainf

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.gradassi_roll_the_dice.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        var n = intent.getIntExtra("Random", -1)
        var n1 = intent.getIntExtra("Random1", -1)
        var n2 = intent.getIntExtra("Random2", -1)
        var somma = intent.getIntExtra("SOMMA", 0)
        somma=n1+n2
        Log.d("DEBUG", "Numero uscito: $n")
        Log.d("DEBUG", "Numeri sommati: $n1 + $n2 = $somma")
        var Stringa1=""
        var risultato = if (n > somma) {

            Stringa1 = "Hai vinto!"
        } else {
            Stringa1="Hai perso!"
        }

        val textView3=findViewById<TextView>(R.id.textView_Estrazione)
        textView3.text="$n";
        val textView2 = findViewById<TextView>(R.id.Hai_perso_vinto)
        textView2.text=Stringa1;
    }
}