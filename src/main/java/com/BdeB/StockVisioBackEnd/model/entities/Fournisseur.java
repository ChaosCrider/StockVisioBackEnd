package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String codeFournisseur;
    private String nom;
    private String adresse;
    private String tel;
    private String prenom;
    private String nrc;
    private boolean statut;
    private String email;
}
