package dev.zalaya.sentinel.infrastructure.crypto;

import dev.zalaya.sentinel.domain.port.outbound.security.TextHasher;

import com.password4j.Password;

public class BCryptTextHasher implements TextHasher {

    @Override
    public String encrypt(String plainText) {
        return Password.hash(plainText).withBcrypt().getResult();
    }

    @Override
    public boolean verify(String plainText, String hashedText) {
        return Password.check(plainText, hashedText).withBcrypt();
    }

}
