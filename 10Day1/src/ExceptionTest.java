
public class ExceptionTest {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("프로그램 시작"); //int num=10/0; //ArithmeticException 발생 후
		 * 프로그램 중단 String num=null;
		 * System.out.println(num.length());//NullPointerException 발생 후 //예외처리 :
		 * Exception handling = 예외를 수정하는게 아닌 더 정확한 예외메세지, //프로그램은 끝까지 동작하도록 처리
		 * System.out.println("프로그램 종료 ");
		 */
		System.out.println("프로그램 시작");
	try {	
		int num =10;
		int result =num/0;   //ArithmeticException 발생
		System.out.println(result);
	}catch(RuntimeException  e) {
		System.out.println("예외발생");
	}
		System.out.println("프로그램 종료");
	
	
	}
}
