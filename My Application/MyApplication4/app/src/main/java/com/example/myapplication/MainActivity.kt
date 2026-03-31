package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtInput: EditText
    private lateinit var txtResult: TextView

    private lateinit var txtResult2: TextView

    private lateinit var btnSuggest: Button
    private lateinit var btnReset: Button
    private lateinit var imglogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtInput = findViewById(R.id.edtInput)
        txtResult = findViewById(R.id.txtResult)
        txtResult2 = findViewById(R.id.txtResult2)
        btnSuggest = findViewById(R.id.btnSuggest)
        btnReset = findViewById(R.id.btnReset)
        imglogo = findViewById(R.id.imgLogo)



        btnSuggest.setOnClickListener {
            showSuggestion()
        }

        btnReset.setOnClickListener {
            resetFields()
        }

        imglogo.setImageResource(R.drawable.abc)


    }

    private fun showSuggestion() {
        val input = edtInput.text.toString().trim().lowercase()

        if (input.isEmpty()) {
            Toast.makeText(this, "Please enter a time of day", Toast.LENGTH_SHORT).show()
            return
        }

        val suggestion: String

        // IF STATEMENTS
        if (input == "morning") {
            suggestion = " Send a 'Good morning' text to a family member."
        } else if (input == "mid-morning") {

            suggestion = " Thank a colleague for their help."
        } else if (input == "afternoon") {

            suggestion = " Share a funny meme with a friend."
        } else if (input == "snack" || input == "afternoon snack time") {

            suggestion = " Send a 'thinking of you' message."
        } else if (input == "dinner") {

            suggestion = "🍽 Call a friend for a 5-minute catch-up."
        } else if (input == "night" || input == "after dinner") {

            suggestion = " Leave a kind comment on someone's post."
        } else {

            // Invalid input handling
            suggestion = "❌ Invalid input. Try: Morning, Afternoon, Dinner, Night."
            Log.w("SocialSpark", "Invalid input entered: $input")
        }



        txtResult.text = suggestion
        Log.d("SocialSpark", "Suggestion displayed")
    }


    private fun resetFields() {
        edtInput.text.clear()
        txtResult.text = ""

        Toast.makeText(this, "Reset successful ✅", Toast.LENGTH_SHORT).show()
        Log.d("SocialSpark", "Fields reset")
    }
}

 // Reference List
//Anon., 2026. ChatGPT. [Online]
//Available at: https://www.chatgpt.com
//[Accessed  20 March 2026].
//Anon., 2026. W3Schools. [Online]
//Available at: https://www.w3schools.com
//[Accessed 21 March 2026].
//Anon., 2026. IMAD5112 Module manual. [Online]
//Available at: https://www.Rosebank College.com
//[Accessed 18 March2026].
//
//Android Studio- Create a Button Quickly . 2022. [Film] Directed by Random code. Denmark:. https://youtu.be/_dgLxW9DbIY?si=L8tLlT8k2GyeiPwV
//
//[Android Tutorial] 4 - if Statement. 2017.[Flim] Directed by young coder club: https://youtube.com/@youngcoderclub6569?si=AXDDIYIfIR4F-I59

