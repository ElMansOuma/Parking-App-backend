package com.example.parking_backend.service;

import com.example.parking_backend.model.ParkingSlot;
import com.example.parking_backend.repository.ParkingSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSlotService {

    @Autowired
    private ParkingSlotRepository parkingSlotRepository;

    public List<ParkingSlot> getAllSlots() {
        return parkingSlotRepository.findAll();
    }

    public ParkingSlot addSlot(ParkingSlot slot) {
        return parkingSlotRepository.save(slot);
    }

    public void deleteSlot(Long id) {
        parkingSlotRepository.deleteById(id);
    }
}
