package com.snipe.learning.hrmswebapp.constants;

public interface IConstants {
	
	public static final String GENDER_F = "F";
	public static final String GENDER_M = "M";
	//Connection
	public static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/hrms";
	public static final String DB_USER_NAME="root";
	public static final String DB_PASSWORD="root@123";
	
	//Employee table queries
	public static final String SELECT_EMPLOYEES_LIST_QUERY = "select emp.emp_no, emp.emp_desig, emp.first_name, emp.last_name, emp.dob, emp.hire_date, emp.gender, "
			+ "emp.email_id, emp.mobile_no, emp.pan_no, emp.password, emp_add.h_no, emp_add.street_no, emp_add.colony, "
			+ "emp_add.locality, emp_add.pincode, emp_add.city, emp_add.state, emp_add.country, "
			+ "emp_grade.emp_dept_no, emp_grade.emp_grade_id, emp_grade.emp_manager_no "
			+ "from tbl_employee emp "
			+ "join tbl_emp_address emp_add on emp.emp_no = emp_add.emp_no "
			+ "join tbl_emp_grade_detail emp_grade on emp.emp_no = emp_grade.emp_no";
	public static final String INSERT_INTO_EMP = "insert into tbl_employee(emp_no,emp_desig,first_name,last_name,dob,hire_date,gender,email_id,mobile_no,pan_no) "
			+ "values(?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_INTO_EMP_WITH_OUT_EMP_NO = "insert into tbl_employee(emp_desig,first_name,last_name,dob,hire_date,gender,email_id,mobile_no,pan_no,password) "
			+ "values(?,?,?,?,?,?,?,?,?,?)";
	public static final String SELECT_MAX_EMP_ID =  "select max(emp_no) as emp_no from tbl_employee";
	public static final String INSERT_INTO_EMP_ADD = "insert into tbl_emp_address(emp_no,h_no,street_no,colony,locality,pincode,city,state,country) values(?,?,?,?,?,?,?,?,?)";
	public static final String SELECT_FROM_EMP = "select emp_no, email_id from tbl_employee where mobile_no = ? and password = ?";
	
	//Department table queries
	public static final String SELECT_FROM_DEPT_USING_DEPT_ID = "select * from tbl_dept where dept_no=?";
	public static final String INSERT_INTO_DEPT  = "insert into tbl_dept(dept_name, dept_location) values(?,?)";
	public static final String SELECT_FROM_DEPT = "select * from tbl_dept";
	
	//pay_grade table queries
	
	public static final String SELECT_FROM_GRADE_USING_GRADE_ID = "select * from tbl_pay_grade where grade_id=?";
	public static final String SELECT_FROM_GRADE = "select * from tbl_pay_grade";
	public static final String INSERT_INTO_PAY_GRADE = "insert into tbl_pay_grade(grade_name,grade_basic,grade_ta,grade_da,grade_hra,grade_ma,grade_bonus,grade_pf,grade_pt) values(?,?,?,?,?,?,?,?,?)";
	
	public static final String INSERT_INTO_EMP_GRADE_DETAIL  = "insert into tbl_emp_grade_detail(emp_no,emp_dept_no,emp_grade_id,emp_from_date,emp_manager_no) values(?,?,?,?,?)";
	
	//User table queries
	
	public static final String SELECT_FROM_USER = "select user_id, email_id, user_type from tbl_user where user_name = ? and password = ? ";
	
}
