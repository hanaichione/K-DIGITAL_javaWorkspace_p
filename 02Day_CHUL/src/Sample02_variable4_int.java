
public class Sample02_variable4_int {

	public static void main(String[] args) {
		
		byte b =10;  // -128 ~ 127
		short b2 =20; //-32768 ~ 32767
		int b3 =30; // -2147483648 ~ 2147483647
		long b4 =40L; //-9223372036854775808 ~ 9223372036854775807
		
		//주민번호저장
	//	int ssn_int= 8901201234567; //error
		long ssn = 8901201234567L;
		
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

}
