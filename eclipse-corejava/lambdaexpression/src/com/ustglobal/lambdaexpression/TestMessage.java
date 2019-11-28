package com.ustglobal.lambdaexpression;

public class TestMessage {
	public static void main(String[] args) {
		MessageInterface mess = (message)->{
			System.out.println(message);
			return message;
		};
		String messg = mess.great("Hello");
		System.out.println("our messages is "+messg);
	}

}
