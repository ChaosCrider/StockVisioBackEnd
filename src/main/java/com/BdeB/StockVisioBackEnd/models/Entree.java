package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;

@Entity
public class Entree extends Mouvement {

    @ManyToOne
    private Emplacement source;
    @ManyToOne
    private Emplacement destination;
}
