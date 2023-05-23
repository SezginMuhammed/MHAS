package com.example.mhas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mhas.databinding.ActivityKkayitBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Kkayit extends AppCompatActivity {
    private ActivityKkayitBinding binding;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kkayit);
        auth=FirebaseAuth.getInstance();


        binding = ActivityKkayitBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    public void kayit (View view)
    {
        String email=binding.kayitmail.getText().toString();
        String sifre=binding.kayitsifre.getText().toString();
        if (email.equals("")||sifre.equals(""))
        {
            Toast.makeText(this, "BU KISIM BOŞ OLAMAZ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            auth.createUserWithEmailAndPassword(email,sifre).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent=new Intent(Kkayit.this,Kgris.class);
                    startActivity(intent);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Kkayit.this,e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    public void anasayfa(View view)
    {
        Intent intent=new Intent(Kkayit.this,Kgris.class);
        startActivity(intent);
    }
}