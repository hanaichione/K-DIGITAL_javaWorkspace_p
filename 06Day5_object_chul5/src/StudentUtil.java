
public class StudentUtil {
	Student stu;//하나의 클래스에 다른 클래스가 멤버변수 포함 : has a  관계 //메인에서 생성한  stu를 가지게 됨 
	
	public Student getStu() {//리턴타입이 클래스 타입
		return stu;
	}

	public void setStu(Student stu) {//매개변수가 클래스 타입
		this.stu = stu;
	}

	public StudentUtil(Student stu) {
		super();
		this.stu = stu;
	}

	public StudentUtil() {//기본생성자
		super();
		// TODO Auto-generated constructor stub
	}

	//version-4
	public char firstName() {
		String name = stu.getName();
		char first = name.charAt(0);
		System.out.println("성은 ======" + first);
		return first;
	}

	public int nameLength() {
		String name = stu.getName();// 이름얻기
		int length = name.length();// 길이 얻기
		System.out.println("길이는  ======" + length);
		return length;
	}
	
	
	
	// version-3
//	public char firstName(Student stu) {
//		String name = stu.getName();
//		char first = name.charAt(0);
//		System.out.println("성은 ======" + first);
//		return first;
//	}
//
//	public int nameLength(Student stu) {
//		String name = stu.getName();// 이름얻기
//		int length = name.length();// 길이 얻기
//		System.out.println("길이는  ======" + length);
//		return length;
//	}

	// version-2
//	public char firstName(Student stu) {
//		// 이름 얻기, 첫글자 추출, 추출한 글자 리턴
//		String name = stu.getName();// 이름얻기
//		char first = name.charAt(0);
//		return first;
//	}
//
//	public int nameLength(Student stu) {
//		//이름얻기, 이름 길이 , 리턴 
//		//메소드체인 사용
//		String name = stu.getName();// 이름얻기
//		int length= name.length();//길이 얻기 
//		return length;
//	}
//	public int nameLength2(Student stu) {
//		return stu.getName().length();  //메소드 체인 
//	}

//version-1 
//	public char firstName(String name) {
//		return name.charAt(0);
//	}
//	public int nameLength(String name) {
//		return name.length();
//	}
}
