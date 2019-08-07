package com.parkingManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parkingManagementSystem.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
EmployeeServiceImpl employeeServiceImpl;
@PutMapping("update/{id}/{status}")
public ResponseEntity<Boolean>  freeParkingSpace(@PathVariable Long id,@PathVariable boolean status){
	Boolean b=employeeServiceImpl.freeParkingSpace(id, status);
	
	return new ResponseEntity<Boolean> (b,HttpStatus.OK);
	
}
}
