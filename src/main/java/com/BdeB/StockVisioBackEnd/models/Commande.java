package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

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
