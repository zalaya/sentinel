package dev.zalaya.sentinel.domain.vo;

import lombok.Value;

@Value
public class Username {

    String value;

    public Username(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Username is invalid");
        }

        this.value = value;
    }

}
