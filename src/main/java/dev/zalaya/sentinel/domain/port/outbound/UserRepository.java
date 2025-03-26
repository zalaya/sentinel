package dev.zalaya.sentinel.domain.port.outbound;

import dev.zalaya.sentinel.domain.model.User;

import java.util.Optional;

public interface UserRepository {

    /**
     * Retrieves a user by their username from the data store.
     *
     * @param username The unique username used to identify the user.
     * @return An Optional containing the User if found, otherwise, an empty Optional.
     */
    Optional<User> findByUsername(String username);

    /**
     *Persists a new user in the data store.
     *
     * @param user The user to persist.
     * @return True if the user was saved successfully, false if the persistence failed.
     */
    boolean save(User user);

}
