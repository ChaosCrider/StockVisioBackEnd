package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Emplacement;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmplacementRepository extends JpaRepository<Emplacement, Integer> {

    @Query(name = "Emplacement.findById")
    List<Emplacement> findById(@Param("id") int id);


    @Query(name = "Produit.findFilteredByProduit")
    List<Produit> findByCodeOrDescription(@Param("keyword") String keyword);

    @Query(name = "Produit.findFilteredByCategorie")
    List<Produit> findByCategorie(@Param("categorie") String categorie);


    @Query(name = "Produit.findFilteredByEmplacement")
    List<Produit> findByEmplacement(@Param("emplacement") String emplacement);

}

