//
public class Person {
	String name;
	int age;
	String email;
	public String getData() {
		return this.name+"\t"+this.age+"\t"+this.email;
	}

	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public Person() {}//기본생성자 
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
