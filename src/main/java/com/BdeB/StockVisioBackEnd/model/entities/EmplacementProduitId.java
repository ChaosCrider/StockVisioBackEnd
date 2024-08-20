package com.BdeB.StockVisioBackEnd.model.entities;

import  jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class EmplacementProduitId implements Serializable {
    private Long emplacementId;
    private Long produitId;

    // hashCode, equals, constructors
}