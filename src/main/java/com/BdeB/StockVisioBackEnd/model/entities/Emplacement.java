package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import java.util.Set;

@Entity
@Table(name = "emplacements")

@NamedQuery(name = "Emplacement.findById", query = "SELECT e FROM Emplacement e WHERE e.id = :id")

@NamedQuery(name = "Emplacement.findAll", query = "SELECT e FROM Emplacement e")

@NamedQuery(
        name = "Produit.findFilteredByProduit",
        query = """
        SELECT p
        FROM Produit p
        JOIN p.categorie c
        JOIN p.fournisseur f
        WHERE (:keyword IS NULL OR p.codeProduit LIKE CONCAT('%', :keyword, '%') OR p.description LIKE CONCAT('%', :keyword, '%'))
    """
)

@NamedQuery(
        name = "Produit.findFilteredByCategorie",
        query = """
        SELECT p
        FROM Produit p
        JOIN p.categorie c
        WHERE (:categorie IS NULL OR c.description LIKE CONCAT('%', :categorie, '%'))
    """
)


@NamedQuery(
        name = "Produit.findFilteredByEmplacement",
        query = """
        SELECT p
        FROM Produit p
        JOIN p.emplacement e
        WHERE (:emplacement IS NULL OR e.nom LIKE CONCAT('%', :emplacement, '%'))
    """
)








public class Emplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emplacement_id")
    private int id;

    @Column(name = "code", nullable = false, length = 80)
    private String code;
    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "type", length = 80)
    private String typeEmplacement;

    @Column(name = "capacitemax", nullable = false)
    private double capaciteMax;

    @Column(name = "quantite_actuelle", nullable = false)
    private double quantiteActuelle;

    @Column(name = "statut", length = 80, nullable = false)
    private String statut = "Disponible";

    @OneToMany(mappedBy = "emplacement")
    private List<EmplacementProduit> produits = new ArrayList<>();


    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEmplacement() {
        return nom;
    }

    public void setNomEmplacement(String nomEmplacement) {
        this.nom = nom;
    }

    public String getDescEmplacement() {
        return description;
    }

    public void setDescEmplacement(String descEmplacement) {
        this.description = description;
    }

    public String getTypeEmplacement() {
        return typeEmplacement;
    }

    public void setTypeEmplacement(String typeEmplacement) {
        this.typeEmplacement = typeEmplacement;
    }

    public double getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(double capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public double getQuantiteActuelle() {
        return quantiteActuelle;
    }

    public void setQuantiteActuelle(double quantiteActuelle) {
        this.quantiteActuelle = quantiteActuelle;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCodeEmp() {
        return code;
    }

    public void setCodeEmp(String codeEmp) {
        this.code = code;
    }
}