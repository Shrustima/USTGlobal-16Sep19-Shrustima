package com.ustglobal.libraryms.dao;

import com.ustglobal.libraryms.beans.Users;
import com.ustglobal.libraryms.customException.CustomException;

public interface LoginDAO {

	public Users login(Users users) throws CustomException ;
	
}
