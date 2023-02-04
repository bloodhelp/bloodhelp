package com.example.bloodhelp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.bloodhelp.adapters.adapter_donation;

public class archivement extends Fragment  {

    ProgressBar progress1;
    int pross =0 ;
    RecyclerView rec;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_archivement, container, false);
        progress1 = v.findViewById(R.id.progress1);
        rec = v.findViewById(R.id.rec);
        GridLayoutManager g =new GridLayoutManager(v.getContext() , 1);
        rec.setLayoutManager(g);
        rec.setAdapter(new adapter_donation());
        new Thread(()->{
            while (pross < 60){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pross++;
                progress1.setProgress(pross);
            }

        }).start();
        return v;
    }
}