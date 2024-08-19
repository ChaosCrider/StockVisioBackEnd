package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "commandes_clients")
public class CommandeClient extends Commande {

    @Column(name = "prix_achat", nullable = false)
    private double prixAchat;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters and setters
    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}