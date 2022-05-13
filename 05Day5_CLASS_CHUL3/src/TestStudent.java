
public class TestStudent {

	public static void main(String[] args) {
		//1.객체생성
		Student stu= new Student();//매개변수 0 개짜리 생성자를 사용해서 객체 생성 후 초기화
		
//		public Student() {//매개변수를 받는 생성자를 명시적 작성, 기본생성자 안만들어줌
//			
//		}		
		//2. 객체사용
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);		
		
		//2. 학생 2번 객체생성
		Student stu2= new Student("홍길동");
				
		//생성자만 있고 기본생성자가 없어 에러가 남. 
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		
		
		
//		//1. 객체생성 
//		Student stu1= new Student();//객체생성완료 ==기본생성자 호출 하여 객체 생성함. 
//		//public Student(){} 호출 
//		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
//		Student stu2= new Student();//객체생성완료 
//		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
//		//2번학생에 "이순신", 30, "경기"로 설정
//		stu2.name="이순신";
//		stu2.age=30;
//		stu2.address="경기";
//		//2번학생 자료 출력 
//		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);

	}

}
