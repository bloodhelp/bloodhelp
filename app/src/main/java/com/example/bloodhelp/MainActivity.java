package com.example.bloodhelp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ContentInfoCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputLayout;

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class MainActivity extends AppCompatActivity {

    TextView create_account;
    LottieAnimationView lottieAnimationView;
    TextInputLayout txt_email_layout;
    TextInputLayout txt_password_layout;
    ScrollView scroll;
    Button login_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        scroll =findViewById(R.id.scroll);
        lottieAnimationView =findViewById(R.id.lottieAnimationView);
        txt_email_layout =findViewById(R.id.txt_email_layout);
        txt_password_layout =findViewById(R.id.txt_password_layout);
        create_account =findViewById(R.id.create_account);
        login_btn =findViewById(R.id.login_btn);
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this , createaccount.class);
                androidx.core.util.Pair<View ,String> p1 = androidx.core.util.Pair.create(lottieAnimationView , "blooddonation_logo");
                androidx.core.util.Pair<View ,String> p2 = androidx.core.util.Pair.create(txt_email_layout , "txt_email_layout");
                androidx.core.util.Pair<View ,String> p3 = androidx.core.util.Pair.create(txt_password_layout , "txt_password_layout");
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,p1,p2,p3);
                startActivity(it ,options.toBundle());
            }
        });
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this , homme.class);
                startActivity(it);
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}