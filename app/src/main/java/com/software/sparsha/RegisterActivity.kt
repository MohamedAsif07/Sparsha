package com.software.sparsha


import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Handler

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Change Status Bar Color Properly
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.decorView.windowInsetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
            window.statusBarColor = Color.parseColor("#F4FBEA") // Background color
        } else {
            window.statusBarColor = Color.parseColor("#F4FBEA")
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etName = findViewById<EditText>(R.id.etName)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etAadhar = findViewById<EditText>(R.id.etAadhar)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)

        btnSignUp.setOnClickListener {
            // Show Progress Bar
            progressBar.visibility = View.VISIBLE
            btnSignUp.visibility = View.GONE

            // Wait for 3 seconds
            android.os.Handler().postDelayed({
                progressBar.visibility = View.GONE
                btnSignUp.visibility = View.VISIBLE

                // Navigate to next screen
                val intent = Intent(this, VerificationActivity::class.java)
                startActivity(intent)
                finish()
            }, 1000)
        }
    }
}

