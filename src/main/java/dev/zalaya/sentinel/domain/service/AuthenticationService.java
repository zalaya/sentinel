package dev.zalaya.sentinel.domain.service;

import dev.zalaya.sentinel.domain.model.Token;
import dev.zalaya.sentinel.domain.port.inbound.LogInUseCase;
import dev.zalaya.sentinel.domain.port.inbound.SignUpUseCase;

public class AuthenticationService implements SignUpUseCase, LogInUseCase {

    @Override
    public Token logIn(String username, String password) {
        return null;
    }

    @Override
    public void signUp(String username, String password) {

    }

}
