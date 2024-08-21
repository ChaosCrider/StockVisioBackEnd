package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "mouvements")
public abstract class Mouvement {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "mouvement_id")
    private int id;

    @Column(name = "date_mouvement", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @Column(name = "quantite", nullable = false)
    private double quantite;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
