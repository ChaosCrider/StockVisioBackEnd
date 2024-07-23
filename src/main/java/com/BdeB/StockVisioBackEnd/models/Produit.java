package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String codeProduit;
    private String nom;

    @ManyToOne
    private Categorie categorie;

    @ManyToOne
    private Fournisseur fournisseur;

    private String description;
    private double seuilCritique;
    private double prixU;
    private Date dateAchat;
    private Date dateExpiration;
    private double quantite;
    private double prixVente;
}
