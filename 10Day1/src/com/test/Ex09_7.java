package com.test;

public class Ex09_7 {

	// public static void check(int num) throws Exception{
	public static void check(int num) {
		try {// 1. Exceptin강제 발생 후 직접 try ~catch
			if (num < 100) {
				throw new Exception("num 값이 100보다 작다");// Exception 강제 발생
			}
		} catch (Exception e) {
			System.out.println("check함수에서 Exception발생 ");
		}
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		check(70);
		System.out.println("프로그램 정상 종료");

	}

}
