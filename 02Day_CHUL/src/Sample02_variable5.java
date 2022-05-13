
public class Sample02_variable5 {// 클래스안 : 변수, 함수 선언가능 

	public static void main(String[] args) {
		
		int num =10; //main함수에 속한 로컬변수 
		//int num =20; //변수명 중복 사용불가
		System.out.println(num);
		
	}//main end 
	
	public void test() {
		int num=20;  //test함수에 속한 로컬 변수 
		System.out.println(num);
	}//test end 

}
