package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {

    @Autowired
    private ProduitService produitService;


    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/ID")
    public List<Produit> getProduitById(@RequestParam int id) throws ResourceNotFoundException {
        List<Produit> produit = produitService.getProduitById(id);
        if(produit == null){
            throw new ResourceNotFoundException("Produit with ID " + id + " not found");
        }
        return produit;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping()
    public List<Produit> getAllProduits() throws ResourceNotFoundException {
        List<Produit> produits = produitService.getAllProduits();
        if(produits == null){
            throw new ResourceNotFoundException("no Produit found");
        }
        return produits;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/filtered")
    public List<Produit> getFilteredProduits(
            @RequestParam(value = "surstock", required = false) Optional<Boolean> surstock,
            @RequestParam(value = "rupture", required = false) Optional<Boolean> rupture,
            @RequestParam(value = "categorie_id", required = false) Optional<Integer> categorie_id,
            @RequestParam(value = "fournisseur_id", required = false) Optional<Integer> fournisseur_id
    ) throws ResourceNotFoundException{
        List<Produit> produits = produitService.getFilteredProduits(
                Optional.ofNullable(surstock.orElse(null)),
                Optional.ofNullable(rupture.orElse(null)),
                Optional.ofNullable(categorie_id.orElse(null)),
                Optional.ofNullable(fournisseur_id.orElse(null))
        );
        if(produits == null){
            throw new ResourceNotFoundException("no Produit found");
        }
        return produits;
    }

}
