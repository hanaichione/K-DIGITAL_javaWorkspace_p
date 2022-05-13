import java.util.Scanner;

public class ScannerTest4 {
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자 ");
		//int num=  scan.nextInt();
		String num_str=  scan.next();
		int num= Integer.parseInt(num_str);////아주 중요함 ...

		
		String message =(num%2==0)?"짝수":"홀수";
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
