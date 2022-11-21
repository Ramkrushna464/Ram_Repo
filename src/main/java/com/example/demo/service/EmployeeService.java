package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeInfo;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	EmployeeRepo empRepo;

	@Override
	public String saveEmployeeService(EmployeeInfo empInfo) {
		System.out.println(empInfo);
		EmployeeInfo save = empRepo.save(empInfo);
		return save.getEmployeeId() != 0 ? "Saved Successfully" : "Not Saved !!";
	}

	@Override
	public List<EmployeeInfo> getEmployeeService() {
		return empRepo.findAll();
	}

}
