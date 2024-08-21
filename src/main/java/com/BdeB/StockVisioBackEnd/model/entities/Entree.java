package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "mouvements_entree")
public class Entree extends Mouvement {

//    @ManyToOne
//    @JoinColumn(name = "source_id")
//    private Emplacement source;

    @ManyToOne
    @JoinColumn(name = "emplacement_id")
    private Emplacement destination;

    // Getters and setters
//    public Emplacement getSource() {
//        return source;
//    }
//
//    public void setSource(Emplacement source) {
//        this.source = source;
//    }

    public Emplacement getDestination() {
        return destination;
    }

    public void setDestination(Emplacement destination) {
        this.destination = destination;
    }
}
