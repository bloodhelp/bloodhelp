package com.example.bloodhelp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class createaccount extends AppCompatActivity {

    TextInputLayout txt_bloodtype;
    AutoCompleteTextView dropdown_text;
    Button create;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        create =findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loading();
            }
        });
        txt_bloodtype =findViewById(R.id.txt_bloodtype);
        dropdown_text =findViewById(R.id.autodropdwon);
        String[] items = new String[]{"A+", "A-", "O+", "0-",
                "B+", "B-", "AB+", "AB-"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.dropdown_item,
                items );

        dropdown_text.setAdapter(adapter);
    }

    private void loading() {
        Dialog diyalog = new Dialog(this);
        diyalog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        diyalog.setContentView(R.layout.loading);
        diyalog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        diyalog.show();
        new Handler().postDelayed(()->{
            diyalog.dismiss();
            Toast.makeText(this, "Compte crée", Toast.LENGTH_SHORT).show();
            finish();
        } ,5000);
    }
}