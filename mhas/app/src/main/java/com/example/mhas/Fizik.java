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

public class Fizik extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizik);
        searchView = (SearchView) findViewById(R.id.farama);
        listView = (ListView) findViewById(R.id.flist);
        list = new ArrayList<>();
        list.add("Arnavutköy Devlet Hastanesi");
        list.add("Avcılar Hospital");
        list.add("Avcılar Murat Kölük Devlet Hastanesi");
        list.add("Bağcılar Eğitim ve Araştırma Hastanesi");
        list.add("Bakırköy Dr. Sadi Konuk Eğitim ve Araştırma Hastanesi");
        list.add("Başakşehir Çam ve Sakura Şehir Hastanesi");
        list.add("Başakşehir Devlet Hastanesi");
        list.add("Başkent Üniversitesi İstanbul Hastanesi");
        list.add("Bayrampaşa Devlet Hastanesi");
        list.add("Beşiktaş Sait Çiftçi Devlet Hastanesi");
        list.add("Beykoz Devlet Hastanesi");
        list.add("Beylikdüzü Devlet Hastanesi");
        list.add("Bezmialem Vakıf Üniversitesi Tıp Fakültesi Hastanesi");
        list.add("Büyükada Dr. Lütfi Kırdar Şehir Hastanesi");
        list.add("Büyükçekmece Kolan Hospital");
        list.add("Büyükçekmece Mimar Sinan Devlet Hastanesi");
        list.add("Çekmeköy Devlet Hastanesi");
        list.add("Doğan Hastanesi");
        list.add("Dr. İsmail Niyazi Kurtulmuş Hastanesi");
        list.add("Dr. Sadi Konuk Eğitim Araştırma Hastanesi Bahçelievler Semt Polikliniği");
        list.add("Dr. Siyami Ersek Göğüs Kalp ve Damar Cerrahisi Eğitim ve Araştırma Hastanesi");
        list.add("Erenköy Fizik Tedavi ve Rehabilitasyon Hastanesi");
        list.add("Esenyurt Necmi Kadıoğlu Devlet Hastanesi");
        list.add("Eyüpsultan Devlet Hastanesi");
        list.add("Fatih Sultan Mehmet Eğitim ve Araştırma Hastanesi");
        list.add("Fatih Üniversitesi Tıp Fakültesi Maltepe Hastanesi");
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
        list.add("İstanbul Üniversitesi Cerrahpaşa Tıp Fakültesi Hastanesi");
        list.add("İstinye Devlet Hastanesi");
        list.add("İstinye Üniversite Hastanesi");
        list.add("Kağıthane Devlet Hastanesi");
        list.add("Kartal Dr. Lütfi Kırdar Şehir Hastanesi");
        list.add("Kartal Koşuyolu Yüksek İhtisas Eğitim ve Araştırma Hastanesi");
        list.add("Kasımpaşa Asker Hastanesi");
        list.add("Koç Üniversitesi Hastanesi");
        list.add("Levent Hastanesi");
        list.add("Liv Hospital Ulus");
        list.add("Maltepe Devlet Hastanesi");
        list.add("Maltepe Üniversitesi Tıp Fakültesi Hastanesi");
        list.add("Marmara Üniversitesi İstanbul Pendik Eğitim ve Araştırma Hastanesi");
        list.add("Medical Park Bahçelievler Hastanesi");
        list.add("Medicana Bahçelievler Hastanesi");
        list.add("Medicine Hospital");
        list.add("Medilife Beylikdüzü Hastanesi");
        list.add("Medipol Mega Üniversite Hastanesi");
        list.add("Medivita İncirli Hastanesi");
        list.add("Memorial Ataşehir Hastanesi");
        list.add("Metin Sabancı Baltalimanı Kemik Hastalıkları Eğitim ve Araştırma Hastanesi");
        list.add("Okmeydanı Eğitim ve Araştırma Hastanesi");
        list.add("Özel Avicenna Hastanesi");
        list.add("Özel Gazi Hastanesi");
        list.add("Özel Güngören Hastanesi");
        list.add("Pendik Devlet Hastanesi");
        list.add("Prof. Dr. Cemil Taşcıoğlu Şehir Hastanesi");
        list.add("Prof. Dr. Mazhar Osman Ruh Sağlığı ve Sinir Hastalıkları Eğitim ve Araştırma Hastanesi");
        list.add("Rami Hastanesi");
        list.add("Sancaktepe Şehit Prof. Dr. İlhan Varank Eğitim ve Araştırma Hastanesi");
        list.add("Silivri Devlet Hastanesi");
        list.add("Sultan 2.Abdülhamid Han Eğitim ve Araştırma Hastanesi");
        list.add("Sultanbeyli Devlet Hastanesi");
        list.add("Süreyyapaşa Göğüs Hastalıkları Eğitim ve Araştırma Hastanesi");
        list.add("Şişli Hamidiye Etfal Eğitim ve Araştırma Hastanesi");
        list.add("Taksim Eğitim ve Araştırma Hastanesi");
        list.add("Tuzla Devlet Hastanesi");
        list.add("Üsküdar Devlet Hastanesi");
        list.add("Yedikule Göğüs Hastalıkları ve Göğüs Cerrahisi Eğitim Araştırma Hastanesi");
        list.add("Yeni Yüzyıl Üniversitesi Gaziosmanpaşa Hastanesi");
        list.add("Yenibosna Safa Hastanesi");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
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
                if (position>=0 && position<=76)
                {
                    Intent intent=new Intent(Fizik.this,doktorlar.class);
                    startActivity(intent);
                }
            }
        });


    }
}
