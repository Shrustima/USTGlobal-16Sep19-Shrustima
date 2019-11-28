package com.ustglobal.exception.customizeduncheckedexception;

public class Validator {
	
	
	

	public void verify(int age) {
		if(age < 18) {
			throw new InvalidAgeException("try again next time!!");
	}

}
}
