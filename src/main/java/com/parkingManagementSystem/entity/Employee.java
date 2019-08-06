package com.parkingManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long empId;
private String name;
private Integer experience;
private String designation;
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getExperience() {
	return experience;
}
public void setExperience(Integer experience) {
	this.experience = experience;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

}
