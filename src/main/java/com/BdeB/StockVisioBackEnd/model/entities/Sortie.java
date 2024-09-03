package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "mouvements_sortie")
@NamedQuery(name = "Sortie.findAll", query = "select s from Sortie s")
public class Sortie extends Mouvement {
    // No additional fields for Sortie
}
