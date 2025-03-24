package dev.zalaya.sentinel.domain;

import lombok.Value;

import java.util.UUID;

@Value
public class User {

    UUID id;
    String username;
    String hashedPassword;
    boolean enabled;

}
