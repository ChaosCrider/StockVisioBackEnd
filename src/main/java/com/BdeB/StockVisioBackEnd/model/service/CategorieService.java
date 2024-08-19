package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Categorie;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

    @Autowired
    private EntityService entityService;

    @Autowired
    private CategorieRepository categorieRepository;

    public void insertCategorie(String code, String description) {
        Categorie categorie = new Categorie();
        categorie.setCode(code);
        categorie.setDescription(description);

        entityService.insertEntity(categorie);
    }

    public Categorie getCategorieById(int id) {
        return categorieRepository.findById(id).orElse(null);
    }
}

