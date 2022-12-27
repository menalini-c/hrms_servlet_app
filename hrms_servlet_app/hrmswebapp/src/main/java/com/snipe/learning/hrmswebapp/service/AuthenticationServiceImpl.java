package com.snipe.learning.hrmswebapp.service;

import java.util.Map;


import com.snipe.learning.hrmswebapp.domain.User;
import com.snipe.learning.hrmswebapp.exception.HrmsException;
import com.snipe.learning.hrmswebapp.repository.AuthenticationDao;
import com.snipe.learning.hrmswebapp.repository.AuthenticationDaoImpl;

public class AuthenticationServiceImpl implements  AuthenticationService{
	
	AuthenticationDao authenticationDao = new AuthenticationDaoImpl();
	
	@Override
	public Map<String, String> validateUserRecord(User user) throws HrmsException {
		// TODO Auto-generated method stub
		return authenticationDao.validateUserRecord(user);
	}

}
