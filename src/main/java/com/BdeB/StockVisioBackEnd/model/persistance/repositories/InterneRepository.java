package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Interne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterneRepository extends JpaRepository<Interne, Integer> {
}
