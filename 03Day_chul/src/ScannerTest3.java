import java.util.Scanner;

public class ScannerTest3 {
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("첫번째 입력 ");
		String str=  scan.next();
		//첫번째 이름과 두번째 이름을 입력 받아 두개가 같으면 이름 같음, 두개가 다르면 이름다름 출력 
//		System.out.println("입력하신 이름은 "+ str);
//		boolean result= str.equals("홍길동");
////		System.out.println(result);
//		//true =>이름이 같음, false=>이름이 다름 
		System.out.println("두번째 입력");
		String str2= scan.next();
		boolean result= str.equals(str2);
		String message =(result)?"이름같음":"이름다름";
		System.out.println(message);

		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// TODO Auto-generated method stub
//		Scanner scan= new Scanner(System.in);
//		System.out.println("이름 입력 : ");
//		String str= scan.next();
//	
//		boolean result = str.equals("홍길동");
//		String message=(result)?"이름이 같음":"이름이 다름 ";
//		System.out.println(message);
//		scan.close();
//		
		

	}

}
