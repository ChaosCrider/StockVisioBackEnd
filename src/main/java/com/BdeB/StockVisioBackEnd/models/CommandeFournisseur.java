package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;

@Entity
public class CommandeFournisseur extends Commande {

    private double prixAchat;

    @ManyToOne
    private Fournisseur fournisseur;
}
