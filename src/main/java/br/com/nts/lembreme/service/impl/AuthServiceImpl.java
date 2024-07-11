package br.com.nts.lembreme.service.impl;

import br.com.nts.lembreme.controller.request.LoginRequest;
import br.com.nts.lembreme.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    @Override
    public String getUserToken(LoginRequest loginRequest) {
        return null;
    }


}
