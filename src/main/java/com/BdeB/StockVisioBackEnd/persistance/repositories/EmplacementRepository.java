package com.BdeB.StockVisioBackEnd.persistance.repositories;

import com.BdeB.StockVisioBackEnd.models.Emplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplacementRepository extends JpaRepository<Emplacement, Integer> {
}
