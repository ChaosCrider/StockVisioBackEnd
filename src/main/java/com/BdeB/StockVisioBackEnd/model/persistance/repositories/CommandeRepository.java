package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
