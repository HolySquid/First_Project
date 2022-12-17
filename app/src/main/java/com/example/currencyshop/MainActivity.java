package com.example.currencyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IncreaseQuantity(View view) {
        quantity = quantity + 1;
        TextView QuantityTextView = findViewById(R.id.prise5);
        QuantityTextView.setText("quantity");
    }

}