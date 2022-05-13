package com.test;

public class Ex08_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		Integer num2 =new Integer( num);
		int num5= num2.intValue();
		System.out.println(num == num5);
		
		Integer num3 = new Integer(200);
		int num4 = num3.intValue();
		
		System.out.println( num3 > 100);
	}

}
