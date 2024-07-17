package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Alertes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private Date dateCreation;

    @ManyToOne
    private Produit produit;

    private double seuilDeclenchement;
    private String message;
    private String statut;
    private Date dateResolution;
    private String priorite;
}
