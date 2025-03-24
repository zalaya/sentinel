package dev.zalaya.sentinel.infrastructure.crypto;

import dev.zalaya.sentinel.domain.port.outbound.crypto.EncryptPasswordPort;
import dev.zalaya.sentinel.domain.port.outbound.crypto.VerifyPasswordPort;

import com.password4j.Password;

public enum EncryptionPolicy implements EncryptPasswordPort, VerifyPasswordPort {

    BCRYPT {
        @Override
        public String encrypt(String raw) {
            return Password.hash(raw).withBcrypt().getResult();
        }

        @Override
        public boolean verify(String raw, String encrypted) {
            return Password.check(raw, encrypted).withBcrypt();
        }
    },

    ARGON2 {
        @Override
        public String encrypt(String raw) {
            return Password.hash(raw).withArgon2().getResult();
        }

        @Override
        public boolean verify(String raw, String encrypted) {
            return Password.check(raw, encrypted).withArgon2();
        }
    }

}
