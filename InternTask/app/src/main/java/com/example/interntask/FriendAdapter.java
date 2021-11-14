package com.example.interntask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder>{

    Context context;
    ArrayList<FriendModel> list;

    public FriendAdapter(Context context, ArrayList<FriendModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.friend_sample,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        FriendModel model = list.get(position);
        holder.profile.setImageResource(model.getProfile());
        holder.rupee.setImageResource(model.getRupee());
        holder.name.setText(model.getName());
        holder.status.setText(model.getStatus());
        holder.money.setText(model.getMoney());
        holder.due.setText(model.getDue());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,Screen4.class);
                intent.putExtra("image",model.getProfile());
                intent.putExtra("name",model.getName());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView profile,rupee;
        TextView name,status,money,due;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.profile_image);
            rupee = itemView.findViewById(R.id.rupee);
            name = itemView.findViewById(R.id.userName);
            status = itemView.findViewById(R.id.status);
            money = itemView.findViewById(R.id.money);
            due = itemView.findViewById(R.id.due);

        }
    }
}
