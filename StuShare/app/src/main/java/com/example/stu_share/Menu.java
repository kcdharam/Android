package com.example.stu_share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
        private Button btnMyEvents, btnViewEvents, btnMyProf, btnCrtEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnMyEvents = findViewById(R.id.btnMyEvents);
        btnMyEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyEventsActivity();
            }
        });
        btnViewEvents = findViewById(R.id.btnViewEvents);
        btnViewEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewEventsActivity();
            }
        });
        btnMyProf = findViewById(R.id.btnMyProf);
        btnMyProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile();
            }
        });

        btnCrtEvent = findViewById(R.id.btnCrtEvent);
        btnCrtEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateEventActivity();
            }
        });

    }
    public void openMyEventsActivity(){
        Intent intent =new Intent(this, MyEvents.class);
        startActivity(intent);
    }
    public void openViewEventsActivity(){
        Intent intent =new Intent(this, AvailableEvents.class);
        startActivity(intent);
    }
    public void openCreateEventActivity(){
        Intent intent =new Intent(this, CreateDescription.class);
        startActivity(intent);
    }
    public void openMyProfile(){
        Intent intent =new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}
