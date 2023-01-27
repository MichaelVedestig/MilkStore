package com.example.demo;

import com.example.demo.model.Milk;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MilkRepositoryInterface extends CrudRepository<Milk, UUID> {
}
