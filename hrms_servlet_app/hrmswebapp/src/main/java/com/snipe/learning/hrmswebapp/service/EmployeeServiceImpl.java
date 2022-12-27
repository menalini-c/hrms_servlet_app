package com.snipe.learning.hrmswebapp.service;

import java.util.List;

import com.snipe.learning.hrmswebapp.domain.Employee;
import com.snipe.learning.hrmswebapp.exception.HrmsException;
import com.snipe.learning.hrmswebapp.repository.EmployeeDao;
import com.snipe.learning.hrmswebapp.repository.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	@Override
	public int addEmployeeRecord(Employee employee) throws HrmsException {
		return employeeDao.addEmployeeRecord(employee);
	}

	@Override
	public List<Employee> getEmployeeRecords() throws HrmsException {
		return employeeDao.getEmployeeRecords();
	}
}
