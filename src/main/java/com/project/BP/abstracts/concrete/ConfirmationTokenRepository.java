package com.project.BP.abstracts.concrete;

import com.project.BP.services.token.ConfirmationToken;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ConfirmationTokenRepository extends MongoRepository<ConfirmationToken, String> {

    public Optional<ConfirmationToken> findByToken(String token);
}
