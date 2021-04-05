package by.lebedev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_click)
        val infoText = findViewById<TextView>(R.id.info_text)
        val inputField = findViewById<EditText>(R.id.input_field)

        button.setOnClickListener {

            val newText = inputField.text.toString()
            infoText.text = newText
            inputField.text.clear()
        }
    }
}