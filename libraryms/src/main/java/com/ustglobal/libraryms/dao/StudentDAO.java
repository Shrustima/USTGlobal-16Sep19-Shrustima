package com.ustglobal.libraryms.dao;

import java.util.List;

import com.ustglobal.libraryms.beans.BooksInventory;
import com.ustglobal.libraryms.customException.CustomException;

public interface StudentDAO {

	public List<BooksInventory> searchBook(BooksInventory booksInventory) throws CustomException;
	public Boolean requestBook(int bookId) throws CustomException;

}
