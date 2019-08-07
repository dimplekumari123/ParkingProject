package com.parkingManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class ParkingSpot {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long parkingId;
private boolean available;
@OneToOne
@JoinColumn(name="empId")
private Employee emp;
public Employee getEmp() {
	return emp;
}
public void setEmp(Employee emp) {
	this.emp = emp;
}
public Long getParkingId() {
	return parkingId;
}
public void setParkingId(Long parkingId) {
	this.parkingId = parkingId;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}


}
