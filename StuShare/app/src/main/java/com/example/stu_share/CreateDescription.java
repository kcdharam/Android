package com.example.stu_share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateDescription extends AppCompatActivity {
    private Button btnNextCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_description);
        btnNextCreate = findViewById(R.id.btnNextCreate);
        btnNextCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateActivity();
            }
        });
    }
    public void openCreateActivity(){
        Intent intent =new Intent(this, Create.class);
        startActivity(intent);
    }
}
