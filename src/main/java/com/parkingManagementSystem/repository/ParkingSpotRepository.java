package com.parkingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parkingManagementSystem.entity.ParkingSpot;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Long>{
public ParkingSpot findByEmp(Long  empoyeeId);



//public ParkingSpot findByEmp

}
