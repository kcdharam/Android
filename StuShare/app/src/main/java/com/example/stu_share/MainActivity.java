package com.example.stu_share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnCreateAcc, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCreateAcc = findViewById(R.id.btnCreateAcc);
        btnCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignupActivity();
            }
        });
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainMenu();
            }
        });
    }
    public void openSignupActivity(){
        Intent intent =new Intent(this, Signup.class);
        startActivity(intent);
    }
    public void openMainMenu(){
        Intent intent =new Intent(this, Menu.class);
        startActivity(intent);
    }

}
