package com.project.BP.abstracts.concrete;

import com.project.BP.entities.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<AppUser, Long> {

    public AppUser findByFirstName(String firstName);
    public List<AppUser> findByLastName(String lastName);

    public Optional<AppUser> findByUsername(String username);
    public Optional<AppUser> findByEmail(String email);

}