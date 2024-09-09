package com.example.parking_backend.service;

import com.example.parking_backend.model.User;
import com.example.parking_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User registerUser(User user) {
    String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
    user.setPassword(hashedPassword);  // Save hashed password
    return userRepository.save(user);
  }

  public User findByEmailAndPassword(String email, String password) {
    User user = userRepository.findByEmail(email);
    if (user != null && BCrypt.checkpw(password, user.getPassword())) {
      return user;  // Successful login
    }
    return null;  // Incorrect credentials
  }
}