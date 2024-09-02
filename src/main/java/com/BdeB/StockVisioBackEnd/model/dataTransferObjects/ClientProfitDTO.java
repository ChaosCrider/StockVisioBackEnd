package com.BdeB.StockVisioBackEnd.model.dataTransferObjects;

public class ClientProfitDTO {
    private String nom;
    private int id;
    private Double profits;

    // Constructor
    public ClientProfitDTO(String name, int id, Double ventes) {
        this.nom = name;
        this.id = id;
        this.profits = ventes;
    }

    public ClientProfitDTO(String name, int id, long ventes) {
        this.nom = name;
        this.id = id;
        this.profits = Double.longBitsToDouble(ventes);
    }

    // Getters and setters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getProfits() {
        return profits;
    }

    public void setProfits(Double profits) {
        this.profits = profits;
    }
}