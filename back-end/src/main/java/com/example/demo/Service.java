package com.example.demo;
import com.example.demo.model.Confirmation;
import com.example.demo.model.Milk;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repo;

    public List<Milk> findAll(){

        List<Milk> list = repo.findAll();
        System.out.println();
        return repo.findAll();
    }

    public Confirmation orderMilk(Order order) {
            Milk milk  = repo.findById(order.id());
            milk.setStorage(milk.getStorage() - order.quantity());
            repo.save(milk);
            return new Confirmation(milk.getName(), order.quantity());
    }

    public void saveAll(List<Milk> newShipment) {
        repo.saveAll(newShipment);
    }
}
