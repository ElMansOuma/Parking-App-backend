package com.example.parking_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.parking_backend")
public class ParkingBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(ParkingBackendApplication.class, args);
  }
}
