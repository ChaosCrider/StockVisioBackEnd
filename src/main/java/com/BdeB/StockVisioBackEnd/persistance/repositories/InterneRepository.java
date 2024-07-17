package com.BdeB.StockVisioBackEnd.persistance.repositories;

import com.BdeB.StockVisioBackEnd.models.Interne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterneRepository extends JpaRepository<Interne, Integer> {
}
