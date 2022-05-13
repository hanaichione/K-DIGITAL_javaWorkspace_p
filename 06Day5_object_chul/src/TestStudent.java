
public class TestStudent {

	
	//추가기능 ==> 메서드
	// "홍길동"==> "홍"
	
	public static void main(String[] args) {

		Student stu = new Student("홍길동",20,"서울");
		StudentUtil util = new StudentUtil();// 도움클래스 
		String name =stu.getName();
		System.out.println(util.firstName(name)
				+"\t"+util.nameLength(name));
		
		Student stu2 = new Student("박혁거세",40,"경기");
		String name2 =stu2.getName();
		System.out.println(util.firstName(stu2.getName())
				+"\t"+util.nameLength(name2));
		
		

	}//end main
}//end class
