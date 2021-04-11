package com.project.BP.entities;

import org.springframework.data.annotation.Id;

public class Topping {

    public static final String SEQUENCE_NAME = "toppings_sequence";

    @Id
    private String id;
    private String name;

    public Topping(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
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

}
