package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "emplacement_produits")
public class EmplacementProduit {
    @EmbeddedId
    private EmplacementProduitId id;

    @ManyToOne
    @MapsId("emplacementId")
    @JoinColumn(name = "emplacement_id")
    private Emplacement emplacement;

    @ManyToOne
    @MapsId("produitId")
    @JoinColumn(name = "produit_id")
    private Produit produit;

    private BigDecimal quantite;
}
