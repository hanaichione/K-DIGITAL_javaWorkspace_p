
public class Sample02_variable3_char {

	public static void main(String[] args) {
		
		char c ='A';
		 int num= (int)c;//명시적 형변환 
		 System.out.println(num);
		 System.out.println(c+1);//묵시적형변환: 자동 char -> int형변환+1 계산 후 출력 
		 System.out.println((char)(c+1));//명시적 형변환 66 값을 char로 변경하여 문자로 출력  
		 
		char c2 ='홍';
		char c3 ='\uD64D';
		System.out.println(c+"\t"+c2+"\t"+c3);
		//escape문자
		System.out.println("aaa\tbbb");  //탭
		System.out.println("aaa\nbbb");  //줄바꿈 
		System.out.println("aaa\'bbb"); //' 출력
		System.out.println("aaa\"bbb"); //"출력
		System.out.println("aaa\\bbb"); //\출력
	   
		
	}

}
