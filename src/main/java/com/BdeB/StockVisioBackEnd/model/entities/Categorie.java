package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
@NamedQuery(
        name = "Categorie.findById",
        query = "SELECT c FROM Categorie c WHERE c.id = :id"
)
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorie_id")
    private int id;

    @Column(name = "code", nullable = false, length = 80)
    private String code;

    @Column(name = "description")
    private String description;

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}

