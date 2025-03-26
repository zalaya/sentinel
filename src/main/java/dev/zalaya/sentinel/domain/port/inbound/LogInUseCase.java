package dev.zalaya.sentinel.domain.port.inbound;

import dev.zalaya.sentinel.domain.model.Token;

public interface LogInUseCase {

    Token logIn(String username, String password);

}
