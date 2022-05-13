
public class TestStudent2 {

	public static void main(String[] args) {
		//학생2명의 자료를 객체생성 저장. 
		//1번학생
		//1.Student class 객체생성
		Student stu1= new Student();//객체생성완료, 멤버변수는 초기값을 가짐 
		//2. 1번학생 자료 저장
		stu1.name="홍길동";
		stu1.age=20;
		
		//2번학생 
		Student stu2= new Student();//다른 객체생성완료, 멤버변수는 초기값을 가짐 
		stu2.name="강감찬";
		stu2.age=30;
		
		//객체의 사용
		System.out.println(stu1+"\t"+ stu2);
		System.out.println(stu1.name+"\t"+stu2.name);
		System.out.println(stu1.age+"\t"+stu2.age);
		System.out.println(stu1.address+"\t"+stu2.address);
		
		
		

	}

}
