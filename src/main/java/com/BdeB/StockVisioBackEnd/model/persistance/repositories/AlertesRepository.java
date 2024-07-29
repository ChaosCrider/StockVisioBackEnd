package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Alertes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertesRepository extends JpaRepository<Alertes, Integer> {
}
