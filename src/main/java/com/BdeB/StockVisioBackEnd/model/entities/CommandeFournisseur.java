package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
public class CommandeFournisseur extends Commande {

    private double prixAchat;

    @ManyToOne
    private Fournisseur fournisseur;
}
