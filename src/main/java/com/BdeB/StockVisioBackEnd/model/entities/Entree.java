package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
public class Entree extends Mouvement {

    @ManyToOne
    private Emplacement source;
    @ManyToOne
    private Emplacement destination;
}
