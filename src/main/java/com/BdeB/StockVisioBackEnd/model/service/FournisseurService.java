package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Fournisseur;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;

    public List<Fournisseur> getAll(){
        return fournisseurRepository.findAll();
    }
}
