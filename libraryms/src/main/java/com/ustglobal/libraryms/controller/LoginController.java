package com.ustglobal.libraryms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.libraryms.beans.Users;
import com.ustglobal.libraryms.customException.CustomException;
import com.ustglobal.libraryms.service.LoginService;
import com.ustglobal.libraryms.service.LoginServiceImpl;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
public class LoginController {

	@Autowired
	LoginService service = new LoginServiceImpl();
	
	@PostMapping("/library/login/")
	public Users login(@RequestBody Users users) {
		 Users user = null;
		try {
			user = service.login(users);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return user;
	}// end of login()

	
}
