
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("이순신", 20);
		Person p3 = new Person("유관순", 30);
		
		Person [] perb = new Person[3];
		perb[0] = p1;
		perb[1] = p2;
		perb[2] = p3;
		
		for (int i = 0; i < perb.length; i++) {
			System.out.println(perb[i]);
		}
		
	}
}
