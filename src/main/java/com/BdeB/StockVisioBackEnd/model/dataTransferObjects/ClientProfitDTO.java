package com.BdeB.StockVisioBackEnd.model.dataTransferObjects;

import java.math.BigDecimal;

public class ClientProfitDTO {
    private String name;
    private int id;
    private Double ventes;

    // Constructor
    public ClientProfitDTO(String name, int id, Double ventes) {
        this.name = name;
        this.id = id;
        this.ventes = ventes;
    }

    public ClientProfitDTO(String name, int id, long ventes) {
        this.name = name;
        this.id = id;
        this.ventes = Double.longBitsToDouble(ventes);
    }

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getVentes() {
        return ventes;
    }

    public void setVentes(Double ventes) {
        this.ventes = ventes;
    }
}