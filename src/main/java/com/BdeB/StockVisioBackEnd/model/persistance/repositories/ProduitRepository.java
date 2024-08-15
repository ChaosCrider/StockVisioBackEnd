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
            @Param("surstock") Optional<Boolean> surstock,
            @Param("rupture") Optional<Boolean> rupture,
            @Param("categorie") Optional<String> categorie,
            @Param("fournisseur") Optional<String> fournisseur
    );
}
