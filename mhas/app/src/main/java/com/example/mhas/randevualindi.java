package com.example.mhas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class randevualindi extends AppCompatActivity {

   Button exitButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randevualindi);

        exitButton = findViewById(R.id.buttoncikis);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitApplication();
            }
        });

    }

    private void exitApplication() {
        finishAffinity();
    }
}