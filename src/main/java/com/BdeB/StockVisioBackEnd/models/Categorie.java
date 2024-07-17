package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;
    private String description;
}
