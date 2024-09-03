package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "mouvements_entree")
@NamedQuery(name = "Entree.findAll" , query="select e from Entree e")
public class Entree extends Mouvement {

    @ManyToOne
    @JoinColumn(name = "emplacement_id")
    private Emplacement destination;

    public Emplacement getDestination() {
        return destination;
    }

    public void setDestination(Emplacement destination) {
        this.destination = destination;
    }
}
