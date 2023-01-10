package com.example.customlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvCountry = findViewById(R.id.lvCountry);

        final ArrayList<CountryModel> list = new ArrayList<>();
        list.add(new CountryModel("brazil","5", R.drawable.brazil));
        list.add(new CountryModel("Germany","4",R.drawable.germany));
        list.add(new CountryModel("France","2",R.drawable.france));
        list.add(new CountryModel("Spain","1",R.drawable.spain));
        list.add(new CountryModel("England","1",R.drawable.unitedkingdom));
        list.add(new CountryModel("United States","0",R.drawable.unitedstates));
        list.add(new CountryModel("Saudi Arabia","0",R.drawable.saudiarabia));
        list.add(new CountryModel("brazil","5", R.drawable.brazil));
        list.add(new CountryModel("Germany","4",R.drawable.germany));
        list.add(new CountryModel("France","2",R.drawable.france));
        list.add(new CountryModel("Spain","1",R.drawable.spain));
        list.add(new CountryModel("England","1",R.drawable.unitedkingdom));
        list.add(new CountryModel("United States","0",R.drawable.unitedstates));
        list.add(new CountryModel("Saudi Arabia","0",R.drawable.saudiarabia));

        CountryAdapter adapter = new CountryAdapter(list,getApplicationContext());

        lvCountry.setAdapter(adapter);

    }
}