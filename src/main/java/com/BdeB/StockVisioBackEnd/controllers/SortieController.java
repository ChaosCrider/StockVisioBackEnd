package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Sortie;
import com.BdeB.StockVisioBackEnd.model.service.SortieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/sortie")
public class SortieController {

    @Autowired
    private SortieService sortieService;

    @GetMapping()
    public List<Sortie> getAll() throws ResourceNotFoundException {
        List<Sortie> sorties = sortieService.findAll();
        if(sorties == null){throw new ResourceNotFoundException("No sorties Found");}
        return sorties;
    }


}
