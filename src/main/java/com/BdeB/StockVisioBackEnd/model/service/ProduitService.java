package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Categorie;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.CategorieRepository;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Port;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

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

    public List<Produit> getProduitById(int id) {
        return produitRepository.findById(id);
    }

    public List<Produit> getAllProduits(){
        return produitRepository.findAll();
    }

    public List<Produit> getFilteredProduits(Optional<Boolean> surstock, Optional<Boolean> rupture, Optional<Integer> categorie_id, Optional<Integer> fournisseur_id) {
        return produitRepository.findFiltered(
                Optional.ofNullable(surstock.orElse(null)),
                Optional.ofNullable(rupture.orElse(null)),
                Optional.ofNullable(categorie_id.orElse(null)),
                Optional.ofNullable(fournisseur_id.orElse(null))
        );
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
