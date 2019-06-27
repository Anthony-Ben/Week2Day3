package com.example.week2day3.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.week2day3.Animal;
import com.example.week2day3.R;
import com.example.week2day3.tables.DummyDBAnimal;

import java.util.ArrayList;

public class CategoryListActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        listView = findViewById(R.id.categoryList);

        String[] values = new String[]{
                "Jungle",
                "Artic",
                "Desert",
                "Forest",
                "Mammal",
                "Reptile",
                "Bird"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,values);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                Intent intent = new Intent(parent.getContext(),ListOfAnimalsActivity.class);
                Bundle categoryBundle = new Bundle();
                categoryBundle.putString("category",itemValue);

                intent.putExtras(categoryBundle);
                startActivity(intent);
            }

        });
    }

}
