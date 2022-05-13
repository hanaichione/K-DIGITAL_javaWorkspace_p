import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String str= scan.next();
	
	//	boolean result = str.equals("홍길동");
	//	String message=(result)?"이름이 같음":"이름이 다름 ";
		String message=( str.equals("홍길동"))?"이름이 같음":"이름이 다름 ";
		System.out.println(message);
		scan.close();
		
		

	}

}
