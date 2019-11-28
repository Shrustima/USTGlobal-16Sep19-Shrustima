package com.ustglobal.exception.first;

public class TestA {
	
		public static void main(String[] args) {
			
			System.out.println("main started");
			
			int[] a= {10, 20, 30};
			
			System.out.println(a[1]);
			try {
				System.out.println(a[3]);              //exception occured
			}
			catch(ArrayIndexOutOfBoundsException ae) {         // executed only if there is exception
				System.out.println("Index is no present");
			}
			
			System.out.println("Main ended");
		}

}
