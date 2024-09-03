package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Fournisseur;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
    @Query(name = "Fournisseur.findAll")
    List<Fournisseur> findAll();



//    @Query(name = "Produit.findAll")
//    List<Produit> findAll();



}
