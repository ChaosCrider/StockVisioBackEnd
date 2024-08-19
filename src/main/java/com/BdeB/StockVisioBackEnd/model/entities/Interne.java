package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "mouvements_interne")
public class Interne extends Mouvement {

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Emplacement destination;

    // Getters and setters
    public Emplacement getDestination() {
        return destination;
    }

    public void setDestination(Emplacement destination) {
        this.destination = destination;
    }
}
