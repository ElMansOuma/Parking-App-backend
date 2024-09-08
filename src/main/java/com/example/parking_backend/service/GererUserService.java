package com.example.parking_backend.service;

import com.example.parking_backend.model.GererUser;
import com.example.parking_backend.repository.GererUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GererUserService {

    @Autowired
    private GererUserRepository gererUserRepository;

    // Retrieve all users
    public List<GererUser> getAllUsers() {
        return gererUserRepository.findAll();
    }

    // Add a new user
    public GererUser addUser(GererUser user) {
        return gererUserRepository.save(user);
    }

    // Delete a user by ID
    public void deleteUser(Long id) {
        gererUserRepository.deleteById(id);
    }

    // Update an existing user
    public GererUser updateUser(Long id, GererUser updatedUser) {
        GererUser existingUser = gererUserRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setRole(updatedUser.getRole());
            existingUser.setStatus(updatedUser.getStatus());
            return gererUserRepository.save(existingUser);
        }
        return null;
    }
}
