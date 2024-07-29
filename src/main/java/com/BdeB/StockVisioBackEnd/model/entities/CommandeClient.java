package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
public class CommandeClient extends Commande {

    private double prixVente;

    @ManyToOne
    private Client client;
}
