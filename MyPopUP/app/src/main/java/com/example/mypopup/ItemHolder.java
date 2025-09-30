package com.example.mypopup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemHolder extends RecyclerView.ViewHolder {
    TextView textView;
    ImageView imageView;


    public ItemHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.textView);
        imageView=itemView.findViewById(R.id.imageView);
    }
}
