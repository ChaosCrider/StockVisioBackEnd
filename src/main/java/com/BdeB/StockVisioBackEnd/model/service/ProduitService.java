package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Categorie;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.CategorieRepository;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Port;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class ProduitService {

    @Autowired
    private EntityService entityService;

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private CategorieRepository categorieRepository;

    private Categorie getCategorieById(int categorieId) {
        return categorieRepository.findById(categorieId).orElse(null);
    }

    //generic requests

    public List<Produit> getProduitById(int id) {
        return produitRepository.findById(id);
    }

    public List<Produit> getAllProduits(){
        return produitRepository.findAll();
    }


    //inventory request
    public List<Produit> getFilteredProduits(Optional<Boolean> surstock, Optional<Boolean> rupture, Optional<String> categorie, Optional<String> fournisseur) {
        return produitRepository.findFiltered(
                Optional.ofNullable(surstock.orElse(null)),
                Optional.ofNullable(rupture.orElse(null)),
                Optional.ofNullable(categorie.orElse("")),
                Optional.ofNullable(fournisseur.orElse(""))
        );
    }

    //DashBoard requests ** assigné à Bruno
    /*
        ajouter les requêtes
    */



}
