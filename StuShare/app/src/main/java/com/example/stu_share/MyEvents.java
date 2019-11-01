package com.example.stu_share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyEvents extends AppCompatActivity {
    private Button btnCreate, btnOwnedEvents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);
        btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateDescriptionActivity();
            }
        });
        btnOwnedEvents = findViewById(R.id.btnOwnedEvents);
        btnOwnedEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOwnedEventActivity();
            }
        });

    }
    public void openCreateDescriptionActivity(){
        Intent intent =new Intent(this, CreateDescription.class);
        startActivity(intent);
    }
    public void openOwnedEventActivity(){
        Intent intent =new Intent(this, Owned.class);
        startActivity(intent);
    }
}
