package com.example.record_trail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<CommentsItem> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        recyclerView = findViewById(R.id.recycler_view);

        itemArrayList = new ArrayList<>();
        itemArrayList.add(new CommentsItem(R.color.dark_gray, 3, "후기에요"));
        itemArrayList.add(new CommentsItem(R.color.dark_gray, 3, "후기에요"));
        itemArrayList.add(new CommentsItem(R.color.dark_gray, 3, "후기에요"));
        itemArrayList.add(new CommentsItem(R.color.dark_gray, 3, "후기에요"));
        itemArrayList.add(new CommentsItem(R.color.dark_gray, 3, "후기에요"));

        CommentsAdapter adapter = new CommentsAdapter(itemArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}