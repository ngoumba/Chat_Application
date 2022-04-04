package com.example.chatapplication.modele;

public class User {
    private String id;
    private String prenom;
    private String login;
    private String numerotel;
    private String profil;

    public String getPhoto() {
        return photo;
    }

    private String photo;


    public User(String id, String prenom, String login, String numerotel, String profil, String photo) {
        this.id = id;
        this.prenom = prenom;
        this.login = login;
        this.numerotel = numerotel;
        this.profil = profil;
        this.photo = photo;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getNumerotel() {
        return numerotel;
    }

    public String getProfil() {
        return profil;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }
}
