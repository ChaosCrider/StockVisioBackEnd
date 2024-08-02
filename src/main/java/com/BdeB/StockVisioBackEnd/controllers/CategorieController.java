package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Categorie;
import com.BdeB.StockVisioBackEnd.model.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/{id}")
    public Categorie getCategorieById(@PathVariable int id) throws ResourceNotFoundException {
        Categorie categorie = categorieService.getCategorieById(id);
        if(categorie == null){
            throw new ResourceNotFoundException("Categorie with ID " + id + " not found");
        }
        return categorie;
    }

}
