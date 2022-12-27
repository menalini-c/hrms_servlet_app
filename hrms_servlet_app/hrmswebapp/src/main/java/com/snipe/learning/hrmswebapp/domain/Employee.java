package com.snipe.learning.hrmswebapp.domain;

import java.time.LocalDate;

public class Employee {
	private String emp_No;
	private String designation;
	private String first_Name;
	private String second_Name;
	private String gender;
	private LocalDate dob;
	private long contact_No;
	private String email_Id;
	private LocalDate hire_Date;
	private String pan_No;
	private Employee_Address emp_Address;
	private String job_Id;
	private String dept_No;
	private String manager_No;
	private String user_name;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	
	public String getEmp_No() {
		return emp_No;
	}
	public void setEmp_No(String emp_No) {
		this.emp_No = emp_No;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getSecond_Name() {
		return second_Name;
	}
	public void setSecond_Name(String second_Name) {
		this.second_Name = second_Name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getContact_No() {
		return contact_No;
	}
	public void setContact_No(long contact_No) {
		this.contact_No = contact_No;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public LocalDate getHire_Date() {
		return hire_Date;
	}
	public void setHire_Date(LocalDate hire_Date) {
		this.hire_Date = hire_Date;
	}
	public String getPan_No() {
		return pan_No;
	}
	public void setPan_No(String pan_No) {
		this.pan_No = pan_No;
	}
	public Employee_Address getEmp_Address() {
		return emp_Address;
	}
	public void setEmp_Address(Employee_Address emp_Address) {
		this.emp_Address = emp_Address;
	}
	public String getJob_Id() {
		return job_Id;
	}
	public void setJob_Id(String job_Id) {
		this.job_Id = job_Id;
	}
	public String getDept_No() {
		return dept_No;
	}
	public void setDept_No(String dept_No) {
		this.dept_No = dept_No;
	}
	public String getManager_No() {
		return manager_No;
	}
	public void setManager_No(String manager_No) {
		this.manager_No = manager_No;
	}
	@Override
	public String toString() {
		return "Employee [emp_No=" + emp_No + ", designation=" + designation + ", first_Name=" + first_Name
				+ ", second_Name=" + second_Name + ", gender=" + gender + ", dob=" + dob + ", contact_No=" + contact_No
				+ ", email_Id=" + email_Id + ", hire_Date=" + hire_Date + ", pan_No=" + pan_No + ", emp_Address="
				+ emp_Address + ", job_Id=" + job_Id + ", dept_No=" + dept_No + ", manager_No=" + manager_No
				+ ", user_name=" + user_name + ", password=" + password + "]";
	}

}
