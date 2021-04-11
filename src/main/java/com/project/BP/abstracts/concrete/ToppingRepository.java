package com.project.BP.abstracts.concrete;

import com.project.BP.entities.Topping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToppingRepository extends MongoRepository<Topping, Long> {

}
