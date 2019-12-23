package com.ustglobal.libraryms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.libraryms.beans.Users;
import com.ustglobal.libraryms.customException.CustomException;
import com.ustglobal.libraryms.dao.LoginDAO;
import com.ustglobal.libraryms.dao.LoginDAOImpl;
import com.ustglobal.libraryms.validation.Validation;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao = new LoginDAOImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Users login(Users users) throws CustomException {
		if(users!= null) {
			validation.validatePassword(users.getPassword());
			return dao.login(users);
		}
		return null;
		
	}// end of login()

}
