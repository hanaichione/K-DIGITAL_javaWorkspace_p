import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		//7. 이중 for 2
		for (int i = 0; i <=5; i++) {//0~5 
			for (int j = 0; j <= i; j++) {//0~0, 0~1, 0~2,0~3....0~5 
				//System.out.println(i+"\t"+ j );
				System.out.print("*");
			}
			System.out.println();
		//	System.out.println("============================");
		}
		
		
		
		
		
		
		
		
		
		
		
		//6. 누적합계(1-100)의 총합 
		int sum=0;//총합
		for (int i = 1; i <= 100; i++) {//i 1~100
			System.out.println("누적되는 합계 : "+ i+"\t"+ sum);
			//sum= sum+i;
			sum+=i;
		}
		System.out.println("총합은 : "+ sum);
		
		
		
		

	
		//5. 이중 (중첩)for문
		for(int i=2;i<=9; i++) {//2~9
			
			for(int j=1; j<=9;j++) {//1~9 
				System.out.println(i+"*"+j+"="+ (i*j));
			}
			 System.out.println("========================");
		}//end for
		
		
		
		
		//4. 
		int i=0;//초기식이 여러개인 경우 밖에서 변수 선언
		int j=0;
		for( i=0, j=0;i<5 && j<3;i++,j++) {
			System.out.println("happy "+i+ ":"+ j);
		}//end for
		System.out.println("for문 밖 " +i+":"+j);
		
		
		
		
		
		
		
		
		
		
		
		//3.
		for(int k=0;k<=10; k+=2) {// k= k+2
			System.out.println("hello "+k);//0,2,4
		}//end for
		
//3. 0 ~ 10 까지 짝수만 출력 
		//2.
		for(int i2=10; i2>0 ;i2--) {//10 ~ 1 
			System.out.println("world "+i2);
		}//end for
		
		
		
		
		
		
		
		
		
		
		//1.
//		for(int i3=0; i3<10 ;i3++) {
//			System.out.println("hello "+i3);
//		}//end for
		System.out.println("main 마지막 부분=========================");

	}//end main
}//end class
