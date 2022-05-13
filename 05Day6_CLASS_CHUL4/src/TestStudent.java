
public class TestStudent {

	public static void main(String[] args) {
		//1. 객체생성 
		Student stu1= new Student();//객체생성완료 ==기본생성자 호출 하여 객체 생성함. 
		Student stu2= new Student("이순", -10, "서울", "011");
		
		stu1.name="홍길동";
		stu1.age=20;
		stu1.address="서울";
		
		//public Student(){} 호출 
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		
		
		Student stu3=new Student("aa", 10, "bb");
		System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address+"\t"
				+ stu3.phone);
//		Student stu2= new Student();//객체생성완료 
//		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
//		//2번학생에 "이순신", 30, "경기"로 설정
//		stu2.name="이순신";
//		stu2.age=30;
//		stu2.address="경기";
//		//2번학생 자료 출력 


	}

}
