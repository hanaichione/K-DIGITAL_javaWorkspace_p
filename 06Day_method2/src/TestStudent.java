
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("홍길동", 20, "서울");
		System.out.println(stu1.getData());
//이름수정 
		stu1.setName("이순신");
		stu1.setAge(300);
		stu1.setAddress("제주");
		System.out.println(stu1.getData());
	}

}
