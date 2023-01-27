package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Milk {

    private String name;
    private String type;
    private int storage;
    @Id
    private UUID id;

    public Milk() {
    }

    public Milk(UUID id, String name, String type, int storage) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}