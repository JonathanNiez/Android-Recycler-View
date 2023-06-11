package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ItemsModel> itemsModelArrayList;
    private ItemsAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        itemsModelArrayList = new ArrayList<>();
        itemsModelArrayList.add(new ItemsModel(R.drawable.ic_launcher_background, "Logo", 9999));
        itemsModelArrayList.add(new ItemsModel(R.drawable.ic_launcher_background, "Logo", 9999));
        itemsModelArrayList.add(new ItemsModel(R.drawable.ic_launcher_background, "Logo", 9999));
        itemsModelArrayList.add(new ItemsModel(R.drawable.ic_launcher_background, "Logo", 9999));

        loadRecyclerView();

    }

    private void loadRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemsAdapter = new ItemsAdapter(this, itemsModelArrayList);
        recyclerView.setAdapter(itemsAdapter);

    }

}