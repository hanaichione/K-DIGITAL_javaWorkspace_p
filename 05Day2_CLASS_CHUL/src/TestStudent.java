
public class TestStudent {

	public static void main(String[] args) {
		//Student 클래스 이용 학생 한명의 자료를 가진 객체 생성 
		Student stu1= new Student();  //모델클래스 이용 객체 생성완료-
		//모델클래스의 멤버변수가 생성되면서 자동으로 타입의 초기값으로 설정됨 , 기본생성자 호출 사용 
		
		System.out.println(stu1.name);  //null
		System.out.println(stu1.age);  //0
		System.out.println(stu1.address); //null		
		

		//실제 학생 한명의 자료를 생성된 객체에 저장   "홍길동", 20, "서울";
		stu1.name="홍길동";
		stu1.age=20;
		stu1.address="서울";  //1명의 객체 정보 저장완료 
		System.out.println("============================");
		System.out.println(stu1);
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.address);
		
		

	}

}
