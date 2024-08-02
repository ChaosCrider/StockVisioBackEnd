package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitService produitService;


    @GetMapping("/ID")
    public Optional<Produit> getProduitById(@RequestParam int id) throws ResourceNotFoundException {
        Optional<Produit> produit = produitService.getProduitById(id);
        if(produit == null){
            throw new ResourceNotFoundException("Produit with ID " + id + " not found");
        }
        return produit;
    }

}
