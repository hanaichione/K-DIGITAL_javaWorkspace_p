
public class Sample05_operator {

	public static void main(String[] args) {
		
		//6. 3항연산자
		int xxx =(3==4)?100:200;
		String xxx2 =(3==4)?"A":"B";
		System.out.println(xxx);
		System.out.println(xxx2);
		
		
		//5. 논리 연산자
		
		System.out.println( 3==4 && 4>3);

		System.out.println( ! true );
		System.out.println( ! false );
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		
		// 4. 비교연산자==> 실행결과는 논리값
		int xyz=5;
		int xyz2=3;
		boolean result = xyz == xyz2;
		System.out.println(xyz == xyz2);
		System.out.println(xyz != xyz2);
		System.out.println(xyz > xyz2);
		System.out.println(xyz >= xyz2);
		System.out.println(xyz < xyz2);
		System.out.println(xyz <= xyz2);
		
		
		//3.증감연산자 (증가/감소 연산자)
		 int y=10;
		 int y2 =++y; // 전치: 먼저증가하고 나중에 할당
		 System.out.println(y+"\t"+y2);
		 int y3 =y++; // 후치: 먼저할당하고 나중에 증가
		 System.out.println(y+"\t"+y3);
		 
		 
		
		//3.증감연산자 (증가/감소 연산자)
		int k = 10;
		++k;  //전치
		System.out.println(k);
		k++;  //후치
		System.out.println(k);
		
		
		//2.대입연산자
		int x = 10;
		int x2 = x;
		x2 += x;
		x2 -= x;
		x2 *= x;
		x2 /= x;
		x2 %= x;
		
		
		
		//1. 산술연산자 :  +,-,*,/,%
		int n = 10;
		int n2 =3;
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		System.out.println(n/n2);  //3
		System.out.println(n/3.0);  //3.3333
		System.out.println(n%n2);
		
		
	}

}
