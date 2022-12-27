package com.snipe.learning.hrmswebapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.snipe.learning.hrmswebapp.constants.IConstants;
import com.snipe.learning.hrmswebapp.domain.User;
import com.snipe.learning.hrmswebapp.exception.ErrorCode;
import com.snipe.learning.hrmswebapp.exception.HrmsException;

public class AuthenticationDaoImpl implements  AuthenticationDao{

	@Override
	public Map<String, String> validateUserRecord(User user) throws HrmsException {
		Connection connection = null;
		Map<String,String> userDetilsMap = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectToDatabase.getConnection();
			preparedStatement = connection.prepareStatement(IConstants.SELECT_FROM_USER);
			preparedStatement.setString(1, user.getUser_name());
			preparedStatement.setString(2, user.getPassword());
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				userDetilsMap = new HashMap<String,String>();
				userDetilsMap.put("user_id", rs.getString("user_id"));
				userDetilsMap.put("email_id", rs.getString("email_id"));
				userDetilsMap.put("user_type", rs.getString("user_type"));
			}
			System.out.println("no exception");
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
		return userDetilsMap;
	}

}
