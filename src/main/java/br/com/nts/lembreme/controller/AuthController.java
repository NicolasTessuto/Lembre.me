package br.com.nts.lembreme.controller;


import br.com.nts.lembreme.controller.request.LoginRequest;
import br.com.nts.lembreme.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auths")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    ResponseEntity<String> getUserToken(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.getUserToken(loginRequest));
    }



}
