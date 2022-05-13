package com.test;


public class Ex08_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		Integer x = new Integer(num);
		//1.5버전이전 에러가 남 
		int sum = x+ 1;//1.5버전 이후 객체 x를 자동으로 int로 변형, 자동 언박싱 
		// int sum= x.intValue()+1;
		System.out.println(sum);
		System.out.println(x);
		Integer x2= 10;  //1.5버전 이후 pdf 10을 자동으로 Integer객체로 변형, 자동 박싱 
		int x3 = x.intValue();
		System.out.println(x3);
		System.out.println(x2+num);
		Object i[]= new Object[3];
		i[0]=10;//자동박싱 
	i[1]= new Integer(20);//예전 방식 
	}

}
