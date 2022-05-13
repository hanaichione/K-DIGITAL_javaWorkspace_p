
public class ExceptionTest2 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
	try {	
		
		  int num =10; 
		  int result =num/0;//ArithmethicEx
		 		
			/* String name=null; System.out.println(name.length()); *///NullPointerEx
		 		//System.out.println(result);
	}catch(Exception  e) {  //권장하지 않지만 메세지 출력, 에러 경로찾는 함수
		e.printStackTrace();
		System.out.println("예외발생  : "+ e.getMessage() );
	}
		System.out.println("프로그램 종료");
	}

}
