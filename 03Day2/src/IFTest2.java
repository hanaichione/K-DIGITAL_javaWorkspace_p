
public class IFTest2 {

	public static void main(String[] args) {

		//2.  if~else문
		System.out.println("문장1");
		int num =0;  //변수선언
		if(3==3) {
			num=3;  //초기화
			System.out.println("참");
			System.out.println(num);
		}else {
			System.out.println("거짓");
		}
		System.out.println(num);
		System.out.println("문장3");
		
		//3.if~ else (대소문자 판단)
		System.out.println("++++++++++++++++++++++++");
		
		
		
		

		char c='a';
		int intc=97;
		String mesg2="";
		if((c>='a')&&(c<='z')) {
			
			 mesg2="소문자";
		}else {
			 mesg2="대문자";
		}
		System.out.println(mesg2);
		
		
		
		System.out.println("===========================");
		int num2 = 100;
		int result = num2 % 2;
		String mesg;
		
		  if (result == 0) {
			  mesg = "짝수"; 
		  } else {
			  mesg = "홀수";
		  }		
		System.out.println(mesg);

		
		
		System.out.println("main종료 ==============");
		
	}//main

}//class 
