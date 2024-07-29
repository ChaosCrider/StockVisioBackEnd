package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "produits")
@NamedQuery(name = "Produit.findByID", query = "SELECT p FROM Produit p WHERE p.id = :id")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produit_id")
    private int id;


    @Column(name = "code", nullable = false, length = 80)
    private String codeProduit;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "seuilCritique", nullable = false)
    private double seuilCritique;

    @Column(name = "prix_u", nullable = false, precision = 10, scale = 2)
    private double prixU;

    @Column(name = "date_achat", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAchat;

    @Column(name = "date_expiration", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateExpiration;

    @Column(name = "quantite_en_stock", nullable = false)
    private double quantiteEnStock;

    @Column(name = "quantite_maximale", nullable = false)
    private double quantiteMaximale;

    @Column(name = "prix_vente", nullable = false, precision = 10, scale = 2)
    private double prixVente;
}
