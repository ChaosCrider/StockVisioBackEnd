package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Entree;
import com.BdeB.StockVisioBackEnd.model.service.EntreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/entree")
public class EntreeController {

    @Autowired
    private EntreeService entreeService;

    @GetMapping
    public List<Entree> getAll() throws ResourceNotFoundException {
        List<Entree> entrees = entreeService.findAll();
        if(entrees == null){
            throw new ResourceNotFoundException("Not entrees found");
        }
        return entrees;
    }

}
