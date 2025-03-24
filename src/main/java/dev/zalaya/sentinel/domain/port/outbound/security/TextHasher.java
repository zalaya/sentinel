package dev.zalaya.sentinel.domain.port.outbound.security;

public interface TextHasher {

    /**
     * Hashes a plain text input into a secure, irreversible representation.
     *
     * @param plainText The original text to be hashed.
     * @return A secure hash representing the input text.
     */
    String encrypt(String plainText);

    /**
     * Verifies whether the provided plain text matches a previously hashed value.
     *
     * @param plainText The original plain text to be verified.
     * @param hashedText The hash to compare against.
     * @return True if they match, False otherwise.
     */
    boolean verify(String plainText, String hashedText);

}
