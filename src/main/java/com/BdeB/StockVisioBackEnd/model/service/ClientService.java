package com.BdeB.StockVisioBackEnd.model.service;

import com.BdeB.StockVisioBackEnd.model.dataTransferObjects.ClientProfitDTO;
import com.BdeB.StockVisioBackEnd.model.entities.Client;
import com.BdeB.StockVisioBackEnd.model.persistance.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.findAll();
    };

    public List<ClientProfitDTO> findProfits(){
        return clientRepository.findProfits();
    }
}


