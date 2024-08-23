package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.entities.Alertes;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.AlertesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AlerteService {
    @Autowired
    private AlertesRepository alertesRepository;

    public List<Alertes> getAlerteById(int id) { return alertesRepository.findById(id);}

    public List<Alertes> getAllAlertes() { return alertesRepository.findAll();}

    public List<Alertes> getAlerteByFilter(Optional<String> nom, Optional <String> fournisseur, Optional <String> statut, Optional <Date> dateCree, Optional <Date> dateReglee )
    { return alertesRepository.findByFilter(
            Optional.ofNullable(nom.orElse("")),
            Optional.ofNullable(fournisseur.orElse("")),
            Optional.ofNullable(statut.orElse("")),
            Optional.ofNullable(dateCree.orElse(new Date())),
            Optional.ofNullable(dateReglee.orElse(new Date()))
    );
    }



}
