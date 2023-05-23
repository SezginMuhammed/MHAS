package com.example.mhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Dahiliye extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dahiliye);
        searchView=(SearchView) findViewById(R.id.dahiliyearama);
        listView=(ListView) findViewById(R.id.dahiliyelist);
        list=new ArrayList<>();
        list.add("Arnavutköy Devlet Hastanesi");
        list.add("Avcılar Hospital");
        list.add("Avcılar Murat Kölük Devlet Hastanesi");
        list.add("Bağcılar Eğitim ve Araştırma Hastanesi");
        list.add("Bahçelievler Devlet Hastanesi");
        list.add("Bakırköy Dr. Sadi Konuk Eğitim ve Araştırma Hastanesi");
        list.add("Başakşehir Çam ve Sakura Şehir Hastanesi");
        list.add("Başakşehir Devlet Hastanesi");
        list.add("Başkent Üniversitesi İstanbul Hastanesi");
        list.add("Bayrampaşa Devlet Hastanesi");
        list.add("Beşiktaş Sait Çiftçi Devlet Hastanesi");
        list.add("Beykoz Devlet Hastanesi");
        list.add("Beyoğlu Göz Eğitim ve Araştırma Hastanesi");
        list.add("Bezmialem Vakıf Üniversitesi Tıp Fakültesi Hastanesi");
        list.add("Büyükada Dr. Lütfi Kırdar Şehir Hastanesi");
        list.add("Büyükçekmece Kolan Hospital");
        list.add("Büyükçekmece Mimar Sinan Devlet Hastanesi");
        list.add("Çatalca İlyas Çokay Devlet Hastanesi");
        list.add("Çekmeköy Devlet Hastanesi");
        list.add("Çekmeköy Tıp Merkezi");
        list.add("Doğa Hospital");
        list.add("Doğan Hastanesi");
        list.add("Dr. İsmail Niyazi Kurtulmuş Hastanesi");
        list.add("Dr. Sadi Konuk Eğitim Araştırma Hastanesi Bahçelievler Semt Polikliniği");
        list.add("Dr. Siyami Ersek Göğüs Kalp ve Damar Cerrahisi Eğitim ve Araştırma Hastanesi");
        list.add("Ensar Hastanesi");
        list.add("Erenköy Fizik Tedavi ve Rehabilitasyon Hastanesi");
        list.add("Esenler Kadın Doğum ve Çocuk Hastalıkları Hastanesi");
        list.add("Esenyurt Necmi Kadıoğlu Devlet Hastanesi");
        list.add("Eyüpsultan Devlet Hastanesi");
        list.add("Fatih Sultan Mehmet Eğitim ve Araştırma Hastanesi");
        list.add("Fatih Üniversitesi Tıp Fakültesi Maltepe Hastanesi");
        list.add("Fizik Tedavi Rehabilitasyon Eğitim ve Araştırma Hastanesi");
        list.add("Florya Hastanesi");
        list.add("Gaziosmanpaşa Eğitim ve Araştırma Hastanesi");
        list.add("Göztepe Prof. Dr. Süleyman Yalçın Şehir Hastanesi");
        list.add("Gümüşsuyu Asker Hastanesi");
        list.add("Haliç Hospital");
        list.add("Haseki Eğitim ve Araştırma Hastanesi");
        list.add("Haydarpaşa Numune Eğitim ve Araştırma Hastanesi");
        list.add("İstanbul Eğitim ve Araştırma Hastanesi Osmaniye / Bakırköy Polikliniği");
        list.add("İstanbul Eğitim ve Araştırma Hastanesi Samatya Polikliniği");
        list.add("İstanbul Eğitim ve Araştırma Hastanesi Zeytinburnu Polikliniği");
        list.add("İstanbul Meslek Hastalıkları Hastanesi");
        list.add("İstanbul Üniversitesi Cerrahpaşa Tıp Fakültesi Hastanesi");
        list.add("İstinye Devlet Hastanesi");
        list.add("İstinye Üniversite Hastanesi");
        list.add("Kağıthane Devlet Hastanesi");
        list.add("Kanuni Sultan Süleyman Eğitim ve Araştırma Hastanesi");
        list.add("Kartal Dr. Lütfi Kırdar Şehir Hastanesi");
        list.add("Kartal Koşuyolu Yüksek İhtisas Eğitim ve Araştırma Hastanesi");
        list.add("Kasımpaşa Asker Hastanesi");
        list.add("Koç Üniversitesi Hastanesi");
        list.add("Lepra Deri ve Zührevi Hastalıkları Hastanesi");
        list.add("Levent Hastanesi");
        list.add("Liv Hospital Ulus");
        list.add("Lütfiye Nuri Burat Devlet Hastanesi");
        list.add("Maltepe Devlet Hastanesi");
        list.add("Maltepe Üniversitesi Tıp Fakültesi Hastanesi");
        list.add("Marmara Üniversitesi İstanbul Pendik Eğitim ve Araştırma Hastanesi");
        list.add("Medical Park Bahçelievler Hastanesi");
        list.add("Medicana Bahçelievler Hastanesi");
        list.add("Medicine Hospital");
        list.add("Medilife Beylikdüzü Hastanesi");
        list.add("Medipol Mega Üniversite Hastanesi");
        list.add("Medivita İncirli Hastanesi");
        list.add("Mehmet Akif Ersoy Göğüs Kalp ve Damar Cerrahisi Eğitim ve Araştırma Hastanesi");
        list.add("Memorial Ataşehir Hastanesi");
        list.add("Metin Sabancı Baltalimanı Kemik Hastalıkları Eğitim ve Araştırma Hastanesi");
        list.add("Moodist Psikiyatri ve Nöroloji Hastanesi");
        list.add("Okmeydanı Eğitim ve Araştırma Hastanesi");
        list.add("Özel Bayrampaşa Hastanesi");
        list.add("Özel Gazi Hastanesi");
        list.add("Özel Güngören Hastanesi");
        list.add("Pendik Devlet Hastanesi");
        list.add("Prof. Dr. Cemil Taşcıoğlu Şehir Hastanesi");
        list.add("Prof. Dr. Mazhar Osman Ruh Sağlığı ve Sinir Hastalıkları Eğitim ve Araştırma Hastanesi");
        list.add("Rami Hastanesi");
        list.add("Sancaktepe Şehit Prof. Dr. İlhan Varank Eğitim ve Araştırma Hastanesi");
        list.add("Sarıyer İsmail Akgün Devlet Hastanesi");
        list.add("Silivri Devlet Hastanesi");
        list.add("Sultan 2.Abdülhamid Han Eğitim ve Araştırma Hastanesi");
        list.add("Sultanbeyli Devlet Hastanesi");
        list.add("Süleymaniye Kadın Doğum ve Çocuk Hastalıkları Eğitim ve Araştırma Hastanesi");
        list.add("Süreyyapaşa Göğüs Hastalıkları Eğitim ve Araştırma Hastanesi");
        list.add("Şile Devlet Hastanesi");
        list.add("Şişli Hamidiye Etfal Eğitim ve Araştırma Hastanesi");
        list.add("Taksim Eğitim ve Araştırma Hastanesi");
        list.add("Tuzla Devlet Hastanesi");
        list.add("Ümraniye Eğitim ve Araştırma Hastanesi");
        list.add("Üsküdar Devlet Hastanesi");
        list.add("Yedikule Göğüs Hastalıkları ve Göğüs Cerrahisi ");

        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position>0 && position<=91)
                {
                    Intent intent=new Intent(Dahiliye.this,doktorlar.class);
                    startActivity(intent);
                }
            }
        });


    }
}