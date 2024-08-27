package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Fournisseur;
import com.BdeB.StockVisioBackEnd.model.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/fournisseurs")
public class FournisseurController {

    @Autowired
    private FournisseurService fournisseurService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping()
    public List<Fournisseur> getAll() throws ResourceNotFoundException {
        List<Fournisseur> fournisseurs = fournisseurService.getAll();
        if(fournisseurs == null){
            throw new ResourceNotFoundException("no fournisseur found");
        }
        return fournisseurs;
    }

}
