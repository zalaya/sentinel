package dev.zalaya.sentinel.domain.model;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" "})
    void shouldThrowException_whenCreatingUser_withInvalidUsername(String username) {
        // Given
        String password = "1234";

        // When
        Executable executable = () -> new User(username, password);

        // Then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" "})
    void shouldThrowException_whenCreatingUser_withInvalidPassword(String password) {
        // Given
        String username = "1234";

        // When
        Executable executable = () -> new User(username, password);

        // Then
        assertThrows(IllegalArgumentException.class, executable);
    }

}
