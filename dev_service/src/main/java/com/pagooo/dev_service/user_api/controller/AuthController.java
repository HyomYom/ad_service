package com.pagooo.dev_service.user_api.controller;


import com.pagooo.dev_service.entity.user.dto.Sign;
import com.pagooo.dev_service.user_api.service.SignService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final SignService service;

    @PostMapping("/register")
    public ResponseEntity<?> userSignUp(@RequestBody Sign.Up form) {
        Sign.Up up = service.signUp(form);
        return ResponseEntity.ok(up);
    }
}
