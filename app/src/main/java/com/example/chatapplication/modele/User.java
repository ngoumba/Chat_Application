package com.example.chatapplication.modele;

public class User {
    private String nom;
    private String prenom;
    private String login;
    private Long numerotel;
    private String profil;
    private String photo;

    public User(String nom, String prenom, String login, Long numerotel) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.numerotel = numerotel;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public Long getNumerotel() {
        return numerotel;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }
}
