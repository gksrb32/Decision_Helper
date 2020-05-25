package com.pita.decision_helper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val optionList = arrayListOf("Option1", "Option2", "Same")
    var bestDecision = optionList[2]
    var option1subScore1 = 0
    var option1subScore2 = 0
    var option1subScore3 = 0

    var option2subScore1 = 0
    var option2subScore2 = 0
    var option2subScore3 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            option1subScore1 = priorityWrite1_1.text.toString().toInt() * scoreWrite1_1.text.toString().toInt()
            option1subScore2 = priorityWrite2_1.text.toString().toInt() * scoreWrite2_1.text.toString().toInt()
            option1subScore3 = priorityWrite3_1.text.toString().toInt() * scoreWrite3_1.text.toString().toInt()

            option2subScore1 = priorityWrite1_2.text.toString().toInt() * scoreWrite1_2.text.toString().toInt()
            option2subScore2 = priorityWrite2_2.text.toString().toInt() * scoreWrite2_2.text.toString().toInt()
            option2subScore3 = priorityWrite3_2.text.toString().toInt() * scoreWrite3_2.text.toString().toInt()

            val option1TotalScore = option1subScore1 + option1subScore2 + option1subScore3
            val option2TotalScore = option2subScore1 + option2subScore2 + option2subScore3

            if (option1TotalScore>option2TotalScore)
            {
                bestDecision = optionList[0]
            }
            else if (option1TotalScore<option2TotalScore)
            {
                bestDecision = optionList[1]
            }

            selectedOptionText.text = bestDecision
        }

        addButton.setOnClickListener {
            // Create a row
        }

    }
}

