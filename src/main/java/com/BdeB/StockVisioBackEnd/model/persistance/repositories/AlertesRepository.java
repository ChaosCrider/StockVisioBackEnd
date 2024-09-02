package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.entities.Alertes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface AlertesRepository extends JpaRepository<Alertes, Integer> {

    @Query(name = "Alertes.findById")
    List<Alertes> findById(@Param("id") int id);
    @Query(name = "Alertes.findAll")
    List<Alertes> findAll();

    @Query(name = "Alertes.findByFilter")
    List<Alertes> findByFilter(
            @Param("nom")Optional <String> nom,
            @Param("fournisseur")Optional <String> fournisseur,
            @Param("statut")Optional <String> statut,
            @Param("dateCree")Optional <String> dateCree,
            @Param("dateReglee")Optional <String> dateReglee

    );
    @Query(name = "Alertes.findByFilterNoDate")
    List<Alertes> findByFilterNoDate(
            @Param("nom")Optional <String> nom,
            @Param("fournisseur")Optional <String> fournisseur,
            @Param("statut")Optional <String> statut
    );
    @Query(name = "Alertes.findByFilterDateReglee")
    List<Alertes> findByFilterDateReglee(
            @Param("nom")Optional <String> nom,
            @Param("fournisseur")Optional <String> fournisseur,
            @Param("statut")Optional <String> statut,
            @Param("dateReglee")Optional <String> dateReglee
    );
    @Query(name = "Alertes.findByFilterDateCree")
    List<Alertes> findByFilterDateCree(
            @Param("nom")Optional <String> nom,
            @Param("fournisseur")Optional <String> fournisseur,
            @Param("statut")Optional <String> statut,
            @Param("dateCree")Optional <String> dateCree
    );
}
