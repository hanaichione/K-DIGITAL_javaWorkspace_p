package com.test;  //패키지 선언은 코드이 맨 첫줄에 반드시 들어가야함 
//import 

public class Ex05_12_1 {
//	public void change(int num) {
//		num=20;
//	}
	public static  void change(int num) {//클래스로딩-> static 로딩 (생성)-> main실행 
		//static함수, 변수 클래스 변수, 클래스 함수  : 클래스이름.함수이름, 클래스이름.변수이름 
		//new를 하지 않아도 사용 가능함. 
		num=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex05_12_1 t= new Ex05_12_1();
		int num=10;
		System.out.println("chage 함수 호출전 num======"+ num);
		change(num);  //static메소드를 같은 클래스안에서 객체 생성 필요없이 바로 호출 사용 
		System.out.println("change 함수 호출 후 num========"+num);
		Ex05_12_1.change(num);//클래스이름.static함수이름

	}

}
