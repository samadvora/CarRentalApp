package com.example.samadvora_androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ThankYouActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);

        //register the button with their ID.
//        booking = findViewById(R.id.bookMore);
        Button booking = (Button) findViewById(R.id.bookMore);
        //handle the  button
        booking.setOnClickListener(new View.OnClickListener(){
            //proceed to the HomeActivity
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThankYouActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}