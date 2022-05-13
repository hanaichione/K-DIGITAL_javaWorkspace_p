
public class Student {
	//1.멤버변수 선언영역 
	//접근지정자 변수타입 변수명 ="초기값";
	private String name;//접근 지정자 default, private 로지정 -같은 클래스에서만 사용가능 : 
	private int age;
	private String address;// 다른 클래스에서  참조변수.변수명 사용 안됨.
	//함수영역- 메소드 영역 : 멤버 메소드 : 멤버함수 - 
	//함수 : 동작관련코드 , 객체 생성(new) 후 호출 사용, 
	// 접근지정자 리턴타입 함수이름 (매개변수 ){   코드
	//	return 리턴값;
	// }
	//멤버변수를 필요한 곳에 제공 : getXXX메소드 
	
	
	
	public String getName() {
		System.out.println("getName() 호출=================");
		return this.name;	//이름을 호출한 곳으로 리턴 시킴 	 
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		System.out.println("getAge() 호출=================");
		return age;
	}
	
	public String getAddress() {
		System.out.println("getAddress() 호출 ==============");
		return address;
	}
	

	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	//생성자 영역
	public Student(String name, int age, String address) {
		super();//상속과 관련 , 생성자의 맨 첫줄 
		System.out.println("Student(String name, int age, String address) 생성자 호출");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Student() {//기본생성자 
		super();//상속과 관련, 생성자의 맨 첫줄 
		// TODO Auto-generated constructor stub
	}
	
	
	

}
