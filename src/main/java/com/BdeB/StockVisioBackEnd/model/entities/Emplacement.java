package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "emplacements")
public class Emplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emplacement_id")
    private int id;

    @Column(name = "code", nullable = false, length = 80)
    private String codeEmp;

    @Column(name = "nom", nullable = false, length = 255)
    private String nomEmplacement;

    @Column(name = "description")
    private String descEmplacement;

    @Column(name = "type", length = 80)
    private String typeEmplacement;

    @Column(name = "capacitemax", nullable = false)
    private double capaciteMax;

    @Column(name = "quantite_actuelle", nullable = false)
    private double quantiteActuelle;

    @Column(name = "statut", length = 80, nullable = false)
    private String statut = "Disponible";

    @OneToMany(mappedBy = "produit")
    private List<EmplacementProduit> emplacements = new ArrayList<>();

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEmplacement() {
        return nomEmplacement;
    }

    public void setNomEmplacement(String nomEmplacement) {
        this.nomEmplacement = nomEmplacement;
    }

    public String getDescEmplacement() {
        return descEmplacement;
    }

    public void setDescEmplacement(String descEmplacement) {
        this.descEmplacement = descEmplacement;
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
        return codeEmp;
    }

    public void setCodeEmp(String codeEmp) {
        this.codeEmp = codeEmp;
    }
}