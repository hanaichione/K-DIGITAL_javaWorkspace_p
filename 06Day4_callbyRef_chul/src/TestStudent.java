
public class TestStudent {

//	public static void changeAge(Student n) {
//		n.setAge(40);
//	}//end changeAge
	
	private static void changeAge(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("changeAge 에서  stu==="+stu);//toString
		stu.setAge(100);
	}
	public static void main(String[] args) {

		Student stu = new Student("홍길동",20,"서울");
		System.out.println("변경전 나이:" +stu);
		//String age="10";
	
		changeAge(stu);		//call by reference 주소 전달 
		System.out.println("변경후 나이:" +stu);

	}//end main


}//end class
