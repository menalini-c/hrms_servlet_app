package com.snipe.learning.hrmswebapp.repository;

import java.util.Map;

import com.snipe.learning.hrmswebapp.domain.User;
import com.snipe.learning.hrmswebapp.exception.HrmsException;


public interface AuthenticationDao {
	
	public Map<String,String> validateUserRecord(User user) throws HrmsException;
}
