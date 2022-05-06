package com.example.samadvora_androidproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //register the button with their ID.
        view = findViewById(R.id.btnviewcar);
        //handle the btnviewcar button
            //proceed to the ProductActivity
                    view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //setContentView(R.layout.activity_product_list);
                    Intent intent = new Intent(HomeActivity.this, CarListActivity.class);
                    startActivity(intent);
                }
            });
    }
}