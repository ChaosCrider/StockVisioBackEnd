package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Emplacement;
import com.BdeB.StockVisioBackEnd.model.entities.Mouvement;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MouvementRepository extends JpaRepository<Mouvement, Integer> {

}



