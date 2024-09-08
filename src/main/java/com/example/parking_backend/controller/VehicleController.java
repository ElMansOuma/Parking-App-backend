package com.example.parking_backend.controller;

import com.example.parking_backend.model.Vehicle;
import com.example.parking_backend.model.VehicleCategory;
import com.example.parking_backend.model.VehicleOwner;
import com.example.parking_backend.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
    }

    @GetMapping("/categories")
    public List<VehicleCategory> getAllCategories() {
        return vehicleService.getAllCategories();
    }

    @PostMapping("/categories")
    public VehicleCategory addCategory(@RequestBody VehicleCategory category) {
        return vehicleService.addCategory(category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        vehicleService.deleteCategory(id);
    }

    @GetMapping("/owners")
    public List<VehicleOwner> getAllOwners() {
        return vehicleService.getAllOwners();
    }

    @PostMapping("/owners")
    public VehicleOwner addOwner(@RequestBody VehicleOwner owner) {
        return vehicleService.addOwner(owner);
    }

    @DeleteMapping("/owners/{id}")
    public void deleteOwner(@PathVariable Long id) {
        vehicleService.deleteOwner(id);
    }
}
