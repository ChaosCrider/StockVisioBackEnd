package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Entree;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.EntreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EntreeService {

    @Autowired
    private EntreeRepository entreeRepository;

    public List<Entree> findAll(){
        return entreeRepository.findAll();
    }

}
