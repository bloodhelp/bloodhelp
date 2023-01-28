package com.example.bloodhelp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Adapter_img_condition extends RecyclerView.Adapter<Adapter_img_condition.ViewH> {
    ArrayList<txt_img_condition> list_img = new ArrayList<>();

    public Adapter_img_condition(ArrayList<txt_img_condition> list_img) {
        this.list_img = list_img;
    }

    @NonNull
    @Override
    public ViewH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        View v= inflate.inflate(R.layout.layout_condition , parent , false);
        return new ViewH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewH holder, int position) {
        holder.img.setImageResource(list_img.get(position).getImg());
        holder.txt.setText(list_img.get(position).getTxt());
    }

    @Override
    public int getItemCount() {
        return list_img.size();
    }

    public class ViewH extends RecyclerView.ViewHolder{

        ImageView img ;
        TextView txt ;

        public ViewH(@NonNull View itemView) {
            super(itemView);

            img =itemView.findViewById(R.id.img);
            txt =itemView.findViewById(R.id.txt);
        }
    }
}