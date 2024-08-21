package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Emplacement;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.service.EmplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emplacements")
public class EmplacementController {

    @Autowired
    private EmplacementService emplacementService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping()
    public List<Emplacement> getAllEmplacements() throws ResourceNotFoundException {
        List<Emplacement> emplacements = emplacementService.getAllEmplacements();
        if(emplacements == null){
            throw new ResourceNotFoundException("no Location found");
        }
        return emplacements;
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/emplacement/{id}")
    public ResponseEntity<List<Emplacement>> getEmplacementById(@PathVariable int id) {
        List<Emplacement> emplacements = emplacementService.getEmplacementById(id);
        return ResponseEntity.ok(emplacements);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/produits/recherche")
    public ResponseEntity<List<Produit>> getProduitByCodeOrDescription(
            @RequestParam(required = false) String keyword) {
        List<Produit> emplacements = emplacementService.getProduitByCodeOrDescription(keyword);
        return ResponseEntity.ok(emplacements);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/produits/categorie")
    public ResponseEntity<List<Produit>> getProduitByCategorie(@RequestParam String categorie) {
        List<Produit> produits = emplacementService.getProduitByCategorie(categorie);
        return ResponseEntity.ok(produits);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/produits/emplacement")
    public ResponseEntity<List<Produit>> getProduitByEmplacement(@RequestParam String emplacement) {
        List<Produit> produits = emplacementService.getProduitByEmplacement(emplacement);
        return ResponseEntity.ok(produits);
    }


}
