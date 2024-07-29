package com.BdeB.StockVisioBackEnd.persistance.repositories;

import com.BdeB.StockVisioBackEnd.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    @Query(name = "Produit.findByNom")
    List<Produit> findByNom(@Param("id") int id);

}
