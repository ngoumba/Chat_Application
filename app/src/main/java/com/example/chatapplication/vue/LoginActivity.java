package com.example.chatapplication.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.chatapplication.R;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        ecouteInscriptionRedirect();
        ecouteConnexionbtn();
    }

    private void ecouteInscriptionRedirect() {
        ((TextView) findViewById(R.id.inscriptionRedirrect)).setOnClickListener(new TextView.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, InscriptionActivity.class);
                startActivity(intent);
            }
        });
    }

    private void ecouteConnexionbtn() {
        ((Button) findViewById(R.id.SeConnecter)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
    }
}