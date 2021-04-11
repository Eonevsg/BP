package com.project.BP.services;

import com.project.BP.abstracts.concrete.PizzaRepository;
import com.project.BP.entities.Pizza;
import com.project.BP.util.SequenceGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {

    private final SequenceGenerator sequenceGenerator;
    private final PizzaRepository pizzaRepository;

    public PizzaService(SequenceGenerator sequenceGenerator, PizzaRepository pizzaRepository) {
        this.sequenceGenerator = sequenceGenerator;
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza savePizza(Pizza pizzasARG) {

        return pizzaRepository.save(new Pizza(
                Long.toString(sequenceGenerator.generateSequence(Pizza.SEQUENCE_NAME)),
                pizzasARG.getName(),
                pizzasARG.getToppings()));
    }

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    public void deletePizza(String id) {
        if (pizzaRepository.findById(id).isPresent()) {
            pizzaRepository.delete(pizzaRepository.findById(id).get());
        }
    }

    public void editPizza(Pizza pizza) {
        Optional<Pizza> pizzaToUpdate = pizzaRepository.findById(pizza.getId());
        pizzaToUpdate.get().setName(pizza.getName());
        pizzaToUpdate.get().setToppings(pizza.getToppings());
        pizzaRepository.save(pizzaToUpdate.get());
    }
}
