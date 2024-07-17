package com.BdeB.StockVisioBackEnd.models;

import jakarta.persistence.*;

@Entity
public class Interne extends Mouvement {

    @ManyToOne
    private Emplacement destination;
}
