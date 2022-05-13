
public class Sample02_variable2 {

	public static void main(String[] args) {
		
		// 홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63)체중(78.25
		//1. 변수선언과 초기화 동시에
		String name ="홍길동";
		int age =20;
		String address = "서울";
		char gender ='남';
		boolean isMarried= false;
		float height = 185.63F;
		double weight = 78.25;
//		System.out.printf("이름은 %s, 나이는 %d, 주소는  %s 입니다. ", name, age, address);
//		System.out.println();
//		//이름은 홍길동,나이는 20 ,주소는 서울
//		System.out.println("이름은 "+name
//				+" ,나이는"+age+" ,주소는 "+address+"입니다.");
		System.out.printf("이름은 %s,나이는 %d,주소는 %s입니다.",name,age,address); 
		System.out.println();//강제 줄바꿈		
		System.out.println("이름은 "+name+",나이는 "+age+",주소는 "+address+"입니다.");	
				
		System.out.println(name+" "+age+" " +address+ " 성별("+gender+")"+" 결혼여부 ("+
		isMarried+") 키("+height+") 체중("+weight+")");

	}

}
