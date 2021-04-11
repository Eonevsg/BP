package com.project.BP.entities;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Pizza {

    public static final String SEQUENCE_NAME = "pizzas_sequence";

    @Id
    private String id;
    private String name;
    private List<Topping> toppings;

    public Pizza(String id, String name, List<Topping> toppings) {
        this.id = id;
        this.name = name;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
