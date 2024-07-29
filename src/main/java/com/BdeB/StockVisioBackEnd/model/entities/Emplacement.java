package com.BdeB.StockVisioBackEnd.model.entities;

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
    private String statut;
    private String codeEmp;
}
