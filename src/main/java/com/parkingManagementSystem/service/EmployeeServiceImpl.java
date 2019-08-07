package com.parkingManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingManagementSystem.entity.ParkingSpot;
import com.parkingManagementSystem.repository.EmployeeRepository;
import com.parkingManagementSystem.repository.ParkingSpotRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	@Override
	public boolean freeParkingSpace(Long empoyeeId, boolean available) {
		ParkingSpot parking=parkingSpotRepository.findByEmp( empoyeeId);
		parking.setAvailable(available);
		parkingSpotRepository.save(parking);
		return available;
	}
}
