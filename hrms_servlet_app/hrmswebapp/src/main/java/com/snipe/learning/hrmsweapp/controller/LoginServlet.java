package com.snipe.learning.hrmsweapp.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.snipe.learning.hrmswebapp.domain.User;
import com.snipe.learning.hrmswebapp.exception.ErrorCode;
import com.snipe.learning.hrmswebapp.exception.HrmsException;
import com.snipe.learning.hrmswebapp.service.AuthenticationService;
import com.snipe.learning.hrmswebapp.service.AuthenticationServiceImpl;
import com.snipe.learning.hrmswebapp.utility.VadilationUtility;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession mySession = request. getSession(true);
		RequestDispatcher rd = null;
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if(!VadilationUtility.mobileNoValidatorPredicate.test(username))
				throw new HrmsException(ErrorCode.ENTER_VALID_USER_NAME);
			if(!VadilationUtility.passwordValidatorPredicate.test(password))
				throw new HrmsException(ErrorCode.ENTER_VALID_PASSWORD);
			
			AuthenticationService authenticationService = new AuthenticationServiceImpl();
			User user = new User();
			user.setUser_name(username);
			user.setPassword(password);
			//user.setUser_type(role);
			Map<String,String> userDetailRecord = authenticationService.validateUserRecord(user);
			System.out.println(userDetailRecord);
			if(userDetailRecord != null && userDetailRecord.size()>0) {
				user.setUser_type(userDetailRecord.get("user_type"));
				System.out.println(user);
				mySession.setAttribute("user", user);
				rd= request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}else {
				rd= request.getRequestDispatcher("error.jsp");
				request.setAttribute("errorMessage","Enter valid user Details..OR.. user doesn'texit..!!");
				rd.forward(request, response);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			rd= request.getRequestDispatcher("error.jsp");
			request.setAttribute("errorMessage", e.getMessage());
			rd.forward(request, response);
		}finally {
			
		}
	}

}
