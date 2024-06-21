package com.example.cineease.ui.payment

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.cineease.R

class TicketPaymentActivity : AppCompatActivity() {

    private lateinit var radioGroupPaymentOptions: RadioGroup
    private lateinit var buttonCompletePayment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket_payment)

        radioGroupPaymentOptions = findViewById(R.id.radioGroupPaymentOptions)
        buttonCompletePayment = findViewById(R.id.buttonCompletePayment)

        buttonCompletePayment.setOnClickListener {
            val selectedOptionId = radioGroupPaymentOptions.checkedRadioButtonId
            val selectedOption = findViewById<RadioButton>(selectedOptionId)
            val paymentMethod = selectedOption.text.toString()
            // Handle the payment process here
        }
    }
}
