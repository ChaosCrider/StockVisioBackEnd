package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
public class Interne extends Mouvement {

    @ManyToOne
    private Emplacement destination;
}
