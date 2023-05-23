package com.example.mhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class KalpDamar extends AppCompatActivity {
        SearchView searchView;
        ListView listView;
        ArrayList<String> list;
        ArrayAdapter<String> adapter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_kalp_damar);
            searchView=(SearchView) findViewById(R.id.kalparama);
            listView=(ListView) findViewById(R.id.kalplist);
            list=new ArrayList<>();

            adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
            listView.setAdapter(adapter);
            list.add("Arnavutköy Devlet Hastanesi");
            list.add("Avcılar Hospital");
            list.add("Avcılar Murat Kölük Devlet Hastanesi");
            list.add("Bağcılar Eğitim ve Araştırma Hastanesi");
            list.add("Bahçelievler Devlet Hastanesi");
            list.add("Bakırköy Dr. Sadi Konuk Eğitim ve Araştırma Hastanesi");
            list.add("Başakşehir Çam ve Sakura Şehir Hastanesi");
            list.add("Başkent Üniversitesi İstanbul Hastanesi");
            list.add("Bayrampaşa Devlet Hastanesi");
            list.add("Beykoz Devlet Hastanesi");
            list.add("Bezmialem Vakıf Üniversitesi Tıp Fakültesi Hastanesi");
            list.add("Doğan Hastanesi");
            list.add("Dr. İsmail Niyazi Kurtulmuş Hastanesi");
            list.add("Dr. Siyami Ersek Göğüs Kalp ve Damar Cerrahisi Eğitim ve Araştırma Hastanesi");
            list.add("Eyüpsultan Devlet Hastanesi");
            list.add("Fatih Sultan Mehmet Eğitim ve Araştırma Hastanesi");
            list.add("Fatih Üniversitesi Tıp Fakültesi Maltepe Hastanesi");
            list.add("Gaziosmanpaşa Eğitim ve Araştırma Hastanesi");
            list.add("Göztepe Prof. Dr. Süleyman Yalçın Şehir Hastanesi");
            list.add("Haseki Eğitim ve Araştırma Hastanesi");
            list.add("İstanbul Eğitim ve Araştırma Hastanesi Samatya Polikliniği");
            list.add("İstanbul Üniversitesi Cerrahpaşa Tıp Fakültesi Hastanesi");
            list.add("İstinye Üniversite Hastanesi");
            list.add("Kanuni Sultan Süleyman Eğitim ve Araştırma Hastanesi");
            list.add("Kartal Koşuyolu Yüksek İhtisas Eğitim ve Araştırma Hastanesi");
            list.add("Koç Üniversitesi Hastanesi");
            list.add("Liv Hospital Ulus");
            list.add("Maltepe Üniversitesi Tıp Fakültesi Hastanesi");
            list.add("Marmara Üniversitesi İstanbul Pendik Eğitim ve Araştırma Hastanesi");
            list.add("Medical Park Bahçelievler Hastanesi");
            list.add("Medicana Bahçelievler Hastanesi");
            list.add("Medicine Hospital");
            list.add("Medipol Mega Üniversite Hastanesi");
            list.add("Medivita İncirli Hastanesi");
            list.add("Mehmet Akif Ersoy Göğüs Kalp ve Damar Cerrahisi Eğitim ve Araştırma Hastanesi");
            list.add("Memorial Ataşehir Hastanesi");
            list.add("Okmeydanı Eğitim ve Araştırma Hastanesi");
            list.add("Özel Avicenna Hastanesi");
            list.add("Pendik Devlet Hastanesi");
            list.add("Prof. Dr. Cemil Taşcıoğlu Şehir Hastanesi");
            list.add("Sancaktepe Şehit Prof. Dr. İlhan Varank Eğitim ve Araştırma Hastanesi");
            list.add("Sultan 2.Abdülhamid Han Eğitim ve Araştırma Hastanesi");
            list.add("Süreyyapaşa Göğüs Hastalıkları Eğitim ve Araştırma Hastanesi");
            list.add("Taksim Eğitim ve Araştırma Hastanesi");
            list.add("Ümraniye Eğitim ve Araştırma Hastanesi");
            list.add("Üsküdar Devlet Hastanesi");
            list.add("Yedikule Göğüs Hastalıkları ve Göğüs Cerrahisi Eğitim Araştırma Hastanesi");
            list.add("Yeni Yüzyıl Üniversitesi Gaziosmanpaşa Hastanesi");
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
                    if (position>=0 && position<=47)
                    {
                        Intent intent=new Intent(KalpDamar.this,doktorlar.class);
                        startActivity(intent);
                    }
                }
            });


        }
}