package com.example.samadvora_androidproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.samadvora_androidproject1.databinding.ActivityCarListBinding;

import java.util.ArrayList;
import java.util.List;

public class CarListActivity extends AppCompatActivity {
    private ActivityCarListBinding binding;
    private View imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageView = findViewById(R.id.CImages);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_car_list);
        final List<Product> CarList = new ArrayList<>();
        final ArrayList<Integer> imagelist = new ArrayList<Integer>();
        imagelist.add(R.drawable.car1);
        imagelist.add(R.drawable.sedan);
        imagelist.add(R.drawable.coupes);
        imagelist.add(R.drawable.sports);
        imagelist.add(R.drawable.minivan);
        // setting data to display in recycle view
        CarList.add(new Product("MX-5 Miata", "Mazda", "5", "If you love to drive and you're looking for a car that makes you feel connected to the road, start your search with the Mazda MX-5 Miata. Lively and engaging, the Miata is a joy to drive at any speed. You'll also like its fuss-free soft top and relatively affordable price", "p001",
                "$ 150PH.00", getDrawable((R.drawable.car1))));
        CarList.add(new Product("Hyundai Accent", "Hyundai", "5", "All models come with a 120-hp four-cylinder engine with a continuously variable automatic transmission (CVT). It's not exciting, but it gets the job done and does so while sipping fuel.", "p002",
                "$ 140PH.99", getDrawable((R.drawable.sedan))));
        CarList.add(new Product("Toyota GR86", "Toyota", "4", "Toyota GR86 is due for the 2022 model year, and although it's completely new, it follows the same rear-wheel-drive formula as the first-gen car. Developed again in conjunction with the Subaru BRZ, the 2022 GR86 will be powered by a horizontally opposed four-cylinder engine and a standard six-speed manual transmission. ", "p003",
                "$ 110PH.00", getDrawable((R.drawable.coupes))));
        CarList.add(new Product("Toyota GR86", "Toyota", "5", "The new model is powered by a 2.4-liter horizontally opposed four-cylinder engine that makes 228 horsepower, which is 23 hp more than the outgoing model's 2.0-liter mill", "p004",
                "$ 100PH.99", getDrawable((R.drawable.toyotagr))));
        CarList.add(new Product("Pacifica ", "Chrysler Pacifica", "3", "Practical, comfortable, graceful, and undeniably handsome, the 2022 Chrysler Pacifica has family transportation down pat. It's offered with either a regular V-6 or a plug-in hybrid powertrain, and can be equipped with optional all-wheel drive.", "p005",
                "$ 97.99PH", getDrawable((R.drawable.minivan))));
        final CarAdapter adapter = new CarAdapter (CarList);
        binding.rView.setLayoutManager(new LinearLayoutManager(this));
        binding.rView.setAdapter(adapter);

        adapter.setOnItemClickListener((position)-> {
            Intent myIntent = new Intent(CarListActivity.this, CarDisplay.class);
            myIntent.putExtra("Cname", CarList.get(position).getCname());
            myIntent.putExtra("CComp", CarList.get(position).getCComp());
            myIntent.putExtra("CRatings", CarList.get(position).getCRatings());
            myIntent.putExtra("CDetails", CarList.get(position).getCDetails());
            myIntent.putExtra("CPrice", CarList.get(position).getCPrice());

            myIntent.putExtra("CImages", imagelist.get(position));

            startActivity(myIntent);
        });

        }
    }


