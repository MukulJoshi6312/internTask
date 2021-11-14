package com.example.interntask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class UpComingAdapter extends RecyclerView.Adapter<UpComingAdapter.ViewHolder> {

    Context context;
    ArrayList<UpcomingModel> list;

    public UpComingAdapter(Context context, ArrayList<UpcomingModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public UpComingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.upcoming_rv_sample,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UpComingAdapter.ViewHolder holder, int position) {
        UpcomingModel model = list.get(position);
        holder.userImage.setImageResource(model.getUserImage());
        holder.senderName.setText(model.getSendName());
        holder.name.setText(model.getName());
        holder.toYou.setText(model.getToYou());
        holder.date.setText(model.getDate());
        holder.rupee.setText(model.getRupee());
        holder.rupeeSymbol.setImageResource(model.getRupeeSymobl());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView userImage,rupeeSymbol;
        private TextView senderName,name,toYou,rupee,date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.profile_image);
            senderName = itemView.findViewById(R.id.senderName);
            name = itemView.findViewById(R.id.name);
            toYou = itemView.findViewById(R.id.toYou);
            date = itemView.findViewById(R.id.textDate);
            rupee = itemView.findViewById(R.id.textRupee);
            rupeeSymbol = itemView.findViewById(R.id.rupeeSymbol);

        }
    }

}
