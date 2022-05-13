import java.util.Arrays;

class Counter{
	
	private int num; //인스턴스변수
	private static int count;
	public Counter() {
		num++;
		count++;
	}
	public int getNum() {
		return num;
	}
	public int getCount() {
		return count;
	}
//	public static int getNum2() {
//		return num;
//	}
	public static int getCount2() {
		return count;
	}
}

public class TestMain {
	public static void main(String[] args) {
		
		System.out.println(Counter.getCount2());
		// API 메서드
		int x = Integer.parseInt("10");
		float x2 =Float.parseFloat("3.14");
		double x3 = Double.parseDouble("3.14");
		
		String y= String.valueOf(10);
		int [] k = {10,2,3,5,6};
		Arrays.fill(k, 100);
		
		
		
		Counter c = new Counter();
		System.out.println("count"+c.getCount());
		System.out.println(c.getNum()); //1
		Counter c2 = new Counter();
		System.out.println("count"+c.getCount());
		System.out.println(c.getNum()); //1
	
	}//end main
}//end class
