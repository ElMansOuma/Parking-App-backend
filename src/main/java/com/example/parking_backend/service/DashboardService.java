package com.example.parking_backend.service;

import com.example.parking_backend.model.ParkingSlot;
import com.example.parking_backend.model.Vehicle;
import com.example.parking_backend.repository.ParkingSlotRepository;
import com.example.parking_backend.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    private ParkingSlotRepository parkingSlotRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlotRepository.findAll();
    }

    public List<Vehicle> getOwnedVehicles() {
        return vehicleRepository.findAll();
    }
}
