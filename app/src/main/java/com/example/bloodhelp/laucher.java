package com.example.bloodhelp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class laucher extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laucher);
        lottieAnimationView =findViewById(R.id.lottieAnimationView);

        new Handler().postDelayed(()->{
            animation();
        },2000);
    }

    private void animation() {
        SharedPreferences preferences = getSharedPreferences("start",MODE_PRIVATE);
        Boolean condition_passed =  preferences.getBoolean("condition_passed" ,false);
        if(condition_passed){
            Intent it = new Intent(laucher.this , MainActivity.class);
            androidx.core.util.Pair<View ,String> p1 = androidx.core.util.Pair.create(lottieAnimationView , "blood_icon");
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(laucher.this,p1);
            startActivity(it ,options.toBundle());
            finish();
        }else{
            startActivity(new Intent(laucher.this , condition.class));
            finish();
        }
    }
}