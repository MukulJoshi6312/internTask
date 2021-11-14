package com.example.interntask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    Context context;
    ArrayList<userModel> list;
    boolean show;

    public UserAdapter(Context context, ArrayList<userModel> list,boolean show) {
        this.context = context;
        this.list = list;
        this.show = show;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_sample,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        userModel model = list.get(position);

            holder.userImage.setImageResource(model.getUserImage());
            holder.userName.setText(model.getUserName());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context.getApplicationContext(), "Clicked position "+model.getUserName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context,Screen4.class);
                intent.putExtra("image",model.getUserImage());
                intent.putExtra("name",model.getUserName());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }


    @Override
    public int getItemCount() {

        if (show==false){
            return  4;
        }else {
            return list.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView userImage;
        TextView userName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.profile_image);
            userName = itemView.findViewById(R.id.userName);
        }
    }
}
