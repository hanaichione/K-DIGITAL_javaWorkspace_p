
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1= new Student("홍길동", 20, "서울");//기본생성자 호출 객체 생성
	//	System.out.println(stu1.getName());
		String name= stu1.getName();
		int age= stu1.getAge();
		String address= stu1.getAddress();
		// stu1.getName();
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(stu1);  //toString() 함수 
		// 묵시적  참조변수.toString(); 로 변환사용 => toString이 구현 안된 경우 객체의 주소 
		// 구현된 경우 toString호출 사용 
		System.out.println(stu1.toString());

	}

}
