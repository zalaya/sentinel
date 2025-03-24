package dev.zalaya.sentinel.domain.port.outbound.crypto;

public interface EncryptPasswordPort {

    String encrypt(String raw);

}
