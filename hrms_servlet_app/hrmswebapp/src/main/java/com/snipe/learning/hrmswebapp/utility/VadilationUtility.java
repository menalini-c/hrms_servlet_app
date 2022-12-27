package com.snipe.learning.hrmswebapp.utility;

import java.util.function.Predicate;

public class VadilationUtility {
	
	
	public static final Predicate<String> numberValidatorPredicate = name -> name.matches("[0-9]{1,10}");
	public static final Predicate<String> dobValidatorPredicate = dob -> dob.matches("^([0-9]{4})-(1[0-2]|0[1-9])-(0[1-9]|[12][0-9]|3[01])$");
	public static final Predicate<String> genderValidatorPredicate = gender -> gender.matches("M|F|O|");
	public static final Predicate<String> emailValidatorPredicate = email -> email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
	public static final Predicate<String> mobileNoValidatorPredicate = mobile_no -> mobile_no.matches("^(?!0+$)\\d{10}$");
	public static final Predicate<String> panNoValidatorPredicate =  pan_no -> pan_no.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	public static final Predicate<String> pinCodeValidatorPredicate = pincode -> pincode.matches("^[1-9][0-9]{5}$");
	//public static final Predicate<String> nameValidatorPredicate = name -> name.matches("[a-zA-Z\s]{2,20}");
	public static final Predicate<String> passwordValidatorPredicate  = password -> password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{5,20}$");

}
