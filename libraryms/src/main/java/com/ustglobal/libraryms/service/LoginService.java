package com.ustglobal.libraryms.service;

import com.ustglobal.libraryms.beans.Users;
import com.ustglobal.libraryms.customException.CustomException;

public interface LoginService {

	public Users login(Users users) throws CustomException ;
}
