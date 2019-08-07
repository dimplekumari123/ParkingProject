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
public class EmployeeParkingRequest {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private boolean active;
@OneToOne
@JoinColumn(name="empId")
private Employee emp;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
}
