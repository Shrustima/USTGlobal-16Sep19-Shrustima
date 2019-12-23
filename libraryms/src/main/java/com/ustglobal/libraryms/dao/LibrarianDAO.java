package com.ustglobal.libraryms.dao;

import java.util.List;

import com.ustglobal.libraryms.beans.BooksInventory;
import com.ustglobal.libraryms.beans.BooksRegistration;
import com.ustglobal.libraryms.beans.BooksTransaction;
import com.ustglobal.libraryms.beans.Users;
import com.ustglobal.libraryms.customException.CustomException;

public interface LibrarianDAO {

	public Users registerStudent(Users user)throws CustomException;
	public Boolean deleteStudent(int id) throws CustomException;
	public Boolean addBooks(BooksInventory booksInventory) throws CustomException;
	public Boolean deleteBook(int bookId) throws CustomException;
	public Users getStudentInfo(int id) throws CustomException;
	public List<BooksRegistration> viewRequest() throws CustomException;
	public List<BooksInventory> showAllBooks() throws CustomException;
	public Boolean acceptRequest(int registrationId) throws CustomException;
	public Boolean rejectBook( int registrationId) throws CustomException;
	public List<BooksInventory> getBookInfo(int id) throws CustomException ;
	public Boolean returnBook(int id) throws CustomException;
	public List<BooksTransaction> getIssuedBooks() throws CustomException;

	
}
