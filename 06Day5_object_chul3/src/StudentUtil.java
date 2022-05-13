
public class StudentUtil {
	// version-3
	public char firstName(Student stu) {
		String name = stu.getName();
		char first = name.charAt(0);
		System.out.println("성은 ======" + first);
		return first;
	}

	public int nameLength(Student stu) {
		String name = stu.getName();// 이름얻기
		int length = name.length();// 길이 얻기
		System.out.println("길이는  ======" + length);
		return length;
	}

	// version-2
//	public char firstName(Student stu) {
//		// 이름 얻기, 첫글자 추출, 추출한 글자 리턴
//		String name = stu.getName();// 이름얻기
//		char first = name.charAt(0);
//		return first;
//	}
//
//	public int nameLength(Student stu) {
//		//이름얻기, 이름 길이 , 리턴 
//		//메소드체인 사용
//		String name = stu.getName();// 이름얻기
//		int length= name.length();//길이 얻기 
//		return length;
//	}
//	public int nameLength2(Student stu) {
//		return stu.getName().length();  //메소드 체인 
//	}

//version-1 
//	public char firstName(String name) {
//		return name.charAt(0);
//	}
//	public int nameLength(String name) {
//		return name.length();
//	}
}
