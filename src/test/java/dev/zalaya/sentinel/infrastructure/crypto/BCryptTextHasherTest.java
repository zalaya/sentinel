package dev.zalaya.sentinel.infrastructure.crypto;

import dev.zalaya.sentinel.domain.port.outbound.security.TextHasher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BCryptTextHasherTest {

    private final TextHasher hasher = new BCryptTextHasher();

    @Test
    void givenPlainText_whenHashingPlainText_thenReturnsNotNull() {
        // Given
        String plainText = "This is a plain text";

        // When
        String hashedText = hasher.encrypt(plainText);

        // Then
        assertNotNull(hashedText);
        assertNotEquals(plainText, hashedText);
    }

    @Test
    void givenHashedText_whenVerifyingPlainText_thenReturnsTrue() {
        // Given
        String plainText = "This is a plain text";
        String hashedText = hasher.encrypt(plainText);

        // When
        boolean isVerified = hasher.verify(plainText, hashedText);

        // Then
        assertTrue(isVerified);
    }

}
