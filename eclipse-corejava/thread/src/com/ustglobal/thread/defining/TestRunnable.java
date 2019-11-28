package com.ustglobal.thread.defining;

public class TestRunnable {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		MyRunnable mr = new MyRunnable();
		//mr.start();                start() is undefined in MyRunnable
		Thread t1 = new Thread(mr);
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
		System.out.println("Main ended");
	}

}
