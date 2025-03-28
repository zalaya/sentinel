package dev.zalaya.sentinel.domain.model;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t", "\n"})
    void shouldThrowException_whenCreatingUser_withInvalidUsername(String username) {
        // Given
        String password = "Password";

        // When
        Executable executable = () -> new User(username, password);

        // Then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t", "\n"})
    void shouldThrowException_whenCreatingUser_withInvalidPassword(String password) {
        // Given
        String username = "Username";

        // When
        Executable executable = () -> new User(username, password);

        // Then
        assertThrows(IllegalArgumentException.class, executable);
    }

}
