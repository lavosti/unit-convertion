package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayConverterActivity extends AppCompatActivity {

//    Declaring Widgets
    EditText amountinlitres;
    TextView valueinmililitres;
    Button convertionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_converter);

        amountinlitres = findViewById(R.id.amountinlitresInput);
        valueinmililitres = findViewById(R.id.valueinmililitres);
        convertionBtn = findViewById(R.id.convertionBtn);

        convertionBtn.setOnClickListener(v -> convertFromLitersToMillimeters());
    }

    private void convertFromLitersToMillimeters() {
        String valueEnteredInKilograms = amountinlitres.getText().toString();
        double liters = Double.parseDouble(valueEnteredInKilograms);
        double ml = (liters * 1000);

        valueinmililitres.setText(""+ml);

    }
}