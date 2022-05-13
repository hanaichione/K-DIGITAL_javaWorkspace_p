//클래스 이름 Student == 파일명,첫문자 대문자  
public class Student {   //모델 클래스 학생한명 객체를 생성, 저장할 모델클래스

	String name;//이름  초기값 지정
	int age; //나이 
	String address;// 주소 
	String phone="010";
	
	
	
	public Student(String name, int age, String address) {
		super();
		System.out.println("3개 짜리 생성자 호출=================");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//기본생성자 명시
	public Student(String name, int age, String address, String phone) {
		super();
		System.out.println("4개 짜리 생성자 호출=================");
		this.name = name;
		if(age>0) {
		this.age = age;
		}
		this.address = address;
		this.phone = phone;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

    
	
}
