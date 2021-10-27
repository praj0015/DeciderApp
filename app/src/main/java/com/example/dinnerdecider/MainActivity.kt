package com.example.dinnerdecider

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Indian", "Pizza", "Barros Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decideBtn = findViewById<Button>(R.id.decideBtn)
        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            var selectedFoodText = findViewById<TextView>(R.id.selectedFoodTxt)
            selectedFoodText.text = foodList[randomFood]
        }

        val addFoodBtn = findViewById<Button>(R.id.addFoodBtn)
        addFoodBtn.setOnClickListener {
            var addFoodText = findViewById<TextView>(R.id.addFoodTxt)
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            addFoodText.text = ""
        }
    }
}

