package com.example.stu_share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AvailableEvents extends AppCompatActivity {

    ListView availEventList;
    String items [] = new String[] {"item1", "item2", "item3", "item4", "item5" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_events);

        availEventList = findViewById(R.id.availEventList);


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        availEventList.setAdapter(arrayAdapter);
        availEventList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openViewEventsActivity();
            }
        });

    }

    public void openViewEventsActivity(){
        Intent intent =new Intent(this, ViewEvents.class);
        startActivity(intent);
    }
}
