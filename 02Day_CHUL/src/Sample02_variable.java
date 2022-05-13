
public class Sample02_variable {

	public static void main(String[] args) {//main 시작

		 //함수안에 선언된 변수 : 로컬, 지역변수 
		// 선언된 함수 안에서만 사용가능,  함수 호출시 생성, 종료시에 소멸됨 
		//로컬변수는 반드시 선언, 초기화 한 후 사용해야함 ,
		// 홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63)체중(78.25
		//1. 변수선언( 메모리에 특정크기의 영역생성)
		String name;//변수,name변수,문자열변수,Strng타입의변수,참조형변수
		int age; //변수, age변수, 정수형변수,int 타입의 변수,기본형변수
		String address; // 참조형변수
		char gender;//변수,gender변수,문자형변수,char타입변수,기본형변ㅅ
		boolean isMarried;// 기본형변수
		float height; // 기본형변수
		double weight; // 기본형변수
		
		
		
		
		
		
		//long long_int=100L;
		
		//2. 변수초기화 ( 값을 맨처음 설정하는 작업)
		name ="홍길동";
		age =20;
		address = "서울";
		gender ='남'; //주의
		System.out.println(gender);//로컬변수는 선언, 초기화 후 사용함 
		isMarried= false;
	height = 185.63F; //주의
//		height= 3.14;
		weight = 78.25;
		
		
		System.out.println(name);//3. 변수의 사용 
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);
		
		int age2;//변수는 저장값이 상황에 따라  바뀜 
		age2=10;
		age2=20;
		System.out.println(age2+100);
		System.out.println(age2);
		age2= age2+100;
		System.out.println(age2);
		
		

	}//main 끝

}
