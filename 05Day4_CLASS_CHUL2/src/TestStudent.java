
public class TestStudent {

	public static void main(String[] args) {
		//1. 객체생성 
		Student stu1= new Student();//객체생성완료 
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
		Student stu2= new Student();//객체생성완료 
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		System.out.println(stu1== stu2); //false 
		
		//2번학생에 "이순신", 30, "경기"로 설정
		stu2.name="이순신";
		stu2.age=30;
		stu2.address="경기";
		//2번학생 자료 출력 
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);

	}

}
