package com.example.bloodhelp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bloodhelp.adapters.adapter_offre;

public class fragementmenuactivity extends Fragment {

    RecyclerView rec ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_fragementmenuactivity, container, false);
        GridLayoutManager g = new GridLayoutManager(v.getContext() , 1);
        rec = v.findViewById(R.id.rec);
        rec.setLayoutManager(g);
        rec.setAdapter(new adapter_offre());
        return v;
    }
}