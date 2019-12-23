package com.ustglobal.libraryms.dao;

import java.util.List;

import com.ustglobal.libraryms.beans.Users;
import com.ustglobal.libraryms.customException.CustomException;

public interface AdminDAO {

	public Users addLibrarian(Users users)  throws CustomException;
	public Boolean deleteLibrarian(int id) throws CustomException;
	public List<Users> displayLibrarian() throws CustomException;
	
}
