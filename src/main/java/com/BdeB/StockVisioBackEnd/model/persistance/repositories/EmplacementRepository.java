package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Emplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplacementRepository extends JpaRepository<Emplacement, Integer> {
}
