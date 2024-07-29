package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Entree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntreeRepository extends JpaRepository<Entree, Integer> {
}
