package com.BdeB.StockVisioBackEnd.controllers;


import com.BdeB.StockVisioBackEnd.exception.ResourceNotFoundException;
import com.BdeB.StockVisioBackEnd.model.dataTransferObjects.ClientProfitDTO;
import com.BdeB.StockVisioBackEnd.model.entities.Client;
import com.BdeB.StockVisioBackEnd.model.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping()
    public List<Client> getAll() throws ResourceNotFoundException {
        List<Client> clients = clientService.getAll();
        if (clients == null){
            throw new ResourceNotFoundException("No clients found");
        }
        return clients;
    }

    @GetMapping("/profits")
    public List<ClientProfitDTO> getProfits() throws ResourceNotFoundException {
        List<ClientProfitDTO> clients = clientService.findProfits();
        if (clients == null){
            throw new ResourceNotFoundException("No clients found");
        }
        return clients;
    }

}
