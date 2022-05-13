
public class TestMain {
	public static void main(String[] args) {
		
		System.out.println(Person.age);//static변수 : 객체 생성없이 클래스이름.변수명으로 사용가능		
		Person p= new Person();
		p.name="홍길동";
		p.a();
//		System.out.println(p.name);
//		System.out.println(p.age);
		Person.age=10;  //static변수는 객체의 공유변수가 됨 
		Person p2= new Person();
		p2.name="이순신";
		p2.a();
		p.a();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		p.a();
//		System.out.println(Person.age);
//		Person.b();
//		
//		p.age=20;
//		Person p2= new Person();
//		System.out.println(p2.age);
		
		
	}//end main
}//end class
