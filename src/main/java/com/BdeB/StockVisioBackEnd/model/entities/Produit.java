package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "produits")
@NamedQuery(name = "Produit.findById", query = "SELECT p FROM Produit p WHERE p.id = :id")

@NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p")

@NamedQuery(name = "Produit.findFiltered", query = "SELECT p " +
        "FROM Produit p " +
        "JOIN p.categorie c " +
        "JOIN p.fournisseur f " +
        "WHERE (:surstock IS NULL OR p.quantiteEnStock > p.quantiteMaximale) " +
        "AND (:rupture IS NULL OR p.quantiteEnStock < p.seuilCritique) " +
        "AND (:categorie IS NULL OR c.description LIKE CONCAT('%', :categorie, '%')) " +
        "AND (:fournisseur IS NULL OR f.nom LIKE CONCAT('%', :fournisseur, '%'))"
)

public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produit_id")
    private int id;

    @Column(name = "code", nullable = false, length = 80)
    private String codeProduit;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "seuilcritique", nullable = false)
    private double seuilCritique;

    @Column(name = "prix_u", nullable = false, precision = 10)
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

    @Column(name = "prix_vente", nullable = false, precision = 10)
    private double prixVente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "produit")
    private List<EmplacementProduit> emplacements = new ArrayList<>();

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSeuilCritique() {
        return seuilCritique;
    }

    public void setSeuilCritique(double seuilCritique) {
        this.seuilCritique = seuilCritique;
    }

    public double getPrixU() {
        return prixU;
    }

    public void setPrixU(double prixU) {
        this.prixU = prixU;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public double getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(double quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public double getQuantiteMaximale() {
        return quantiteMaximale;
    }

    public void setQuantiteMaximale(double quantiteMaximale) {
        this.quantiteMaximale = quantiteMaximale;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }
}
