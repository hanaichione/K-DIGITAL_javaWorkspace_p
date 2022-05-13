
public class Student {

	private String name;
	private int age;
	private String address;	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Student() {}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student(String name, int age) {
		this(name,age,null); //반드시 첫라인에서 사용
	}

	public Student(String name, String address) {
		this(name,20,address);
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

	
	
}



