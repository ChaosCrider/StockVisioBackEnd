package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alertes")
@NamedQuery(name = "Alertes.findAll", query = "SELECT a FROM Alertes a")
@NamedQuery(name = "Alertes.findById", query = "SELECT a FROM Alertes a where a.id = :id")
@NamedQuery(name = "Alertes.findByFilter", query = "SELECT a " +
        "FROM Alertes a " +
        "where (:nom IS NULL OR a.message like CONCAT('%', :nom,'%')) " +
        "AND (:fournisseur IS NULL OR a.produit.fournisseur.nom like CONCAT('%', :fournisseur,'%')) " +
        "AND (:statut IS NULL OR a.statut like CONCAT('%', :statut,'%'))" +
        "AND (:dateCree IS NULL OR (a.dateCreation = :dateCree AND :dateCree IS NOT NULL)) " +
        "AND (:dateReglee IS NULL OR (a.dateResolution = :dateReglee AND :dateReglee IS NOT NULL))")


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