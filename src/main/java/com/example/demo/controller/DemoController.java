package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeInfo;
import com.example.demo.service.EmployeeServiceInterface;

@RequestMapping("/DemoApp")
@RestController
public class DemoController {

	@Autowired
	EmployeeServiceInterface service;

	@PostMapping(value = "/saveEmployee", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Object> saveEmployee(@RequestBody EmployeeInfo empInfo) {
		String responseMessage = service.saveEmployeeService(empInfo).toString();
		return new ResponseEntity<Object>(responseMessage, HttpStatus.OK);
	}

	@GetMapping(value = "/getEmployee", consumes = "application/json")
	public ResponseEntity<Object> getEmployee() {
		List<EmployeeInfo> employeeService = service.getEmployeeService();
		return new ResponseEntity<Object>(employeeService, HttpStatus.OK);
	}

}
