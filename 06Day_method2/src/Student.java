
public class Student {
	private String name;
	private int age;
	private String address;
	//함수   setXXX() 함수 
	public  void  setName(String name) {//리턴(반환값)값이 없음 : 리턴타입  void 
		System.out.println("setName()매개변수 name====="+name);
		this.name= name;
	}
	public void setAge(int age) {//나이 설정시 데이터 유효성 검사 
		if(age<200) {
			this.age= age;
		}else {			
			System.out.println("나이 데이터가 너무 큽니다 .");
		}		
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	
	
	//함수  getXXX()함수
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddress() {
		return this.address;
	}
	public String getData() {
		return this.name+"\t"+this.age+"\t"+this.address;
	}
	
	
	
	
	
	
	
	
	
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Student() {//기본생성자 
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
