

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		클래스명 변수명 = new 클래스명();
		Student stu = new Student();  //1. 객체생성
		System.out.println(stu);
		System.out.println(stu.name+"\t"+ stu.age+"\t"+stu.address);  //2.초기값확인
		stu.name ="홍길동";   //3. 실제 학생1명의 데이터 저장 
		stu.age = 20;
		stu.address ="서울";
		System.out.println(stu.name+"\t"+ stu.age+"\t"+stu.address);  //4. 확인
		
		
		
		Student stu2 = new Student();  //다른 객체 생성 
		//2번학생 이순신, 44, 전라로 저장 후 데이터 출력 
		
		stu2.name ="이순신";
		stu2.age = 44;
		stu2.address ="전라";
		System.out.println(stu2.name+"\t"+ stu2.age+"\t"+stu2.address);  //4. 확인
		//3번학생 유관순, 19, 경기로 저장 후 데이터 출력 
		
		Student  stu3= new Student();
		stu3.name ="유관순";
		stu3.age = 19;
		stu3.address ="경기";
		System.out.println(stu3.name+"\t"+ stu3.age+"\t"+stu3.address);  //4. 확인
		
		
		
		
		
		
		
		
		

		

		
	
		

		
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.address);
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.address);
		System.out.println(stu3.name);
		System.out.println(stu3.age);
		System.out.println(stu3.address);
	}

}
