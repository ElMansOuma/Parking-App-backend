package com.example.parking_backend.service;

import com.example.parking_backend.model.GlobalDashboardStats;
import com.example.parking_backend.repository.BookingRepository;
import com.example.parking_backend.repository.ParkingSlotRepository;
import com.example.parking_backend.repository.VehicleOwnerRepository;
import com.example.parking_backend.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlobalDashboardService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ParkingSlotRepository parkingSlotRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleOwnerRepository vehicleOwnerRepository;

    public GlobalDashboardStats getGlobalDashboardStats() {
        GlobalDashboardStats stats = new GlobalDashboardStats();
        stats.setTotalBookings((int) bookingRepository.count());
        stats.setTotalParkingSlots((int) parkingSlotRepository.count());
        stats.setTotalVehicles((int) vehicleRepository.count());
        stats.setTotalVehicleOwners((int) vehicleOwnerRepository.count());
        return stats;
    }
}
