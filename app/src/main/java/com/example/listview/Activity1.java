package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;

        listView = findViewById(R.id.listviewmonan);
        arrayList = new ArrayList<>();

        arrayList.add(new MonAn("BÚN BÒ", "ĐƠN GIÁ: 30.000 VNĐ", R.drawable.bunbo));
        arrayList.add(new MonAn("PHỞ HÀ NỘI", "ĐƠN GIÁ: 35.000 VNĐ", R.drawable.phohn));
        arrayList.add(new MonAn("BÁNH MÌ", "ĐƠN GIÁ: 15.000 VNĐ", R.drawable.banhmi1));
        arrayList.add(new MonAn("PIZZA", "ĐƠN GIÁ: 100.000 VNĐ", R.drawable.pizza));

        adapter = new AdapterMonAn(Activity1.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(Activity1.this, BunBo.class);
                    startActivity(intent);

                }

            }
        });

    }
}