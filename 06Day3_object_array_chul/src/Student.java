
public class Student {

	private String name;
	private int age;
	private String address;
	
	public Student() {}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("3개 짜리 생성자 호출================");
	}
// main  new Student("aa", 10);
	public Student(String name, int age) {
		//this() : 같은 클래스의 생성자를 호출 사용  
		//this(name,age,"미상"); //반드시 첫라인에서 사용
		this(name, age, "미상");
		System.out.println("2개 짜리 생성자 호출================");
//		this.name=name;
//		this.age=age;
//		this.address="미상";
	}

	public Student(String name, String address) {
		this(name, 20, address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	
	
}



