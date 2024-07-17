package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;

@Entity
public class CommandeClient extends Commande {

    private double prixVente;

    @ManyToOne
    private Client client;
}
