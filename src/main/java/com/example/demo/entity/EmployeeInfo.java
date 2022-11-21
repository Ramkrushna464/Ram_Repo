package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "EMPLOYEE_INFO")
public class EmployeeInfo {

	@Id
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeePincode;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeePincode() {
		return employeePincode;
	}

	public void setEmployeePincode(String employeePincode) {
		this.employeePincode = employeePincode;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeePincode=" + employeePincode + "]";
	}

}
