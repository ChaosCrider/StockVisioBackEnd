package com.BdeB.StockVisioBackEnd.persistance.repositories;

import com.BdeB.StockVisioBackEnd.models.Alertes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertesRepository extends JpaRepository<Alertes, Integer> {
}
