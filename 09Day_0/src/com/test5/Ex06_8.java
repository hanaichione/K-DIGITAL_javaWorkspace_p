package com.test5;

class Employee /*extends Object*/ {	// 묵시적 extends Object 추가
	
	//public void taxRate(Employee e) {
		public void taxRate(Object e) {
		//instanceof 사용시 자식 => 부모 순서로 비교 
		if(e instanceof Manager) {   //실제 객체의 타입 비교 
			Manager m = (Manager)e;
			System.out.println("Manager 세금 구하기");
		}else if(e instanceof Engineer) {
			Engineer en = (Engineer)e;
			System.out.println("Engineer 세금 구하기");
		}else if(e instanceof Employee) {
			System.out.println("Employee 세금 구하기");
		}		
	}//end method
	
	public Employee test() {
		//return new Employee();
//		return new Manager();
		return new Engineer();
		
	}
}

class Engineer extends Employee{}
class Manager extends Employee{}

public class Ex06_8 {

	public static void main(String[] args) {
		Employee emp = new Engineer();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		emp.taxRate(emp);
		man.taxRate(man);
		eng.taxRate(eng);
		
	}
	
	
}

