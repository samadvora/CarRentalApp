package com.example.samadvora_androidproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Checkout extends AppCompatActivity {
    TextView txtFinalProduct, txtFinalPrice, txtFinalRating;
    ImageView imageview6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        txtFinalPrice = findViewById(R.id.txtFinalPrice);
        txtFinalProduct = findViewById(R.id.txtFinalProduct);
        imageview6 = findViewById(R.id.imageView6);

        Intent checkintent = getIntent();

        txtFinalPrice.setText(checkintent.getStringExtra("Price"));
        txtFinalProduct.setText(checkintent.getStringExtra("ProductName"));
        imageview6.setImageDrawable(getDrawable(checkintent.getIntExtra("img", 0)));
    }

    public void gotoDisplay(View v) {
        setContentView(R.layout.activity_thank_you);
    }
}