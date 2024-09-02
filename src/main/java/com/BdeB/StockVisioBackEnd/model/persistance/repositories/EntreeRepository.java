package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Entree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntreeRepository extends JpaRepository<Entree, Integer> {

    @Query(name ="Entree.findAll")
    public List<Entree> findAll();

}
