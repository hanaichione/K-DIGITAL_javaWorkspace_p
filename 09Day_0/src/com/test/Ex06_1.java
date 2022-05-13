package com.test;
class Employee extends Object{   //묵시적 extends Object 추가 
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
		return name + " " + salary;
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
	public String getManager() {
		return name + " " + salary + " " + depart;
	}	
}//end Manager




public class Ex06_1 {

	public static void main(String[] args) {
		Employee emp= new Employee("홍길동", 2000);
		System.out.println(emp.getEmployee());
		System.out.println("================================");
		Manager man = new  Manager("이순신", 4000, "개발");
		System.out.println(man.getManager());
	

	}

}
