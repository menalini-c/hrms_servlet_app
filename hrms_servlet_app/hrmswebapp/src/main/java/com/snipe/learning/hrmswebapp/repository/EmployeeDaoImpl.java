package com.snipe.learning.hrmswebapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.snipe.learning.hrmswebapp.constants.IConstants;
import com.snipe.learning.hrmswebapp.domain.Employee;
import com.snipe.learning.hrmswebapp.domain.Employee_Address;
import com.snipe.learning.hrmswebapp.exception.ErrorCode;
import com.snipe.learning.hrmswebapp.exception.HrmsException;

public class EmployeeDaoImpl implements EmployeeDao{
	
	public List<Employee> getEmployeeRecords() throws HrmsException {
		Connection connection = null;
		List<Employee> employeesList = new ArrayList<Employee>();
		try {
			connection = ConnectToDatabase.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(IConstants.SELECT_EMPLOYEES_LIST_QUERY);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmp_No(rs.getString("emp_no"));
				employee.setDesignation(rs.getString("emp_desig"));
				employee.setFirst_Name(rs.getString("first_name"));
				employee.setSecond_Name(rs.getString("last_name"));
				employee.setDob(rs.getDate("dob").toLocalDate());
				employee.setHire_Date(rs.getDate("hire_date").toLocalDate());
				employee.setGender(rs.getString("gender"));
				employee.setEmail_Id(rs.getString("email_id"));
				employee.setContact_No(rs.getLong("mobile_no"));
				employee.setPan_No(rs.getString("pan_no"));
				employee.setUser_name(rs.getString("mobile_no"));
				employee.setPassword(rs.getString("password"));
				employee.setDept_No(String.valueOf(rs.getInt("emp_dept_no")));
				employee.setJob_Id(String.valueOf(rs.getInt("emp_grade_id")));
				employee.setManager_No(String.valueOf(rs.getInt("emp_manager_no")));
				
				Employee_Address employeeAddress = new Employee_Address();
				employeeAddress.setHouse_no(rs.getString("h_no"));
				employeeAddress.setStreet_no(rs.getString("street_no"));
				employeeAddress.setColony(rs.getString("colony"));
				employeeAddress.setLocality(rs.getString("locality"));
				employeeAddress.setPin_code(rs.getLong("pincode"));
				employeeAddress.setCity(rs.getString("city"));
				employeeAddress.setState(rs.getString("state"));
				employeeAddress.setCountry(rs.getString("country"));
				employee.setEmp_Address(employeeAddress);
				employeesList.add(employee);
			}
		}catch (ClassNotFoundException cnfe) {
			throw new HrmsException(ErrorCode.LOAD_DRIVER_ERROR);
		}catch(SQLException se) {
			throw new HrmsException(se.getMessage());
		}catch(Exception e) {
			throw new HrmsException(e.getMessage());
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new HrmsException(e.getMessage());
			}
		}
		return employeesList;
	}

	@Override
	public int addEmployeeRecord(Employee employee) throws HrmsException {
		// TODO Auto-generated method stub
		return 0;
	}

}
