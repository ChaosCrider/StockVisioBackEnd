package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Utilisateur utilisateur;
    private String statut;
    private Date date;
    private String codeCommande;
    private double quantite;
}
