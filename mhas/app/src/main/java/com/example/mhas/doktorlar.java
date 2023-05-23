package com.example.mhas;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class doktorlar extends AppCompatActivity {
    GridView gridViewdoktor;
    String doktorisima[]={"AHMET KATİPOĞLU","AKİF SARI", "NİSA ATEŞ","EMİRHAN DURMUŞ","MURAT YILDIRIM","FEVZİ DURDAĞI","GİZEM GÜL",
            "FURKAN YALÇINKAYA", "EBRU GÜNDÜZ","YUSUF İNAN","ELİF GÜRBÜZ","MELEK LALE","MUHAMMED SEZGİN","SERHAT DAL","GÜL KELEBEK","SUDE DAL"
    };
    int doktorresima[]={R.drawable.erkek,R.drawable.erkek,R.drawable.kadin,R.drawable.erkek,R.drawable.erkek,R.drawable.erkek,R.drawable.kadin,
            R.drawable.erkek,R.drawable.kadin,R.drawable.erkek,R.drawable.kadin,R.drawable.kadin,R.drawable.erkek,R.drawable.erkek,R.drawable.kadin,R.drawable.kadin,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doktorlar);
        gridViewdoktor = findViewById(R.id.doktorgrid);
        dadapter adapter=new dadapter(this,doktorisima,doktorresima);
        gridViewdoktor.setAdapter(adapter);
        gridViewdoktor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position>=0 && position<=15)
                {
                    Intent intent=new Intent(doktorlar.this,notyazma.class);
                    startActivity(intent);
                }
            }
        });

    }
    class dadapter extends ArrayAdapter<String> {
        Context context;
        String disimaa[];
        int dresimaa[];
        dadapter(Context c,String baslik[],int doktorresim[]){
            super(c, R.layout.doktor,R.id.doktorisim,baslik);
            this.context=c;
            this.disimaa=baslik;
            this.dresimaa=doktorresim;




        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View satir=layoutInflater.inflate(R.layout.doktor,parent,false);
            ImageView resim=satir.findViewById(R.id.doktorresim);
            TextView benimbaslik=satir.findViewById(R.id.doktorisim);

            resim.setImageResource(dresimaa[position]);
            benimbaslik.setText(disimaa[position]);


            return satir;
        }
    }
}