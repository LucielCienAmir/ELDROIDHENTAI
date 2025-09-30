package com.example.mypopup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {
    Context context;
    ArrayList<String> list;
    LayoutInflater inflater;

    public ItemAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemHolder(inflater.inflate(R.layout.itemlayout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.textView.setText(list.get(position));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup=new PopupMenu(context, view);
                popup.getMenuInflater().inflate(R.menu.mypopup,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int id = menuItem.getItemId();
                        int edit = R.id.edit;
                        int delete = R.id.delete;
                        switch (id){

                            case 2131231247:
                                Toast.makeText(context, "Edit item :"+ list.get(position),Toast.LENGTH_SHORT).show();
                                break;
                            case 2131231246:
                                Toast.makeText(context, "Delete item :"+ list.get(position),Toast.LENGTH_SHORT).show();
                        }
                        System.out.println(id );
                        return false;
                    }
                });
                popup.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size() ;
    }
}
