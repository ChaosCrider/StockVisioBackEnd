package com.BdeB.StockVisioBackEnd.controllers;

import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.entities.Alertes;
import com.BdeB.StockVisioBackEnd.model.entities.Produit;
import com.BdeB.StockVisioBackEnd.model.service.AlerteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alertes")

public class AlerteController {
    @Autowired
    private AlerteService alerteService;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping()
    public List<Alertes> getAllAlertes() throws ResourceNotFoundException {
        List<Alertes> alertes = alerteService.getAllAlertes();
        if (alertes == null){
            throw new ResourceNotFoundException("No Alerts found");
        }
        return alertes;
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/id")
    public List<Alertes> getAlerteById(@RequestParam int id ) throws ResourceNotFoundException {
        List<Alertes> alerte = alerteService.getAlerteById(id);
        if (alerte == null){
            throw new ResourceNotFoundException("Alerts with ID" + id + " not found");
        }
        return alerte;
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/filter")
    public List<Alertes> getAlerteByFilter(
            @RequestParam(value = "nom", required = false) Optional<String> nom,
            @RequestParam(value = "fournisseur", required = false) Optional<String> fournisseur,
            @RequestParam(value = "statut", required = false) Optional<String> statut,
            @RequestParam (value = "dateCree", required = false)  Optional<String> dateCree,
            @RequestParam(value = "dateReglee", required = false) Optional<String> dateReglee

    ) throws ResourceNotFoundException{
        List<Alertes> alertes = alerteService.getAlerteByFilter(
                Optional.ofNullable(nom.orElse(null)),
                Optional.ofNullable(fournisseur.orElse(null)),
                Optional.ofNullable(statut.orElse(null)),
                Optional.ofNullable(dateCree.orElse(null)),
                Optional.ofNullable(dateReglee.orElse(null))

        );
        if(alertes == null){
            throw new ResourceNotFoundException("no Alerts found");
        }
        return alertes;
    }
}
