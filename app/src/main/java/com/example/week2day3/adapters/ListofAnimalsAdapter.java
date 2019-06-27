package com.example.week2day3.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week2day3.Animal;

import com.example.week2day3.R;
import com.example.week2day3.activities.AnimalViewDetailsActivity;
import com.example.week2day3.activities.ListOfAnimalsActivity;
import com.example.week2day3.tables.DummyDBAnimal;

import java.util.ArrayList;

public class ListofAnimalsAdapter extends RecyclerView.Adapter<ListofAnimalsAdapter.ViewHolder> {
    ArrayList<Animal> animalList;


    public ListofAnimalsAdapter(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public ListofAnimalsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_name_list, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListofAnimalsAdapter.ViewHolder holder, int position) {
        final Animal currentAnimal = animalList.get(position);
        holder.tvAnimalName.setText(currentAnimal.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AnimalViewDetailsActivity.class);

                Bundle bundle = new Bundle();
                bundle.putParcelable("animal", currentAnimal);
                intent.putExtras(bundle);
                Log.d("SHHAJJJJJJJJ", currentAnimal.getName());
                if(intent != null) {
                    view.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvAnimalName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAnimalName = itemView.findViewById(R.id.tvAnimalNameForList);
        }
    }
}
