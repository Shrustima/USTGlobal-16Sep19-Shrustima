package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("==================");
		
		for(int i : num) {
			System.out.println(num);
		}
		System.out.println("======================");
		char[] ch = {'a', 'b','c','d'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("=============");
		for(int c : ch)
		{
			System.out.println(c);
		}
		System.out.println("=========================");
		boolean[] b = {true, false, true , false};
		for(boolean b1 : b ) {
			System.out.println(b1);
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(i);
		}
		System.out.println("========================");
		
		
		
		byte[] by = {1, 2, 3};
		for(byte by1 : by) {
			System.out.println(by1);
		}
		for(int i=0;i<by.length;i++) {
			System.out.println(i);
		}
		System.out.println("===========================");
		
		
		
		String[] s11 = {"shru", "shra"};
		for(String s111 : s11) {
			System.out.println(s111);
		}
	}

}
