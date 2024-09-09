package com.example.parking_backend.controller;

import com.example.parking_backend.model.User;
import com.example.parking_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class UserController {

  @Autowired
  private UserService userService;

  // Login endpoint
  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody User user, HttpSession session) {
    User utilisateur = userService.findByEmailAndPassword(user.getEmail(),user.getPassword());
    if (utilisateur != null) {
      session.setAttribute("user", utilisateur);  // Store user in session
      Map<String, String> response = new HashMap<>();
      response.put("message", "Logged in successfully");
      return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
  }

  // Register endpoint
  @PostMapping("/register")
  public ResponseEntity<?> register(@RequestBody User user) {
    User userSaved = userService.registerUser(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(userSaved);
  }

  // Logout endpoint
  @GetMapping("/logout")
  public ResponseEntity<?> logout(HttpSession session) {
    session.invalidate();
    Map<String, String> response = new HashMap<>();
    response.put("message", "Logged out successfully");
    return ResponseEntity.ok(response);
  }
}
