package com.example.week2day3.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.week2day3.Animal;
import com.example.week2day3.R;

public class AnimalViewDetailsActivity extends AppCompatActivity {

    TextView tvAnimalName;
    TextView tvHabitatName;
    TextView tvClassName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_view);
        tvAnimalName= findViewById(R.id.tvAnimalName);
        tvHabitatName = findViewById(R.id.tvHabitatName);
        tvClassName = findViewById(R.id.tvClassName);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            Animal animal = bundle.getParcelable("animal");

            Log.d("FUCKING", animal.getName());
            tvAnimalName.setText(animal.getName());
            tvHabitatName.setText(animal.getHabitat());
            tvClassName.setText(animal.getKingdom());
        }



    }

}
