package com.ustglobal.libraryms.service;

import java.util.List;

import com.ustglobal.libraryms.beans.BooksInventory;
import com.ustglobal.libraryms.customException.CustomException;

public interface StudentService {
	
	public List<BooksInventory> searchBook(BooksInventory booksInventory) throws CustomException;
	public Boolean requestBook(int bookId) throws CustomException;
}
