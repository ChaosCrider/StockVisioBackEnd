package com.BdeB.StockVisioBackEnd.persistance.repositories;

import com.BdeB.StockVisioBackEnd.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
}
