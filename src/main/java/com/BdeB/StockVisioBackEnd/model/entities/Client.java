package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String codeClient;
    private String categorie;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String email;
    private boolean statut;

    private String nrc;
}
