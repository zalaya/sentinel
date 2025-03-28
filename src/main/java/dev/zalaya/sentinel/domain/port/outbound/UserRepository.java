package dev.zalaya.sentinel.domain.port.outbound;

import dev.zalaya.sentinel.domain.model.User;

public interface UserRepository {

    /**
     * Persists the given {@link User} instance into the underlying storage mechanism.
     *
     * @param user The {@link User} to be persisted.
     * @return The persisted {@link User}.
     */
    User save(User user);

}
