package com.example.pokemoncw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //OK so after creating a new class(for Pokemon objects) and a new xml file (for each cell), you make instances of the class
        //and put them in an array list.

        ArrayList<Pokemon> myPokemon = new ArrayList<>();

        Pokemon blaziken = new Pokemon("Blaziken", R.drawable.blaziken, 120, 70, 530);
        Pokemon blastoise = new Pokemon("Blastoise", R.drawable.blastoise, 83, 100, 530);
        Pokemon charizard = new Pokemon("Charizard.jpg", R.drawable.charizard, 84, 78, 534);
        Pokemon noivern = new Pokemon("Noivern", R.drawable.noivern, 70, 80, 535);
        Pokemon lucario = new Pokemon("Lucario", R.drawable.lucario, 110, 70, 525);

        myPokemon.add(blaziken);
        myPokemon.add(blastoise);
        myPokemon.add(charizard);
        myPokemon.add(noivern);
        myPokemon.add(lucario);

        //Declare the recycler view
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager ln = new LinearLayoutManager(this);







    }
}