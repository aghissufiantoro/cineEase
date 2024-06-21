package com.example.cineease.ui.ticket

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cineease.R

class TicketPurchaseActivity : AppCompatActivity() {

    private lateinit var textViewSelectedMovie: TextView
    private lateinit var textViewSelectedSchedule: TextView
    private lateinit var spinnerNumberOfTickets: Spinner
    private lateinit var buttonProceedToPayment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket_purchase)

        textViewSelectedMovie = findViewById(R.id.textViewSelectedMovie)
        textViewSelectedSchedule = findViewById(R.id.textViewSelectedSchedule)
        spinnerNumberOfTickets = findViewById(R.id.spinnerNumberOfTickets)
        buttonProceedToPayment = findViewById(R.id.buttonProceedToPayment)

        // Set movie details (should be passed from the previous activity)
        textViewSelectedMovie.text = "Selected Movie: Example Movie"
        textViewSelectedSchedule.text = "Schedule: 12:00 PM"

        // Setup number of tickets spinner
        val ticketOptions = arrayOf(1, 2, 3, 4, 5)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, ticketOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerNumberOfTickets.adapter = adapter

        // Set button click listener
        buttonProceedToPayment.setOnClickListener {
            // Handle the button click, navigate to payment screen
        }
    }
}
