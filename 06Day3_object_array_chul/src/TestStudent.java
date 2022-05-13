
public class TestStudent {

	public static void main(String[] args) {


		Student stu = new Student("홍길동1","서울1");
		Student stu2 = new Student("홍길동2","서울2");
		Student stu3 = new Student("홍길동3","서울3");
		Student stu4 = new Student("홍길동4","서울4");
		Student stu5 = new Student("홍길동5",19,"서울5");
		Student[] yy= new Student[5];
		System.out.println(yy[0]);
		yy[0]= stu;
		yy[1]= stu2;
		yy[2]= stu3;
		yy[3]= stu4;
		yy[4]= stu5;
		System.out.println(yy[0]);//.toStrin() 데이터 출력 
		System.out.println("=========================");
		for (int i = 0; i < yy.length; i++) {
			System.out.println(yy[i].getAge());
		}
//
//		// 데이터타입 [] 배열명 = { 값1,값2};
//		Student [] yy = {stu,stu2,stu4,stu5,stu6 };
		
//		Student stu1 = new Student("홍길동", 10);
//		System.out.println(stu1);
//		Student stu2= new Student("이순신", "서울");
//		System.out.println(stu2);
		
		
		
		
		
//		Student [] yy2 = {
//				new Student("홍길동1","서울1"),
//				new Student("홍길동2","서울3"),
//				new Student("홍길동4","서울4"),
//				new Student("홍길동5","서울5"),
//				new Student("홍길동5",19,"서울5") 
//				};
		
		
		
		
		
		
		
		
		
		
//		for(Student x: yy2) {
//			System.out.println(x.getName());
//		}

	}

}
