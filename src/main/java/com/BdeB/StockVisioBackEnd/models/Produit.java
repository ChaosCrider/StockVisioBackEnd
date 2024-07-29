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
    private String description;
    private double seuilCritique;
    private double prixU;
    private Date dateAchat;
    private Date dateExpiration;
    private double quantiteEnStock;
    private double quantiteMaximale;
    private double prixVente;
}
