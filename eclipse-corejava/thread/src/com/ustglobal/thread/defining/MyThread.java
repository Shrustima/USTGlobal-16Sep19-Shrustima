package com.ustglobal.thread.defining;

public class MyThread extends Thread{

	public void run() {                                         // overriding run() method 
		for(int i = 0; i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
}
