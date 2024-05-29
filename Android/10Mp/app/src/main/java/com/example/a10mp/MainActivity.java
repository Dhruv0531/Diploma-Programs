package com.example.a10mp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText currencyToBeConverted, currencyConverted;
    private Spinner fromSpinner, toSpinner;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        currencyToBeConverted = findViewById(R.id.currency_to_be_converted);
        currencyConverted = findViewById(R.id.currency_converted);
        fromSpinner = findViewById(R.id.from);
        toSpinner = findViewById(R.id.to);
        convertButton = findViewById(R.id.button);

        // Populate spinners
        List<String> currencies = new ArrayList<>();
        currencies.add("USD");
        currencies.add("EUR");
        currencies.add("GBP");
        currencies.add("JPY");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, currencies);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);

        // Set click listener for convert button
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        // Get the amount to be converted
        String amountStr = currencyToBeConverted.getText().toString();
        if (amountStr.isEmpty()) {
            Toast.makeText(this, "Please enter an amount", Toast.LENGTH_SHORT).show();
            return;
        }

        double amount = Double.parseDouble(amountStr);

        // Get the selected currencies
        String fromCurrency = fromSpinner.getSelectedItem().toString();
        String toCurrency = toSpinner.getSelectedItem().toString();

        // Perform currency conversion (You can implement your conversion logic here)
        double convertedAmount = amount * getConversionRate(fromCurrency, toCurrency);

        // Update the converted amount
        currencyConverted.setText(String.valueOf(convertedAmount));
    }

    // Dummy conversion rates method (Replace with actual conversion rates)
    private double getConversionRate(String fromCurrency, String toCurrency) {
        // You need to implement a method to get conversion rates from an API or database
        // For now, let's assume some conversion rates
        double usdToEur = 0.85;
        double usdToGbp = 0.72;
        double usdToJpy = 110.29;

        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {
                    case "EUR":
                        return usdToEur;
                    case "GBP":
                        return usdToGbp;
                    case "JPY":
                        return usdToJpy;
                }
                break;
            case "EUR":
                switch (toCurrency) {
                    case "USD":
                        return 1 / usdToEur;
                    // You need to define other conversion rates
                }
                break;
            // You need to define conversion rates for other currencies
        }

        // Return 1.0 if conversion rate not found
        return 1.0;
    }
}
