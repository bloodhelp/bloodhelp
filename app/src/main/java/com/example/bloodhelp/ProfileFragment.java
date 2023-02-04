package com.example.bloodhelp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.imageview.ShapeableImageView;


public class ProfileFragment extends Fragment {

    BottomNavigationView bottomnavigation;
    CardView cardView;
    ImageView imageView;
    TextView textView3;
    com.google.android.material.imageview.ShapeableImageView ShapeableImageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_profile, container, false);
        ShapeableImageView = v.findViewById(R.id.shapeableImageView);
        textView3 = v.findViewById(R.id.textView3);
        imageView = v.findViewById(R.id.imageView);
        cardView = v.findViewById(R.id.cardView);
        cardView.setZ(0);
        ShapeableImageView.bringToFront();
        imageView.bringToFront();
        textView3.bringToFront();
        bottomnavigation = v.findViewById(R.id.bottomnavigation);
        bottomnavigation.setSelectedItemId(R.id.archifement);
        getParentFragmentManager().beginTransaction().replace(R.id.body_ , new archivement()).commit();
        bottomnavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment f = null;
                switch (item.getItemId()){
                    case R.id.archifement:
                        f = new archivement();
                        break;
                    case R.id.activitymenu:
                        f = new fragementmenuactivity();
                        break;
                }
                getParentFragmentManager().beginTransaction().replace(R.id.body_ , f).commit();
                return true;
            }
        });
        return v;

    }
}