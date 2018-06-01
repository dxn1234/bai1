package com.example.administrator.demorecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.logging.SocketHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recycleview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<Shop>shops=new ArrayList<>();
        shops.add(new Shop("H1",R.drawable.h1));
        shops.add(new Shop("H2",R.drawable.h2));
        shops.add(new Shop("H3",R.drawable.h3));
        shops.add(new Shop("H4",R.drawable.h4));
        shops.add(new Shop("H5",R.drawable.h5));
        shops.add(new Shop("H6",R.drawable.h6));
        shops.add(new Shop("H7",R.drawable.h7));
        shops.add(new Shop("H8",R.drawable.h8));
        shops.add(new Shop("H9",R.drawable.h9));
        shops.add(new Shop("H10",R.drawable.h10));
        shops.add(new Shop("H11",R.drawable.h11));
        shops.add(new Shop("H12",R.drawable.h12));
        shops.add(new Shop("H13",R.drawable.h13));
        shops.add(new Shop("H14",R.drawable.h14));
        shops.add(new Shop("H15",R.drawable.h15));
        ShopAdapter shopAdapter=new ShopAdapter(shops,this);
        recyclerView.setAdapter(shopAdapter);
    }
}
