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

    public List<Alertes> getAlerteByFilter(Optional<String> nom, Optional <String> fournisseur, Optional <String> statut, Optional <String> dateCree, Optional <String> dateReglee )
    { List<Alertes> liste;
        if (!dateCree.isPresent() && !dateReglee.isPresent())
        {
            return alertesRepository.findByFilterNoDate(
                    Optional.ofNullable(nom.orElse("")),
                    Optional.ofNullable(fournisseur.orElse("")),
                    Optional.ofNullable(statut.orElse(""))
            );
        }

        else if  (!dateCree.isPresent() && dateReglee.isPresent())
        {
            return alertesRepository.findByFilterDateReglee(
                    Optional.ofNullable(nom.orElse("")),
                    Optional.ofNullable(fournisseur.orElse("")),
                    Optional.ofNullable(statut.orElse("")),
                    dateReglee
            );
        }
            else if (dateCree.isPresent() && !dateReglee.isPresent())
        {
            return alertesRepository.findByFilterDateCree(
                    Optional.ofNullable(nom.orElse("")),
                    Optional.ofNullable(fournisseur.orElse("")),
                    Optional.ofNullable(statut.orElse("")),
                    dateCree
            );
        }

            else {

        return alertesRepository.findByFilter(
            Optional.ofNullable(nom.orElse("")),
            Optional.ofNullable(fournisseur.orElse("")),
            Optional.ofNullable(statut.orElse("")),
            dateCree,
            dateReglee
    );
    }



}}
