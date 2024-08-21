package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Emplacement;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.EmplacementRepository;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.MouvementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplacementService {

    @Autowired
    private EmplacementRepository emplacementRepository;

    public List<Emplacement> getAllEmplacements(){
        return emplacementRepository.findAll();
    }
    public List<Emplacement> getEmplacementById(int id) {
        return emplacementRepository.findById(id);
    }

    public List<Produit> getProduitByCodeOrDescription(String keyword) {
        return emplacementRepository.findByCodeOrDescription(keyword);
    }

    public List<Produit> getProduitByCategorie(String categorie) {
        return emplacementRepository.findByCategorie(categorie);
    }

    public List<Produit> getProduitByEmplacement(String emplacement) {
        return emplacementRepository.findByEmplacement(emplacement);
    }
}

