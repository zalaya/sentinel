package dev.zalaya.sentinel.domain.model;

import lombok.Value;

import java.time.Instant;
import java.util.UUID;

@Value
public class Token {

    UUID userId;
    Instant issuedAt;
    Instant expiresAt;

    public Token(UUID userId, Instant expiresAt) {
        this.userId = userId;
        this.issuedAt = Instant.now();
        this.expiresAt = expiresAt;
    }

}
