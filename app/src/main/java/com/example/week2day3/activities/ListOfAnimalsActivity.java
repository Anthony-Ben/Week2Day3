package com.example.week2day3.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import com.example.week2day3.Animal;
import com.example.week2day3.R;
import com.example.week2day3.adapters.ListofAnimalsAdapter;
import com.example.week2day3.tables.DummyDBAnimal;

import java.util.ArrayList;

public class ListOfAnimalsActivity extends AppCompatActivity {
    private ArrayList<Animal> animalList;
    private String categoryName;
    RecyclerView rvAnimalNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_animals);

        rvAnimalNameView = findViewById(R.id.recyclerViewAnimals);

        Intent intentPassed = getIntent();

        Bundle categoryBundlePassed = intentPassed.getExtras();

        if (categoryBundlePassed != null) {
            categoryName= categoryBundlePassed.getString("category");
            //Log.d("wassup", categoryName);
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        ListofAnimalsAdapter animalsAdapter = new ListofAnimalsAdapter(new DummyDBAnimal().getAnimalsByCategory(categoryName));
        rvAnimalNameView.setLayoutManager(layoutManager);
        rvAnimalNameView.setAdapter(animalsAdapter);

    }



}
