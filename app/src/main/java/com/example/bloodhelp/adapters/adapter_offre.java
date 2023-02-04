package com.example.bloodhelp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bloodhelp.R;

public class adapter_offre extends RecyclerView.Adapter<adapter_offre.viewholder1>  {

    @NonNull
    @Override
    public viewholder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_offre , parent , false);
        return new viewholder1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder1 holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class viewholder1 extends RecyclerView.ViewHolder{

        public viewholder1(@NonNull View itemView) {
            super(itemView);
        }
    }
}
