package com.example.parking_backend.repository;

import com.example.parking_backend.model.GererUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GererUserRepository extends JpaRepository<GererUser, Long> {
    // Additional custom queries can be added here if needed
}
