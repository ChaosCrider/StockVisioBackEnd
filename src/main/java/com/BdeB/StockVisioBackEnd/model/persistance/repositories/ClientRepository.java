package com.BdeB.StockVisioBackEnd.model.persistance.repositories;

import com.BdeB.StockVisioBackEnd.model.dataTransferObjects.ClientProfitDTO;
import com.BdeB.StockVisioBackEnd.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query(name = "Client.findALl")
    List<Client> findAll();

    @Query(name = "Client.Profits")
    List<ClientProfitDTO> findProfits();

}
