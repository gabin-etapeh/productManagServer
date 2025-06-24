package com.example.productManagement.controller;

import com.example.productManagement.security.JwtUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final JwtUtils jwtUtil;

    public AuthController(JwtUtils jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login() {
        String token = jwtUtil.generateToken("user");
        return ResponseEntity.ok().body("Vous êtes connecté avec succès. Token: " + token);
    }
}