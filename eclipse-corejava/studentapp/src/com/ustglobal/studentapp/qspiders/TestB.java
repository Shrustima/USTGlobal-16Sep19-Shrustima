package com.ustglobal.studentapp.qspiders;
import static com.ustglobal.studentapp.jspiders.Remote.*; // to access sonly static methods or variables
import com.ustglobal.studentapp.jspiders.*; // to accesss non static members 
public class TestB {
	public static void main(String[] args) {
		on();  // no need of class name dot
		System.out.println(num); //----do-----
		Remote r = new Remote(); // import non static by using * 
		System.out.println(r.sum);
		
	}
}
