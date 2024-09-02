package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Sortie;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.SortieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortieService {

    @Autowired
    private SortieRepository sortieRepository;

    public List<Sortie> findAll(){
        return sortieRepository.findAll();
    }

}
