
public class Sample03_typeCasting {

	public static void main(String[] args) {
		
		// 데이터 타입 변경(자동으로 변경된다): 묵시적: promotion :자동변환
		//1. byte->short->int->long->float->double ( 작은-->큰)
		byte b= 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;
		System.out.println(b6);
		//2. char --> int
		char n ='A';
		int n2 = n+1;//연산시 int로 형변환 계산 
		System.out.println(n2);
		char c=(char)n2;  //명시적 형변환   int -> char 
		System.out.println(c);
		
		//3. int보다 작은 타입의연산결과는 int로 
		short x =10;
		short x2 =20;
		int  x3 = x + x2; //연산 후 결과는 자동 int로 변환 
		short x4=  (short) (x+ x2);  // 결과 int를 명시적으로 short로 변형 short변수에 저장 
		
		//4. 문자열과 + 문자열이아닌데이터 => 연결된 문자열로 반환
		System.out.println("10"+ 1+2+3);  //  
		System.out.println(1+2+3+"10");  //610
		//System.out.println("10" - 1);
		
		// "10"---->10   //문자숫자를 강제로 정수로 변경 후 연산 
		// 자바스크립트: Number.parseInt("10")==> 10
		// 자바: Integer.parseInt("10") ==> 10   //문자열 10을 정수 10으로 변환 후 계산 
		String k = "10";
		System.out.println(k+20);  // 1020, 문자열이어서 사칙연산 불가 	
		
		int k2 = Integer.parseInt(k); //문자열을 정수로 변환
		System.out.println( k2+20);  // 30
		
		// 10==>"10"
		// 자바스크립트: toString()
		// 자바: String.valueOf(10) ==> "10"
		// 자바: String.valueOf(3.14) ==> "3.14"
		// 자바: String.valueOf(true) ==> "true"
		//정수 10 => 문자 10으로 변환 
		System.out.println(String.valueOf(10)+10); //1010
		System.out.println(10+""+10); //1010
		
		
		
		//5. 작은타입과 큰타입이 연산==> 큰타입
		int p = 100;
		double p2 =3.14;
		double p3=p+p2;
		
		
	}

}
