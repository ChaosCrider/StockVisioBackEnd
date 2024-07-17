package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;

@Entity
public class Emplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomEmplacement;
    private String descEmplacement;
    private String typeEmplacement;
    private double capaciteMax;
    private double quantiteActuelle;
    private String entrepot;
    private String statut;
    private String codeEmp;
}
