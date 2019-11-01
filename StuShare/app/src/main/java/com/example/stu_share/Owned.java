package com.example.stu_share;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Owned extends AppCompatActivity {
    private Button btnCancel, btnEdit, btnViewAttend, btnCheckIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owned);
    }
}
