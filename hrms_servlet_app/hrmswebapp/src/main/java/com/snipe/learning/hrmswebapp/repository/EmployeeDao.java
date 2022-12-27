package com.snipe.learning.hrmswebapp.repository;

import java.util.List;

import com.snipe.learning.hrmswebapp.domain.Employee;
import com.snipe.learning.hrmswebapp.exception.HrmsException;

public interface EmployeeDao {
	
	public List<Employee> getEmployeeRecords() throws HrmsException;
	public int addEmployeeRecord(Employee employee) throws HrmsException;

}
