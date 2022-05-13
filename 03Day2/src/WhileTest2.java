import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// 반복문을 이용한 누적
//0~10 까지의 합계 : 55

		int num = 1; // 증가값
		int sum =0; // 누적된 합계
		while (num <= 10) {// 1~10
				
				sum += num;   // sum= sum+ num;
				System.out.println("sum="+ sum+ "num="+ num);
				
		
			num++;
			System.out.println(sum);
		}
		System.out.println("누적합계:  "+ sum);

	}// end main
}// end class
