// src/main/java/com/example/parking_backend/service/VehicleOwnerService.java
package com.example.parking_backend.service;

import com.example.parking_backend.model.VehicleOwner;
import com.example.parking_backend.repository.VehicleOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleOwnerService {
    @Autowired
    private VehicleOwnerRepository ownerRepository;

    public List<VehicleOwner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public VehicleOwner addOwner(VehicleOwner owner) {
        return ownerRepository.save(owner);
    }

    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}
