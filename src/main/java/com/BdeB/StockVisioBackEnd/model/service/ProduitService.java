package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Categorie;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.CategorieRepository;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private EntityService entityService;

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private CategorieRepository categorieRepository;


    private Categorie getCategorieById(int categorieId) {
        return categorieRepository.findById(categorieId).orElse(null);
    }


    public Optional<Produit> getProduitById(int id) {
        return produitRepository.findById(id);
    }

    public void insertProduit(String codeProduit, String nom, String description, int categorieId,
                              double seuilCritique, double prixU, double prixVente, double quantiteEnStock,
                              double quantiteMaximale, Date dateAchat, Date dateExpiration) {
        Categorie categorie = getCategorieById(categorieId);
        if (categorie == null){
            throw new IllegalArgumentException("Categorie with ID " + categorieId + " not found");
        }

        Produit produit = new Produit();
        produit.setCodeProduit(codeProduit);
        produit.setNom(nom);
        produit.setDescription(description);
        produit.setCategorie(categorie);
        produit.setSeuilCritique(seuilCritique);
        produit.setPrixU(prixU);
        produit.setPrixVente(prixVente);
        produit.setQuantiteEnStock(quantiteEnStock);
        produit.setQuantiteMaximale(quantiteMaximale);
        produit.setDateAchat(dateAchat);
        produit.setDateExpiration(dateExpiration);

        entityService.insertEntity(produit);
    }


}
