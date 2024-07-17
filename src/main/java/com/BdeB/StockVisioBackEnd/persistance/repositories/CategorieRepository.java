package com.BdeB.StockVisioBackEnd.persistance.repositories;

import com.BdeB.StockVisioBackEnd.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
