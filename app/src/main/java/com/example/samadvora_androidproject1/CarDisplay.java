package com.example.samadvora_androidproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CarDisplay extends AppCompatActivity {
    String txtFinalProduct, txtFinalPrice;
    Button check;
    Integer img;

    TextView txtCname,  txtdesc, txtprice;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_display);

        txtCname=findViewById(R.id.txtCname);
        txtdesc=findViewById(R.id.txtdesc);
        txtprice = findViewById(R.id.txtPrice);
        imageView = findViewById(R.id.CImages);
        check = findViewById(R.id.btnBuy);

        Intent myIntent = getIntent();

        txtCname.setText(myIntent.getStringExtra("Cname"));
        txtprice.setText(myIntent.getStringExtra("CPrice"));
        txtdesc.setText(myIntent.getStringExtra("CDetails"));
        imageView.setImageDrawable(getDrawable(myIntent.getIntExtra("CImages", 0)));
        img=myIntent.getIntExtra("CImages", 0);

        Bundle bundle = getIntent().getExtras();

        txtFinalProduct = bundle.getString("Cname");

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkout = new Intent(CarDisplay.this, Checkout.class);
                checkout.putExtra("ProductName", txtCname.getText());
                checkout.putExtra("Price", txtprice.getText());
                checkout.putExtra("img", img);

                startActivity(checkout);
            }
        });
    }


}