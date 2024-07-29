package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;
    private String description;

}

