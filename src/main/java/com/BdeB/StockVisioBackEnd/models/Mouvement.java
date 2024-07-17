package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Mouvement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date dateOperation;

    @ManyToOne
    private Produit produit;

    private double quantite;
}
