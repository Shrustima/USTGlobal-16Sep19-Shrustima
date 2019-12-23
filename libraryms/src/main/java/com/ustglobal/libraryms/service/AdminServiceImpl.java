package com.ustglobal.libraryms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.libraryms.beans.Users;
import com.ustglobal.libraryms.customException.CustomException;
import com.ustglobal.libraryms.dao.AdminDAO;
import com.ustglobal.libraryms.dao.AdminDaoImpl;
import com.ustglobal.libraryms.validation.Validation;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	//private AdminDAO dao = new AdminDaoImpl();
	AdminDAO dao = new AdminDaoImpl();
	
	Validation validation = new Validation();
	
	@Override
	public Users addLibrarian(Users users) throws CustomException {
		if(users!= null) {
			validation.validateEmail(users.getEmail());
			validation.validatePassword(users.getPassword());
			return dao.addLibrarian(users);
		}
		return null;
	}// end of addLibrarian()

	@Override
	public Boolean deleteLibrarian(int id) throws CustomException {
		return dao.deleteLibrarian(id);
	}// end of deleteLibrarian()

	@Override
	public List<Users> displayLibrarian() throws CustomException {
		return dao.displayLibrarian();
	}// end of displayLibrarian()

}
