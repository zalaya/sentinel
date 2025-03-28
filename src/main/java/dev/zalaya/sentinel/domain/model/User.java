package dev.zalaya.sentinel.domain.model;

import dev.zalaya.sentinel.domain.vo.Password;
import dev.zalaya.sentinel.domain.vo.Username;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.UUID;

@Value
@EqualsAndHashCode(of = {"username", "password"})
public class User {

    UUID id;
    Username username;
    Password password;

    public User(String username, String password) {
        this.id = UUID.randomUUID();
        this.username = new Username(username);
        this.password = new Password(password);
    }

}
