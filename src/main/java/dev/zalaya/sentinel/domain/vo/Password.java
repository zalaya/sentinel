package dev.zalaya.sentinel.domain.vo;

import lombok.Value;

@Value
public class Password {

    String value;

    public Password(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Password is invalid");
        }

        this.value = value;
    }

}
