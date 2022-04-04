package com.example.chatapplication.modele;

import android.content.ContentResolver;

public class Contacts {

    public Contacts() {
    }

    private String prenom;
    private String numerotel;


    public Contacts(String prenom, String numerotel) {
        this.prenom = prenom;
        this.numerotel = numerotel;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumerotel() {
        return numerotel;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumerotel(String numerotel) {
        this.numerotel = numerotel;
    }
}
