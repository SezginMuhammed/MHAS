package com.example.mhas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class notyazma extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notyazma);
        button=(Button)findViewById(R.id.buttonnot);
        editText=(EditText)findViewById(R.id.editnot);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText.getText().toString();
                Intent intent=new Intent(notyazma.this,randevualindi.class);
                startActivity(intent);

            }
        });
    }
}