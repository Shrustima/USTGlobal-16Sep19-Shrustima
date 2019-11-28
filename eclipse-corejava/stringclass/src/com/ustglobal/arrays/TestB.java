package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40};
//		System.out.println(nums[10]);  //ArrayIndexOutOfBoundsException
		receive(nums);
		int[] values = getArray2();
		
		for(int val : values) {
			System.out.println(val);
		}
		
		
		String[] s11 = {"shru", "shar"};
		receive(s11);
		int[] stt = getArray2();
		
		for(int val1 : stt) {
			System.out.println(val1);
		}
	}
static void receive(int[] numbers) {      //passing array as parameters
	
	for(int num : numbers) {
		System.out.println(num);
	}
}
static int[] getArray2() {
	int[] values = {30,40,50};
	return values;
} 
 
static void  receive(String[] s1) {
	for(String str1 : s1) {
		System.out.println(str1);
	}
}
static String[] getArray() {
	String[] stt = {"shrr", "shraaa"};
	return stt;
}






}
