package com.BdeB.StockVisioBackEnd.persistance.repositories;

import com.BdeB.StockVisioBackEnd.models.Entree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntreeRepository extends JpaRepository<Entree, Integer> {
}
