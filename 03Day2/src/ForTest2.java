import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {

		A:
		for(int i=0;i<5; i++) {
			for(int j=0; j<4;j++) {
				System.out.println(i+"\t"+j);
				if(i==3)break A;
			}
		}//end for
		
		
		
		
		
		
		
		for(int i=0;i<5;i++) {
			System.out.println("hello1 "+i);
			System.out.println("hello2 "+i);
			if(i==3)continue;
			System.out.println("hello3 "+i);
			System.out.println("hello4 "+i);
			
		}//end for
		
		for(int i=0;i<5;i++) {
			System.out.println("hello "+i);
			if(i==3)break; //반복문을 빠져나올때
		}//end for
		
		
		
	}//end main
}//end class





