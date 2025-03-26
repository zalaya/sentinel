package dev.zalaya.sentinel.domain.model;

import lombok.Value;

import java.util.UUID;

@Value
public class User {

    UUID id;
    String username;
    String password;

    public User(String username, String password) {
        validateUsername(username);
        validatePassword(password);

        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }

    private void validateUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username is invalid");
        }
    }

    private void validatePassword(String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password is invalid");
        }
    }

}
