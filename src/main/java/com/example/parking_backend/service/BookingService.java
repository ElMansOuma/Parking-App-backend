package com.example.parking_backend.service;

import com.example.parking_backend.exceptions.ResourceNotFoundException;
import com.example.parking_backend.model.Booking;
import com.example.parking_backend.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(Long id, Booking updatedBooking) {
        Booking existingBooking = bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found for id :: " + id));
        existingBooking.setReference(updatedBooking.getReference());
        existingBooking.setCustomerName(updatedBooking.getCustomerName());
        existingBooking.setVehicle(updatedBooking.getVehicle());
        existingBooking.setDuration(updatedBooking.getDuration());
        existingBooking.setSlot(updatedBooking.getSlot());
        existingBooking.setStatus(updatedBooking.getStatus());
        existingBooking.setRemarks(updatedBooking.getRemarks());
        return bookingRepository.save(existingBooking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found for id :: " + id));
        bookingRepository.deleteById(id);
    }
}
