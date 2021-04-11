package com.project.BP.controllers;

import com.project.BP.entities.Pizza;
import com.project.BP.services.PizzaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/pizzas")
public class PizzaController {

    private PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @PostMapping
    public Pizza savePizza(@RequestBody Pizza request) {
        return pizzaService.savePizza(request);
    }

    @GetMapping
    public List<Pizza> fetchAllPizzas() {
        return pizzaService.getAllPizzas();
    }


    @DeleteMapping(value = "/{id}")
    public void deletePizza(@PathVariable("id") String id) {
        pizzaService.deletePizza(id);
    }

    @PutMapping(value = "/{id}")
    public void editPizza(@RequestBody Pizza request) {
        pizzaService.editPizza(request);
    }
}
