package com.example.chatapplication.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.chatapplication.R;
import com.google.android.material.chip.Chip;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ecouteContactBtn();
    }
    private void ecouteContactBtn() {
        ((Chip) findViewById(R.id.contactbtn)).setOnClickListener(new Chip.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MessageActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });
    }
}