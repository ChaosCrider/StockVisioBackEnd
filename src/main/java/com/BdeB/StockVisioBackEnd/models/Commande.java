package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String statut;
    private Date date;
    private String codeCommande;
    private double quantite;
}
