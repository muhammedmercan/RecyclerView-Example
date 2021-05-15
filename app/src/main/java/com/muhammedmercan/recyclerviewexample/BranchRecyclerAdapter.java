package com.muhammedmercan.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BranchRecyclerAdapter extends RecyclerView.Adapter<BranchRecyclerAdapter.MyViewHolder> {

    private ArrayList<Branch> branches;

    private Context context;

    public BranchRecyclerAdapter(ArrayList<Branch> branches, Context context) {
        this.branches = branches;
        this.context = context;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtPuan, txtSıralama;
        ImageView imgLogo;
        private CardView parent;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtPuan = itemView.findViewById(R.id.txtPuan);
            txtSıralama = itemView.findViewById(R.id.txtSıralama);
            imgLogo = itemView.findViewById(R.id.imgLogo);
            parent = itemView.findViewById(R.id.parent);

        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txtName.setText(branches.get(position).getTxtName());
        holder.txtPuan.setText(branches.get(position).getTxtPuan());
        holder.txtSıralama.setText(branches.get(position).getTxtSıralama());
        holder.imgLogo.setImageResource(branches.get(position).getLogo());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "BASTIN KARDEŞ", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return branches.size();
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
        notifyDataSetChanged();
    }
}
