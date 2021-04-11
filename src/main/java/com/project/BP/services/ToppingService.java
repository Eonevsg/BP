package com.project.BP.services;

import com.project.BP.abstracts.concrete.ToppingRepository;
import com.project.BP.entities.Topping;
import com.project.BP.util.SequenceGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToppingService {

    private final SequenceGenerator sequenceGenerator;
    private final ToppingRepository toppingRepository;

    public ToppingService(SequenceGenerator sequenceGenerator, ToppingRepository toppingRepository) {
        this.sequenceGenerator = sequenceGenerator;
        this.toppingRepository = toppingRepository;
    }

    public String saveAllToppings(List<Topping> toppingsARG) {
        List<Topping> toppings = new ArrayList<Topping>();
        for (Topping topping : toppingsARG) {
            toppings.add(new Topping(
                    Long.toString(sequenceGenerator.generateSequence(Topping.SEQUENCE_NAME)),
                    topping.getName()
            ));
        }
        var result = toppingRepository.saveAll(toppings);
        return result.isEmpty() ? "error" : "saved";
    }

    public List<Topping> getAllToppings(){
        return toppingRepository.findAll();
    }
}
