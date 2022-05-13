package com.test;
public class Ex09_7_2 {

	//public static void check(int num) throws Exception{
		public static void check(int num) throws Exception {
	
		if (num <100) throw new Exception("num 값이 100보다 작다");//Exception 강제 발생
	
	}
	
	public static void main(String[] args)  {
		System.out.println("프로그램 시작");
		try {
			check(70);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	

	}

}
