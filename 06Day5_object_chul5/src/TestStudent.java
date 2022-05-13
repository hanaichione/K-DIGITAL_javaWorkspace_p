
public class TestStudent {

	
	//추가기능 ==> 메서드
	// "홍길동"==> "홍"
	
	public static void main(String[] args) {
	Student stu1 = new Student("홍길동", 20, "서울");
	StudentUtil util = new StudentUtil();//util stu=null;
	
	util.setStu(stu1);
	util.firstName();
	util.nameLength();
	//이순신, 20, 경기
	//첫글자, 길이 출력 
	util.setStu(new Student("이순신", 20, "경기"));
	util.firstName();
	util.nameLength();
	}//end main
}//end class
