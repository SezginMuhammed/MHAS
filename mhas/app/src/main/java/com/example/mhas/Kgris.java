package com.example.mhas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mhas.databinding.ActivityKgrisBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Kgris extends AppCompatActivity {
    private ActivityKgrisBinding binding;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kgris);
        auth=FirebaseAuth.getInstance();

        binding = ActivityKgrisBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    public void giris (View view)
    {
        String email =binding.mail.getText().toString();
        String sifre =binding.sifre.getText().toString();
        if (email.equals("")||sifre.equals(""))
        {
            Toast.makeText(this, "BU KISIM BOŞ OLAMAZ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            auth.signInWithEmailAndPassword(email,sifre).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent=new Intent(Kgris.this,MainActivity.class);
                    startActivity(intent);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Kgris.this,e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    public void kaydol(View view)
    {
        Intent intent=new Intent(Kgris.this,Kkayit.class);
        startActivity(intent);
    }
}