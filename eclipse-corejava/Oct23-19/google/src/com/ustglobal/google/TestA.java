package com.ustglobal.google;

public class TestA {

		 public static void main(String[] args) {
			
			 Browser b = new Browser();
			 
			 Google g = new Gmail(); // up casting
			 b.open(g);
			 
			 Google gd = new GoogleDrive(); //up casting
			 b.open(gd);
		}
}
