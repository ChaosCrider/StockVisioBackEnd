package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alertes")
public class Alertes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alerte_id")
    private int id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "date_creation", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @Column(name = "seuil_declanchement", nullable = false)
    private double seuilDeclenchement;

    @Column(name = "message")
    private String message;

    @Column(name = "statut", nullable = false)
    private String statut;

    @Column(name = "date_resolution")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateResolution;

    @Column(name = "priorite")
    private String priorite;

    // Getters and setters

    // Constructor
    public Alertes() {
        this.dateCreation = new Date(); // Default value for dateCreation
    }
}