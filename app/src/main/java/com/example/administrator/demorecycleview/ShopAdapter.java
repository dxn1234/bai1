package com.example.administrator.demorecycleview;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHo>{
    ArrayList<Shop>shops;
    Context context;

    public ShopAdapter(ArrayList<Shop> shops, Context context) {
        this.shops = shops;
        this.context = context;
    }

    @Override
    public ViewHo onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.item_row,parent,false);
        return new ViewHo(view);
    }

    @Override
    public void onBindViewHolder(ViewHo holder, int position) {
        holder.imgHinh.setImageResource(shops.get(position).hinh);
        holder.txtName.setText(shops.get(position).name);
    }

    @Override
    public int getItemCount() {
        return shops.size();
    }

    public class ViewHo extends RecyclerView.ViewHolder{
        TextView txtName;
        ImageView imgHinh;
        public ViewHo(View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txt_name);
            imgHinh=itemView.findViewById(R.id.img_hinh);
        }
    }
}
