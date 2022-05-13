
public class TestStudent {

	public static void main(String[] args) {

		Student stu = new Student();
		
		stu.setName("홍길동");
		stu.setAge(2000);
		stu.setAddress("서울");
		
		String name=stu.getName();
		int age = stu.getAge();
		String address = stu.getAddress();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);

	
Student stu2 = new Student();
		stu2.setName("이순신");
		stu2.setAge(45);
		stu2.setAddress("전라");
		
		String name2=stu2.getName();
		int age2 = stu2.getAge();
		String address2 = stu2.getAddress();
		
		System.out.println(name2);
		System.out.println(age2);
		System.out.println(address2);

	}

}
