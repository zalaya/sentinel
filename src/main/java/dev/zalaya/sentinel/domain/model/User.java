package dev.zalaya.sentinel.domain.model;

import lombok.Value;

import java.util.UUID;

@Value
public class User {

    UUID id;
    String username;
    String password;

    public User(String username, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }

}
