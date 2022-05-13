import java.util.Random;

public class RandomTest {

	public static void main(String [] args) {
		
		//랜덤값 얻기
		Random r = new Random();
//		int n = r.nextInt();
		int n = r.nextInt(5)+1;
		System.out.println(n);
		boolean n2 = r.nextBoolean();
		System.out.println(n2);
		double n3 = r.nextDouble();
		float n4 = r.nextFloat();
		System.out.println(n3);
		System.out.println(n4);
		
		
		//현재시간:  long타입으로   1/1000초
		//유일한 값 지정시
		long kkk = System.currentTimeMillis();
		System.out.println(kkk);
		long kkk2 = System.currentTimeMillis();
		System.out.println(kkk2-kkk);
		String mesg = "a"+kkk;
		System.out.println(mesg);
	}//end main

}




