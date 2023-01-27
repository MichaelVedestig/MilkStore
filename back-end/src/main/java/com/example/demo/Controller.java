package com.example.demo;
import com.example.demo.model.Inventory;
import com.example.demo.model.Milk;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    Service service;
    @GetMapping
    public ResponseEntity<List<Milk>> findAll(){
        try {
            return ResponseEntity.ok(service.findAll());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping("/order")
    public ResponseEntity orderMilk(@RequestBody Order order){
        try {
           return ResponseEntity.status(201).body(service.orderMilk(order));
        }
        catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/populate")
    public ResponseEntity populateDB(@RequestBody Inventory inventory){
        try {
            System.out.println(inventory.count());
            service.saveAll(inventory.results());
            return ResponseEntity.status(201).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(404).body(e.fillInStackTrace());
        }
    }
}
