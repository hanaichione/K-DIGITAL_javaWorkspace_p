
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("홍길동", 20, "aa@naver.com");
		Person p2= new Person("이순신", 10, "bb@goolge.com");
		System.out.println(p1.getData());
		System.out.println(p2.getData());	
		
		p1.setAge(40);
		p2.setEmail("bb@naver.com");
		System.out.println(p1.getData());
		System.out.println(p2.getData());
		//3. 나이비교	
		p2.setAge(40);
		int age1= p1.getAge();  //40
		int age2= p2.getAge();  //40 
		if(age1==age2) {//나이 비교 
			System.out.println("나이같음");
		}else {
			System.out.println("나이다름 ");
		}
		//4. 이름 비교
		 p2.setName("홍길동");//String 변수에 저장 비교 하도록 수정 
		 String name1=p1.getName();
		 String name2= p2.getName();
		 String mesg="이름다름 ";
		 if(name1.equals(name2)) {
			 mesg="이름 같음 ";
		 }
		 System.out.println(mesg);
		

	}

}
