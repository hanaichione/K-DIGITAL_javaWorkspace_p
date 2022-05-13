import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println(name);
		System.out.println("나이 입력하세요");
		int age = scan.nextInt();
		System.out.println(age);
		

		scan.close();
	}

}
