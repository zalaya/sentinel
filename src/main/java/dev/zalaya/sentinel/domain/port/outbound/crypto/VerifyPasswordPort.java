package dev.zalaya.sentinel.domain.port.outbound.crypto;

public interface VerifyPasswordPort {

    boolean verify(String raw, String encrypted);

}
