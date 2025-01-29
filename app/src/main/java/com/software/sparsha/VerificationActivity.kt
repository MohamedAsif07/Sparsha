package com.software.sparsha



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class VerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        val backButton: Button = findViewById(R.id.backButton)
        val nextButton: Button = findViewById(R.id.nextButton)

        backButton.setOnClickListener {
            finish() // Go back to the previous screen
        }

        nextButton.setOnClickListener {
            val intent = Intent(this, ReportActivity::class.java)
            startActivity(intent)
        }
    }
}
