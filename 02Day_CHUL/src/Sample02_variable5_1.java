
public class Sample02_variable5_1 {

	public static void main(String[] args) {
		
		int num=10;  //main에 속한 로컬 변수 main전체에서 사용이 가능함 
		//자바는 블럭 scope ( 자바스크립트는 함수scope)
		{//a 블럭 
			 num=20;  
			 int num2=10;//a 블럭안의 로컬변수 
			System.out.println(num);
		}
		
	//	System.out.println(num); //블럭밖에서 인식불가
		{//b 블럭 
			 num=30;			
			System.out.println(num);
		}
		num= num+10;
		System.out.println(num);
		
	}

}
