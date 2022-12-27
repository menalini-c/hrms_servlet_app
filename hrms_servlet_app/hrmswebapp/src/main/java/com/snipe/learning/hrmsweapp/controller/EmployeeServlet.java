package com.snipe.learning.hrmsweapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.snipe.learning.hrmswebapp.domain.Employee;
import com.snipe.learning.hrmswebapp.exception.HrmsException;
import com.snipe.learning.hrmswebapp.service.EmployeeService;
import com.snipe.learning.hrmswebapp.service.EmployeeServiceImpl;

@WebServlet("/EmpServlet")
public class EmployeeServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession mySession = request. getSession(true);
		RequestDispatcher rd = null;
		try {
			String operation = request.getParameter("operation");
			if(operation.equalsIgnoreCase("addEmployee"))
				response.sendRedirect("addEmp.jsp");
			else if(operation.equalsIgnoreCase("viewAllEmployees")) {
				EmployeeService employeeService = new EmployeeServiceImpl();
				List<Employee>  employeeRecords = new  ArrayList<Employee>();
				employeeRecords = employeeService.getEmployeeRecords();
				System.out.println("employeeRecords ::"+employeeRecords);
				if(employeeRecords != null && employeeRecords.size() >0) {
					mySession.setAttribute("employeeRecords", employeeRecords);
					
					for(Employee emp : employeeRecords){
						System.out.println(emp.getContact_No());
					}
					rd = request.getRequestDispatcher("viewAllEmployees.jsp");
					rd.forward(request, response);
				}else 
					throw new HrmsException("There are no Employess");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			rd= request.getRequestDispatcher("error.jsp");
			request.setAttribute("errorMessage", e.getMessage());
			rd.forward(request, response);
		}finally {
			
		}
		
			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession mySession = request. getSession(true);
		RequestDispatcher rd = null;
		try {
			System.out.println("Im in post");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			rd= request.getRequestDispatcher("error.jsp");
			request.setAttribute("errorMessage", e.getMessage());
			rd.forward(request, response);
		}finally {
			
		}
	}

}
