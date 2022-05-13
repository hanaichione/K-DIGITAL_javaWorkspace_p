
public class Student {
	String name;
	int age;
	String addr;
     //toString()함수의 사용 
	
	//생성자, set,get메소드 만들기 
	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
