package com.ustglobal.libraryms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.libraryms.beans.BooksInventory;
import com.ustglobal.libraryms.customException.CustomException;
import com.ustglobal.libraryms.dao.StudentDAO;
import com.ustglobal.libraryms.dao.StudentDAOImpl;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao = new StudentDAOImpl();
	
	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory) throws CustomException {
		return dao.searchBook(booksInventory);
	}// end of searchBook()
	
	@Override
	public Boolean requestBook(int bookId) throws CustomException {
		return dao.requestBook(bookId);
	}// end of requestBook() 

}
