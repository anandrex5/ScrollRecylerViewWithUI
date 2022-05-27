package com.example.scrollrecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MyListData[] myListData = new MyListData[]{
                new MyListData("Brayden Smith", R.drawable.image_1435),
                new MyListData("Steffan Devin", R.drawable.image_1436),
                new MyListData("Ethan Martin", R.drawable.image_1434),
                new MyListData("than Martin", R.drawable.image_1434_1),
                new MyListData("than Martin", R.drawable.image_1434_1),
                new MyListData("than Martin", R.drawable.image_1434_1),
                new MyListData("than Martin", R.drawable.image_1434_1),
                new MyListData("than Martin", R.drawable.image_1434_1),
                new MyListData("than Martin", R.drawable.image_1434_1),
                new MyListData("than Martin", R.drawable.image_1434_1),
                new MyListData("than Martin", R.drawable.image_1434_1),


        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

    }
}
