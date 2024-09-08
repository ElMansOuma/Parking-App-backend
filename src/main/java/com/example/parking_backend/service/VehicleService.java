package com.example.parking_backend.service;

import com.example.parking_backend.model.Vehicle;
import com.example.parking_backend.model.VehicleCategory;
import com.example.parking_backend.model.VehicleOwner;
import com.example.parking_backend.repository.VehicleCategoryRepository;
import com.example.parking_backend.repository.VehicleOwnerRepository;
import com.example.parking_backend.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleCategoryRepository vehicleCategoryRepository;

    @Autowired
    private VehicleOwnerRepository vehicleOwnerRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<VehicleCategory> getAllCategories() {
        return vehicleCategoryRepository.findAll();
    }

    public VehicleCategory addCategory(VehicleCategory category) {
        return vehicleCategoryRepository.save(category);
    }

    public List<VehicleOwner> getAllOwners() {
        return vehicleOwnerRepository.findAll();
    }

    public VehicleOwner addOwner(VehicleOwner owner) {
        return vehicleOwnerRepository.save(owner);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    public void deleteCategory(Long id) {
        vehicleCategoryRepository.deleteById(id);
    }

    public void deleteOwner(Long id) {
        vehicleOwnerRepository.deleteById(id);
    }
}
