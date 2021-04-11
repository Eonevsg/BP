package com.project.BP.controllers;


import com.project.BP.entities.Topping;
import com.project.BP.services.ToppingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/toppings")
public class ToppingController {

    private final ToppingService toppingService;

    public ToppingController(ToppingService toppingService) {
        this.toppingService = toppingService;
    }

    @PostMapping
    public String saveToppings(@RequestBody List<Topping> request) {
        return toppingService.saveAllToppings(request);
    }

    @GetMapping
    public List<Topping> fetchAllToppings() {
        return toppingService.getAllToppings();
    }
}
