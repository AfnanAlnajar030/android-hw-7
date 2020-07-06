package com.example.pokemoncw7;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {

    ArrayList<Pokemon> mPokemon;

    // Constructor
    public Adapter(ArrayList<Pokemon> mPokemon ) {
        this.mPokemon = mPokemon;
    }

    // Required methods
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // This method gives data to each item in it based on the 'position' which is the index..?

    }

    @Override
    public int getItemCount() {
        return mPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
