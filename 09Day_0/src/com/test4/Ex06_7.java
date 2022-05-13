package com.test4;
class Employee {   //묵시적 extends Object 추가 
	String name;
	int salary;
	public Employee() {
		super();   //부모의 기본생성자 호출 , 부모 먼저 생성 후 자신을 생성함 
		// TODO Auto-generated constructor stub
		System.out.println("emp 기본생성자 호출 됨 ==================");
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getEmployee() {
		//System.out.println("emp getEmployee()================");
		return name + " " + salary;
	}
	
	public void test() {
		
	}
	
}//end emp

class Manager extends Employee{
	
	String depart;	
	public Manager() {
		//System.out.println();
		super();//항상 첫라인에 기재 
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, int salary , String depart ) {
	//	super();   //생성자의 첫라인에 묵시적 추가 
		this.name= name;
		this.salary=salary;
		this.depart = depart;
		System.out.println("Manager 생성자 호출됨 =====================");
	}
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		
		//System.out.println("manger getEmployee()================");
		return super.getEmployee()+"\t"+ depart;
	}
	
	public void print() {//자식의 유일함수 
		System.out.println("mananger print()=============");
	}
	
	
	
	
	
	
//	public String getManager() {
//		return name + " " + salary + " " + depart;
//	}	
}//end Manager




public class Ex06_7 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		System.out.println(emp.getEmployee());  //부모함수
		
		emp = new Manager("이순신", 4000, "개발");
		System.out.println(emp.getEmployee()); //실제 객체 함수 (동적 바인딩)
		//emp.print();   //error
		
		Manager mgr = (Manager)emp;
		mgr.print();

		
		

		//다형성
		//1. 부모타입의 변수로 자식객체 저장 가능(매개변수, 리턴타입도 사용가능 )
		// 2. 부/자식간 오버라이딩된 함수는 다형성 변수로 호출 가능 : 실제 저장된 자식 객체의 함수 호출 (형변환 필요 없음)
		//3. 자식의 유일한 변수,함수 사용을 위해서는 형변환을 한 후 사용해야함. 
		
	

	}

}
