package com.example.cineease.ui.receipt

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cineease.R

class PurchaseReceiptActivity : AppCompatActivity() {

    private lateinit var textViewMovieDetails: TextView
    private lateinit var textViewSnackDetails: TextView
    private lateinit var textViewTotalAmount: TextView
    private lateinit var buttonPrintReceipt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase_receipt)

        textViewMovieDetails = findViewById(R.id.textViewMovieDetails)
        textViewSnackDetails = findViewById(R.id.textViewSnackDetails)
        textViewTotalAmount = findViewById(R.id.textViewTotalAmount)
        buttonPrintReceipt = findViewById(R.id.buttonPrintReceipt)

        // Set receipt details (should be passed from the previous activity)
        textViewMovieDetails.text = "Movie: Example Movie\nSchedule: 12:00 PM\nTickets: 2"
        textViewSnackDetails.text = "Snacks: Popcorn, Soda"
        textViewTotalAmount.text = "Total: $20.00"

        buttonPrintReceipt.setOnClickListener {
            // Handle the print receipt action here
        }
    }
}
