package com.snipe.learning.hrmswebapp.exception;

public class ErrorCode {
	
	public static final String INPUT_ERROR = "Invalid Error";
	public static final String LOAD_DRIVER_ERROR ="Error in loading Driver Class";
	public static final String SQL_INSERT_ERROR ="Insert SQL is not working";
	public static final String SQL_UNKNOWN_ERROR=" UNknown SQL error";
	public static final String UNKNOWN_ERROR=" UNknown error";
	
	//user validations
	
	public static final String ENTER_VALID_USER_NAME= "Please enter Valid UserName (Ur Mobile Number)";
	public static final String ENTER_VALID_PASSWORD= "1.Password must contain at least one digit [0-9].\r\n"
			+ "2.Password must contain at least one lowercase Latin character [a-z].\r\n"
			+ "3.Password must contain at least one uppercase Latin character [A-Z].\r\n"
			+ "4.Password must contain at least one special character like ! @ # & ( ).\r\n"
			+ "5.Password must contain a length of at least 8 characters and a maximum of 20 characters.";
	
	//Employee Validations
	public static final String EMPTY_INPUT=" Input cannot be Empty";
	public static final String EMP_NAME_VALIDATE_ERROR=" Employee Name should contain minimum of 5 and maximum of 20 characters and only alphabtes(a-z or A-Z)";
	public static final String DOB_VALIDATE_ERROR="Date of Birth must be in YYYY-MM-DD format";
	public static final String GENDER_VALIDATE_ERROR="PLEASE Enter Either M(Male) or F(Female) Or O(Others)";
	public static final String EMAIL_VALIDATE_ERROR="PLEASE Enter Valid Email ID";
	public static final String MOBILE_NO_VALIDATE_ERROR="PLEASE Enter Valid Mobile No";
	public static final String PAN_NO_VALIDATE_ERROR="PLEASE Enter Valid Pan No";
	public static final String NAME_VALIDATE_ERROR="Must contain only alphabets";
	public static final String NUMBER_VALIDATE_ERROR="Must contain only numbers";
	public static final String PIN_CODE_VALIDATE_ERROR="Please enter valid pincode";
	
	public static final String DEPT_DOESNT_EXIST = "Department into which you are trying to create Employee doesn't exist";
	public static final String GRADE_DOESNT_EXIST = "GRADE into which you are trying to create Employee doesn't exist"; 
	public static final String ENTER_Y_N = "Please Enter either Y or N only";

}
