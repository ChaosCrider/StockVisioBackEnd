package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;

@Entity
public class LigneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Produit produit;

    private double quantite;

    @ManyToOne
    private Commande commande;
}
