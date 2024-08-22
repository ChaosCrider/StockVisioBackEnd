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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public double getSeuilDeclenchement() {
        return seuilDeclenchement;
    }

    public void setSeuilDeclenchement(double seuilDeclenchement) {
        this.seuilDeclenchement = seuilDeclenchement;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateResolution() {
        return dateResolution;
    }

    public void setDateResolution(Date dateResolution) {
        this.dateResolution = dateResolution;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }


    // Constructor
    public Alertes() {
        this.dateCreation = new Date(); // Default value for dateCreation
    }
}