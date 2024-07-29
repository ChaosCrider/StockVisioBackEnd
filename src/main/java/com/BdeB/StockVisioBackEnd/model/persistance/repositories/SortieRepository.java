package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Sortie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SortieRepository extends JpaRepository<Sortie, Integer> {
}
