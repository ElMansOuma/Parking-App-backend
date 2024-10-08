package com.example.parking_backend.controller;

import com.example.parking_backend.model.GererUser;
import com.example.parking_backend.service.GererUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gerer-users")  // Renamed URL mapping
public class GererUserController {

    @Autowired
    private GererUserService gererUserService;

    // GET all users
    @GetMapping
    public List<GererUser> getAllUsers() {
        return gererUserService.getAllUsers();
    }

    // ADD a new user
    @PostMapping
    public GererUser addUser(@RequestBody GererUser user) {
        return gererUserService.addUser(user);
    }

    // DELETE a user by ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        gererUserService.deleteUser(id);
    }

    // UPDATE an existing user by ID
    @PutMapping("/{id}")
    public GererUser updateUser(@PathVariable Long id, @RequestBody GererUser user) {
        return gererUserService.updateUser(id, user);
    }
}
