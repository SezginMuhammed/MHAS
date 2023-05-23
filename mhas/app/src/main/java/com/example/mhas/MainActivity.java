package com.example.mhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView=(SearchView) findViewById(R.id.hastalikarama);
        listView=(ListView) findViewById(R.id.hastaliklist);
        list=new ArrayList<>();
        list.add("Nezle");
        list.add("Boğaz ağrısı");
        list.add("Burun akıntısı");
        list.add("Kulak iltihabı");
        list.add("Sinüzit");
        list.add("Kulak ağrısı");
        list.add("İşitme kaybı");
        list.add("Burun eğriliği");
        list.add("Horlama");
        list.add("Kulak akıntısı");
        list.add("Uçuk");
        list.add("Baş dönmesi");
        list.add("Kulaktan kan gelmesi");
        list.add("Burunda şekil bozukluğu");
        list.add("Aft");
        list.add("Kulak çınlaması");
        list.add("Tükürük bezi hastalıkları");
        list.add("Saman nezlesi(yaz aylarında görülür)");
        list.add("Burundan kan gelmesi");
        list.add("Çene eklem rahatsızlıkları");
        list.add("Karın ağrısı");
        list.add("Mide ağrısı");
        list.add("Göğüs ağrısı ( sol kol ağrısı)");
        list.add("Sık idrara çıkma");
        list.add("Ağız kuruluğu");
        list.add("Gastrit");
        list.add("Terleme");
        list.add("Tansiyon");
        list.add("Midede ekşime");
        list.add("İshal ve kabızlık");
        list.add("Çarpıntı");
        list.add("Göğüs ağrısı");
        list.add("Damar");
        list.add("Kalp");
        list.add("Damar sertliği");
        list.add("Bacaklarda veya bacak damarlarında siyahlaşma");
        list.add("Ayaklarda morarma");
        list.add("Karın bölgesinde oluşan ağrı ve şişlik");
        list.add("Apandisit");
        list.add("Memede ağrı ve kollara doğru yayılan ağrı");
        list.add("Memede ele gelen sertlik");
        list.add("Basur");
        list.add("Hemoroid");
        list.add("Gangren");
        list.add("Karaciğer");
        list.add("Mide");
        list.add("İnce ve kalın bağırsak");
        list.add("Hipertiroidi");
        list.add("Tiroid bezi rahatsızlıkları");
        list.add("Vücutta bulunan et beni veya yağ bezeleri");
        list.add("Büyük dışkı ile kan gelmesi");
        list.add("Kasıkta ağrı ve şişlik");
        list.add("Uzun süren ishal ve ya kabızlık");
        list.add("Karında doygunluk hissi ve bağırsak gazları");
        list.add("Halsizlik");
        list.add("Yorgunluk");
        list.add("Grip");
        list.add("Sarılık");
        list.add("İdrarda koyulaşma");
        list.add("İştahsızlık ve bulantı");
        list.add("Kabakulak");
        list.add("Hayvanlar tarafından ısırılma");
        list.add("Karın ağrısı ve ishal");
        list.add("Büyük dışkıda parazit ve tenya");
        list.add("Öksürük");
        list.add("Sarılık");
        list.add("Kene sokması");
        list.add("Vücuda paslı metal batması");
        list.add("Ayak veya bacakta şişlik, ağrı");
        list.add("Unutkanlık");
        list.add("Hafıza kaybı");
        list.add("Ellerde titreme");
        list.add("Baş ağrısı");
        list.add("Kol ve bacakta uyuşma");
        list.add("Parmaklarda oluşan uyuşukluk");
        list.add("Baş dönmesi");
        list.add("Kasılma");
        list.add("Vücudun sağ veya sol tarafında uyuşukluk");
        list.add("Felç");
        list.add("Nezle");
        list.add("Çift görme");
        list.add("Bunama");
        list.add("İstemsiz hareket");
        list.add("Denge problemi");
        list.add("Yüz ağrısı");
        list.add("Vücutta seğirme");
        list.add("Akne ve sivilce");
        list.add("Deri kanseri");
        list.add("Ağız içinde yara oluşumu");
        list.add("Bel soğukluğu");
        list.add("Egzama");
        list.add("Mantar");
        list.add("Saç dökülmesi");
        list.add("Alerjik deri hastalıkları");
        list.add("Nasır");
        list.add("Siğil");
        list.add("Uçuk");
        list.add("Zona");
        list.add("Deride meydana gelen renk değişikliği");
        list.add("Kaşıntı");
        list.add("Geçmeyen deri yaraları");
        list.add("Cilt lekeleri");
        list.add("Tırnak bozukluğu");
        list.add("Çiller, benler ve doğum lekeleri");
        list.add("Kıl dönmesi ve aşırı kıllanma");
        list.add("Koltuk altı ve ayak terlemesi");
        list.add("Eklem yerlerinde oluşan ağrılar");
        list.add("Yağmurlu havalarda oluşan eklem ağrıları");
        list.add("Omurga ve omuz romatizma");
        list.add("Ayak bileği burkulması");
        list.add("Boyun, bel, kalça ve bacak ağrıları");
        list.add("Kas ve kemik ağrısı");
        list.add("Lif kopması");
        list.add("Topuk dikeni");
        list.add("Siyatik");
        list.add("Kısırlık");
        list.add("İktidarsızlık");
        list.add("Erken boşalma");
        list.add("İdrar yolunda yanma ve akıntı");
        list.add("Sık idrara çıkma");
        list.add("Böbrek taşı");
        list.add("Testis ağrısı");
        list.add("Kanlı idrar");
        list.add("Penis hastalıkları");
        list.add("Uzak ve yakını görme güçlüğü");
        list.add("Göz kuruluğu");
        list.add("Ani görme kaybı");
        list.add("Işık çakmaları");
        list.add("Göz ağrısı ve batma");
        list.add("Çapaklanma");
        list.add("İshal, bulantı ve kusma");
        list.add("Kabızlık");
        list.add("İrritabıl barsak sendromu");
        list.add("Asit reflüsü");
        list.add("Aşırı geğirme");
        list.add("Midede yanma ve ekşime");
        list.add("Safra kesesi ve yolları hastalıkları");
        list.add("Karaciğer hastalıkları");
        list.add("Pankreas hastalıkları");
        list.add("Hepatitler");
        list.add("Bel ve boyun ağrısı");
        list.add("Dizde kireçlenme");
        list.add("Fibromiyalji");
        list.add("Osteoporoz (kemik erimesi)");
        list.add("Felçli hastalar");
        list.add("Romatizmal hastalıklar");
        list.add("El, bilek, dirsek ve kol ağrısı");

        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String a) {
                adapter.getFilter().filter(a);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position<=19)
                {
                    Intent intent=new Intent(MainActivity.this, Kulakbb.class);
                    startActivity(intent);

                }
                else if (position>19 && position<=29)
                {
                    Intent intent=new Intent(MainActivity.this,Dahiliye.class);
                    startActivity(intent);
                }
                else if (position>29 && position<=36)
                {
                    Intent intent=new Intent(MainActivity.this,KalpDamar.class);
                    startActivity(intent);
                }
                else if (position>36 && position<=53)
                {
                    Intent intent=new Intent(MainActivity.this,Hariciye.class);
                    startActivity(intent);
                }
                else if (position>53 && position<=68)
                {
                    Intent intent=new Intent(MainActivity.this,Enfeksiyon.class);
                    startActivity(intent);
                }
                else if (position>68 && position<=85)
                {
                    Intent intent=new Intent(MainActivity.this,Norolog.class);
                    startActivity(intent);
                }
                else if (position>85 && position<=105)
                {
                    Intent intent=new Intent(MainActivity.this,dermatolog.class);
                    startActivity(intent);
                }
                else if (position>105 && position<=114)
                {
                    Intent intent=new Intent(MainActivity.this,Ortopedi.class);
                    startActivity(intent);
                }
                else if (position>114 && position<=123)
                {
                    Intent intent=new Intent(MainActivity.this,Urolog.class);
                    startActivity(intent);
                }
                else if (position>123 && position<=129)
                {
                    Intent intent=new Intent(MainActivity.this,goz.class);
                    startActivity(intent);
                }
                else if (position>129 && position<=139)
                {
                    Intent intent=new Intent(MainActivity.this,Gastroen.class);
                    startActivity(intent);
                }
                else if (position>139 && position<=146)
                {
                    Intent intent=new Intent(MainActivity.this,Fizik.class);
                    startActivity(intent);
                }


            }
        });


    }
}