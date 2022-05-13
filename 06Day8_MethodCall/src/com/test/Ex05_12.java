package com.test;  //패키지 선언은 코드이 맨 첫줄에 반드시 들어가야함 
//import 

public class Ex05_12 {
	public void change(int num) {
		num=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex05_12 t= new Ex05_12();
		int num=10;
		System.out.println("chage 함수 호출전 num======"+ num);
		t.change(num);  //기본형 데이터 를 함수에 매개변수로 전달시 값의 복사 (다른 변수 에 저장 )
		System.out.println("change 함수 호출 후 num========"+num);

	}

}
