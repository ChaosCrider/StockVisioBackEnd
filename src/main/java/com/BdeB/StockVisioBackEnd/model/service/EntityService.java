package com.BdeB.StockVisioBackEnd.model.service;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


// Performs LifeCycle operations for entity
// used for insert of sample data and not by the client
@Service
public class EntityService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public <T> void insertEntity(T entity){
        entityManager.persist(entity);
    }
}
