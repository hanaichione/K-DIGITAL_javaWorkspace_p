import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

	
	  int n=0;//초기식  
	  
	  
	  while(n<=10) {//조건검사    n=0~5
		 // if(n==5) break;
		  System.out.println("hello "+n);
		  n++;//증감식
		 // n--;
	  }
	  System.out.println("while 빠져나옴  n="+ n);
	  
	  System.out.println("============================"); 
	  
	  
	  
	  // do~while문 : 조건이 일치하지않아도 적어도 한번은 수행
//	  int n2 = 0;
//	  do {
//		  if(n2==2) continue;  //조건 충족시 해당 블록을 찾아가 다시 실행 
//		  System.out.println("world " + n2);
//		 
//		  n2++;
//	  }while(n2<5);   //n2 : 0~ 4
//		System.out.println("aaaaaa");
	  
	  
	  
	  
	  
	}//end main
}//end class
