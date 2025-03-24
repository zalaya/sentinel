package dev.zalaya.sentinel.domain.model;

import lombok.Value;

import java.util.UUID;

@Value
public class Client {

    UUID id;
    String name;
    String key;
    boolean open;

}
