package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class EmplacementProduit {
    @EmbeddedId
    private EmplacementProduitId id;

    @ManyToOne
    @MapsId("emplacementId")
    private Emplacement emplacement;

    @ManyToOne
    @MapsId("produitId")
    private Produit produit;

    private BigDecimal quantite;
}
