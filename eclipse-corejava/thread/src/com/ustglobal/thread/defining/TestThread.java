package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {

		System.out.println("Main started");
		MyThread t1 = new MyThread();
		t1.start();
		//t1.start();        IllegalThreadStateException            if we try to restart
		
		/*
		 * dont call run() method bcz it behaves like normal progrm
		 * All code will be executed inside main thread only
		 */		
		//t1.run();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main ended");
	}
}
