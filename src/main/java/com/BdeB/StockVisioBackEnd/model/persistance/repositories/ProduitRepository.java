package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import jakarta.persistence.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    @Query(name = "Produit.findById")
    List<Produit> findById(@Param("id") int id);

    @Query(name = "Produit.findAll")
    List<Produit> findAll();

    @Query(name = "Produit.findFiltered")
    List<Produit> findFiltered(
            @Param("quantite_en_stock") Optional<Double> quantite_en_stock,
            @Param("categorie_id") Optional<Integer> categorie_id,
            @Param("fournisseur_id") Optional<Integer> fournisseur_id
            );
}
