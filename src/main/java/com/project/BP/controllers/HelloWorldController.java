package com.project.BP.controllers;

import com.project.BP.abstracts.concrete.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final UserRepository repository;

    public HelloWorldController(UserRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }



}
