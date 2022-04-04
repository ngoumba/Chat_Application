package com.example.chatapplication.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.chatapplication.R;
import com.example.chatapplication.adapter.ListAmisAdapter;
import com.example.chatapplication.databinding.FragmentAmisBinding;
import com.example.chatapplication.modele.Contacts;
import com.example.chatapplication.modele.User;
import com.example.chatapplication.vue.ContactActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import okhttp3.internal.cache.DiskLruCache;

public class AmisFragment extends Fragment {


    public AmisFragment() {
        // Required empty public constructor
    }
    FragmentAmisBinding binding;
    ArrayList<User> mesamis = new ArrayList<>();
    ArrayList<Contacts> mescontacts = new ArrayList<>();
    FirebaseDatabase db;
    ContactActivity ca;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentAmisBinding.inflate(inflater,container,false);
        db = FirebaseDatabase.getInstance();

        ListAmisAdapter adapter = new ListAmisAdapter(mesamis,getContext());
        binding.contactRecycleView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
       binding.contactRecycleView.setLayoutManager(layoutManager);

       db.getReference().child("user").addValueEventListener(new ValueEventListener(){

           @Override
           public void onDataChange(@NonNull DataSnapshot snapshot){
               mesamis.clear();
               mescontacts = ca.recupContacts();
               for(Contacts c : mescontacts) {
                   for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                       User user = dataSnapshot.getValue(User.class);
                       user.setId(dataSnapshot.getKey());

                       if (c.getNumerotel().equals(user.getNumerotel())){
                           mesamis.add(user);
                       }

                   }
               }
           }

           @Override
           public void onCancelled(@NonNull DatabaseError error) {

           }
       });
        return binding.getRoot();
    }
}