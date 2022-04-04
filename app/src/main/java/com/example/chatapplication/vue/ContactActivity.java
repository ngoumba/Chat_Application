package com.example.chatapplication.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;

import com.example.chatapplication.R;
import com.example.chatapplication.adapter.FragmentAdapter;
import com.example.chatapplication.databinding.ActivityContactBinding;
import com.example.chatapplication.modele.Contacts;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    ActivityContactBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        binding.tablayout.setupWithViewPager(binding.viewPager);
        //setContentView(R.layout.activity_contact);
    }

    @SuppressLint("Range")
    public ArrayList<Contacts> recupContacts(){
        ArrayList<Contacts> contacts = new ArrayList<>() ;
        ContentResolver contentResolver = this.getContentResolver();
        Cursor cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_ALTERNATIVE,
                        ContactsContract.CommonDataKinds.Phone.NUMBER}, null ,null, null);

        if(cursor == null ){
            Log.d("recuperation contacts" , "erreur");
        }
        else{
            while (cursor.moveToNext()){
                Contacts contact = new Contacts();
                contact.setPrenom(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_ALTERNATIVE)));
                contact.setNumerotel(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_ALTERNATIVE)));
                contacts.add(contact);
            }
            cursor.close();
        }
        return contacts;
    }
}