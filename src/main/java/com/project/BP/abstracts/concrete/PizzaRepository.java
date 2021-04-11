package com.project.BP.abstracts.concrete;

import com.project.BP.entities.Pizza;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PizzaRepository extends MongoRepository<Pizza, Long> {
    public Optional<Pizza> findById(String id);
}
