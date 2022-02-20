package com.example.homework42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LanguageAdapter adapter;
    private ArrayList<String> language;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loadData();
        recyclerView = findViewById(R.id.recycler);
        adapter = new LanguageAdapter(language);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        language = new ArrayList<>();
        language.add("Python");
        language.add("Java");
        language.add("JavaScript");
        language.add("C");
        language.add("C++");
        language.add("PHP");
        language.add("VisulBasic");
        language.add("Go");
        language.add("SQL");
        language.add("UNITY");
        language.add("Net.Data");
        language.add("Dog");
        language.add("Lingo");
        language.add("Icon");
        language.add("NetLogo");
    }
}