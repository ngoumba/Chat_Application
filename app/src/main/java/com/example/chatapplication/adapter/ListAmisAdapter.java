package com.example.chatapplication.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatapplication.R;
import com.example.chatapplication.modele.Contacts;
import com.example.chatapplication.modele.User;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListAmisAdapter extends RecyclerView.Adapter<ListAmisAdapter.ViewHolder> {
    private ArrayList<User> mesAmis;
    Context context;

    public ListAmisAdapter(ArrayList<User> mesAmis, Context context) {
        this.mesAmis = mesAmis;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_uncontact,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = mesAmis.get(position);
        Picasso.get().load(user.getPhoto()).placeholder(R.drawable.user).into(holder.imgprofil);
        holder.prenom.setText(user.getPrenom());
        holder.desc.setText(user.getProfil());
    }

    @Override
    public int getItemCount() {
        return mesAmis.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgprofil;
        TextView prenom,desc;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imgprofil = itemView.findViewById(R.id.profile_image);
            prenom = itemView.findViewById(R.id.contactList);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}

