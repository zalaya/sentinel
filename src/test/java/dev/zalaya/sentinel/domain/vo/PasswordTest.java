package dev.zalaya.sentinel.domain.vo;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t", "\n"})
    void shouldThrowException_whenCreatingPassword_withInvalidValue(String value) {
        // When
        Executable executable = () -> new Password(value);

        // Then
        assertThrows(IllegalArgumentException.class, executable);
    }

}
