package com.example.demo;

import com.example.demo.model.Milk;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    MilkRepositoryInterface repo;

    public List<Milk> findAll(){
        return (List<Milk>) repo.findAll();
    }


    public Milk findById(UUID id) {
        return repo.findById(id).get();
    }

    public void save(Milk milk) {
        repo.save(milk);
    }

    public void saveAll(List<Milk> newShipment) {
        repo.saveAll(newShipment);
    }
}
