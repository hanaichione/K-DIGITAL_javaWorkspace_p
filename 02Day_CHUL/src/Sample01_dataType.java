import java.util.Date;
//묵시적으로 import java.lang.* 코드가 자동 삽입돔 , 
//나머지는 명시적 코드 작성해야함

public class Sample01_dataType {

	public static void main(String[] args) {
		
		long num= 100L;//long형 저장시 값뒤에 ㅣ, L을 명시 
	//	byte num2= 300;
		float num3= 3.14F;  //실수형 float사용시 F명시 주의 
		System.out.println("\uD64D"); // 문자열, 반드시  "",String
		System.out.println(100); // 정수 
		System.out.println(3.14); // 실수, 3.14D 와 동일 
		System.out.println(3.14F); // 실수 ,f 와 동일
		System.out.println(3.14D); // 실수 ,d 와동일
		System.out.println('\uD64D'); // 문자(하나의 문자),반드시 ''
		
		System.out.println(true); // 논리값(true,false)
		System.out.println(false); // 논리값(true,false)
		//System.out.println(null); //null 값, 가리키지않는것(참조하지않는것)
		Date d= new Date();//참조변수 
		System.out.println(d); // 날짜
		//날짜 api 객체 생성, 사용 
	    	
		
		
	}

}
