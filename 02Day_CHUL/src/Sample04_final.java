
public class Sample04_final {

	public static void main(String[] args) {
		
		// 상수: 값변경불가, 전부 대문자로
		// Byte.MIN_VALUE, Byte.MAX_VALUE
		final int SIZE=100;//상수 : 초기화는 한번만, 변경 불가 final 사용 
		//SIZE=200;  //값 변경불가
		System.out.println(SIZE);
		
		
		int num = 10;
		System.out.println(num);
		
		num =20;
		System.out.println(num);
		
	}

}
