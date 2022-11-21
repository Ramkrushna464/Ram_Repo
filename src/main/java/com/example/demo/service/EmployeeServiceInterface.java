package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.EmployeeInfo;

public interface EmployeeServiceInterface {

	public String saveEmployeeService(EmployeeInfo empInfo);

	public List<EmployeeInfo> getEmployeeService();

}
