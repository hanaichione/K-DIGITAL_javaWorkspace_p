
public class TestMain {
	int num;//멤버변수 
	
	//기본생성자 
	public int getNum() {  //멤버메소드(함수)
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	private static void test() {
		// TODO Auto-generated method stub
		System.out.println("test 함수 호출됨 ================");
	}


	public static void main(String[] args) {//클래스 로딩 -> static 변수, 함수 로딩 
		// TODO Auto-generated method stub
		
		//System.out.println(this.num);
		test();		//static때문에 가능함
		TestMain t= new TestMain();//객체생성		
		System.out.println(t.num);//객체생성 후 사용 		
		t.setNum(100);
		System.out.println(t.getNum());

	}//main



}//class 
