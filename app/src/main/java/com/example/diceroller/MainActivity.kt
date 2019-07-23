package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanFGHFGHFceState)
        setContentView(R.layout.actFFHFGHFivity_main)
FGHFGHFG
        FG
        HFGH
        H
        FGH
        FG
        HFG
        H
        FG
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rolldice()
    }
}
private fun rolldice() {
    val randomInt = Random.nextInt(6) + 1
     val drawableResource = when (randomInt) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    val dice_Image: ImageView = findViewById(R.id.dice_Image)
    dice_Image.setImageResource(drawableResource)
}
}
