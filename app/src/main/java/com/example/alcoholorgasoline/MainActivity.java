package com.example.alcoholorgasoline;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText alcoholPrice, gasolinePrice;
    private TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alcoholPrice = findViewById(R.id.edtPriceAlcohlol);
        gasolinePrice = findViewById(R.id.edtPriceGsoline);
        resultText = findViewById(R.id.resultText);
    }

    public void calculatePrice(View view) {
        String priceAlcohol = alcoholPrice.getText().toString();
        String priceGasoline = gasolinePrice.getText().toString();
       Boolean validateField =   vailidat(priceAlcohol, priceGasoline);

       if (validateField) {
           Double valueAlcohol = Double.parseDouble(priceAlcohol);
           Double valueGasoline = Double.parseDouble(priceGasoline);
           Double result = valueAlcohol / valueGasoline;
           if (result >= 0.7) {
               resultText.setText("Batter to use gasoline");
           }
       } else {
           resultText.setText("Batter to use alcohol");
       }
    }

    public Boolean vailidat (String pAlcohol, String pGasoline ) {
        Boolean validateField = true;
        if (pAlcohol == null || pAlcohol.equals("")) {
        } else if (pGasoline == null || pGasoline.equals("")) {
        }
        return validateField;
    }
}