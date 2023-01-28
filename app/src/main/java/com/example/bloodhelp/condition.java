package com.example.bloodhelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator3;


public class condition extends AppCompatActivity {

        ViewPager2 viewPager;
        CircleIndicator3 indecateur3;
        Button txt_next;

        ArrayList<txt_img_condition> li = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
        getlocal();
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_condition);
            getSupportActionBar().hide();
            viewPager = findViewById(R.id.viewPager);
            indecateur3 = findViewById(R.id.indecateur3);
            txt_next = findViewById(R.id.txt_next);
            li.add(new txt_img_condition(R.drawable.img1,"Toute personne agée de < 18 and et de > 70 ans, aui pése moins de 50 kg." ));
            li.add(new txt_img_condition(R.drawable.img2,"Tatouages ou piercings (boucles d'oreilles comprises) datant de moins de 4 mois."));
            li.add(new txt_img_condition(R.drawable.img3,"Relation sexuelle avec plusieurs partenaires différents au cours des 4 derniers mois."));
            li.add(new txt_img_condition(R.drawable.img4,"Séjour dans une région ou peuvent sévir certaines maladies (Asie, Amérique du sud, Afrique sauf Maghreb)," +
                    " et OPEX Barkhane, au cours 4 des derniéres mois."));
            Adapter_img_condition adapter = new Adapter_img_condition(li);
            viewPager.setAdapter(adapter);
            indecateur3.setViewPager(viewPager);
            txt_next.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceType")
                @Override
                public void onClick(View v) {
                    if(viewPager.getCurrentItem() +1 < adapter.getItemCount()){
                        viewPager.setCurrentItem(viewPager.getCurrentItem() +1);
                    }else{
                        SharedPreferences.Editor preferences = (SharedPreferences.Editor) getSharedPreferences("start" ,MODE_PRIVATE ).edit();
                        preferences.putBoolean("condition_passed" ,true).apply();
                        startActivity(new Intent(condition.this , MainActivity.class));
                    }
                }
            });
        }

    private void getlocal() {
        SharedPreferences preferences = getSharedPreferences("start",MODE_PRIVATE);
        Boolean condition_passed =  preferences.getBoolean("condition_passed" ,false);
        if(condition_passed){
            startActivity(new Intent(condition.this , laucher.class));
        }
        else{
            Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
        }
    }
}