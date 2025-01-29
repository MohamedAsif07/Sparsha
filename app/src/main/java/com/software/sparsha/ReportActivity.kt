package com.software.sparsha



import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import android.widget.Toast

class ReportActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        // Initialize the Swipe to Report card
        val swipeToReportCard: CardView = findViewById(R.id.swipeToReportCard)

        // Set click listener to go to the next activity when clicked
        swipeToReportCard.setOnClickListener {
            // Go to Verification Activity (or next activity of your choice)
            goToVerificationActivity()
        }
    }

    // Function to handle navigation to VerificationActivity
    private fun goToVerificationActivity() {
        // Example Toast to show that the swipe action was triggered
        Toast.makeText(this, "Swipe to Report clicked", Toast.LENGTH_SHORT).show()

        // Intent to navigate to VerificationActivity
        val intent = Intent(this, DoActivity::class.java)
        startActivity(intent)
    }
}
