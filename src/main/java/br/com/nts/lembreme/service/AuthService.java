package br.com.nts.lembreme.service;

import br.com.nts.lembreme.controller.request.LoginRequest;

public interface AuthService {
    String getUserToken(LoginRequest loginRequest);
}
