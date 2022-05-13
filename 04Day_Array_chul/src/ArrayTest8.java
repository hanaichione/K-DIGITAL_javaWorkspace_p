import java.util.Arrays;

public class ArrayTest8 {

	public static void main(String [] args) {
		
		// 2차원배열
		// 1.정방형(모든행의 열크기동일)
		
		//가.배열선언
		int [][]num;
		
		//나. 배열생성
		num = new int[2][3]; //2행 3열  
		
		num[0][0] =10;
		num[0][1] =20;
		num[0][2] =30;
		num[1][0] =40;
		num[1][1] =50;
		num[1][2] =60;
		
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[0][2]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		System.out.println(num[1][2]);
		
		
	for(int i=0; i< num.length; i++) {
		for(int j=0; j <num[i].length; j++) {
			System.out.println(num[i][j]);
		}
	}
		for(int[] i: num) {
			for(int j: i) {
				System.out.println(j);
			}
		}
		
		
		System.out.println("행의 갯수:"+num.length);
		System.out.println("1행의 열갯수:"+num[0].length);
		System.out.println("2행의 열갯수:"+num[1].length);
		
	}

}




