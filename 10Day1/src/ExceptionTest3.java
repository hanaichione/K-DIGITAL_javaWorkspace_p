
public class ExceptionTest3 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
	try {	
		int num =10;
		int result =num/0;
		System.out.println(result);
	}catch(ArithmeticException  e) {  //다형성(권장안함),딱 알맞는 클래스 사용하자.
		System.out.println("예외발생" + e.getMessage());
		e.printStackTrace(); //개발자가 디버깅시 주로사용
	}
		System.out.println("프로그램 종료");
	}

}
