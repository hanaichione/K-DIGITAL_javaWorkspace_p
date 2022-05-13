package com.test;

public class Ex05_14 {
	int num=5;//멤버변수 
	public void methodA() {
		int num=4;//로컬 - 함수 호출 생성 , 사용, 함수 종료 시 삭제 
		System.out.println("method A: num====="+num);//로컬
		System.out.println("method A: this.num====="+this.num);//멤버
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ex05_14 test= new Ex05_14();
		 test.methodA();//4,5
		 test.num= 10;//맴버변수 
		 test.methodA();//4, 10 
		int num=3;//main의 로컬변수 
//		int num=5;
//		System.out.println("main num====="+num);

	}

}
