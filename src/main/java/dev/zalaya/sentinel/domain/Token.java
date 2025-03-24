package dev.zalaya.sentinel.domain;

import lombok.Value;

import java.time.Instant;
import java.util.UUID;

@Value
public class Token {

    UUID id;
    UUID userId;
    UUID clientId;
    Instant issued;
    Instant expires;

}
