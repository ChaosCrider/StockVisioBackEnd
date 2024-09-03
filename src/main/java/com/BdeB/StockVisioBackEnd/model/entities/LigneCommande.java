package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lignescommande")
public class LigneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
    private double quantite;
    @ManyToOne
    @JoinColumn(name = "commandes_fournisseur_id")
    private Commande commandeFournisseur;
    @ManyToOne
    @JoinColumn(name = "commandes_clients_id")
    private Commande commandeClient;
}
