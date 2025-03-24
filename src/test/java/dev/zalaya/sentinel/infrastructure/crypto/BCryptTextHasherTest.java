package dev.zalaya.sentinel.infrastructure.crypto;

import com.password4j.BadParametersException;

import dev.zalaya.sentinel.domain.port.outbound.security.TextHasher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class BCryptTextHasherTest {

    private final TextHasher hasher = new BCryptTextHasher();

    @Test
    void givenPlainText_whenHashing_thenReturnsNotNull() {
        // Given
        String plainText = "This is a plain text";

        // When
        String hashedText = hasher.encrypt(plainText);

        // Then
        assertNotNull(hashedText);
        assertNotEquals(plainText, hashedText);
    }

    @Test
    void givenSamePlainText_whenHashingTwice_thenReturnsDifferentHashes() {
        // Given
        String plainText = "This is a plain text";

        // When
        String hash1 = hasher.encrypt(plainText);
        String hash2 = hasher.encrypt(plainText);

        // Then
        assertNotEquals(hash1, hash2);
    }

    @Test
    void givenCorrectHashedText_whenVerifyingPlainText_thenReturnsTrue() {
        // Given
        String plainText = "This is a plain text";
        String hashedText = hasher.encrypt(plainText);

        // When
        boolean isVerified = hasher.verify(plainText, hashedText);

        // Then
        assertTrue(isVerified);
    }

    @Test
    void givenIncorrectHashedText_whenVerifyingPlainText_thenThrowsBadParametersException() {
        // Given
        String plainText = "This is a plain text";
        String hashedText = "This is a hashed text";

        // When
        Executable executable = () -> hasher.verify(plainText, hashedText);

        // Then
        assertThrows(BadParametersException.class, executable);
    }

}
